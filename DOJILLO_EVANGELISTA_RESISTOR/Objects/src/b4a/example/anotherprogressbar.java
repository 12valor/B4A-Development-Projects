package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.anotherprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.anotherprogressbar.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public b4a.example.bcpath._bcbrush _vvvvvv5 = null;
public int _vvvvvv6 = 0;
public int _vvvvvv7 = 0;
public b4a.example.bitmapcreator _vvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvv1 = null;
public b4a.example.bcpath._bcbrush _vvvvvvv2 = null;
public boolean _vvvvvvv3 = false;
public float _vvvvvvv4 = 0f;
public int _vvvvvvv5 = 0;
public b4a.example.bcpath._bcbrush _vvvvvvv6 = null;
public int _vvvv1 = 0;
public Object _vvvv7 = null;
public float _vvvvvvv7 = 0f;
public int _vvvvvvv0 = 0;
public int _vvvvvvvv1 = 0;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
 //BA.debugLineNum = 49;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 50;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvv4.GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
 //BA.debugLineNum = 51;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
 //BA.debugLineNum = 53;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
_vvvvvv0._initialize(ba,(int) (_vvv4.getWidth()/(double)_vvv5.getScale()),(int) (_vvv4.getHeight()/(double)_vvv5.getScale()));
 //BA.debugLineNum = 54;BA.debugLine="Vertical = mBase.Height > mBase.Width";
_vvvvvvv3 = _vvv4.getHeight()>_vvv4.getWidth();
 //BA.debugLineNum = 55;BA.debugLine="UpdateGraphics";
_vvvvvv2();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public void  _vvvvv4() throws Exception{
ResumableSub_BusyLoop rsub = new ResumableSub_BusyLoop(this);
rsub.resume(ba, null);
}
public static class ResumableSub_BusyLoop extends BA.ResumableSub {
public ResumableSub_BusyLoop(b4a.example.anotherprogressbar parent) {
this.parent = parent;
}
b4a.example.anotherprogressbar parent;
int _myindex = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
long _lasttime = 0L;
anywheresoftware.b4a.objects.collections.List _tasks = null;
float _delta = 0f;
float _change = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 60;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = parent._vvvvvv7;
 //BA.debugLineNum = 61;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 62;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
_r.Initialize((float) (0),(float) (0),(float) (parent._vvvvvv0._mwidth),(float) (parent._vvvvvv0._mheight));
 //BA.debugLineNum = 63;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 64;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
this.state = 37;
while (_myindex==parent._vvvvvv7) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 65;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._vvvvvvv3) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 66;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
parent._vvvvvv5.SrcOffsetY = (int) (parent._vvvvvv5.SrcOffsetY+parent._vvvvvvvv1);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 68;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
parent._vvvvvv5.SrcOffsetX = (int) (parent._vvvvvv5.SrcOffsetX+parent._vvvvvvvv1);
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 70;BA.debugLine="Dim tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 71;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
_tasks.Add((Object)(parent._vvvvvv0._asyncdrawrect(parent._vvvvvv0._targetrect,parent._vvvvvvv2,parent.__c.True,(int) (0))));
 //BA.debugLineNum = 73;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (parent._vvvv1-parent._vvvvvvv4);
 //BA.debugLineNum = 74;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Abs(_delta)<=1) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 21;
 //BA.debugLineNum = 75;BA.debugLine="CurrentValue = mValue";
parent._vvvvvvv4 = (float) (parent._vvvv1);
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 77;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) ((parent.__c.DateTime.getNow()-_lasttime)/(double)1000*parent._vvvvvvv7);
 //BA.debugLineNum = 78;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_delta>0) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 //BA.debugLineNum = 79;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
parent._vvvvvvv4 = (float) (parent._vvvvvvv4+parent.__c.Min(_change,parent._vvvv1-parent._vvvvvvv4));
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 81;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
parent._vvvvvvv4 = (float) (parent._vvvvvvv4-parent.__c.Min(_change,parent._vvvvvvv4-parent._vvvv1));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 84;BA.debugLine="LastTime = DateTime.Now";
_lasttime = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 85;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (parent._vvvvvvv4<100) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 86;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
_tasks.Add((Object)(parent._vvvvvv0._asyncdrawrectrounded(parent._vvvvvv0._targetrect,parent._vvvvvvv6,parent.__c.True,(int) (0),parent._vvvvvvv0)));
 if (true) break;
;
 //BA.debugLineNum = 88;BA.debugLine="If Vertical Then";

