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
	public static final boolean includeTitle = true;
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnblack = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnblue = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbrown = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconfirm = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btngold = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btngray = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btngreen = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnorange = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnred = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsilver = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnviolet = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnwhite = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnyellow = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblinstruction = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblresult = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlband1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlband2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmultiplier = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltolerance = null;
public anywheresoftware.b4a.objects.ButtonWrapper[] _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public static String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public static int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public static double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public static String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
String[] _colornames = null;
int[] _digitnums = null;
double[] _mults = null;
int _i = 0;
 //BA.debugLineNum = 42;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 43;BA.debugLine="Activity.LoadLayout(\"Layout\")";
mostCurrent._activity.LoadLayout("Layout",mostCurrent.activityBA);
 //BA.debugLineNum = 46;BA.debugLine="DigitValues.Initialize";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="MultiplierValues.Initialize";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="ToleranceValues.Initialize";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="ColorMap.Initialize";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="Dim ColorNames() As String = Array As String(\"Bla";
_colornames = new String[]{"Black","Brown","Red","Orange","Yellow","Green","Blue","Violet","Gray","White","Gold","Silver"};
 //BA.debugLineNum = 54;BA.debugLine="ColorMap.Put(\"Black\", Colors.Black)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Black"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.Black));
 //BA.debugLineNum = 55;BA.debugLine="ColorMap.Put(\"Brown\", Colors.RGB(139, 69, 19))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Brown"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (139),(int) (69),(int) (19))));
 //BA.debugLineNum = 56;BA.debugLine="ColorMap.Put(\"Red\", Colors.Red)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Red"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.Red));
 //BA.debugLineNum = 57;BA.debugLine="ColorMap.Put(\"Orange\", Colors.RGB(255, 165, 0))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Orange"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (165),(int) (0))));
 //BA.debugLineNum = 58;BA.debugLine="ColorMap.Put(\"Yellow\", Colors.Yellow)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Yellow"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.Yellow));
 //BA.debugLineNum = 59;BA.debugLine="ColorMap.Put(\"Green\", Colors.Green)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Green"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.Green));
 //BA.debugLineNum = 60;BA.debugLine="ColorMap.Put(\"Blue\", Colors.Blue)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Blue"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.Blue));
 //BA.debugLineNum = 61;BA.debugLine="ColorMap.Put(\"Violet\", Colors.RGB(148, 0, 211))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Violet"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (148),(int) (0),(int) (211))));
 //BA.debugLineNum = 62;BA.debugLine="ColorMap.Put(\"Gray\", Colors.Gray)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Gray"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.Gray));
 //BA.debugLineNum = 63;BA.debugLine="ColorMap.Put(\"White\", Colors.White)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("White"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.White));
 //BA.debugLineNum = 64;BA.debugLine="ColorMap.Put(\"Gold\", Colors.RGB(212, 175, 55))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Gold"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (212),(int) (175),(int) (55))));
 //BA.debugLineNum = 65;BA.debugLine="ColorMap.Put(\"Silver\", Colors.RGB(192, 192, 192))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Put((Object)("Silver"),(Object)(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (192),(int) (192),(int) (192))));
 //BA.debugLineNum = 68;BA.debugLine="Dim DigitNums() As Int = Array As Int(0, 1, 2, 3,";
_digitnums = new int[]{(int) (0),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (0),(int) (0)};
 //BA.debugLineNum = 69;BA.debugLine="Dim Mults() As Double = Array As Double(1, 10, 10";
