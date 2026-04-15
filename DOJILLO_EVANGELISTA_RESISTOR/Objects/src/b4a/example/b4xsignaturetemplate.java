package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xsignaturetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xsignaturetemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xsignaturetemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvv0 = null;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0f;
public float _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0f;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvv3 = 0;
public int _vvvvvv6 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 5;BA.debugLine="Private LastX, LastY As Float";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0f;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0f;
 //BA.debugLineNum = 6;BA.debugLine="Public StrokeWidth As Float = 2dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (float) (__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 7;BA.debugLine="Public StrokeColor As Int = xui.Color_Black";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _vvv5.Color_Black;
 //BA.debugLineNum = 8;BA.debugLine="Public TextColor As Int = 0xFFFF8800";
_vvvvvvvvv3 = ((int)0xffff8800);
 //BA.debugLineNum = 9;BA.debugLine="Public BackgroundColor As Int = xui.Color_White";
_vvvvvv6 = _vvv5.Color_White;
 //BA.debugLineNum = 10;BA.debugLine="Public AddDateAndTime As Boolean = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = __c.True;
 //BA.debugLineNum = 11;BA.debugLine="Public TextFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 12;BA.debugLine="Public NumberOfPoints As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
 //BA.debugLineNum = 56;BA.debugLine="Private Sub DialogClosed (Result As Int)";
 //BA.debugLineNum = 57;BA.debugLine="If Result = xui.DialogResponse_Positive And AddDa";
if (_result==_vvv5.DialogResponse_Positive && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 58;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"M\", TextFont";
_r = _vvvvvvvv0.MeasureText("M",_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 59;BA.debugLine="Dim Baseline As Int = cvs.TargetRect.Bottom - r.";
_baseline = (int) (_vvvvvvvv0.getTargetRect().getBottom()-_r.getHeight()-_r.getTop()-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 60;BA.debugLine="cvs.DrawText($\"$DateTime{DateTime.Now}\"$, 2dip,";
_vvvvvvvv0.DrawText(ba,(""+__c.SmartStringFormatter("datetime",(Object)(__c.DateTime.getNow()))+""),(float) (__c.DipToCurrent((int) (2))),(float) (_baseline),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,_vvvvvvvvv3,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub getBitmap As B4XBitmap";
 //BA.debugLineNum = 53;BA.debugLine="Return cvs.CreateBitmap";
if (true) return _vvvvvvvv0.CreateBitmap();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 29;BA.debugLine="Return mBase";
if (true) return _vvv4;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 16;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
_vvv4 = _vvv5.CreatePanel(ba,"mBase");
 //BA.debugLineNum = 17;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
_vvv4.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 18;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvv0.Initialize(_vvv4);
 //BA.debugLineNum = 19;BA.debugLine="TextFont = xui.CreateDefaultFont(14)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvv5.CreateDefaultFont((float) (14));
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _mbase_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub mBase_Touch (Action As Int, X As Float";
 //BA.debugLineNum = 39;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,_vvv4.TOUCH_ACTION_DOWN,_vvv4.TOUCH_ACTION_MOVE)) {
case 0: {
 //BA.debugLineNum = 41;BA.debugLine="LastX = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _x;
 //BA.debugLineNum = 42;BA.debugLine="LastY = Y";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _y;
 break; }
case 1: {
 //BA.debugLineNum = 44;BA.debugLine="cvs.DrawLine(LastX, LastY, X, Y, StrokeColor, S";
_vvvvvvvv0.DrawLine(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_x,_y,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 45;BA.debugLine="LastX = X";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _x;
 //BA.debugLineNum = 46;BA.debugLine="LastY = Y";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _y;
 //BA.debugLineNum = 47;BA.debugLine="cvs.Invalidate";
_vvvvvvvv0.Invalidate();
 //BA.debugLineNum = 48;BA.debugLine="NumberOfPoints = NumberOfPoints + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5+1);
 break; }
}
;
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvv1(int _width,int _height) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
 //BA.debugLineNum = 23;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvv4.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 24;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvv0.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _show(b4a.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
 //BA.debugLineNum = 33;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
_vvvvvvvv0.DrawRect(_vvvvvvvv0.getTargetRect(),_vvvvvv6,__c.True,(float) (0));
 //BA.debugLineNum = 34;BA.debugLine="cvs.Invalidate";
_vvvvvvvv0.Invalidate();
 //BA.debugLineNum = 35;BA.debugLine="NumberOfPoints = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (0);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((b4a.example.b4xdialog) args[0]);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show((b4a.example.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