case 25:
//if
this.state = 30;
if (parent._vvvvvvv3) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 89;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
_r.setBottom((float) (parent.__c.Round(parent._vvvvvvv4/(double)100*parent._vvvvvv0._mheight)));
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 91;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
_r.setRight((float) (parent.__c.Round(parent._vvvvvvv4/(double)100*parent._vvvvvv0._mwidth)));
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 94;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
_tasks.Add((Object)(parent._vvvvvv0._asyncdrawrectrounded(_r,parent._vvvvvv5,parent.__c.True,(int) (0),parent._vvvvvvv0)));
 //BA.debugLineNum = 95;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
parent._vvvvvv0._drawbitmapcreatorsasync(parent,"BC",_tasks);
 //BA.debugLineNum = 96;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
parent.__c.WaitFor("bc_bitmapready", ba, this, null);
this.state = 38;
return;
case 38:
//C
this.state = 31;
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[0];
;
 //BA.debugLineNum = 97;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
this.state = 36;
if (parent._vvv5.getIsB4J()) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_bmp = parent._vvvvvv0._getbitmap();
if (true) break;

case 36:
//C
this.state = 1;
;
 //BA.debugLineNum = 98;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
parent._vvvvvv0._setbitmaptoimageview(_bmp,parent._vvvvvvv1);
 //BA.debugLineNum = 99;BA.debugLine="Sleep(30)";
