package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmenu = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvv5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvv2 = null;
public static boolean _vvvvvv2 = false;
public static int _vvvvvvv6 = 0;
public static String _vvvvvv4 = "";
public static String _vvvvvvvvv4 = "";
public anywheresoftware.b4a.objects.PanelWrapper _vvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _vvvvvvvvv3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _vvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _vvvvvvvv5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _vvvvvvv7 = null;
public static int _vvvvvv0 = 0;
public static int _vvvvvvvv0 = 0;
public static int _vvvvvvvvvv1 = 0;
public static int _vvvvvvvvvv2 = 0;
public static int _vvvvvvvvv1 = 0;
public static int _vvvvvvvvvv3 = 0;
public static int _vvvvvvv2 = 0;
public static int _vvvvvvv1 = 0;
public b4a.example.starter _vvvvv3 = null;
public b4a.example.inchestocm _vvvvv4 = null;
public b4a.example.metertocm _vvvvv5 = null;
public b4a.example.inchestofeet _vvvvv6 = null;
public b4a.example.feettoinches _vvvvv7 = null;
public b4a.example.cmtometer _vvvvv0 = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (inchestocm.mostCurrent != null);
vis = vis | (metertocm.mostCurrent != null);
vis = vis | (inchestofeet.mostCurrent != null);
vis = vis | (feettoinches.mostCurrent != null);
vis = vis | (cmtometer.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 49;BA.debugLine="LoadMainPage";
_vvvvvv1();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 642;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 643;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 645;BA.debugLine="If isMenuOpen Then";
if (_vvvvvv2) { 
 //BA.debugLineNum = 646;BA.debugLine="CloseMenu";
_vvvvvv3();
 //BA.debugLineNum = 647;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 650;BA.debugLine="If currentPage = \"converter\" Then";
if ((mostCurrent._vvvvvv4).equals("converter")) { 
 //BA.debugLineNum = 651;BA.debugLine="GoBackToMain";
_vvvvvv5();
 //BA.debugLineNum = 652;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
 //BA.debugLineNum = 657;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 658;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv6(anywheresoftware.b4a.objects.PanelWrapper _parent,String _fromunit,String _tounit,String _minitext,int _top) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _row = null;
anywheresoftware.b4a.objects.PanelWrapper _dot = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.LabelWrapper _sublbl = null;
 //BA.debugLineNum = 156;BA.debugLine="Sub AddCozyConversionRow(parent As Panel, fromUnit";
 //BA.debugLineNum = 157;BA.debugLine="Dim row As Panel";
_row = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 158;BA.debugLine="row.Initialize(\"\")";
_row.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 159;BA.debugLine="SetPanelBackground(row, Colors.RGB(253, 239, 238)";
_vvvvvv7(_row,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (253),(int) (239),(int) (238)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 160;BA.debugLine="parent.AddView(row, 22dip, Top, 100%x - 84dip, 42";
_parent.AddView((android.view.View)(_row.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (22)),_top,(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (84))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (42)));
 //BA.debugLineNum = 162;BA.debugLine="Dim dot As Panel";
_dot = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 163;BA.debugLine="dot.Initialize(\"\")";
_dot.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 164;BA.debugLine="SetPanelBackground(dot, primaryMaroon, 20dip)";
_vvvvvv7(_dot,_vvvvvv0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 165;BA.debugLine="row.AddView(dot, 14dip, 14dip, 14dip, 14dip)";
_row.AddView((android.view.View)(_dot.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (14)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (14)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (14)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (14)));
 //BA.debugLineNum = 167;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 168;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 169;BA.debugLine="lbl.Text = fromUnit & \"  →  \" & toUnit";
_lbl.setText(BA.ObjectToCharSequence(_fromunit+"  →  "+_tounit));
 //BA.debugLineNum = 170;BA.debugLine="lbl.TextSize = 15";
_lbl.setTextSize((float) (15));
 //BA.debugLineNum = 171;BA.debugLine="lbl.TextColor = darkText";
_lbl.setTextColor(_vvvvvvv1);
 //BA.debugLineNum = 172;BA.debugLine="lbl.Typeface = Typeface.DEFAULT_BOLD";
_lbl.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 173;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 174;BA.debugLine="row.AddView(lbl, 38dip, 3dip, 100%x - 150dip, 20d";
_row.AddView((android.view.View)(_lbl.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (38)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 176;BA.debugLine="Dim subLbl As Label";
_sublbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 177;BA.debugLine="subLbl.Initialize(\"\")";
_sublbl.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 178;BA.debugLine="subLbl.Text = miniText";
_sublbl.setText(BA.ObjectToCharSequence(_minitext));
 //BA.debugLineNum = 179;BA.debugLine="subLbl.TextSize = 12";
_sublbl.setTextSize((float) (12));
 //BA.debugLineNum = 180;BA.debugLine="subLbl.TextColor = mutedText";
_sublbl.setTextColor(_vvvvvvv2);
 //BA.debugLineNum = 181;BA.debugLine="subLbl.Gravity = Gravity.CENTER_VERTICAL";
_sublbl.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 182;BA.debugLine="row.AddView(subLbl, 38dip, 21dip, 100%x - 150dip,";
_row.AddView((android.view.View)(_sublbl.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (38)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (21)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvv3(String _text,String _tagvalue,int _top) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
 //BA.debugLineNum = 228;BA.debugLine="Sub AddMenuButton(Text As String, TagValue As Stri";
 //BA.debugLineNum = 229;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 230;BA.debugLine="btn.Initialize(\"menuButton\")";
_btn.Initialize(mostCurrent.activityBA,"menuButton");
 //BA.debugLineNum = 231;BA.debugLine="btn.Text = Text";
_btn.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 232;BA.debugLine="btn.Tag = TagValue";
_btn.setTag((Object)(_tagvalue));
 //BA.debugLineNum = 233;BA.debugLine="btn.TextSize = 15";
_btn.setTextSize((float) (15));
 //BA.debugLineNum = 234;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 235;BA.debugLine="btn.Gravity = Gravity.CENTER_VERTICAL";
_btn.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 236;BA.debugLine="btn.Padding = Array As Int(18dip, 0, 0, 0)";
_btn.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 237;BA.debugLine="SetButtonNormal(btn)";
_vvvvvvv4(_btn);
 //BA.debugLineNum = 238;BA.debugLine="sidePanel.AddView(btn, 16dip, Top, menuWidth - 32";
mostCurrent._vvvvvvv5.AddView((android.view.View)(_btn.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)),_top,(int) (_vvvvvvv6-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)));
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return "";
}
public static String  _btnback_click() throws Exception{
 //BA.debugLineNum = 613;BA.debugLine="Sub btnBack_Click";
 //BA.debugLineNum = 614;BA.debugLine="GoBackToMain";
_vvvvvv5();
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public static boolean  _btnback_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 617;BA.debugLine="Sub btnBack_Touch (Action As Int, X As Float, Y As";
 //BA.debugLineNum = 618;BA.debugLine="If Action = 0 Then";
if (_action==0) { 
 //BA.debugLineNum = 619;BA.debugLine="btnBack.TextColor = Colors.RGB(245, 210, 215)";
mostCurrent._vvvvvvv7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (245),(int) (210),(int) (215)));
 //BA.debugLineNum = 620;BA.debugLine="btnBack.SetLayoutAnimated(70, 15dip, 44dip, 48di";
mostCurrent._vvvvvvv7.SetLayoutAnimated((int) (70),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (44)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (44)));
 }else if(_action==1 || _action==3) { 
 //BA.debugLineNum = 622;BA.debugLine="btnBack.TextColor = Colors.White";
mostCurrent._vvvvvvv7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 623;BA.debugLine="btnBack.SetLayoutAnimated(70, 12dip, 42dip, 54di";
mostCurrent._vvvvvvv7.SetLayoutAnimated((int) (70),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (12)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (42)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (54)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)));
 };
 //BA.debugLineNum = 626;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return false;
}
public static String  _btnmenu_click() throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub btnMenu_Click";
 //BA.debugLineNum = 254;BA.debugLine="If isMenuOpen = False Then";
