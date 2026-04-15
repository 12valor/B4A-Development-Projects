package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xseekbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvv0 = null;
public Object _vvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvv7 = null;
public int _vvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public boolean _vvvvvvv3 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
public int _vvvvvvvvvvvvvvv2 = 0;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 53;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvv0.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 54;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvv7.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 55;BA.debugLine="Vertical = mBase.Height > mBase.Width";
_vvvvvvv3 = _vvv4.getHeight()>_vvv4.getWidth();
 //BA.debugLineNum = 56;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
_vvvvvvvvvvvvvvv2 = (int) (__c.Max(_vvv4.getHeight(),_vvv4.getWidth())-2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 57;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 12;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 13;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 14;BA.debugLine="Public mBase As B4XView 'ignore";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 16;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 17;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 18;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 19;BA.debugLine="Private TouchPanel As B4XView";
_vvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private mValue As Int";
_vvvv1 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public MinValue, MaxValue As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 22;BA.debugLine="Public Interval As Int = 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) (1);
 //BA.debugLineNum = 23;BA.debugLine="Private Vertical As Boolean";
_vvvvvvv3 = false;
 //BA.debugLineNum = 24;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.DipToCurrent((int) (4));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.DipToCurrent((int) (2));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = __c.DipToCurrent((int) (6));
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (12));
 //BA.debugLineNum = 25;BA.debugLine="Private Pressed As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
 //BA.debugLineNum = 26;BA.debugLine="Private size As Int";
_vvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 36;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 37;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 37;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 38;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvv5.PaintOrColorToColor(_props.Get((Object)("Color1")));
 //BA.debugLineNum = 39;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvv5.PaintOrColorToColor(_props.Get((Object)("Color2")));
 //BA.debugLineNum = 40;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvv5.PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
 //BA.debugLineNum = 41;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_props.GetDefault((Object)("Interval"),(Object)(1))))));
 //BA.debugLineNum = 42;BA.debugLine="MinValue = Props.Get(\"Min\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
 //BA.debugLineNum = 43;BA.debugLine="MaxValue = Props.Get(\"Max\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
 //BA.debugLineNum = 44;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
_vvvv1 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
 //BA.debugLineNum = 45;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvv0.Initialize(_vvv4);
 //BA.debugLineNum = 46;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
_vvvvvvvvv7 = _vvv5.CreatePanel(ba,"TouchPanel");
 //BA.debugLineNum = 47;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
_vvv4.AddView((android.view.View)(_vvvvvvvvv7.getObject()),(int) (0),(int) (0),_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 48;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (_vvv5.getIsB4A() || _vvv5.getIsB4i()) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (20));};
 //BA.debugLineNum = 49;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (_vvv5.getIsB4A()) { 
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());};
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public int  _getvvv1() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 131;BA.debugLine="Return mValue";
if (true) return _vvvv1;
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 30;BA.debugLine="mEventName = EventName";
_vvv2 = _eventname;
 //BA.debugLineNum = 31;BA.debugLine="mCallBack = Callback";
_vvv3 = _callback;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Private Sub RaiseTouchStateEvent";
 //BA.debugLineNum = 103;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (_vvv5.SubExists(ba,_vvv3,_vvv2+"_TouchStateChanged",(int) (1))) { 
 //BA.debugLineNum = 104;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,_vvv3,_vvv2+"_TouchStateChanged",(Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 };
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _setvvv1(int _v) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub setValue(v As Int)";
 //BA.debugLineNum = 126;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
_vvvv1 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_v)));
 //BA.debugLineNum = 127;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(int _x,int _y) throws Exception{
int _v = 0;
int _newvalue = 0;
 //BA.debugLineNum = 108;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
 //BA.debugLineNum = 109;BA.debugLine="Dim v As Int";
_v = 0;
 //BA.debugLineNum = 110;BA.debugLine="If Vertical Then";
if (_vvvvvvv3) { 
 //BA.debugLineNum = 111;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((_vvv4.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5-_y)/(double)_vvvvvvvvvvvvvvv2*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 }else {
 //BA.debugLineNum = 113;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5)/(double)_vvvvvvvvvvvvvvv2*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 };
 //BA.debugLineNum = 115;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 116;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_v)));
 //BA.debugLineNum = 117;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=_vvvv1) { 
 //BA.debugLineNum = 118;BA.debugLine="mValue = NewValue";
_vvvv1 = _newvalue;
 //BA.debugLineNum = 119;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (_vvv5.SubExists(ba,_vvv3,_vvv2+"_ValueChanged",(int) (1))) { 
 //BA.debugLineNum = 120;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,_vvv3,_vvv2+"_ValueChanged",(Object)(_vvvv1));
 };
 };
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
 //BA.debugLineNum = 89;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==_vvvvvvvvv7.TOUCH_ACTION_DOWN) { 
 //BA.debugLineNum = 90;BA.debugLine="Pressed = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.True;
 //BA.debugLineNum = 91;BA.debugLine="RaiseTouchStateEvent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 //BA.debugLineNum = 92;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((int) (_x),(int) (_y));
 }else if(_action==_vvvvvvvvv7.TOUCH_ACTION_MOVE) { 
 //BA.debugLineNum = 94;BA.debugLine="SetValueBasedOnTouch(X, Y)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3((int) (_x),(int) (_y));
 }else if(_action==_vvvvvvvvv7.TOUCH_ACTION_UP) { 
 //BA.debugLineNum = 96;BA.debugLine="Pressed = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.False;
 //BA.debugLineNum = 97;BA.debugLine="RaiseTouchStateEvent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2();
 };
 //BA.debugLineNum = 99;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv7() throws Exception{
int _s1 = 0;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 61;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 63;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvv0.ClearRect(_vvvvvvvv0.getTargetRect());
 //BA.debugLineNum = 64;BA.debugLine="If size > 0 Then";
if (_vvvvvvvvvvvvvvv2>0) { 
 //BA.debugLineNum = 65;BA.debugLine="If Vertical = False Then";
if (_vvvvvvv3==__c.False) { 
 //BA.debugLineNum = 66;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5+(_vvvv1-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)*_vvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 67;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (_vvv4.getHeight()/(double)2);
 //BA.debugLineNum = 68;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
_vvvvvvvv0.DrawLine((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_y),(float) (_s1),(float) (_y),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 69;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
_vvvvvvvv0.DrawLine((float) (_s1),(float) (_y),(float) (_vvv4.getWidth()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_y),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 70;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
_vvvvvvvv0.DrawCircle((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.True,(float) (0));
 //BA.debugLineNum = 71;BA.debugLine="If Pressed Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) { 
 //BA.debugLineNum = 72;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
_vvvvvvvv0.DrawCircle((float) (_s1),(float) (_y),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(float) (0));
 };
 }else {
 //BA.debugLineNum = 75;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue) /";
_s1 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5+(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvv1)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)*_vvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 76;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (_vvv4.getWidth()/(double)2);
 //BA.debugLineNum = 77;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
_vvvvvvvv0.DrawLine((float) (_x),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_x),(float) (_s1),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 78;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
_vvvvvvvv0.DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (_vvv4.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 79;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
_vvvvvvvv0.DrawCircle((float) (_x),(float) (_s1),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.True,(float) (0));
 //BA.debugLineNum = 80;BA.debugLine="If Pressed Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6) { 
 //BA.debugLineNum = 81;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
_vvvvvvvv0.DrawCircle((float) (_x),(float) (_s1),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(float) (0));
 };
 };
 };
 //BA.debugLineNum = 85;BA.debugLine="cvs.Invalidate";
_vvvvvvvv0.Invalidate();
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
