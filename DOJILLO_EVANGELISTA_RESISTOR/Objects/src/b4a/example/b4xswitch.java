package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xswitch");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public b4a.example.bitmapcreator _vvvvvv0 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public boolean _vvvv1 = false;
public b4a.example.bcpath._bcbrush _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public Object _vvvv7 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public boolean _vvvvvvvvvv1 = false;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width1,double _height1) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 9;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public mBase As B4XView 'ignore";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private OnColor, OffColor As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4a.example.bcpath._bcbrush();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 13;BA.debugLine="Private bc As BitmapCreator";
_vvvvvv0 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 14;BA.debugLine="Private Width As Int = 55dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int) (55));
 //BA.debugLineNum = 15;BA.debugLine="Private Height As Int = 31dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (31));
 //BA.debugLineNum = 16;BA.debugLine="Private ThumbColor As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 17;BA.debugLine="Private iv As ImageView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private mValue As Boolean";
_vvvv1 = false;
 //BA.debugLineNum = 19;BA.debugLine="Private transparent As BCBrush";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 20;BA.debugLine="Private LoopIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Private Scale As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0f;
 //BA.debugLineNum = 23;BA.debugLine="Private mEnabled As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 24;BA.debugLine="Public mHaptic As Boolean";
_vvvvvvvvvv1 = false;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 34;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 35;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 36;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
_vvv4.SetLayoutAnimated((int) (0),_vvv4.getLeft(),_vvv4.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 37;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvv4.SetColorAndBorder(_vvv5.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 38;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _vvv5.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 39;BA.debugLine="pnl.Color = xui.Color_Transparent";
_pnl.setColor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 40;BA.debugLine="iv.Initialize(\"\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize(ba,"");
 //BA.debugLineNum = 41;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 42;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
_vvv4.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 44;BA.debugLine="bc.Initialize(Width, Height)";
_vvvvvv0._initialize(ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 45;BA.debugLine="Scale = xui.Scale";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvv5.getScale();
 //BA.debugLineNum = 50;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvvvvv0._createbrushfromcolor(_vvv5.PaintOrColorToColor(_props.Get((Object)("OnColor"))));
 //BA.debugLineNum = 51;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvvvvv0._createbrushfromcolor(_vvv5.PaintOrColorToColor(_props.Get((Object)("OffColor"))));
 //BA.debugLineNum = 52;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvvvvv0._createbrushfromcolor(_vvv5.PaintOrColorToColor(_props.Get((Object)("ThumbColor"))));
 //BA.debugLineNum = 53;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
_vvvvvvvvvv1 = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
 //BA.debugLineNum = 54;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvvvvv0._createbrushfromcolor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 55;BA.debugLine="mEnabled = mBase.Enabled";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvv4.getEnabled();
 //BA.debugLineNum = 56;BA.debugLine="mBase.Enabled = True";
_vvv4.setEnabled(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(BA.ObjectToBoolean(_props.Get((Object)("Value"))),__c.True);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv2(float _state) throws Exception{
float _r = 0f;
float _cx = 0f;
int _cy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _smallrect = null;
float _w = 0f;
float _h = 0f;
 //BA.debugLineNum = 126;BA.debugLine="Private Sub Draw (State As Float)";
 //BA.debugLineNum = 127;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
_vvvvvv0._drawrect2(_vvvvvv0._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(int) (0));
 //BA.debugLineNum = 128;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
_r = (float) (__c.Round(_vvvvvv0._mheight/(double)2));
 //BA.debugLineNum = 129;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
_cx = (float) (_r-1*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6+(_vvvvvv0._mwidth-2*_r)*_state);
 //BA.debugLineNum = 130;BA.debugLine="If State = 0 Then";
if (_state==0) { 
 //BA.debugLineNum = 131;BA.debugLine="cx = r";
_cx = _r;
 }else if(_state==1) { 
 //BA.debugLineNum = 133;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
_cx = (float) (__c.Round(_vvvvvv0._mwidth-1*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6-_r));
 };
 //BA.debugLineNum = 135;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
_cy = (int) (_vvvvvv0._mheight/(double)2);
 //BA.debugLineNum = 136;BA.debugLine="Dim smallrect As B4XRect";
_smallrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 137;BA.debugLine="Dim w As Float = State * bc.mWidth";
_w = (float) (_state*_vvvvvv0._mwidth);
 //BA.debugLineNum = 138;BA.debugLine="Dim h As Float = State * bc.mHeight";
_h = (float) (_state*_vvvvvv0._mheight);
 //BA.debugLineNum = 139;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
if (_state<1) { 
_vvvvvv0._drawrectrounded2(_vvvvvv0._targetrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.True,(int) (2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),(int) (_r));};
 //BA.debugLineNum = 140;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
_smallrect.Initialize((float) (_vvvvvv0._mwidth/(double)2-_w/(double)2),(float) (_cy-_h/(double)2),(float) (_vvvvvv0._mwidth/(double)2+_w/(double)2),(float) (_cy+_h/(double)2));
 //BA.debugLineNum = 141;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
if (_state>0) { 
_vvvvvv0._drawrectrounded2(_smallrect,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(int) (2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),(int) (_smallrect.getHeight()/(double)2));};
 //BA.debugLineNum = 142;BA.debugLine="If mEnabled Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 143;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor";
_vvvvvv0._drawcircle2(_cx,(float) (_cy),(float) (_r-2*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,__c.True,(int) (0));
 };
 //BA.debugLineNum = 145;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
_vvvvvv0._setbitmaptoimageview(_vvvvvv0._getbitmap(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject())));
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub getEnabled As Boolean";
 //BA.debugLineNum = 123;BA.debugLine="Return mEnabled";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return false;
}
public boolean  _getvvv1() throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Public Sub getValue As Boolean";
 //BA.debugLineNum = 114;BA.debugLine="Return mValue";
if (true) return _vvvv1;
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
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
public String  _pnl_click() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub pnl_Click";
 //BA.debugLineNum = 72;BA.debugLine="If mEnabled Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 73;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (_vvvvvvvvvv1) { 
_vvvvv3._v0 /*String*/ (ba,_vvv4);};
 //BA.debugLineNum = 74;BA.debugLine="SetValueImpl(Not(mValue), False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(__c.Not(_vvvv1),__c.False);
 //BA.debugLineNum = 75;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (_vvv5.SubExists(ba,_vvv3,_vvv2+"_ValueChanged",(int) (1))) { 
 //BA.debugLineNum = 76;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,_vvv3,_vvv2+"_ValueChanged",(Object)(_vvvv1));
 };
 };
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvv1(boolean _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub setEnabled (b As Boolean)";
 //BA.debugLineNum = 118;BA.debugLine="mEnabled = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _b;
 //BA.debugLineNum = 119;BA.debugLine="SetValueImpl(mValue, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvv1,__c.True);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setvvv1(boolean _b) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub setValue(b As Boolean)";
 //BA.debugLineNum = 109;BA.debugLine="If b = mValue Then Return";
if (_b==_vvvv1) { 
if (true) return "";};
 //BA.debugLineNum = 110;BA.debugLine="SetValueImpl(b, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_b,__c.False);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(boolean _b,boolean _immediate) throws Exception{
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4a.example.b4xswitch parent,boolean _b,boolean _immediate) {
this.parent = parent;
this._b = _b;
this._immediate = _immediate;
}
b4a.example.b4xswitch parent;
boolean _b;
boolean _immediate;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 82;BA.debugLine="mValue = b";
parent._vvvv1 = _b;
 //BA.debugLineNum = 83;BA.debugLine="LoopIndex = LoopIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+1);
 //BA.debugLineNum = 84;BA.debugLine="If Immediate Then";