parent.__c.Sleep(ba,this,(int) (30));
this.state = 39;
return;
case 39:
//C
this.state = 1;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _bc_bitmapready(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 9;BA.debugLine="Private BusyBrush As BCBrush";
_vvvvvv5 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 10;BA.debugLine="Private BackgroundColor As Int";
_vvvvvv6 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Private BusyIndex As Int";
_vvvvvv7 = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private bc As BitmapCreator";
_vvvvvv0 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 13;BA.debugLine="Private mIV As B4XView";
_vvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private TransparentBrush As BCBrush";
_vvvvvvv2 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 15;BA.debugLine="Private Vertical As Boolean";
_vvvvvvv3 = false;
 //BA.debugLineNum = 16;BA.debugLine="Private CurrentValue As Float";
_vvvvvvv4 = 0f;
 //BA.debugLineNum = 17;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
_vvvvvvv5 = _vvv5.Color_White;
 //BA.debugLineNum = 18;BA.debugLine="Private EmptyBrush As BCBrush";
_vvvvvvv6 = new b4a.example.bcpath._bcbrush();
 //BA.debugLineNum = 19;BA.debugLine="Private mValue As Int";
_vvvv1 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public ValueChangePerSecond As Float = 60";
_vvvvvvv7 = (float) (60);
 //BA.debugLineNum = 22;BA.debugLine="Public CornerRadius As Int";
_vvvvvvv0 = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public BrushOffsetDelta As Int = 3";
_vvvvvvvv1 = (int) (3);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 36;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 37;BA.debugLine="mIV = iv";
_vvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 38;BA.debugLine="mIV.Color = xui.Color_Transparent";
_vvvvvvv1.setColor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 39;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
_setvvv1((int)(BA.ObjectToNumber(_props.GetDefault((Object)("Value"),(Object)(100)))));
 //BA.debugLineNum = 40;BA.debugLine="CurrentValue = mValue";
_vvvvvvv4 = (float) (_vvvv1);
 //BA.debugLineNum = 41;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvv1.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 42;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
_vvv4.AddView((android.view.View)(_lbl.getObject()),(int) (0),(int) (0),_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 43;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
_vvv4.SetColorAndBorder(_vvv5.Color_Transparent,(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 44;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
_vvvvvv6 = _vvv5.PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
 //BA.debugLineNum = 45;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
_vvvvvvv0 = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornerRadius"),(Object)(15))));
 //BA.debugLineNum = 46;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvv3() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Public Sub getProgressColor As Int";
 //BA.debugLineNum = 104;BA.debugLine="Return BackgroundColor";
if (true) return _vvvvvv6;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return 0;
}
public int  _getvvv1() throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 158;BA.debugLine="Return mValue";
if (true) return _vvvv1;
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return 0;
}
public boolean  _getvvvvvv4() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 154;BA.debugLine="Return mBase.Visible";
if (true) return _vvv4.getVisible();
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 27;BA.debugLine="mEventName = EventName";
_vvv2 = _eventname;
 //BA.debugLineNum = 28;BA.debugLine="mCallBack = Callback";
_vvv3 = _callback;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvv3(int _c) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub setProgressColor (c As Int)";
 //BA.debugLineNum = 108;BA.debugLine="BackgroundColor = c";
_vvvvvv6 = _c;
 //BA.debugLineNum = 109;BA.debugLine="UpdateGraphics";
_vvvvvv2();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _setvvv1(int _v) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub setValue (v As Int)";
 //BA.debugLineNum = 162;BA.debugLine="mValue = Max(0, Min(100, v))";
_vvvv1 = (int) (__c.Max(0,__c.Min(100,_v)));
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
public String  _vvvvv0(int _v) throws Exception{
 //BA.debugLineNum = 165;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
 //BA.debugLineNum = 166;BA.debugLine="setValue(v)";
_setvvv1(_v);
 //BA.debugLineNum = 167;BA.debugLine="CurrentValue = mValue";
_vvvvvvv4 = (float) (_vvvv1);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvv4(boolean _b) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Public Sub setVisible(b As Boolean)";
 //BA.debugLineNum = 146;BA.debugLine="BusyIndex = BusyIndex + 1";
_vvvvvv7 = (int) (_vvvvvv7+1);
 //BA.debugLineNum = 147;BA.debugLine="If b Then";
if (_b) { 
 //BA.debugLineNum = 148;BA.debugLine="BusyLoop";
_vvvvv4();
 };
 //BA.debugLineNum = 150;BA.debugLine="mBase.Visible = b";
_vvv4.setVisible(_b);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvv2() throws Exception{
int _width = 0;
b4a.example.bitmapcreator _template = null;
b4a.example.bitmapcreator._argbcolor _bcolor = null;
 //BA.debugLineNum = 112;BA.debugLine="Public Sub UpdateGraphics";
 //BA.debugLineNum = 113;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
_vvvvvvv6 = _vvvvvv0._createbrushfromcolor(_vvvvvvv5);
 //BA.debugLineNum = 114;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
_vvvvvvv2 = _vvvvvv0._createbrushfromcolor(_vvv5.Color_Transparent);
 //BA.debugLineNum = 115;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
 //BA.debugLineNum = 116;BA.debugLine="Dim Template As BitmapCreator";
_template = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 117;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 118;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
_vvvvvv0._colortoargb(_vvvvvv6,_bcolor);
 //BA.debugLineNum = 119;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*1.5));
 //BA.debugLineNum = 120;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*1.5));
 //BA.debugLineNum = 121;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*1.5));
 //BA.debugLineNum = 122;BA.debugLine="If Vertical Then";
if (_vvvvvvv3) { 
 //BA.debugLineNum = 123;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
_template._initialize(ba,(int) (_vvv4.getWidth()/(double)_vvv5.getScale()),(int) (_vvv4.getWidth()/(double)_vvv5.getScale()+_width));
 }else {
 //BA.debugLineNum = 125;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
_template._initialize(ba,(int) (_vvv4.getHeight()/(double)_vvv5.getScale()+_width),(int) (_vvv4.getHeight()/(double)_vvv5.getScale()));
 };
 //BA.debugLineNum = 128;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
_template._drawrect(_template._targetrect,_vvvvvv6,__c.True,(int) (0));
 //BA.debugLineNum = 129;BA.debugLine="If Vertical Then";
if (_vvvvvvv3) { 
 //BA.debugLineNum = 130;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
_template._drawline((float) (-_width/(double)2),(float) (_width/(double)2),(float) (_template._mwidth+_width/(double)2),(float) (_template._mheight-_width/(double)2),_vvvvvv0._argbtocolor(_bcolor),_width);
 }else {
 //BA.debugLineNum = 132;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
_template._drawline((float) (_width/(double)2),(float) (-_width/(double)2),(float) (_template._mwidth-_width/(double)2),(float) (_template._mheight+_width/(double)2),_vvvvvv0._argbtocolor(_bcolor),_width);
 };
 //BA.debugLineNum = 134;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
_vvvvvv5 = _vvvvvv0._createbrushfrombitmapcreator(_template);
 //BA.debugLineNum = 135;BA.debugLine="If mValue = 100 Then";
if (_vvvv1==100) { 
 //BA.debugLineNum = 136;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
_vvvvvv0._drawrectrounded(_vvvvvv0._targetrect,_vvvvvv6,__c.True,(int) (0),(int) (15));
 }else {
 //BA.debugLineNum = 138;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
_vvvvvv0._drawrectrounded2(_vvvvvv0._targetrect,_vvvvvvv6,__c.True,(int) (0),(int) (15));
 };
 //BA.debugLineNum = 140;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
_vvvvvv0._setbitmaptoimageview(_vvvvvv0._getbitmap(),_vvvvvvv1);
 //BA.debugLineNum = 141;BA.debugLine="setVisible(mBase.Visible)";
_setvvvvvv4(_vvv4.getVisible());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
