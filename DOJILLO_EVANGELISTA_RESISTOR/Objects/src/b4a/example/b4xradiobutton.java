package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xradiobutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xradiobutton.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public b4a.example.bitmapcreator _vvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public boolean _vvvv1 = false;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public Object _vvvv7 = null;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public boolean _vvvvvvvvvv1 = false;
public int _vvvvvvvvvvvvvvv2 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width1,double _height1) throws Exception{
int _newsize = 0;
int _gap = 0;
 //BA.debugLineNum = 59;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
 //BA.debugLineNum = 60;BA.debugLine="Dim NewSize As Int = Max(5dip, Height1)";
_newsize = (int) (__c.Max(__c.DipToCurrent((int) (5)),_height1));
 //BA.debugLineNum = 61;BA.debugLine="If NewSize = Size Then Return";
if (_newsize==_vvvvvvvvvvvvvvv2) { 
if (true) return "";};
 //BA.debugLineNum = 62;BA.debugLine="Size = NewSize";
_vvvvvvvvvvvvvvv2 = _newsize;
 //BA.debugLineNum = 63;BA.debugLine="Dim gap As Int = 3dip";
_gap = __c.DipToCurrent((int) (3));
 //BA.debugLineNum = 65;BA.debugLine="bc.Initialize(NewSize - 2 * gap, NewSize - 2 * ga";
_vvvvvv0._initialize(ba,(int) (_newsize-2*_gap),(int) (_newsize-2*_gap));
 //BA.debugLineNum = 66;BA.debugLine="Scale = xui.Scale";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvv5.getScale();
 //BA.debugLineNum = 71;BA.debugLine="iv.SetLayoutAnimated(0, gap, gap, Size - 2 * gap,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),_gap,_gap,(int) (_vvvvvvvvvvvvvvv2-2*_gap),(int) (_vvvvvvvvvvvvvvv2-2*_gap));
 //BA.debugLineNum = 72;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width1, Height1)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width1),(int) (_height1));
 //BA.debugLineNum = 73;BA.debugLine="mLabel.SetLayoutAnimated(0, Size + gap, 0, Width1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.SetLayoutAnimated((int) (0),(int) (_vvvvvvvvvvvvvvv2+_gap),(int) (0),(int) (_width1-_vvvvvvvvvvvvvvv2-_gap),(int) (_height1));
 //BA.debugLineNum = 74;BA.debugLine="OnBrush = bc.CreateBrushFromColor(OnColor)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvvvvv0._createbrushfromcolor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 75;BA.debugLine="OffBrush = bc.CreateBrushFromColor(OffColor)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvv0._createbrushfromcolor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 76;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvv0._createbrushfromcolor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 77;BA.debugLine="SetValueImpl(mValue, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvv1,__c.True);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView 'ignore";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Public OnColor, OffColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private bc As BitmapCreator";
_vvvvvv0 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 13;BA.debugLine="Private iv As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private mValue As Boolean";
_vvvv1 = false;
 //BA.debugLineNum = 15;BA.debugLine="Private transparent As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 16;BA.debugLine="Private LoopIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 18;BA.debugLine="Private OnBrush, OffBrush As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new b4a.example.bcpath._bcbrush();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 19;BA.debugLine="Private mEnabled As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 20;BA.debugLine="Public mHaptic As Boolean";
_vvvvvvvvvv1 = false;
 //BA.debugLineNum = 21;BA.debugLine="Private Size As Int";
_vvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 22;BA.debugLine="Public mLabel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private pnl As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Scale As Float 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 36;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvv4.SetColorAndBorder(_vvv5.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 37;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvv5.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 38;BA.debugLine="pnl.Color = xui.Color_Transparent";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setColor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 39;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 40;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
 //BA.debugLineNum = 41;BA.debugLine="iv = iiv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="mBase.AddView(iv, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 43;BA.debugLine="mLabel = Lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="mLabel.SetTextAlignment(\"CENTER\", \"LEFT\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 45;BA.debugLine="mBase.AddView(mLabel, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 46;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 48;BA.debugLine="OnColor = xui.PaintOrColorToColor(Props.Get(\"OnCo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvv5.PaintOrColorToColor(_props.Get((Object)("OnColor")));
 //BA.debugLineNum = 49;BA.debugLine="OffColor = xui.PaintOrColorToColor(Props.Get(\"Off";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvv5.PaintOrColorToColor(_props.Get((Object)("OffColor")));
 //BA.debugLineNum = 50;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
_vvvvvvvvvv1 = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
 //BA.debugLineNum = 52;BA.debugLine="mEnabled = mBase.Enabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvv4.getEnabled();
 //BA.debugLineNum = 53;BA.debugLine="mBase.Enabled = True";
_vvv4.setEnabled(__c.True);
 //BA.debugLineNum = 54;BA.debugLine="mValue = Props.Get(\"Value\")";
_vvvv1 = BA.ObjectToBoolean(_props.Get((Object)("Value")));
 //BA.debugLineNum = 55;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv2(float _state) throws Exception{
float _r = 0f;
 //BA.debugLineNum = 153;BA.debugLine="Private Sub Draw (State As Float)";
 //BA.debugLineNum = 154;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
_vvvvvv0._drawrect2(_vvvvvv0._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(int) (0));
 //BA.debugLineNum = 155;BA.debugLine="Dim r As Float = Floor(bc.mHeight / 2)";
_r = (float) (__c.Floor(_vvvvvv0._mheight/(double)2));
 //BA.debugLineNum = 156;BA.debugLine="If State < 1 Then bc.DrawCircle2(r, r, r, OffBrus";
if (_state<1) { 
_vvvvvv0._drawcircle2(_r,_r,_r,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3,__c.True,(int) (0));};
 //BA.debugLineNum = 157;BA.debugLine="If State > 0 Then bc.DrawCircle2(r, r, r * State,";
if (_state>0) { 
_vvvvvv0._drawcircle2(_r,_r,(float) (_r*_state),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.True,(int) (0));};
 //BA.debugLineNum = 158;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
_vvvvvv0._setbitmaptoimageview(_vvvvvv0._getbitmap(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub getChecked As Boolean";
 //BA.debugLineNum = 141;BA.debugLine="Return mValue";
if (true) return _vvvv1;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return false;
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 150;BA.debugLine="Return mEnabled";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return false;
}
public Object  _getvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Public Sub getText As Object";
 //BA.debugLineNum = 166;BA.debugLine="Return mLabel.Text";
if (true) return (Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getText());
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
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
public String  _pnl_click() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub pnl_Click";
 //BA.debugLineNum = 88;BA.debugLine="If mValue Then Return";
if (_vvvv1) { 
if (true) return "";};
 //BA.debugLineNum = 89;BA.debugLine="If mEnabled Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 90;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (_vvvvvvvvvv1) { 
_vvvvv3._v0 /*String*/ (ba,_vvv4);};
 //BA.debugLineNum = 91;BA.debugLine="SetValueImpl(Not(mValue), False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(__c.Not(_vvvv1),__c.False);
 //BA.debugLineNum = 92;BA.debugLine="If mValue And xui.SubExists(mCallBack, mEventNam";
if (_vvvv1 && _vvv5.SubExists(ba,_vvv3,_vvv2+"_Checked",(int) (0))) { 
 //BA.debugLineNum = 93;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed(ba,_vvv3,_vvv2+"_Checked");
 };
 };
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(boolean _b) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Public Sub setChecked(b As Boolean)";
 //BA.debugLineNum = 136;BA.debugLine="If b = mValue Then Return";