if (_vvvvvv2==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 255;BA.debugLine="OpenMenu";
_vvvvvvv0();
 }else {
 //BA.debugLineNum = 257;BA.debugLine="CloseMenu";
_vvvvvv3();
 };
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return "";
}
public static boolean  _btnmenu_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub btnMenu_Touch (Action As Int, X As Float, Y As";
 //BA.debugLineNum = 262;BA.debugLine="If Action = 0 Then";
if (_action==0) { 
 //BA.debugLineNum = 263;BA.debugLine="StyleMenuButtonPressed";
_vvvvvvvv1();
 }else if(_action==1 || _action==3) { 
 //BA.debugLineNum = 265;BA.debugLine="StyleMenuButtonNormal";
_vvvvvvvv2();
 };
 //BA.debugLineNum = 268;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return false;
}
public static String  _btnresult_click() throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub btnResult_Click";
 //BA.debugLineNum = 529;BA.debugLine="ConvertValue";
_vvvvvvvv3();
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return "";
}
public static boolean  _btnresult_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 570;BA.debugLine="Sub btnResult_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 571;BA.debugLine="If Action = 0 Then";
if (_action==0) { 
 //BA.debugLineNum = 572;BA.debugLine="SetResultButtonPressed";
_vvvvvvvv4();
 //BA.debugLineNum = 573;BA.debugLine="btnResult.SetLayoutAnimated(70, 28dip, 299dip, 1";
mostCurrent._vvvvvvvv5.SetLayoutAnimated((int) (70),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (28)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (299)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (96))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)));
 }else if(_action==1 || _action==3) { 
 //BA.debugLineNum = 575;BA.debugLine="SetResultButtonNormal";
_vvvvvvvv6();
 //BA.debugLineNum = 576;BA.debugLine="btnResult.SetLayoutAnimated(70, 24dip, 295dip, 1";
mostCurrent._vvvvvvvv5.SetLayoutAnimated((int) (70),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (295)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (54)));
 };
 //BA.debugLineNum = 579;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return false;
}
public static String  _vvvvvvvv7() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _toppanel = null;
anywheresoftware.b4a.objects.PanelWrapper _circle1 = null;
anywheresoftware.b4a.objects.PanelWrapper _circle2 = null;
anywheresoftware.b4a.objects.LabelWrapper _apptitle = null;
anywheresoftware.b4a.objects.LabelWrapper _namelabel = null;
anywheresoftware.b4a.objects.PanelWrapper _card = null;
anywheresoftware.b4a.objects.LabelWrapper _cardtitle = null;
anywheresoftware.b4a.objects.LabelWrapper _cardsub = null;
anywheresoftware.b4a.objects.LabelWrapper _note = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub BuildMainUI";
 //BA.debugLineNum = 78;BA.debugLine="StyleMenuButtonNormal";
_vvvvvvvv2();
 //BA.debugLineNum = 81;BA.debugLine="Dim topPanel As Panel";
_toppanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 82;BA.debugLine="topPanel.Initialize(\"\")";
_toppanel.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 83;BA.debugLine="SetPanelBackground(topPanel, darkMaroon, 0)";
_vvvvvv7(_toppanel,_vvvvvvvv0,(int) (0));
 //BA.debugLineNum = 84;BA.debugLine="Activity.AddView(topPanel, 0, 0, 100%x, 245dip)";
mostCurrent._activity.AddView((android.view.View)(_toppanel.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (245)));
 //BA.debugLineNum = 87;BA.debugLine="Dim circle1 As Panel";
_circle1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 88;BA.debugLine="circle1.Initialize(\"\")";
_circle1.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 89;BA.debugLine="SetPanelBackground(circle1, Colors.ARGB(45, 255,";
_vvvvvv7(_circle1,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (45),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
 //BA.debugLineNum = 90;BA.debugLine="topPanel.AddView(circle1, 100%x - 95dip, 25dip, 1";
_toppanel.AddView((android.view.View)(_circle1.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (95))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
 //BA.debugLineNum = 92;BA.debugLine="Dim circle2 As Panel";
_circle2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 93;BA.debugLine="circle2.Initialize(\"\")";
_circle2.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 94;BA.debugLine="SetPanelBackground(circle2, Colors.ARGB(30, 255,";
_vvvvvv7(_circle2,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (30),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80)));
 //BA.debugLineNum = 95;BA.debugLine="topPanel.AddView(circle2, -45dip, 155dip, 115dip,";
_toppanel.AddView((android.view.View)(_circle2.getObject()),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (155)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (115)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (115)));
 //BA.debugLineNum = 98;BA.debugLine="Dim appTitle As Label";
_apptitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 99;BA.debugLine="appTitle.Initialize(\"\")";
_apptitle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 100;BA.debugLine="appTitle.Text = \"Multi-Page\" & CRLF & \"Unit Conve";
_apptitle.setText(BA.ObjectToCharSequence("Multi-Page"+anywheresoftware.b4a.keywords.Common.CRLF+"Unit Converter"));
 //BA.debugLineNum = 101;BA.debugLine="appTitle.TextSize = 31";
_apptitle.setTextSize((float) (31));
 //BA.debugLineNum = 102;BA.debugLine="appTitle.TextColor = Colors.White";
_apptitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 103;BA.debugLine="appTitle.Typeface = Typeface.DEFAULT_BOLD";
_apptitle.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 104;BA.debugLine="appTitle.Gravity = Gravity.CENTER_VERTICAL";
_apptitle.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 105;BA.debugLine="topPanel.AddView(appTitle, 24dip, 92dip, 100%x -";
_toppanel.AddView((android.view.View)(_apptitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (92)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (82)));
 //BA.debugLineNum = 108;BA.debugLine="Dim nameLabel As Label";
_namelabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 109;BA.debugLine="nameLabel.Initialize(\"\")";
_namelabel.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 110;BA.debugLine="nameLabel.Text = \"AG D. Evangelista\"";
_namelabel.setText(BA.ObjectToCharSequence("AG D. Evangelista"));
 //BA.debugLineNum = 111;BA.debugLine="nameLabel.TextSize = 16";
_namelabel.setTextSize((float) (16));
 //BA.debugLineNum = 112;BA.debugLine="nameLabel.TextColor = Colors.RGB(235, 205, 210)";
_namelabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (235),(int) (205),(int) (210)));
 //BA.debugLineNum = 113;BA.debugLine="nameLabel.Typeface = Typeface.DEFAULT_BOLD";
_namelabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 114;BA.debugLine="nameLabel.Gravity = Gravity.CENTER_VERTICAL";
_namelabel.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 115;BA.debugLine="topPanel.AddView(nameLabel, 24dip, 178dip, 100%x";
_toppanel.AddView((android.view.View)(_namelabel.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (178)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
 //BA.debugLineNum = 118;BA.debugLine="Dim card As Panel";
_card = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 119;BA.debugLine="card.Initialize(\"\")";
_card.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 120;BA.debugLine="SetPanelBackground(card, cardCream, 26dip)";
_vvvvvv7(_card,_vvvvvvvvv1,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (26)));
 //BA.debugLineNum = 121;BA.debugLine="Activity.AddView(card, 20dip, 275dip, 100%x - 40d";
mostCurrent._activity.AddView((android.view.View)(_card.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (275)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (335)));
 //BA.debugLineNum = 123;BA.debugLine="Dim cardTitle As Label";
_cardtitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 124;BA.debugLine="cardTitle.Initialize(\"\")";
_cardtitle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 125;BA.debugLine="cardTitle.Text = \"Choose a Conversion\"";
_cardtitle.setText(BA.ObjectToCharSequence("Choose a Conversion"));
 //BA.debugLineNum = 126;BA.debugLine="cardTitle.TextSize = 22";
_cardtitle.setTextSize((float) (22));
 //BA.debugLineNum = 127;BA.debugLine="cardTitle.TextColor = darkText";
_cardtitle.setTextColor(_vvvvvvv1);
 //BA.debugLineNum = 128;BA.debugLine="cardTitle.Typeface = Typeface.DEFAULT_BOLD";
_cardtitle.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 129;BA.debugLine="card.AddView(cardTitle, 22dip, 24dip, 100%x - 84d";
_card.AddView((android.view.View)(_cardtitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (22)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (84))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (34)));
 //BA.debugLineNum = 131;BA.debugLine="Dim cardSub As Label";
_cardsub = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 132;BA.debugLine="cardSub.Initialize(\"\")";
_cardsub.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 133;BA.debugLine="cardSub.Text = \"Open the menu and pick the unit y";
_cardsub.setText(BA.ObjectToCharSequence("Open the menu and pick the unit you need."));
 //BA.debugLineNum = 134;BA.debugLine="cardSub.TextSize = 14";
_cardsub.setTextSize((float) (14));
 //BA.debugLineNum = 135;BA.debugLine="cardSub.TextColor = mutedText";