_mults = new double[]{1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000,0.1,0.01};
 //BA.debugLineNum = 71;BA.debugLine="For i = 0 To ColorNames.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_colornames.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 72;BA.debugLine="DigitValues.Put(ColorNames(i), DigitNums(i))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Put((Object)(_colornames[_i]),(Object)(_digitnums[_i]));
 //BA.debugLineNum = 73;BA.debugLine="MultiplierValues.Put(ColorNames(i), Mults(i))";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Put((Object)(_colornames[_i]),(Object)(_mults[_i]));
 }
};
 //BA.debugLineNum = 77;BA.debugLine="ToleranceValues.Put(\"Brown\", \"±1%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Brown"),(Object)("±1%"));
 //BA.debugLineNum = 78;BA.debugLine="ToleranceValues.Put(\"Red\", \"±2%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Red"),(Object)("±2%"));
 //BA.debugLineNum = 79;BA.debugLine="ToleranceValues.Put(\"Orange\", \"±3%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Orange"),(Object)("±3%"));
 //BA.debugLineNum = 80;BA.debugLine="ToleranceValues.Put(\"Yellow\", \"±4%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Yellow"),(Object)("±4%"));
 //BA.debugLineNum = 81;BA.debugLine="ToleranceValues.Put(\"Green\", \"±0.5%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Green"),(Object)("±0.5%"));
 //BA.debugLineNum = 82;BA.debugLine="ToleranceValues.Put(\"Blue\", \"±0.25%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Blue"),(Object)("±0.25%"));
 //BA.debugLineNum = 83;BA.debugLine="ToleranceValues.Put(\"Violet\", \"±0.1%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Violet"),(Object)("±0.1%"));
 //BA.debugLineNum = 84;BA.debugLine="ToleranceValues.Put(\"Gray\", \"±0.05%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Gray"),(Object)("±0.05%"));
 //BA.debugLineNum = 85;BA.debugLine="ToleranceValues.Put(\"Gold\", \"±5%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Gold"),(Object)("±5%"));
 //BA.debugLineNum = 86;BA.debugLine="ToleranceValues.Put(\"Silver\", \"±10%\")";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Put((Object)("Silver"),(Object)("±10%"));
 //BA.debugLineNum = 89;BA.debugLine="ColorButtons = Array As Button(btnBlack, btnBrown";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.ButtonWrapper[]{mostCurrent._btnblack,mostCurrent._btnbrown,mostCurrent._btnred,mostCurrent._btnorange,mostCurrent._btnyellow,mostCurrent._btngreen,mostCurrent._btnblue,mostCurrent._btnviolet,mostCurrent._btngray,mostCurrent._btnwhite,mostCurrent._btngold,mostCurrent._btnsilver};
 //BA.debugLineNum = 91;BA.debugLine="For i = 0 To ColorButtons.Length - 1";
{
final int step36 = 1;
final int limit36 = (int) (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length-1);
_i = (int) (0) ;
for (;_i <= limit36 ;_i = _i + step36 ) {
 //BA.debugLineNum = 92;BA.debugLine="ColorButtons(i).Tag = ColorNames(i)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_i].setTag((Object)(_colornames[_i]));
 }
};
 //BA.debugLineNum = 95;BA.debugLine="ResetApp";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfirm_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 107;BA.debugLine="Sub btnConfirm_Click";
 //BA.debugLineNum = 108;BA.debugLine="If btnConfirm.Text = \"AGAIN\" Then";
