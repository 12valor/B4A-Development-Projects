package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.swiftbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.swiftbutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
public Object _vvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public boolean _vvvvvvvvvv1 = false;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 54;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 55;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvv0.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 56;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _vvv4.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
 //BA.debugLineNum = 57;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
 //BA.debugLineNum = 59;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 14;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 15;BA.debugLine="Public mBase As B4XView 'ignore";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 17;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 18;BA.debugLine="Public xLBL As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public clr1, clr2, disabledColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private pressed As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = false;
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Private mDisabled As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = false;
 //BA.debugLineNum = 23;BA.debugLine="Public CornersRadius, SideHeight As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 24;BA.debugLine="Public mHaptic As Boolean";
_vvvvvvvvvv1 = false;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _vvv5.CreatePanel(ba,"p");
 //BA.debugLineNum = 36;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 37;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvv5.PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
 //BA.debugLineNum = 38;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvv5.PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
 //BA.debugLineNum = 39;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvv5.PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(((int)0xff999999))));
 //BA.debugLineNum = 40;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(15)))));
 //BA.debugLineNum = 41;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("SideHeight"),(Object)(5)))));
 //BA.debugLineNum = 42;BA.debugLine="mDisabled = Not(Props.GetDefault(\"ButtonEnabled\",";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.Not(BA.ObjectToBoolean(_props.GetDefault((Object)("ButtonEnabled"),(Object)(__c.True))));
 //BA.debugLineNum = 43;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
_vvvvvvvvvv1 = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
 //BA.debugLineNum = 44;BA.debugLine="pressed = mDisabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 45;BA.debugLine="xLBL = Lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 46;BA.debugLine="xLBL.Visible = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setVisible(__c.True);
 //BA.debugLineNum = 47;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 48;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 49;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 50;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvv0.Initialize(_vvv4);
 //BA.debugLineNum = 51;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv2() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
 //BA.debugLineNum = 121;BA.debugLine="Private Sub Draw";
 //BA.debugLineNum = 122;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvv0.ClearRect(_vvvvvvvv0.getTargetRect());
 //BA.debugLineNum = 123;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 124;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 125;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
_r.Initialize((float) (0),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3),(float) (_vvv4.getWidth()),(float) (_vvv4.getHeight()));
 //BA.debugLineNum = 126;BA.debugLine="If pressed = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6==__c.False) { 
 //BA.debugLineNum = 127;BA.debugLine="xLBL.Top = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setTop((int) (0));
 //BA.debugLineNum = 128;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 129;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
_vvvvvvvv0.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.True,(float) (0));
 //BA.debugLineNum = 130;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
_r.Initialize((float) (0),(float) (0),(float) (_vvv4.getWidth()),(float) (_vvv4.getHeight()-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3));
 //BA.debugLineNum = 131;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 132;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
_vvvvvvvv0.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 134;BA.debugLine="xLBL.Top = SideHeight";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setTop(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 135;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6));
 //BA.debugLineNum = 136;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 137;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) { 
_c = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1;}
else {
_c = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;};
 //BA.debugLineNum = 138;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
_vvvvvvvv0.DrawPath(_p,_c,__c.True,(float) (0));
 };
 //BA.debugLineNum = 141;BA.debugLine="cvs.Invalidate";
_vvvvvvvv0.Invalidate();
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 63;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 28;BA.debugLine="mEventName = EventName";
_vvv2 = _eventname;
 //BA.debugLineNum = 29;BA.debugLine="mCallBack = Callback";
_vvv3 = _callback;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(int _action,float _x,float _y) throws Exception{
boolean _inside = false;
 //BA.debugLineNum = 72;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
 //BA.debugLineNum = 73;BA.debugLine="If mDisabled Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2) { 
if (true) return "";};
 //BA.debugLineNum = 74;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<_vvv4.getWidth() && _y>0 && _y<_vvv4.getHeight();
 //BA.debugLineNum = 75;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvv4.TOUCH_ACTION_DOWN,_vvv4.TOUCH_ACTION_MOVE,_vvv4.TOUCH_ACTION_UP,(int) (3))) {
case 0: {
 //BA.debugLineNum = 77;BA.debugLine="SetPressedState(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(__c.True);
 //BA.debugLineNum = 78;BA.debugLine="Draw";
_vvvvvvvv2();
 break; }
case 1: {
 //BA.debugLineNum = 80;BA.debugLine="If pressed <> Inside Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6!=_inside) { 
 //BA.debugLineNum = 81;BA.debugLine="SetPressedState(Inside)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(_inside);
 //BA.debugLineNum = 82;BA.debugLine="Draw";
_vvvvvvvv2();
 };
 break; }
case 2: 
case 3: {
 //BA.debugLineNum = 85;BA.debugLine="SetPressedState(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(__c.False);
 //BA.debugLineNum = 86;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 87;BA.debugLine="If Inside Then";
if (_inside) { 
 //BA.debugLineNum = 88;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (_vvvvvvvvvv1) { 
_vvvvv3._v0 /*String*/ (ba,_vvv4);};
 //BA.debugLineNum = 89;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,_vvv3,_vvv2+"_Click");
 };
 break; }
}
;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(int _primary,int _secondary) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
 //BA.debugLineNum = 112;BA.debugLine="clr1 = Primary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _primary;
 //BA.debugLineNum = 113;BA.debugLine="clr2 = Secondary";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _secondary;
 //BA.debugLineNum = 114;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvv1(boolean _b) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub setEnabled(b As Boolean)";
 //BA.debugLineNum = 67;BA.debugLine="mDisabled = Not(b)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = __c.Not(_b);
 //BA.debugLineNum = 68;BA.debugLine="pressed = mDisabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 69;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(boolean _newstate) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
 //BA.debugLineNum = 95;BA.debugLine="If pressed = NewState Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6==_newstate) { 
if (true) return "";};
 //BA.debugLineNum = 96;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && _vvv5.SubExists(ba,_vvv3,_vvv2+"_ButtonDown",(int) (0))) { 
 //BA.debugLineNum = 97;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,_vvv3,_vvv2+"_ButtonDown");
 };
 //BA.debugLineNum = 99;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && _vvv5.SubExists(ba,_vvv3,_vvv2+"_ButtonUp",(int) (0))) { 
 //BA.debugLineNum = 100;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,_vvv3,_vvv2+"_ButtonUp");
 };
 //BA.debugLineNum = 102;BA.debugLine="pressed= NewState";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _newstate;
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 118;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