_cardsub.setTextColor(_vvvvvvv2);
 //BA.debugLineNum = 136;BA.debugLine="cardSub.Gravity = Gravity.CENTER_VERTICAL";
_cardsub.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 137;BA.debugLine="card.AddView(cardSub, 22dip, 58dip, 100%x - 84dip";
_card.AddView((android.view.View)(_cardsub.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (22)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (84))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
 //BA.debugLineNum = 139;BA.debugLine="AddCozyConversionRow(card, \"Inches\", \"Centimeter\"";
_vvvvvv6(_card,"Inches","Centimeter","2.54 cm per inch",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (108)));
 //BA.debugLineNum = 140;BA.debugLine="AddCozyConversionRow(card, \"Meter\", \"Centimeter\",";
_vvvvvv6(_card,"Meter","Centimeter","100 cm per meter",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (158)));
 //BA.debugLineNum = 141;BA.debugLine="AddCozyConversionRow(card, \"Inches\", \"Feet\", \"12";
_vvvvvv6(_card,"Inches","Feet","12 inches per foot",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (208)));
 //BA.debugLineNum = 142;BA.debugLine="AddCozyConversionRow(card, \"Feet\", \"Inches\", \"Qui";
_vvvvvv6(_card,"Feet","Inches","Quick length conversion",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (258)));
 //BA.debugLineNum = 145;BA.debugLine="Dim note As Label";
_note = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 146;BA.debugLine="note.Initialize(\"\")";
_note.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 147;BA.debugLine="note.Text = \"Use the ☰ button to start converting";
_note.setText(BA.ObjectToCharSequence("Use the ☰ button to start converting."));
 //BA.debugLineNum = 148;BA.debugLine="note.TextSize = 14";
_note.setTextSize((float) (14));
 //BA.debugLineNum = 149;BA.debugLine="note.TextColor = mutedText";
_note.setTextColor(_vvvvvvv2);
 //BA.debugLineNum = 150;BA.debugLine="note.Gravity = Gravity.CENTER";
_note.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 151;BA.debugLine="Activity.AddView(note, 20dip, 625dip, 100%x - 40d";
mostCurrent._activity.AddView((android.view.View)(_note.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (625)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35)));
 //BA.debugLineNum = 153;BA.debugLine="btnMenu.BringToFront";
mostCurrent._btnmenu.BringToFront();
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public static void  _vvvvvv3() throws Exception{
ResumableSub_CloseMenu rsub = new ResumableSub_CloseMenu(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CloseMenu extends BA.ResumableSub {
public ResumableSub_CloseMenu(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 306;BA.debugLine="If sidePanel.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._vvvvvvv5.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 307;BA.debugLine="sidePanel.SetLayoutAnimated(180, -menuWidth - 15";
parent.mostCurrent._vvvvvvv5.SetLayoutAnimated((int) (180),(int) (-parent._vvvvvvv6-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15))),(int) (0),parent._vvvvvvv6,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 310;BA.debugLine="isMenuOpen = False";
parent._vvvvvv2 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 311;BA.debugLine="Sleep(180)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (180));
this.state = 9;
return;
case 9:
//C
this.state = 5;
;
 //BA.debugLineNum = 313;BA.debugLine="If overlayPanel.IsInitialized Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent._vvvvvvvvv2.IsInitialized()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 314;BA.debugLine="overlayPanel.Visible = False";
parent.mostCurrent._vvvvvvvvv2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 317;BA.debugLine="StyleMenuButtonNormal";
_vvvvvvvv2();
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _vvvvvvvv3() throws Exception{
ResumableSub_ConvertValue rsub = new ResumableSub_ConvertValue(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ConvertValue extends BA.ResumableSub {
public ResumableSub_ConvertValue(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
double _inputvalue = 0;
double _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 537;BA.debugLine="If value1.Text.Trim = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._vvvvvvvvv3.getText().trim()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 538;BA.debugLine="ToastMessageShow(\"Please enter a value\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enter a value"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 539;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 542;BA.debugLine="Dim inputValue As Double = value1.Text";
_inputvalue = (double)(Double.parseDouble(parent.mostCurrent._vvvvvvvvv3.getText()));
 //BA.debugLineNum = 543;BA.debugLine="Dim result As Double";
_result = 0;
 //BA.debugLineNum = 545;BA.debugLine="Select currentConversion";
if (true) break;

case 5:
//select
this.state = 16;
switch (BA.switchObjectToInt(parent.mostCurrent._vvvvvvvvv4,"in_to_cm","m_to_cm","in_to_ft","ft_to_in","cm_to_m")) {
case 0: {
this.state = 7;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
case 3: {
this.state = 13;
if (true) break;
}
case 4: {
this.state = 15;
if (true) break;
}
}
if (true) break;

case 7:
//C
this.state = 16;
 //BA.debugLineNum = 547;BA.debugLine="result = inputValue * 2.54";
_result = _inputvalue*2.54;
 if (true) break;

case 9:
//C
this.state = 16;
 //BA.debugLineNum = 550;BA.debugLine="result = inputValue * 100";
_result = _inputvalue*100;
 if (true) break;

case 11:
//C
this.state = 16;
 //BA.debugLineNum = 553;BA.debugLine="result = inputValue / 12";
_result = _inputvalue/(double)12;
 if (true) break;

case 13:
//C
this.state = 16;
 //BA.debugLineNum = 556;BA.debugLine="result = inputValue * 12";
_result = _inputvalue*12;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 559;BA.debugLine="result = inputValue / 100";
_result = _inputvalue/(double)100;
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 562;BA.debugLine="value2.Text = NumberFormat(result, 1, 4)";
parent.mostCurrent._vvvvvvvvv5.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_result,(int) (1),(int) (4))));
 //BA.debugLineNum = 565;BA.debugLine="value2.SetLayoutAnimated(80, value2.Left + 3dip,";
parent.mostCurrent._vvvvvvvvv5.SetLayoutAnimated((int) (80),(int) (parent.mostCurrent._vvvvvvvvv5.getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))),parent.mostCurrent._vvvvvvvvv5.getTop(),(int) (parent.mostCurrent._vvvvvvvvv5.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (6))),parent.mostCurrent._vvvvvvvvv5.getHeight());
 //BA.debugLineNum = 566;BA.debugLine="Sleep(80)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (80));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
 //BA.debugLineNum = 567;BA.debugLine="value2.SetLayoutAnimated(80, value2.Left - 3dip,";
parent.mostCurrent._vvvvvvvvv5.SetLayoutAnimated((int) (80),(int) (parent.mostCurrent._vvvvvvvvv5.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))),parent.mostCurrent._vvvvvvvvv5.getTop(),(int) (parent.mostCurrent._vvvvvvvvv5.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (6))),parent.mostCurrent._vvvvvvvvv5.getHeight());
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _vvvvvvvvv6() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _headerpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _menutitle = null;
anywheresoftware.b4a.objects.LabelWrapper _menusubtitle = null;
 //BA.debugLineNum = 189;BA.debugLine="Sub CreateSideMenu";
 //BA.debugLineNum = 190;BA.debugLine="overlayPanel.Initialize(\"overlayPanel\")";
mostCurrent._vvvvvvvvv2.Initialize(mostCurrent.activityBA,"overlayPanel");
 //BA.debugLineNum = 191;BA.debugLine="overlayPanel.Color = Colors.ARGB(115, 35, 10, 15)";
mostCurrent._vvvvvvvvv2.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (115),(int) (35),(int) (10),(int) (15)));
 //BA.debugLineNum = 192;BA.debugLine="Activity.AddView(overlayPanel, 0, 0, 100%x, 100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._vvvvvvvvv2.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 193;BA.debugLine="overlayPanel.Visible = False";
mostCurrent._vvvvvvvvv2.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 195;BA.debugLine="sidePanel.Initialize(\"sidePanel\")";
mostCurrent._vvvvvvv5.Initialize(mostCurrent.activityBA,"sidePanel");
 //BA.debugLineNum = 196;BA.debugLine="SetPanelBackground(sidePanel, darkMaroon, 0)";
_vvvvvv7(mostCurrent._vvvvvvv5,_vvvvvvvv0,(int) (0));
 //BA.debugLineNum = 197;BA.debugLine="Activity.AddView(sidePanel, -menuWidth, 0, menuWi";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._vvvvvvv5.getObject()),(int) (-_vvvvvvv6),(int) (0),_vvvvvvv6,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 199;BA.debugLine="Dim headerPanel As Panel";
_headerpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 200;BA.debugLine="headerPanel.Initialize(\"\")";
_headerpanel.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 201;BA.debugLine="SetPanelBackground(headerPanel, primaryMaroon, 0)";
_vvvvvv7(_headerpanel,_vvvvvv0,(int) (0));
 //BA.debugLineNum = 202;BA.debugLine="sidePanel.AddView(headerPanel, 0, 0, menuWidth, 1";
mostCurrent._vvvvvvv5.AddView((android.view.View)(_headerpanel.getObject()),(int) (0),(int) (0),_vvvvvvv6,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
 //BA.debugLineNum = 204;BA.debugLine="Dim menuTitle As Label";
_menutitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 205;BA.debugLine="menuTitle.Initialize(\"\")";
_menutitle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 206;BA.debugLine="menuTitle.Text = \"Conversion Menu\"";
_menutitle.setText(BA.ObjectToCharSequence("Conversion Menu"));
 //BA.debugLineNum = 207;BA.debugLine="menuTitle.TextColor = Colors.White";
_menutitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 208;BA.debugLine="menuTitle.TextSize = 22";
_menutitle.setTextSize((float) (22));
 //BA.debugLineNum = 209;BA.debugLine="menuTitle.Typeface = Typeface.DEFAULT_BOLD";
_menutitle.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 210;BA.debugLine="menuTitle.Gravity = Gravity.CENTER_VERTICAL";
_menutitle.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 211;BA.debugLine="headerPanel.AddView(menuTitle, 20dip, 36dip, menu";
_headerpanel.AddView((android.view.View)(_menutitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (36)),(int) (_vvvvvvv6-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (34)));
 //BA.debugLineNum = 213;BA.debugLine="Dim menuSubTitle As Label";
_menusubtitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 214;BA.debugLine="menuSubTitle.Initialize(\"\")";
_menusubtitle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 215;BA.debugLine="menuSubTitle.Text = \"Select where you want to go\"";
_menusubtitle.setText(BA.ObjectToCharSequence("Select where you want to go"));
 //BA.debugLineNum = 216;BA.debugLine="menuSubTitle.TextColor = Colors.RGB(245, 218, 221";
_menusubtitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (245),(int) (218),(int) (221)));
 //BA.debugLineNum = 217;BA.debugLine="menuSubTitle.TextSize = 14";
_menusubtitle.setTextSize((float) (14));
 //BA.debugLineNum = 218;BA.debugLine="menuSubTitle.Gravity = Gravity.CENTER_VERTICAL";
_menusubtitle.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 219;BA.debugLine="headerPanel.AddView(menuSubTitle, 20dip, 72dip, m";
_headerpanel.AddView((android.view.View)(_menusubtitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (72)),(int) (_vvvvvvv6-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 221;BA.debugLine="AddMenuButton(\"Inches to Centimeter\", \"in_to_cm\",";
_vvvvvvv3("Inches to Centimeter","in_to_cm",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (165)));
 //BA.debugLineNum = 222;BA.debugLine="AddMenuButton(\"Meter to Centimeter\", \"m_to_cm\", 2";
_vvvvvvv3("Meter to Centimeter","m_to_cm",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (225)));
 //BA.debugLineNum = 223;BA.debugLine="AddMenuButton(\"Inches to Feet\", \"in_to_ft\", 285di";
_vvvvvvv3("Inches to Feet","in_to_ft",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (285)));
 //BA.debugLineNum = 224;BA.debugLine="AddMenuButton(\"Feet to Inches\", \"ft_to_in\", 345di";
_vvvvvvv3("Feet to Inches","ft_to_in",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (345)));
 //BA.debugLineNum = 225;BA.debugLine="AddMenuButton(\"Centimeter to Meter\", \"cm_to_m\", 4";
_vvvvvvv3("Centimeter to Meter","cm_to_m",anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (405)));
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvv7(String _unitname) throws Exception{
 //BA.debugLineNum = 594;BA.debugLine="Sub GetUnitAbbr(UnitName As String) As String";
 //BA.debugLineNum = 595;BA.debugLine="Select UnitName";
switch (BA.switchObjectToInt(_unitname,"Inches","Centimeter","Meter","Feet")) {
case 0: {
 //BA.debugLineNum = 597;BA.debugLine="Return \"in\"";
if (true) return "in";
 break; }
case 1: {
 //BA.debugLineNum = 599;BA.debugLine="Return \"cm\"";
if (true) return "cm";
 break; }
case 2: {
 //BA.debugLineNum = 601;BA.debugLine="Return \"m\"";
if (true) return "m";
 break; }
case 3: {
 //BA.debugLineNum = 603;BA.debugLine="Return \"ft\"";
if (true) return "ft";
 break; }
}
;
 //BA.debugLineNum = 606;BA.debugLine="Return UnitName";
if (true) return _unitname;
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private btnMenu As Button";
mostCurrent._btnmenu = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblTitle As Label";
mostCurrent._lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private sidePanel As Panel";
mostCurrent._vvvvvvv5 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private overlayPanel As Panel";
mostCurrent._vvvvvvvvv2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private isMenuOpen As Boolean = False";
_vvvvvv2 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 25;BA.debugLine="Private menuWidth As Int = 265dip";
_vvvvvvv6 = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (265));
 //BA.debugLineNum = 27;BA.debugLine="Private currentPage As String = \"main\"";
mostCurrent._vvvvvv4 = "main";
 //BA.debugLineNum = 28;BA.debugLine="Private currentConversion As String";
mostCurrent._vvvvvvvvv4 = "";
 //BA.debugLineNum = 30;BA.debugLine="Private pageRoot As Panel";
mostCurrent._vvvvvvvvv0 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private value1 As EditText";
mostCurrent._vvvvvvvvv3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private value2 As EditText";
mostCurrent._vvvvvvvvv5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private btnResult As Button";
mostCurrent._vvvvvvvv5 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private btnBack As Label";
mostCurrent._vvvvvvv7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private primaryMaroon As Int = Colors.RGB(112, 28";
_vvvvvv0 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (112),(int) (28),(int) (46));
 //BA.debugLineNum = 39;BA.debugLine="Private darkMaroon As Int = Colors.RGB(73, 18, 31";
_vvvvvvvv0 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (73),(int) (18),(int) (31));
 //BA.debugLineNum = 40;BA.debugLine="Private softMaroon As Int = Colors.RGB(145, 52, 7";
_vvvvvvvvvv1 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (145),(int) (52),(int) (72));
 //BA.debugLineNum = 41;BA.debugLine="Private warmCream As Int = Colors.RGB(253, 247, 2";
_vvvvvvvvvv2 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (253),(int) (247),(int) (241));
 //BA.debugLineNum = 42;BA.debugLine="Private cardCream As Int = Colors.RGB(255, 251, 2";
_vvvvvvvvv1 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (251),(int) (247));
 //BA.debugLineNum = 43;BA.debugLine="Private softPink As Int = Colors.RGB(248, 226, 22";
_vvvvvvvvvv3 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (248),(int) (226),(int) (226));
 //BA.debugLineNum = 44;BA.debugLine="Private mutedText As Int = Colors.RGB(125, 91, 91";
_vvvvvvv2 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (125),(int) (91),(int) (91));
 //BA.debugLineNum = 45;BA.debugLine="Private darkText As Int = Colors.RGB(55, 35, 38)";