if ((mostCurrent._btnconfirm.getText()).equals("AGAIN")) { 
 //BA.debugLineNum = 109;BA.debugLine="ResetApp";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 110;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 113;BA.debugLine="If TempColorName = \"\" Then";
if ((mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).equals("")) { 
 //BA.debugLineNum = 114;BA.debugLine="xui.MsgboxAsync(\"Please select a color first!\",";
_vvv5.MsgboxAsync(processBA,BA.ObjectToCharSequence("Please select a color first!"),BA.ObjectToCharSequence("Selection Required"));
 //BA.debugLineNum = 115;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 118;BA.debugLine="Select CurrentStep";
switch (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
case 1: {
 //BA.debugLineNum = 119;BA.debugLine="Case 1: Digit1 = DigitValues.Get(TempColorName)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int)(BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get((Object)(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2))));
 break; }
case 2: {
 //BA.debugLineNum = 120;BA.debugLine="Case 2: Digit2 = DigitValues.Get(TempColorName)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int)(BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.Get((Object)(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2))));
 break; }
case 3: {
 //BA.debugLineNum = 121;BA.debugLine="Case 3: Multiplier = MultiplierValues.Get(TempCo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (double)(BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.Get((Object)(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2))));
 break; }
case 4: {
 //BA.debugLineNum = 122;BA.debugLine="Case 4: Tolerance = ToleranceValues.Get(TempColo";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = BA.ObjectToString(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.Get((Object)(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)));
 break; }
}
;
 //BA.debugLineNum = 125;BA.debugLine="CurrentStep = CurrentStep + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+1);
 //BA.debugLineNum = 126;BA.debugLine="TempColorName = \"\"";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 128;BA.debugLine="If CurrentStep > 4 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3>4) { 
 //BA.debugLineNum = 129;BA.debugLine="CalculateOhms";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 130;BA.debugLine="lblInstruction.Text = \"Calculation Complete!\"";
mostCurrent._lblinstruction.setText(BA.ObjectToCharSequence("Calculation Complete!"));
 //BA.debugLineNum = 131;BA.debugLine="btnConfirm.Text = \"AGAIN\"";
mostCurrent._btnconfirm.setText(BA.ObjectToCharSequence("AGAIN"));
 //BA.debugLineNum = 133;BA.debugLine="For Each b As Button In ColorButtons";
{
final anywheresoftware.b4a.objects.ButtonWrapper[] group25 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
final int groupLen25 = group25.length
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_b = group25[index25];
 //BA.debugLineNum = 134;BA.debugLine="b.Enabled = False";
_b.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 135;BA.debugLine="Dim v As B4XView = b";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_b.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="v.Alpha = 0.3";
_v.setAlpha((float) (0.3));
 }
};
 }else {
 //BA.debugLineNum = 139;BA.debugLine="UpdateStepUI";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1();
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
double _basevalue = 0;
double _finalohms = 0;
String _formattedtext = "";
 //BA.debugLineNum = 203;BA.debugLine="Sub CalculateOhms";
 //BA.debugLineNum = 204;BA.debugLine="Dim BaseValue As Double = (Digit1 * 10) + Digit2";
_basevalue = (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4*10)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 205;BA.debugLine="Dim FinalOhms As Double = BaseValue * Multiplier";
_finalohms = _basevalue*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 206;BA.debugLine="Dim FormattedText As String";
_formattedtext = "";
 //BA.debugLineNum = 209;BA.debugLine="If FinalOhms >= 1000000000 Then";
if (_finalohms>=1000000000) { 
 //BA.debugLineNum = 210;BA.debugLine="FormattedText = NumberFormat2(FinalOhms / 100000";
_formattedtext = anywheresoftware.b4a.keywords.Common.NumberFormat2(_finalohms/(double)1000000000,(int) (1),(int) (2),(int) (0),anywheresoftware.b4a.keywords.Common.False)+" GΩ";
 }else if(_finalohms>=1000000) { 
 //BA.debugLineNum = 212;BA.debugLine="FormattedText = NumberFormat2(FinalOhms / 100000";
_formattedtext = anywheresoftware.b4a.keywords.Common.NumberFormat2(_finalohms/(double)1000000,(int) (1),(int) (2),(int) (0),anywheresoftware.b4a.keywords.Common.False)+" MΩ";
 }else if(_finalohms>=1000) { 
 //BA.debugLineNum = 214;BA.debugLine="FormattedText = NumberFormat2(FinalOhms / 1000,";
_formattedtext = anywheresoftware.b4a.keywords.Common.NumberFormat2(_finalohms/(double)1000,(int) (1),(int) (2),(int) (0),anywheresoftware.b4a.keywords.Common.False)+" kΩ";
 }else {
 //BA.debugLineNum = 216;BA.debugLine="FormattedText = NumberFormat2(FinalOhms, 1, 2, 0";
_formattedtext = anywheresoftware.b4a.keywords.Common.NumberFormat2(_finalohms,(int) (1),(int) (2),(int) (0),anywheresoftware.b4a.keywords.Common.False)+" Ω";
 };
 //BA.debugLineNum = 219;BA.debugLine="lblResult.Text = FormattedText & \" \" & Tolerance";
mostCurrent._lblresult.setText(BA.ObjectToCharSequence(_formattedtext+" "+mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return "";
}
public static String  _colorbtn_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _clickedbutton = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub ColorBtn_Click";
 //BA.debugLineNum = 101;BA.debugLine="Dim ClickedButton As Button = Sender";
_clickedbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
_clickedbutton = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 102;BA.debugLine="TempColorName = ClickedButton.Tag";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToString(_clickedbutton.getTag());
 //BA.debugLineNum = 103;BA.debugLine="TempColorValue = ColorMap.Get(TempColorName)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (int)(BA.ObjectToNumber(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Get((Object)(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2))));
 //BA.debugLineNum = 104;BA.debugLine="UpdateBandColor(CurrentStep, TempColorValue)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private btnBlack, btnBlue, btnBrown, btnConfirm,";
mostCurrent._btnblack = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnblue = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnbrown = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnconfirm = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btngold = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btngray = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btngreen = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private btnOrange, btnRed, btnSilver, btnViolet,";
mostCurrent._btnorange = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnred = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnsilver = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnviolet = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnwhite = new anywheresoftware.b4a.objects.ButtonWrapper();
mostCurrent._btnyellow = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private ImageView1 As ImageView";
mostCurrent._imageview1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lblInstruction, lblResult As Label";
mostCurrent._lblinstruction = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._lblresult = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Panel1, pnlBand1, pnlBand2, pnlMultiplier";
mostCurrent._panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlband1 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlband2 = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnlmultiplier = new anywheresoftware.b4a.objects.PanelWrapper();
mostCurrent._pnltolerance = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private ColorButtons() As Button";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.ButtonWrapper[(int) (0)];
{
int d0 = mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length;
for (int i0 = 0;i0 < d0;i0++) {
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[i0] = new anywheresoftware.b4a.objects.ButtonWrapper();
}
}
;
 //BA.debugLineNum = 30;BA.debugLine="Private CurrentStep As Int = 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (1);
 //BA.debugLineNum = 31;BA.debugLine="Private TempColorName As String = \"\"";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 32;BA.debugLine="Private TempColorValue As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 34;BA.debugLine="Private Digit1, Digit2 As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 35;BA.debugLine="Private Multiplier As Double = 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 1;
 //BA.debugLineNum = 36;BA.debugLine="Private Tolerance As String = \"\"";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = "";
 //BA.debugLineNum = 39;BA.debugLine="Private DigitValues, MultiplierValues, ToleranceV";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.collections.Map();
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.collections.Map();
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.Map();
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
starter._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}

private static byte[][] bb;

public static String vvv13(final byte[] _b, final int i) throws Exception {
Runnable r = new Runnable() {
{

int value = i / 7 + 5679;
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
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 222;BA.debugLine="Sub ResetApp";
 //BA.debugLineNum = 223;BA.debugLine="CurrentStep = 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (1);
 //BA.debugLineNum = 224;BA.debugLine="TempColorName = \"\"";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 225;BA.debugLine="lblInstruction.Text = \"Pick 1st band color\"";
mostCurrent._lblinstruction.setText(BA.ObjectToCharSequence("Pick 1st band color"));
 //BA.debugLineNum = 226;BA.debugLine="lblResult.Text = \"\"";
mostCurrent._lblresult.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 227;BA.debugLine="btnConfirm.Text = \"CONFIRM\"";
mostCurrent._btnconfirm.setText(BA.ObjectToCharSequence("CONFIRM"));
 //BA.debugLineNum = 229;BA.debugLine="pnlBand1.Color = Colors.Transparent";
mostCurrent._pnlband1.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 230;BA.debugLine="pnlBand2.Color = Colors.Transparent";
mostCurrent._pnlband2.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 231;BA.debugLine="pnlMultiplier.Color = Colors.Transparent";
mostCurrent._pnlmultiplier.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 232;BA.debugLine="pnlTolerance.Color = Colors.Transparent";
mostCurrent._pnltolerance.setColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 //BA.debugLineNum = 234;BA.debugLine="UpdateButtonLabels(1)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4((int) (1));
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int _bandstep,int _selectedcolor) throws Exception{
int _semitransparent = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub UpdateBandColor(BandStep As Int, SelectedColor";
 //BA.debugLineNum = 147;BA.debugLine="Dim SemiTransparent As Int = Bit.Or(0xCC000000, S";
_semitransparent = anywheresoftware.b4a.keywords.Common.Bit.Or(((int)0xcc000000),_selectedcolor);
 //BA.debugLineNum = 148;BA.debugLine="Dim v As B4XView";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Select BandStep";
switch (_bandstep) {
case 1: {
 //BA.debugLineNum = 151;BA.debugLine="Case 1: v = pnlBand1";
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._pnlband1.getObject()));
 break; }
case 2: {
 //BA.debugLineNum = 152;BA.debugLine="Case 2: v = pnlBand2";
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._pnlband2.getObject()));
 break; }
case 3: {
 //BA.debugLineNum = 153;BA.debugLine="Case 3: v = pnlMultiplier";
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._pnlmultiplier.getObject()));
 break; }