if (_b==_vvvv1) { 
if (true) return "";};
 //BA.debugLineNum = 137;BA.debugLine="SetValueImpl(b, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_b,__c.False);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvv1(boolean _b) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Public Sub setEnabled (b As Boolean)";
 //BA.debugLineNum = 145;BA.debugLine="mEnabled = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _b;
 //BA.debugLineNum = 146;BA.debugLine="SetValueImpl(mValue, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvv1,__c.True);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvv3(Object _t) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub setText (t As Object)";
 //BA.debugLineNum = 162;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(mLabel, t";
_vvvvv3._vv3 /*String*/ (ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_t);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean _b,boolean _immediate) throws Exception{
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4a.example.b4xradiobutton parent,boolean _b,boolean _immediate) {
this.parent = parent;
this._b = _b;
this._immediate = _immediate;
}
b4a.example.b4xradiobutton parent;
boolean _b;
boolean _immediate;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.example.b4xradiobutton _rb = null;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 99;BA.debugLine="mValue = b";
parent._vvvv1 = _b;
 //BA.debugLineNum = 100;BA.debugLine="If b = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_b==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 101;BA.debugLine="For i = 0 To mBase.Parent.NumberOfViews - 1";
if (true) break;

case 4:
//for
this.state = 11;
step3 = 1;
limit3 = (int) (parent._vvv4.getParent().getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 102;BA.debugLine="Dim v As B4XView = mBase.Parent.GetView(i)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = parent._vvv4.getParent().GetView(_i);
 //BA.debugLineNum = 103;BA.debugLine="If v <> mBase And v.Tag Is B4XRadioButton Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_v).equals(parent._vvv4) == false && _v.getTag() instanceof b4a.example.b4xradiobutton) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 104;BA.debugLine="Dim rb As B4XRadioButton = v.Tag";
_rb = (b4a.example.b4xradiobutton)(_v.getTag());
 //BA.debugLineNum = 105;BA.debugLine="rb.Checked = False";
_rb._setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 /*boolean*/ (parent.__c.False);
 if (true) break;

case 10:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 109;BA.debugLine="LoopIndex = LoopIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+1);
 //BA.debugLineNum = 110;BA.debugLine="If Immediate Then";
if (true) break;

case 13:
//if
this.state = 53;
if (_immediate) { 
this.state = 15;
}else {
this.state = 25;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 111;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 16:
//if
this.state = 23;
if (parent._vvvv1) { 
this.state = 18;
;}
else {
this.state = 20;
;}if (true) break;

case 18:
//C
this.state = 23;
parent._vvvvvvvv2((float) (1));
if (true) break;

case 20:
//C
this.state = 23;
parent._vvvvvvvv2((float) (0));
if (true) break;

case 23:
//C
this.state = 53;
;
 if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 113;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 114;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 115;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
 //BA.debugLineNum = 116;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 26:
//do while
this.state = 41;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 117;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
 //BA.debugLineNum = 118;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 29:
//if
this.state = 34;
if (parent._vvvv1==parent.__c.False) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_state1 = (float) (1-_state1);
if (true) break;

case 34:
//C
this.state = 35;
;
 //BA.debugLineNum = 119;BA.debugLine="Draw(state1)";
parent._vvvvvvvv2(_state1);
 //BA.debugLineNum = 120;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,this,(int) (16));
this.state = 61;
return;
case 61:
//C
this.state = 35;
;
 //BA.debugLineNum = 121;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 35:
//if
this.state = 40;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
this.state = 41;
if (true) break;
if (true) break;

case 40:
//C
this.state = 26;
;
 if (true) break;
;
 //BA.debugLineNum = 123;BA.debugLine="If MyIndex = LoopIndex Then";

case 41:
//if
this.state = 52;
if (_myindex==parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 124;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 44:
//if
this.state = 51;
if (parent._vvvv1) { 
this.state = 46;
;}
else {
this.state = 48;
;}if (true) break;

case 46:
//C
this.state = 51;
parent._vvvvvvvv2((float) (1));
if (true) break;

case 48:
//C
this.state = 51;
parent._vvvvvvvv2((float) (0));
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
 //BA.debugLineNum = 127;BA.debugLine="If mEnabled Then";

case 53:
//if
this.state = 58;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
 //BA.debugLineNum = 128;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._vvvvv3._vv1 /*String*/ (ba,parent._vvv4,(float) (1));
 if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 130;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.4)";
parent._vvvvv3._vv1 /*String*/ (ba,parent._vvv4,(float) (0.4));
 if (true) break;

case 58:
//C
this.state = -1;
;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