_vvvvvvv1 = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (55),(int) (35),(int) (38));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static void  _vvvvvv5() throws Exception{
ResumableSub_GoBackToMain rsub = new ResumableSub_GoBackToMain(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GoBackToMain extends BA.ResumableSub {
public ResumableSub_GoBackToMain(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 630;BA.debugLine="If pageRoot.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._vvvvvvvvv0.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 631;BA.debugLine="pageRoot.SetLayoutAnimated(220, 100%x + 20dip, 0";
parent.mostCurrent._vvvvvvvvv0.SetLayoutAnimated((int) (220),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 632;BA.debugLine="Sleep(220)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (220));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 635;BA.debugLine="LoadMainPage";
_vvvvvv1();
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _vvvvvvvvvv4(String _pagetitle,String _conversiontype,String _unit1,String _unit2) throws Exception{
ResumableSub_LoadConversionPage rsub = new ResumableSub_LoadConversionPage(null,_pagetitle,_conversiontype,_unit1,_unit2);
rsub.resume(processBA, null);
}
public static class ResumableSub_LoadConversionPage extends BA.ResumableSub {
public ResumableSub_LoadConversionPage(b4a.example.main parent,String _pagetitle,String _conversiontype,String _unit1,String _unit2) {
this.parent = parent;
this._pagetitle = _pagetitle;
this._conversiontype = _conversiontype;
this._unit1 = _unit1;
this._unit2 = _unit2;
}
b4a.example.main parent;
String _pagetitle;
String _conversiontype;
String _unit1;
String _unit2;
anywheresoftware.b4a.objects.PanelWrapper _toppanel = null;
anywheresoftware.b4a.objects.PanelWrapper _softcircle = null;
anywheresoftware.b4a.objects.LabelWrapper _subtitle = null;
anywheresoftware.b4a.objects.PanelWrapper _card = null;
anywheresoftware.b4a.objects.LabelWrapper _lblinput = null;
anywheresoftware.b4a.objects.PanelWrapper _inputbox = null;
anywheresoftware.b4a.objects.LabelWrapper _unitlabel1 = null;
anywheresoftware.b4a.objects.LabelWrapper _arrowlabel = null;
anywheresoftware.b4a.objects.LabelWrapper _lbloutput = null;
anywheresoftware.b4a.objects.PanelWrapper _outputbox = null;
anywheresoftware.b4a.objects.LabelWrapper _unitlabel2 = null;
anywheresoftware.b4a.objects.LabelWrapper _keyboardnote = null;
anywheresoftware.b4a.objects.LabelWrapper _footertext = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 369;BA.debugLine="currentPage = \"converter\"";
parent.mostCurrent._vvvvvv4 = "converter";
 //BA.debugLineNum = 370;BA.debugLine="currentConversion = ConversionType";
parent.mostCurrent._vvvvvvvvv4 = _conversiontype;
 //BA.debugLineNum = 371;BA.debugLine="isMenuOpen = False";
parent._vvvvvv2 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 373;BA.debugLine="Activity.RemoveAllViews";
parent.mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 374;BA.debugLine="Activity.Color = warmCream";
parent.mostCurrent._activity.setColor(parent._vvvvvvvvvv2);
 //BA.debugLineNum = 376;BA.debugLine="pageRoot.Initialize(\"pageRoot\")";
parent.mostCurrent._vvvvvvvvv0.Initialize(mostCurrent.activityBA,"pageRoot");
 //BA.debugLineNum = 377;BA.debugLine="pageRoot.Color = warmCream";
parent.mostCurrent._vvvvvvvvv0.setColor(parent._vvvvvvvvvv2);
 //BA.debugLineNum = 378;BA.debugLine="Activity.AddView(pageRoot, 100%x, 0, 100%x, 100%y";
parent.mostCurrent._activity.AddView((android.view.View)(parent.mostCurrent._vvvvvvvvv0.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 380;BA.debugLine="Dim topPanel As Panel";
_toppanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 381;BA.debugLine="topPanel.Initialize(\"\")";
_toppanel.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 382;BA.debugLine="SetPanelBackground(topPanel, darkMaroon, 0)";
_vvvvvv7(_toppanel,parent._vvvvvvvv0,(int) (0));
 //BA.debugLineNum = 383;BA.debugLine="pageRoot.AddView(topPanel, 0, 0, 100%x, 118dip)";
parent.mostCurrent._vvvvvvvvv0.AddView((android.view.View)(_toppanel.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (118)));
 //BA.debugLineNum = 385;BA.debugLine="Dim softCircle As Panel";
_softcircle = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 386;BA.debugLine="softCircle.Initialize(\"\")";
_softcircle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 387;BA.debugLine="SetPanelBackground(softCircle, Colors.ARGB(38, 25";
_vvvvvv7(_softcircle,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (38),(int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)));
 //BA.debugLineNum = 388;BA.debugLine="topPanel.AddView(softCircle, 100%x - 70dip, -35di";
_toppanel.AddView((android.view.View)(_softcircle.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (35))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)));
 //BA.debugLineNum = 390;BA.debugLine="btnBack.Initialize(\"btnBack\")";
parent.mostCurrent._vvvvvvv7.Initialize(mostCurrent.activityBA,"btnBack");
 //BA.debugLineNum = 391;BA.debugLine="btnBack.Text = \"‹\"";
parent.mostCurrent._vvvvvvv7.setText(BA.ObjectToCharSequence("‹"));
 //BA.debugLineNum = 392;BA.debugLine="btnBack.TextSize = 44";
parent.mostCurrent._vvvvvvv7.setTextSize((float) (44));
 //BA.debugLineNum = 393;BA.debugLine="btnBack.TextColor = Colors.White";
parent.mostCurrent._vvvvvvv7.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 394;BA.debugLine="btnBack.Gravity = Gravity.CENTER";
parent.mostCurrent._vvvvvvv7.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 395;BA.debugLine="btnBack.Typeface = Typeface.DEFAULT_BOLD";
parent.mostCurrent._vvvvvvv7.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 396;BA.debugLine="topPanel.AddView(btnBack, 12dip, 42dip, 54dip, 48";
_toppanel.AddView((android.view.View)(parent.mostCurrent._vvvvvvv7.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (12)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (42)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (54)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)));
 //BA.debugLineNum = 398;BA.debugLine="lblTitle.Initialize(\"\")";
parent.mostCurrent._lbltitle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 399;BA.debugLine="lblTitle.Text = PageTitle";
parent.mostCurrent._lbltitle.setText(BA.ObjectToCharSequence(_pagetitle));
 //BA.debugLineNum = 400;BA.debugLine="lblTitle.TextSize = 20";
parent.mostCurrent._lbltitle.setTextSize((float) (20));
 //BA.debugLineNum = 401;BA.debugLine="lblTitle.TextColor = Colors.White";
parent.mostCurrent._lbltitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 402;BA.debugLine="lblTitle.Typeface = Typeface.DEFAULT_BOLD";
parent.mostCurrent._lbltitle.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 403;BA.debugLine="lblTitle.Gravity = Gravity.CENTER_VERTICAL";
parent.mostCurrent._lbltitle.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 404;BA.debugLine="topPanel.AddView(lblTitle, 70dip, 43dip, 100%x -";
_toppanel.AddView((android.view.View)(parent.mostCurrent._lbltitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (43)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (92))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (34)));
 //BA.debugLineNum = 406;BA.debugLine="Dim subtitle As Label";
_subtitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 407;BA.debugLine="subtitle.Initialize(\"\")";
_subtitle.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 408;BA.debugLine="subtitle.Text = \"Enter one value, then convert.\"";
_subtitle.setText(BA.ObjectToCharSequence("Enter one value, then convert."));
 //BA.debugLineNum = 409;BA.debugLine="subtitle.TextSize = 13";
_subtitle.setTextSize((float) (13));
 //BA.debugLineNum = 410;BA.debugLine="subtitle.TextColor = Colors.RGB(239, 211, 214)";
_subtitle.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (239),(int) (211),(int) (214)));
 //BA.debugLineNum = 411;BA.debugLine="subtitle.Gravity = Gravity.CENTER_VERTICAL";
_subtitle.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 412;BA.debugLine="topPanel.AddView(subtitle, 70dip, 72dip, 100%x -";
_toppanel.AddView((android.view.View)(_subtitle.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (72)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (92))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)));
 //BA.debugLineNum = 414;BA.debugLine="Dim card As Panel";
_card = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 415;BA.debugLine="card.Initialize(\"\")";
_card.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 416;BA.debugLine="SetPanelBackground(card, cardCream, 28dip)";
_vvvvvv7(_card,parent._vvvvvvvvv1,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (28)));
 //BA.debugLineNum = 417;BA.debugLine="pageRoot.AddView(card, 20dip, 150dip, 100%x - 40d";
parent.mostCurrent._vvvvvvvvv0.AddView((android.view.View)(_card.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (390)));
 //BA.debugLineNum = 419;BA.debugLine="Dim lblInput As Label";
_lblinput = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 420;BA.debugLine="lblInput.Initialize(\"\")";
_lblinput.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 421;BA.debugLine="lblInput.Text = Unit1 & \" Value\"";
_lblinput.setText(BA.ObjectToCharSequence(_unit1+" Value"));
 //BA.debugLineNum = 422;BA.debugLine="lblInput.TextSize = 15";
_lblinput.setTextSize((float) (15));
 //BA.debugLineNum = 423;BA.debugLine="lblInput.TextColor = darkText";
_lblinput.setTextColor(parent._vvvvvvv1);
 //BA.debugLineNum = 424;BA.debugLine="lblInput.Typeface = Typeface.DEFAULT_BOLD";