case 4: {
 //BA.debugLineNum = 154;BA.debugLine="Case 4: v = pnlTolerance";
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._pnltolerance.getObject()));
 break; }
}
;
 //BA.debugLineNum = 157;BA.debugLine="If v.IsInitialized Then";
if (_v.IsInitialized()) { 
 //BA.debugLineNum = 158;BA.debugLine="v.Color = SemiTransparent";
_v.setColor(_semitransparent);
 //BA.debugLineNum = 159;BA.debugLine="v.Visible = True";
_v.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 160;BA.debugLine="v.BringToFront";
_v.BringToFront();
 };
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(int _bandstep) throws Exception{
String[] _labels = null;
boolean[] _enabledstates = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 173;BA.debugLine="Sub UpdateButtonLabels(BandStep As Int)";
 //BA.debugLineNum = 174;BA.debugLine="Dim Labels() As String";
_labels = new String[(int) (0)];
java.util.Arrays.fill(_labels,"");
 //BA.debugLineNum = 175;BA.debugLine="Dim EnabledStates() As Boolean";
_enabledstates = new boolean[(int) (0)];
;
 //BA.debugLineNum = 177;BA.debugLine="Select BandStep";
switch (_bandstep) {
case 1: 
case 2: {
 //BA.debugLineNum = 179;BA.debugLine="Labels = Array As String(\"0\", \"1\", \"2\", \"3\", \"4";
_labels = new String[]{"0","1","2","3","4","5","6","7","8","9","",""};
 //BA.debugLineNum = 180;BA.debugLine="EnabledStates = Array As Boolean(True, True, Tr";
_enabledstates = new boolean[]{anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False};
 break; }
case 3: {
 //BA.debugLineNum = 183;BA.debugLine="Labels = Array As String(\"x1\", \"x10\", \"x100\", \"";
_labels = new String[]{"x1","x10","x100","x1k","x10k","x100k","x1M","x10M","x100M","x1G","x0.1","x0.01"};
 //BA.debugLineNum = 184;BA.debugLine="EnabledStates = Array As Boolean(True, True, Tr";
_enabledstates = new boolean[]{anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True};
 break; }
case 4: {
 //BA.debugLineNum = 186;BA.debugLine="Labels = Array As String(\"\", \"±1%\", \"±2%\", \"±3%";
_labels = new String[]{"","±1%","±2%","±3%","±4%","±0.5%","±0.25%","±0.1%","±0.05%","","±5%","±10%"};
 //BA.debugLineNum = 187;BA.debugLine="EnabledStates = Array As Boolean(False, True, T";
_enabledstates = new boolean[]{anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True};
 break; }
}
;
 //BA.debugLineNum = 190;BA.debugLine="For i = 0 To ColorButtons.Length - 1";
{
final int step14 = 1;
final int limit14 = (int) (mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.length-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 191;BA.debugLine="ColorButtons(i).Text = Labels(i)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_i].setText(BA.ObjectToCharSequence(_labels[_i]));
 //BA.debugLineNum = 192;BA.debugLine="ColorButtons(i).Enabled = EnabledStates(i)";
mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_i].setEnabled(_enabledstates[_i]);
 //BA.debugLineNum = 194;BA.debugLine="Dim v As B4XView = ColorButtons(i)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0[_i].getObject()));
 //BA.debugLineNum = 195;BA.debugLine="If EnabledStates(i) = True Then";
if (_enabledstates[_i]==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 196;BA.debugLine="v.Alpha = 1.0";
_v.setAlpha((float) (1.0));
 }else {
 //BA.debugLineNum = 198;BA.debugLine="v.Alpha = 0.3";
_v.setAlpha((float) (0.3));
 };
 }
};
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub UpdateStepUI";
 //BA.debugLineNum = 165;BA.debugLine="Select CurrentStep";
switch (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) {
case 2: {
 //BA.debugLineNum = 166;BA.debugLine="Case 2: lblInstruction.Text = \"Pick 2nd band col";
mostCurrent._lblinstruction.setText(BA.ObjectToCharSequence("Pick 2nd band color"));
 break; }
case 3: {
 //BA.debugLineNum = 167;BA.debugLine="Case 3: lblInstruction.Text = \"Pick multiplier c";
mostCurrent._lblinstruction.setText(BA.ObjectToCharSequence("Pick multiplier color"));
 break; }
case 4: {
 //BA.debugLineNum = 168;BA.debugLine="Case 4: lblInstruction.Text = \"Pick tolerance co";
mostCurrent._lblinstruction.setText(BA.ObjectToCharSequence("Pick tolerance color"));
 break; }
}
;
 //BA.debugLineNum = 170;BA.debugLine="UpdateButtonLabels(CurrentStep)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
}