if (true) break;

case 1:
//if
this.state = 41;
if (_immediate) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 85;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 4:
//if
this.state = 11;
if (parent._vvvv1) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
parent._vvvvvvvv2((float) (1));
if (true) break;

case 8:
//C
this.state = 11;
parent._vvvvvvvv2((float) (0));
if (true) break;

case 11:
//C
this.state = 41;
;
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 87;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 88;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 89;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
 //BA.debugLineNum = 90;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 14:
//do while
this.state = 29;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 91;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
 //BA.debugLineNum = 92;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 17:
//if
this.state = 22;
if (parent._vvvv1==parent.__c.False) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
_state1 = (float) (1-_state1);
if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 93;BA.debugLine="Draw(state1)";
parent._vvvvvvvv2(_state1);
 //BA.debugLineNum = 94;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,this,(int) (16));
this.state = 47;
return;
case 47:
//C
this.state = 23;
;
 //BA.debugLineNum = 95;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 23:
//if
this.state = 28;
if (_myindex!=parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
this.state = 29;
if (true) break;
if (true) break;

case 28:
//C
this.state = 14;
;
 if (true) break;
;
 //BA.debugLineNum = 97;BA.debugLine="If MyIndex = LoopIndex Then";

case 29:
//if
this.state = 40;
if (_myindex==parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 //BA.debugLineNum = 98;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 32:
//if
this.state = 39;
if (parent._vvvv1) { 
this.state = 34;
;}
else {
this.state = 36;
;}if (true) break;

case 34:
//C
this.state = 39;
parent._vvvvvvvv2((float) (1));
if (true) break;

case 36:
//C
this.state = 39;
parent._vvvvvvvv2((float) (0));
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;
;
 //BA.debugLineNum = 101;BA.debugLine="If mEnabled Then";

case 41:
//if
this.state = 46;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
 //BA.debugLineNum = 102;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._vvvvv3._vv1 /*String*/ (ba,parent._vvv4,(float) (1));
 if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 104;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.6)";
parent._vvvvv3._vv1 /*String*/ (ba,parent._vvv4,(float) (0.6));
 if (true) break;

case 46:
//C
this.state = -1;
;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
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