_lblinput.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 425;BA.debugLine="card.AddView(lblInput, 24dip, 32dip, 100%x - 88di";
_card.AddView((android.view.View)(_lblinput.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 427;BA.debugLine="Dim inputBox As Panel";
_inputbox = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 428;BA.debugLine="inputBox.Initialize(\"\")";
_inputbox.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 429;BA.debugLine="SetPanelBackground(inputBox, Colors.RGB(255, 241,";
_vvvvvv7(_inputbox,anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (241),(int) (239)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 430;BA.debugLine="card.AddView(inputBox, 24dip, 65dip, 100%x - 88di";
_card.AddView((android.view.View)(_inputbox.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (65)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)));
 //BA.debugLineNum = 432;BA.debugLine="value1.Initialize(\"value1\")";
parent.mostCurrent._vvvvvvvvv3.Initialize(mostCurrent.activityBA,"value1");
 //BA.debugLineNum = 433;BA.debugLine="value1.Hint = \"Enter value\"";
parent.mostCurrent._vvvvvvvvv3.setHint("Enter value");
 //BA.debugLineNum = 434;BA.debugLine="value1.TextSize = 18";
parent.mostCurrent._vvvvvvvvv3.setTextSize((float) (18));
 //BA.debugLineNum = 435;BA.debugLine="value1.SingleLine = True";
parent.mostCurrent._vvvvvvvvv3.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 436;BA.debugLine="value1.ForceDoneButton = True";
parent.mostCurrent._vvvvvvvvv3.setForceDoneButton(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 437;BA.debugLine="value1.InputType = value1.INPUT_TYPE_DECIMAL_NUMB";
parent.mostCurrent._vvvvvvvvv3.setInputType(parent.mostCurrent._vvvvvvvvv3.INPUT_TYPE_DECIMAL_NUMBERS);
 //BA.debugLineNum = 438;BA.debugLine="value1.TextColor = darkText";
parent.mostCurrent._vvvvvvvvv3.setTextColor(parent._vvvvvvv1);
 //BA.debugLineNum = 439;BA.debugLine="value1.HintColor = Colors.RGB(160, 130, 130)";
parent.mostCurrent._vvvvvvvvv3.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (160),(int) (130),(int) (130)));
 //BA.debugLineNum = 440;BA.debugLine="value1.Padding = Array As Int(15dip, 0, 15dip, 0)";
parent.mostCurrent._vvvvvvvvv3.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)),(int) (0)});
 //BA.debugLineNum = 441;BA.debugLine="value1.Background = Null";
parent.mostCurrent._vvvvvvvvv3.setBackground((android.graphics.drawable.Drawable)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 442;BA.debugLine="inputBox.AddView(value1, 0, 0, inputBox.Width - 7";
_inputbox.AddView((android.view.View)(parent.mostCurrent._vvvvvvvvv3.getObject()),(int) (0),(int) (0),(int) (_inputbox.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)));
 //BA.debugLineNum = 444;BA.debugLine="Dim unitLabel1 As Label";
_unitlabel1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 445;BA.debugLine="unitLabel1.Initialize(\"\")";
_unitlabel1.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 446;BA.debugLine="unitLabel1.Text = GetUnitAbbr(Unit1)";
_unitlabel1.setText(BA.ObjectToCharSequence(_vvvvvvvvv7(_unit1)));
 //BA.debugLineNum = 447;BA.debugLine="unitLabel1.TextSize = 15";
_unitlabel1.setTextSize((float) (15));
 //BA.debugLineNum = 448;BA.debugLine="unitLabel1.TextColor = primaryMaroon";
_unitlabel1.setTextColor(parent._vvvvvv0);
 //BA.debugLineNum = 449;BA.debugLine="unitLabel1.Typeface = Typeface.DEFAULT_BOLD";
_unitlabel1.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 450;BA.debugLine="unitLabel1.Gravity = Gravity.CENTER";
_unitlabel1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 451;BA.debugLine="inputBox.AddView(unitLabel1, inputBox.Width - 70d";
_inputbox.AddView((android.view.View)(_unitlabel1.getObject()),(int) (_inputbox.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (65)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)));
 //BA.debugLineNum = 453;BA.debugLine="Dim arrowLabel As Label";
_arrowlabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 454;BA.debugLine="arrowLabel.Initialize(\"\")";
_arrowlabel.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 455;BA.debugLine="arrowLabel.Text = \"↓\"";
_arrowlabel.setText(BA.ObjectToCharSequence("↓"));
 //BA.debugLineNum = 456;BA.debugLine="arrowLabel.TextSize = 24";
_arrowlabel.setTextSize((float) (24));
 //BA.debugLineNum = 457;BA.debugLine="arrowLabel.TextColor = primaryMaroon";
_arrowlabel.setTextColor(parent._vvvvvv0);
 //BA.debugLineNum = 458;BA.debugLine="arrowLabel.Gravity = Gravity.CENTER";
_arrowlabel.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 459;BA.debugLine="card.AddView(arrowLabel, 0, 132dip, 100%x - 40dip";
_card.AddView((android.view.View)(_arrowlabel.getObject()),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (132)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
 //BA.debugLineNum = 461;BA.debugLine="Dim lblOutput As Label";
_lbloutput = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 462;BA.debugLine="lblOutput.Initialize(\"\")";
_lbloutput.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 463;BA.debugLine="lblOutput.Text = Unit2 & \" Value\"";
_lbloutput.setText(BA.ObjectToCharSequence(_unit2+" Value"));
 //BA.debugLineNum = 464;BA.debugLine="lblOutput.TextSize = 15";
_lbloutput.setTextSize((float) (15));
 //BA.debugLineNum = 465;BA.debugLine="lblOutput.TextColor = darkText";
_lbloutput.setTextColor(parent._vvvvvvv1);
 //BA.debugLineNum = 466;BA.debugLine="lblOutput.Typeface = Typeface.DEFAULT_BOLD";
_lbloutput.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 467;BA.debugLine="card.AddView(lblOutput, 24dip, 166dip, 100%x - 88";
_card.AddView((android.view.View)(_lbloutput.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (166)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 469;BA.debugLine="Dim outputBox As Panel";
_outputbox = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 470;BA.debugLine="outputBox.Initialize(\"\")";
_outputbox.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 471;BA.debugLine="SetPanelBackground(outputBox, softPink, 18dip)";
_vvvvvv7(_outputbox,parent._vvvvvvvvvv3,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 472;BA.debugLine="card.AddView(outputBox, 24dip, 199dip, 100%x - 88";
_card.AddView((android.view.View)(_outputbox.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (199)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)));
 //BA.debugLineNum = 474;BA.debugLine="value2.Initialize(\"value2\")";
parent.mostCurrent._vvvvvvvvv5.Initialize(mostCurrent.activityBA,"value2");
 //BA.debugLineNum = 475;BA.debugLine="value2.Hint = \"Converted value\"";
parent.mostCurrent._vvvvvvvvv5.setHint("Converted value");
 //BA.debugLineNum = 476;BA.debugLine="value2.TextSize = 18";
parent.mostCurrent._vvvvvvvvv5.setTextSize((float) (18));
 //BA.debugLineNum = 477;BA.debugLine="value2.SingleLine = True";
parent.mostCurrent._vvvvvvvvv5.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 478;BA.debugLine="value2.Enabled = False";
parent.mostCurrent._vvvvvvvvv5.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 479;BA.debugLine="value2.TextColor = darkText";
parent.mostCurrent._vvvvvvvvv5.setTextColor(parent._vvvvvvv1);
 //BA.debugLineNum = 480;BA.debugLine="value2.HintColor = Colors.RGB(160, 130, 130)";
parent.mostCurrent._vvvvvvvvv5.setHintColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (160),(int) (130),(int) (130)));
 //BA.debugLineNum = 481;BA.debugLine="value2.Padding = Array As Int(15dip, 0, 15dip, 0)";
parent.mostCurrent._vvvvvvvvv5.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)),(int) (0)});
 //BA.debugLineNum = 482;BA.debugLine="value2.Background = Null";
parent.mostCurrent._vvvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 483;BA.debugLine="outputBox.AddView(value2, 0, 0, outputBox.Width -";
_outputbox.AddView((android.view.View)(parent.mostCurrent._vvvvvvvvv5.getObject()),(int) (0),(int) (0),(int) (_outputbox.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)));
 //BA.debugLineNum = 485;BA.debugLine="Dim unitLabel2 As Label";
_unitlabel2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 486;BA.debugLine="unitLabel2.Initialize(\"\")";
_unitlabel2.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 487;BA.debugLine="unitLabel2.Text = GetUnitAbbr(Unit2)";
_unitlabel2.setText(BA.ObjectToCharSequence(_vvvvvvvvv7(_unit2)));
 //BA.debugLineNum = 488;BA.debugLine="unitLabel2.TextSize = 15";
_unitlabel2.setTextSize((float) (15));
 //BA.debugLineNum = 489;BA.debugLine="unitLabel2.TextColor = primaryMaroon";
_unitlabel2.setTextColor(parent._vvvvvv0);
 //BA.debugLineNum = 490;BA.debugLine="unitLabel2.Typeface = Typeface.DEFAULT_BOLD";
_unitlabel2.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 491;BA.debugLine="unitLabel2.Gravity = Gravity.CENTER";
_unitlabel2.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 492;BA.debugLine="outputBox.AddView(unitLabel2, outputBox.Width - 7";
_outputbox.AddView((android.view.View)(_unitlabel2.getObject()),(int) (_outputbox.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70))),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (65)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (58)));
 //BA.debugLineNum = 494;BA.debugLine="btnResult.Initialize(\"btnResult\")";
parent.mostCurrent._vvvvvvvv5.Initialize(mostCurrent.activityBA,"btnResult");
 //BA.debugLineNum = 495;BA.debugLine="btnResult.Text = \"Convert\"";
parent.mostCurrent._vvvvvvvv5.setText(BA.ObjectToCharSequence("Convert"));
 //BA.debugLineNum = 496;BA.debugLine="btnResult.TextSize = 17";
parent.mostCurrent._vvvvvvvv5.setTextSize((float) (17));
 //BA.debugLineNum = 497;BA.debugLine="btnResult.TextColor = Colors.White";
parent.mostCurrent._vvvvvvvv5.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 498;BA.debugLine="btnResult.Typeface = Typeface.DEFAULT_BOLD";
parent.mostCurrent._vvvvvvvv5.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 499;BA.debugLine="SetResultButtonNormal";
_vvvvvvvv6();
 //BA.debugLineNum = 500;BA.debugLine="card.AddView(btnResult, 24dip, 295dip, 100%x - 88";
_card.AddView((android.view.View)(parent.mostCurrent._vvvvvvvv5.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (295)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (54)));
 //BA.debugLineNum = 502;BA.debugLine="Dim keyboardNote As Label";
_keyboardnote = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 503;BA.debugLine="keyboardNote.Initialize(\"\")";
_keyboardnote.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 504;BA.debugLine="keyboardNote.Text = \"Press Convert or tap Enter o";
_keyboardnote.setText(BA.ObjectToCharSequence("Press Convert or tap Enter on your keyboard."));
 //BA.debugLineNum = 505;BA.debugLine="keyboardNote.TextSize = 12";
_keyboardnote.setTextSize((float) (12));
 //BA.debugLineNum = 506;BA.debugLine="keyboardNote.TextColor = mutedText";
_keyboardnote.setTextColor(parent._vvvvvvv2);
 //BA.debugLineNum = 507;BA.debugLine="keyboardNote.Gravity = Gravity.CENTER";
_keyboardnote.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 508;BA.debugLine="card.AddView(keyboardNote, 24dip, 354dip, 100%x -";
_card.AddView((android.view.View)(_keyboardnote.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (24)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (354)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (88))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 510;BA.debugLine="Dim footerText As Label";
_footertext = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 511;BA.debugLine="footerText.Initialize(\"\")";
_footertext.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 512;BA.debugLine="footerText.Text = \"AG D. Evangelista\"";
_footertext.setText(BA.ObjectToCharSequence("AG D. Evangelista"));
 //BA.debugLineNum = 513;BA.debugLine="footerText.TextSize = 13";
_footertext.setTextSize((float) (13));
 //BA.debugLineNum = 514;BA.debugLine="footerText.TextColor = mutedText";
_footertext.setTextColor(parent._vvvvvvv2);
 //BA.debugLineNum = 515;BA.debugLine="footerText.Gravity = Gravity.CENTER";
_footertext.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 516;BA.debugLine="pageRoot.AddView(footerText, 25dip, 555dip, 100%x";
parent.mostCurrent._vvvvvvvvv0.AddView((android.view.View)(_footertext.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (555)),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (28)));
 //BA.debugLineNum = 519;BA.debugLine="pageRoot.SetLayoutAnimated(240, -6dip, 0, 100%x,";
parent.mostCurrent._vvvvvvvvv0.SetLayoutAnimated((int) (240),(int) (-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (6))),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 520;BA.debugLine="Sleep(240)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (240));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 521;BA.debugLine="pageRoot.SetLayoutAnimated(100, 0, 0, 100%x, 100%";
parent.mostCurrent._vvvvvvvvv0.SetLayoutAnimated((int) (100),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _vvvvvv1() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub LoadMainPage";
 //BA.debugLineNum = 65;BA.debugLine="Activity.RemoveAllViews";
mostCurrent._activity.RemoveAllViews();
 //BA.debugLineNum = 66;BA.debugLine="Activity.Color = warmCream";
mostCurrent._activity.setColor(_vvvvvvvvvv2);
 //BA.debugLineNum = 67;BA.debugLine="Activity.LoadLayout(\"main\")";
mostCurrent._activity.LoadLayout("main",mostCurrent.activityBA);
 //BA.debugLineNum = 68;BA.debugLine="currentPage = \"main\"";
mostCurrent._vvvvvv4 = "main";
 //BA.debugLineNum = 69;BA.debugLine="isMenuOpen = False";
_vvvvvv2 = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 71;BA.debugLine="BuildMainUI";
_vvvvvvvv7();
 //BA.debugLineNum = 72;BA.debugLine="CreateSideMenu";
_vvvvvvvvv6();
 //BA.debugLineNum = 74;BA.debugLine="btnMenu.BringToFront";
mostCurrent._btnmenu.BringToFront();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static void  _menubutton_click() throws Exception{
ResumableSub_menuButton_Click rsub = new ResumableSub_menuButton_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_menuButton_Click extends BA.ResumableSub {
public ResumableSub_menuButton_Click(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 339;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 341;BA.debugLine="If isMenuOpen Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._vvvvvv2) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 342;BA.debugLine="CloseMenu";
_vvvvvv3();
 //BA.debugLineNum = 343;BA.debugLine="Sleep(80)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (80));
this.state = 16;
return;
case 16:
//C
this.state = 4;
;
 if (true) break;
;
 //BA.debugLineNum = 346;BA.debugLine="Select btn.Tag";

case 4:
//select
this.state = 15;
switch (BA.switchObjectToInt(_btn.getTag(),(Object)("in_to_cm"),(Object)("m_to_cm"),(Object)("in_to_ft"),(Object)("ft_to_in"),(Object)("cm_to_m"))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
case 2: {
this.state = 10;
if (true) break;
}
case 3: {
this.state = 12;
if (true) break;
}
case 4: {
this.state = 14;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 15;
 //BA.debugLineNum = 348;BA.debugLine="LoadConversionPage(\"Inches to Centimeter\", \"in_";
_vvvvvvvvvv4("Inches to Centimeter","in_to_cm","Inches","Centimeter");
 if (true) break;

case 8:
//C
this.state = 15;
 //BA.debugLineNum = 351;BA.debugLine="LoadConversionPage(\"Meter to Centimeter\", \"m_to";
_vvvvvvvvvv4("Meter to Centimeter","m_to_cm","Meter","Centimeter");
 if (true) break;

case 10:
//C
this.state = 15;
 //BA.debugLineNum = 354;BA.debugLine="LoadConversionPage(\"Inches to Feet\", \"in_to_ft\"";
_vvvvvvvvvv4("Inches to Feet","in_to_ft","Inches","Feet");
 if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 357;BA.debugLine="LoadConversionPage(\"Feet to Inches\", \"ft_to_in\"";
_vvvvvvvvvv4("Feet to Inches","ft_to_in","Feet","Inches");
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 360;BA.debugLine="LoadConversionPage(\"Centimeter to Meter\", \"cm_t";
_vvvvvvvvvv4("Centimeter to Meter","cm_to_m","Centimeter","Meter");
 if (true) break;

case 15:
//C
this.state = -1;
;
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _menubutton_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
 //BA.debugLineNum = 324;BA.debugLine="Sub menuButton_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 325;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 327;BA.debugLine="If Action = 0 Then";
if (_action==0) { 
 //BA.debugLineNum = 328;BA.debugLine="SetButtonPressed(btn)";
_vvvvvvvvvv5(_btn);
 //BA.debugLineNum = 329;BA.debugLine="btn.SetLayoutAnimated(70, btn.Left + 3dip, btn.T";
_btn.SetLayoutAnimated((int) (70),(int) (_btn.getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3))),(int) (_btn.getTop()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2))),(int) (_btn.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (6))),(int) (_btn.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (4))));
 }else if(_action==1 || _action==3) { 
 //BA.debugLineNum = 331;BA.debugLine="SetButtonNormal(btn)";
_vvvvvvv4(_btn);
 //BA.debugLineNum = 332;BA.debugLine="btn.SetLayoutAnimated(70, 16dip, btn.Top - 2dip,";
_btn.SetLayoutAnimated((int) (70),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)),(int) (_btn.getTop()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2))),(int) (_vvvvvvv6-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)));
 };
 //BA.debugLineNum = 335;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return false;
}
public static void  _vvvvvvv0() throws Exception{
ResumableSub_OpenMenu rsub = new ResumableSub_OpenMenu(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_OpenMenu extends BA.ResumableSub {
public ResumableSub_OpenMenu(b4a.example.main parent) {
this.parent = parent;
}
b4a.example.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 293;BA.debugLine="overlayPanel.Visible = True";
parent.mostCurrent._vvvvvvvvv2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 294;BA.debugLine="overlayPanel.BringToFront";
parent.mostCurrent._vvvvvvvvv2.BringToFront();
 //BA.debugLineNum = 295;BA.debugLine="sidePanel.BringToFront";
parent.mostCurrent._vvvvvvv5.BringToFront();
 //BA.debugLineNum = 298;BA.debugLine="sidePanel.SetLayoutAnimated(180, 10dip, 0, menuWi";
parent.mostCurrent._vvvvvvv5.SetLayoutAnimated((int) (180),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),(int) (0),parent._vvvvvvv6,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 299;BA.debugLine="Sleep(180)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,this,(int) (180));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 300;BA.debugLine="sidePanel.SetLayoutAnimated(110, 0, 0, menuWidth,";
parent.mostCurrent._vvvvvvv5.SetLayoutAnimated((int) (110),(int) (0),(int) (0),parent._vvvvvvv6,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 302;BA.debugLine="isMenuOpen = True";
parent._vvvvvv2 = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 303;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _overlaypanel_click() throws Exception{
 //BA.debugLineNum = 320;BA.debugLine="Sub overlayPanel_Click";
 //BA.debugLineNum = 321;BA.debugLine="If isMenuOpen Then CloseMenu";
if (_vvvvvv2) { 
_vvvvvv3();};
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
starter._process_globals();
inchestocm._process_globals();
metertocm._process_globals();
inchestofeet._process_globals();
feettoinches._process_globals();
cmtometer._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}

private static byte[][] bb;

public static String vvv13(final byte[] _b, final int i) throws Exception {
Runnable r = new Runnable() {
{

int value = i / 5 + 814453;
if (bb == null) {
		
                bb = new byte[4][];
				bb[0] = BA.packageName.getBytes("UTF8");
                bb[1] = BA.applicationContext.getPackageManager().getPackageInfo(BA.packageName, 0).versionName.getBytes("UTF8");
                if (bb[1].length == 0)
                    bb[1] = "jsdkfh".getBytes("UTF8");
                bb[2] = new byte[] { (byte)BA.applicationContext.getPackageManager().getPackageInfo(BA.packageName, 0).versionCode };			
        }
        bb[3] = new byte[] {
                    (byte) (value >>> 24),
						(byte) (value >>> 16),
						(byte) (value >>> 8),
						(byte) value};
				try {
					for (int __b = 0;__b < (3 + 1);__b ++) {
						for (int b = 0;b<_b.length;b++) {
							_b[b] ^= bb[__b][b % bb[__b].length];
						}
					}

				} catch (Exception e) {
					throw new RuntimeException(e);
				}
                

            
}
public void run() {
}
};
return new String(_b, "UTF8");
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvv4(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 241;BA.debugLine="Sub SetButtonNormal(btn As Button)";
 //BA.debugLineNum = 242;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 243;BA.debugLine="cd.Initialize(Colors.RGB(126, 34, 54), 16dip)";
_cd.Initialize(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (126),(int) (34),(int) (54)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
 //BA.debugLineNum = 244;BA.debugLine="btn.Background = cd";
_btn.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvv5(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 247;BA.debugLine="Sub SetButtonPressed(btn As Button)";
 //BA.debugLineNum = 248;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 249;BA.debugLine="cd.Initialize(Colors.RGB(166, 58, 80), 16dip)";
_cd.Initialize(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (166),(int) (58),(int) (80)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
 //BA.debugLineNum = 250;BA.debugLine="btn.Background = cd";
_btn.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvv7(anywheresoftware.b4a.objects.PanelWrapper _pnl,int _clr,int _radius) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 664;BA.debugLine="Sub SetPanelBackground(pnl As Panel, clr As Int, r";
 //BA.debugLineNum = 665;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 666;BA.debugLine="cd.Initialize(clr, radius)";
_cd.Initialize(_clr,_radius);
 //BA.debugLineNum = 667;BA.debugLine="pnl.Background = cd";
_pnl.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 668;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv6() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 582;BA.debugLine="Sub SetResultButtonNormal";
 //BA.debugLineNum = 583;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 584;BA.debugLine="cd.Initialize(primaryMaroon, 18dip)";
_cd.Initialize(_vvvvvv0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 585;BA.debugLine="btnResult.Background = cd";
mostCurrent._vvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv4() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 588;BA.debugLine="Sub SetResultButtonPressed";
 //BA.debugLineNum = 589;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 590;BA.debugLine="cd.Initialize(softMaroon, 16dip)";
_cd.Initialize(_vvvvvvvvvv1,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
 //BA.debugLineNum = 591;BA.debugLine="btnResult.Background = cd";
mostCurrent._vvvvvvvv5.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv2() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _menubg = null;
 //BA.debugLineNum = 271;BA.debugLine="Sub StyleMenuButtonNormal";
 //BA.debugLineNum = 272;BA.debugLine="btnMenu.Text = \"☰\"";
mostCurrent._btnmenu.setText(BA.ObjectToCharSequence("☰"));
 //BA.debugLineNum = 273;BA.debugLine="btnMenu.TextSize = 25";
mostCurrent._btnmenu.setTextSize((float) (25));
 //BA.debugLineNum = 274;BA.debugLine="btnMenu.TextColor = Colors.White";
mostCurrent._btnmenu.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 275;BA.debugLine="btnMenu.Typeface = Typeface.DEFAULT_BOLD";
mostCurrent._btnmenu.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 276;BA.debugLine="btnMenu.Gravity = Gravity.CENTER";
mostCurrent._btnmenu.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 277;BA.debugLine="btnMenu.SetLayoutAnimated(0, 18dip, 32dip, 52dip,";
mostCurrent._btnmenu.SetLayoutAnimated((int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (52)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (52)));
 //BA.debugLineNum = 279;BA.debugLine="Dim menuBg As ColorDrawable";
_menubg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 280;BA.debugLine="menuBg.Initialize(softMaroon, 18dip)";
_menubg.Initialize(_vvvvvvvvvv1,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18)));
 //BA.debugLineNum = 281;BA.debugLine="btnMenu.Background = menuBg";
mostCurrent._btnmenu.setBackground((android.graphics.drawable.Drawable)(_menubg.getObject()));
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvv1() throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _menubg = null;
 //BA.debugLineNum = 284;BA.debugLine="Sub StyleMenuButtonPressed";
 //BA.debugLineNum = 285;BA.debugLine="btnMenu.SetLayoutAnimated(80, 20dip, 34dip, 48dip";
mostCurrent._btnmenu.SetLayoutAnimated((int) (80),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (34)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (48)));
 //BA.debugLineNum = 287;BA.debugLine="Dim menuBg As ColorDrawable";
_menubg = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 288;BA.debugLine="menuBg.Initialize(primaryMaroon, 16dip)";
_menubg.Initialize(_vvvvvv0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
 //BA.debugLineNum = 289;BA.debugLine="btnMenu.Background = menuBg";
mostCurrent._btnmenu.setBackground((android.graphics.drawable.Drawable)(_menubg.getObject()));
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public static String  _value1_enterpressed() throws Exception{
 //BA.debugLineNum = 532;BA.debugLine="Sub value1_EnterPressed";
 //BA.debugLineNum = 533;BA.debugLine="ConvertValue";
_vvvvvvvv3();
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return "";
}
}
