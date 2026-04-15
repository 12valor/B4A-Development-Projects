package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcolortemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xcolortemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xcolortemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public int _vvvvvvvvvvvv3 = 0;
public b4a.example.bitmapcreator _vvvvvvvvvvvv4 = null;
public float _vvvvvvvvvvvv5 = 0f;
public float _vvvvvvvvvvvv6 = 0f;
public float _vvvvvvvvvvvv7 = 0f;
public float _vvvvvvvvvvvv0 = 0f;
public float _vvvvvvvvvvvvv1 = 0f;
public b4a.example.bitmapcreator _vvvvvvvvvvvvv2 = null;
public int _dont_change = 0;
public b4a.example.b4xcolortemplate._colorpickerpart _vvvvvvvvvvvvv3 = null;
public b4a.example.b4xcolortemplate._colorpickerpart _vvvvvvvvvvvvv4 = null;
public b4a.example.b4xcolortemplate._colorpickerpart _vvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvv6 = 0;
public b4a.example.b4xdialog _vvvvvvvvvvvvv7 = null;
public Object[] _vvvvvvvvvvvvv0 = null;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public static class _colorpickerpart{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XCanvas cvs;
public anywheresoftware.b4a.objects.B4XViewWrapper pnl;
public anywheresoftware.b4a.objects.B4XViewWrapper iv;
public anywheresoftware.b4a.objects.B4XCanvas checkersCanvas;
public boolean DrawCheckers;
public void Initialize() {
IsInitialized = true;
cvs = new anywheresoftware.b4a.objects.B4XCanvas();
pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
checkersCanvas = new anywheresoftware.b4a.objects.B4XCanvas();
DrawCheckers = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _alpha_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 263;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
 //BA.debugLineNum = 264;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==_vvv4.TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
 //BA.debugLineNum = 265;BA.debugLine="AlphaBarSelectedChange(x)";
_vvvvvvvvvv2(_x);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvv2(float _x) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 147;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
 //BA.debugLineNum = 148;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
_vvvvvvvvvvvv3 = (int) (255*__c.Max(0,__c.Min(1,_x/(double)_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
 //BA.debugLineNum = 149;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (_vvvvvvvvvvvv3/(double)255*_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 //BA.debugLineNum = 150;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
_vvvvvvvvvvvvv5.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_vvvvvvvvvvvvv5.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
 //BA.debugLineNum = 151;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 152;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
_r.Initialize((float) (_x-__c.DipToCurrent((int) (3))),(float) (__c.DipToCurrent((int) (1))),(float) (_x+__c.DipToCurrent((int) (3))),(float) (_vvvvvvvvvvvvv5.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 153;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
_vvvvvvvvvvvvv5.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_vvv5.Color_Black,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 154;BA.debugLine="AlphaBar.cvs.Invalidate";
_vvvvvvvvvvvvv5.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
 //BA.debugLineNum = 155;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
int _r = 0;
int _w = 0;
b4a.example.b4xcolortemplate._colorpickerpart _cpp = null;
int _i = 0;
 //BA.debugLineNum = 51;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 53;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
_vvvvvvvvvvvvv1 = (float) (__c.Max(1,__c.Max(_width,_height)/(double)100/(double)_vvvvvvvvvvvv0));
 //BA.debugLineNum = 54;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (30)),(int) (_height-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 55;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) (_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 56;BA.debugLine="Dim w As Int = Width - r - 1dip";
_w = (int) (_width-_r-__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 57;BA.debugLine="If xui.IsB4i Then";
if (_vvv5.getIsB4i()) { 
 //BA.debugLineNum = 58;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
 //BA.debugLineNum = 59;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
 //BA.debugLineNum = 61;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,(int) (_height-__c.DipToCurrent((int) (31))),_w,__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 62;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,__c.DipToCurrent((int) (1)),_w,(int) (_height-__c.DipToCurrent((int) (3))-_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 //BA.debugLineNum = 63;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
_vvvvvvvvvvvv4._initialize(ba,(int) (_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)_vvvvvvvvvvvvv1),(int) (_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)_vvvvvvvvvvvvv1));
 //BA.debugLineNum = 64;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
final Object[] group12 = new Object[]{(Object)(_vvvvvvvvvvvvv3),(Object)(_vvvvvvvvvvvvv4),(Object)(_vvvvvvvvvvvvv5)};
final int groupLen12 = group12.length
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (b4a.example.b4xcolortemplate._colorpickerpart)(group12[index12]);
 //BA.debugLineNum = 65;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 66;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
 //BA.debugLineNum = 68;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 //BA.debugLineNum = 69;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp.DrawCheckers /*boolean*/ ) { 
 //BA.debugLineNum = 70;BA.debugLine="DrawCheckers(cpp)";
_vvvvvvvvvv6(_cpp);
 };
 }
};
 //BA.debugLineNum = 73;BA.debugLine="DrawHueBar";
_vvvvvvvvvv0();
 //BA.debugLineNum = 74;BA.debugLine="DrawAlphaBar";
_vvvvvvvvvv5();
 //BA.debugLineNum = 75;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
_vvvvvvvvvvv4((float) (_vvvvvvvvvvvv5/(double)360*_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 //BA.debugLineNum = 76;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
_vvvvvvvvvv2((float) (_vvvvvvvvvvvv3/(double)255*_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public mBase As B4XView 'ignore";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private SelectedAlpha As Int = 255";
_vvvvvvvvvvvv3 = (int) (255);
 //BA.debugLineNum = 5;BA.debugLine="Private bcColors As BitmapCreator";
_vvvvvvvvvvvv4 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 6;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
_vvvvvvvvvvvv5 = (float) (60);
_vvvvvvvvvvvv6 = (float) (0.5);
_vvvvvvvvvvvv7 = (float) (0.5);
 //BA.debugLineNum = 7;BA.debugLine="Private DeviceScale, ColorScale As Float";
_vvvvvvvvvvvv0 = 0f;
_vvvvvvvvvvvvv1 = 0f;
 //BA.debugLineNum = 8;BA.debugLine="Private tempBC As BitmapCreator";
_vvvvvvvvvvvvv2 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 9;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
_dont_change = (int) (-999999999);
 //BA.debugLineNum = 10;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
 //BA.debugLineNum = 11;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
_vvvvvvvvvvvvv3 = new b4a.example.b4xcolortemplate._colorpickerpart();
_vvvvvvvvvvvvv4 = new b4a.example.b4xcolortemplate._colorpickerpart();
_vvvvvvvvvvvvv5 = new b4a.example.b4xcolortemplate._colorpickerpart();
 //BA.debugLineNum = 12;BA.debugLine="Private BordersColor As Int";
_vvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private xDialog As B4XDialog";
_vvvvvvvvvvvvv7 = new b4a.example.b4xdialog();
 //BA.debugLineNum = 14;BA.debugLine="Private InitialColor() As Object";
_vvvvvvvvvvvvv0 = new Object[(int) (0)];
{
int d0 = _vvvvvvvvvvvvv0.length;
for (int i0 = 0;i0 < d0;i0++) {
_vvvvvvvvvvvvv0[i0] = new Object();
}
}
;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _colors_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
 //BA.debugLineNum = 254;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==_vvv4.TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
 //BA.debugLineNum = 255;BA.debugLine="HandleSelectedColorChanged(X, Y)";
_vvvvvvvvvvv3((int) (_x),(int) (_y));
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return "";
}
public Object[]  _vvvvvvvvvv3(int _clr) throws Exception{
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
float _h = 0f;
float _s = 0f;
float _v = 0f;
int _cmax = 0;
int _cmin = 0;
float _rc = 0f;
float _gc = 0f;
float _bc = 0f;
 //BA.debugLineNum = 199;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
 //BA.debugLineNum = 200;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (24)));
 //BA.debugLineNum = 201;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (16)));
 //BA.debugLineNum = 202;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (8)));
 //BA.debugLineNum = 203;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (0)));
 //BA.debugLineNum = 204;BA.debugLine="Dim h, s, v As Float";
_h = 0f;
_s = 0f;
_v = 0f;
 //BA.debugLineNum = 205;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (__c.Max(__c.Max(_r,_g),_b));
 //BA.debugLineNum = 206;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (__c.Min(__c.Min(_r,_g),_b));
 //BA.debugLineNum = 207;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
 //BA.debugLineNum = 208;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
 //BA.debugLineNum = 209;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
 //BA.debugLineNum = 211;BA.debugLine="If s = 0 Then";
if (_s==0) { 
 //BA.debugLineNum = 212;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
 //BA.debugLineNum = 214;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
 //BA.debugLineNum = 215;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
 //BA.debugLineNum = 216;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
 //BA.debugLineNum = 217;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
 //BA.debugLineNum = 218;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else if(_g==_cmax) { 
 //BA.debugLineNum = 220;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
 //BA.debugLineNum = 222;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 };
 //BA.debugLineNum = 224;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
 //BA.debugLineNum = 225;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
 //BA.debugLineNum = 227;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return new Object[]{(Object)(_h*360),(Object)(_s),(Object)(_v),(Object)(_a)};
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4a.example.b4xcolortemplate._colorpickerpart  _vvvvvvvvvv4(String _eventname,boolean _withcheckers) throws Exception{
b4a.example.b4xcolortemplate._colorpickerpart _cpp = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _overlay = null;
 //BA.debugLineNum = 30;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
 //BA.debugLineNum = 31;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = new b4a.example.b4xcolortemplate._colorpickerpart();
 //BA.debugLineNum = 32;BA.debugLine="cpp.Initialize";
_cpp.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _vvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 34;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(_vvvvvvvvvvvvv6,__c.DipToCurrent((int) (1)),_vvvvvvvvvvvvv6,(int) (0));
 //BA.debugLineNum = 35;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 36;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
 //BA.debugLineNum = 37;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 //BA.debugLineNum = 38;BA.debugLine="cpp.DrawCheckers = True";
_cpp.DrawCheckers /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 40;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 41;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 42;BA.debugLine="cpp.iv = iv";
_cpp.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 43;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_overlay = _vvv5.CreatePanel(ba,_eventname);
 //BA.debugLineNum = 44;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 45;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_overlay.getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 46;BA.debugLine="cpp.cvs.Initialize(overlay)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_overlay);
 //BA.debugLineNum = 47;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 48;BA.debugLine="Return cpp";
if (true) return _cpp;
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Private Sub DialogClosed(Result As Int)";
 //BA.debugLineNum = 242;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=_vvv5.DialogResponse_Positive) { 
 //BA.debugLineNum = 243;BA.debugLine="setSelectedHSVColor(InitialColor)";
_setvvvvvvvvvvvv2(_vvvvvvvvvvvvv0);
 };
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvv5() throws Exception{
b4a.example.bitmapcreator _bc = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 109;BA.debugLine="Private Sub DrawAlphaBar";
 //BA.debugLineNum = 110;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 111;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
_bc._initialize(ba,(int) (_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)_vvvvvvvvvvvv0),(int) (_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)_vvvvvvvvvvvv0));
 //BA.debugLineNum = 112;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 113;BA.debugLine="argb.r = 0xcc";
_argb.r = ((int)0xcc);
 //BA.debugLineNum = 114;BA.debugLine="argb.g = 0xcc";
_argb.g = ((int)0xcc);
 //BA.debugLineNum = 115;BA.debugLine="argb.b = 0xcc";
_argb.b = ((int)0xcc);
 //BA.debugLineNum = 117;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
 //BA.debugLineNum = 118;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
 //BA.debugLineNum = 119;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb.a = (int) (_x/(double)_bc._mwidth*255);
 //BA.debugLineNum = 120;BA.debugLine="bc.SetARGB(x, y, argb)";
_bc._setargb(_x,_y,_argb);
 }
};
 }
};
 //BA.debugLineNum = 123;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
_vvvvvvvvvvvvv5.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bc._getbitmap().getObject()));
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvv6(b4a.example.b4xcolortemplate._colorpickerpart _cpp) throws Exception{
int _size = 0;
int[] _clrs = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _x = 0;
int _xx = 0;
int _y = 0;
 //BA.debugLineNum = 79;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
 //BA.debugLineNum = 80;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 //BA.debugLineNum = 81;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
 //BA.debugLineNum = 82;BA.debugLine="Dim size As Int = 10dip";
_size = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 83;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = new int[]{((int)0xffc0c0c0),((int)0xff757575)};
 //BA.debugLineNum = 84;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
 //BA.debugLineNum = 85;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 86;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
final int step7 = _size;
final int limit7 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()-__c.DipToCurrent((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
 //BA.debugLineNum = 87;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
 //BA.debugLineNum = 88;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
 //BA.debugLineNum = 89;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
final int step10 = _size;
final int limit10 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
 //BA.debugLineNum = 90;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
 //BA.debugLineNum = 91;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
_r.Initialize((float) (_x),(float) (_y),(float) (_x+_size),(float) (_y+_size));
 //BA.debugLineNum = 92;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_clrs[_clr],__c.True,(float) (0));
 }
};
 }
};
 //BA.debugLineNum = 95;BA.debugLine="cpp.checkersCanvas.Invalidate";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvv7() throws Exception{
int _x = 0;
int _y = 0;
 //BA.debugLineNum = 126;BA.debugLine="Private Sub DrawColors";
 //BA.debugLineNum = 127;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
final int step1 = 1;
final int limit1 = (int) (_vvvvvvvvvvvv4._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
 //BA.debugLineNum = 128;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
final int step2 = 1;
final int limit2 = (int) (_vvvvvvvvvvvv4._mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
 //BA.debugLineNum = 129;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
_vvvvvvvvvvvv4._sethsv(_x,_y,_vvvvvvvvvvvv3,(int) (_vvvvvvvvvvvv5),(float) (_x/(double)_vvvvvvvvvvvv4._mwidth),(float) ((_vvvvvvvvvvvv4._mheight-_y)/(double)_vvvvvvvvvvvv4._mheight));
 }
};
 }
};
 //BA.debugLineNum = 133;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
_vvvvvvvvvvvvv4.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_vvvvvvvvvvvv4._getbitmap().Resize(_vvvvvvvvvvvvv4.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_vvvvvvvvvvvvv4.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.False).getObject()));
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvv0() throws Exception{
b4a.example.bitmapcreator _bchue = null;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 98;BA.debugLine="Private Sub DrawHueBar";
 //BA.debugLineNum = 99;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 100;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
_bchue._initialize(ba,(int) (_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)_vvvvvvvvvvvv0),(int) (_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)_vvvvvvvvvvvv0));
 //BA.debugLineNum = 101;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
final int step3 = 1;
final int limit3 = (int) (_bchue._mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
 //BA.debugLineNum = 102;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
final int step4 = 1;
final int limit4 = (int) (_bchue._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
 //BA.debugLineNum = 103;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
_bchue._sethsv(_x,_y,(int) (255),(int) (360/(double)_bchue._mheight*_y),(float) (1),(float) (1));
 }
};
 }
};
 //BA.debugLineNum = 106;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
_vvvvvvvvvvvvv3.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bchue._getbitmap().getObject()));
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 231;BA.debugLine="Return mBase";
if (true) return _vvv4;
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvvvvvv1() throws Exception{
Object[] _hsv = null;
 //BA.debugLineNum = 175;BA.debugLine="Public Sub getSelectedColor As Int";
 //BA.debugLineNum = 176;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
_hsv = _getvvvvvvvvvvvv2();
 //BA.debugLineNum = 177;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
_vvvvvvvvvvvvv2._sethsv((int) (0),(int) (0),_vvvvvvvvvvvv3,(int)(BA.ObjectToNumber(_hsv[(int) (0)])),(float)(BA.ObjectToNumber(_hsv[(int) (1)])),(float)(BA.ObjectToNumber(_hsv[(int) (2)])));
 //BA.debugLineNum = 178;BA.debugLine="Return tempBC.GetColor(0, 0)";
if (true) return _vvvvvvvvvvvvv2._getcolor((int) (0),(int) (0));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return 0;
}
public Object[]  _getvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
 //BA.debugLineNum = 187;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return new Object[]{(Object)(_vvvvvvvvvvvv5),(Object)(_vvvvvvvvvvvv6),(Object)(_vvvvvvvvvvvv7),(Object)(_vvvvvvvvvvvv3)};
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvv3(int _x,int _y) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
 //BA.debugLineNum = 164;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=_dont_change) { 
 //BA.debugLineNum = 165;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
_vvvvvvvvvvvv6 = (float) (__c.Max(0,__c.Min(1,_x/(double)_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
 //BA.debugLineNum = 166;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
_vvvvvvvvvvvv7 = (float) (__c.Max(0,__c.Min(1,(_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_y)/(double)_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
 //BA.debugLineNum = 168;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
_vvvvvvvvvvvvv4.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_vvvvvvvvvvvvv4.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
 //BA.debugLineNum = 169;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
_vvvvvvvvvvvvv4.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_vvvvvvvvvvvv6*_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_vvvvvvvvvvvv7*_vvvvvvvvvvvvv4.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(float) (__c.DipToCurrent((int) (10))),_vvv5.Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 171;BA.debugLine="ColorPicker.cvs.Invalidate";
_vvvvvvvvvvvvv4.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
 //BA.debugLineNum = 172;BA.debugLine="UpdateBarColor";
_vvvvvvvvvvv0();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _huebar_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
 //BA.debugLineNum = 259;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==_vvv4.TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
 //BA.debugLineNum = 260;BA.debugLine="HueBarSelectedChanged(Y)";
_vvvvvvvvvvv4(_y);
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv4(float _y) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 136;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
 //BA.debugLineNum = 137;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
_vvvvvvvvvvvv5 = (float) (__c.Max(0,__c.Min(360,360*_y/(double)_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 //BA.debugLineNum = 138;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (_vvvvvvvvvvvv5*_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)360);
 //BA.debugLineNum = 139;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
_vvvvvvvvvvvvv3.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_vvvvvvvvvvvvv3.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
 //BA.debugLineNum = 140;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 141;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
_r.Initialize((float) (0),(float) (_y-__c.DipToCurrent((int) (3))),_vvvvvvvvvvvvv3.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),(float) (_y+__c.DipToCurrent((int) (3))));
 //BA.debugLineNum = 142;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
_vvvvvvvvvvvvv3.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_vvv5.Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 143;BA.debugLine="HueBar.cvs.Invalidate";
_vvvvvvvvvvvvv3.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
 //BA.debugLineNum = 144;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 18;BA.debugLine="tempBC.Initialize(1, 1)";
_vvvvvvvvvvvvv2._initialize(ba,(int) (1),(int) (1));
 //BA.debugLineNum = 19;BA.debugLine="DeviceScale = 100dip / 100";
_vvvvvvvvvvvv0 = (float) (__c.DipToCurrent((int) (100))/(double)100);
 //BA.debugLineNum = 20;BA.debugLine="mBase = xui.CreatePanel(\"\")";
_vvv4 = _vvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
_vvv4.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (250)));
 //BA.debugLineNum = 22;BA.debugLine="BordersColor = xui.Color_Black";
_vvvvvvvvvvvvv6 = _vvv5.Color_Black;
 //BA.debugLineNum = 23;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
_vvv4.SetColorAndBorder(_vvvvvvvvvvvvv6,__c.DipToCurrent((int) (1)),_vvvvvvvvvvvvv6,__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 24;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
_vvvvvvvvvvvvv3 = _vvvvvvvvvv4("hueBar",__c.False);
 //BA.debugLineNum = 25;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
_vvvvvvvvvvvvv4 = _vvvvvvvvvv4("colors",__c.True);
 //BA.debugLineNum = 26;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
_vvvvvvvvvvvvv5 = _vvvvvvvvvv4("alpha",__c.True);
 //BA.debugLineNum = 27;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvv1(int _i) throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Public Sub setSelectedColor(i As Int)";
 //BA.debugLineNum = 182;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
_setvvvvvvvvvvvv2(_vvvvvvvvvv3(_i));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvv2(Object[] _hsv) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
 //BA.debugLineNum = 191;BA.debugLine="selectedH = HSV(0)";
_vvvvvvvvvvvv5 = (float)(BA.ObjectToNumber(_hsv[(int) (0)]));
 //BA.debugLineNum = 192;BA.debugLine="selectedS = HSV(1)";
_vvvvvvvvvvvv6 = (float)(BA.ObjectToNumber(_hsv[(int) (1)]));
 //BA.debugLineNum = 193;BA.debugLine="selectedV = HSV(2)";
_vvvvvvvvvvvv7 = (float)(BA.ObjectToNumber(_hsv[(int) (2)]));
 //BA.debugLineNum = 194;BA.debugLine="SelectedAlpha = HSV(3)";
_vvvvvvvvvvvv3 = (int)(BA.ObjectToNumber(_hsv[(int) (3)]));
 //BA.debugLineNum = 195;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
_vvvvvvvvvvv4((float) (_vvvvvvvvvvvv5/(double)360*_vvvvvvvvvvvvv3.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
 //BA.debugLineNum = 196;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
_vvvvvvvvvv2((float) (_vvvvvvvvvvvv3/(double)255*_vvvvvvvvvvvvv5.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.example.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xcolortemplate parent,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
b4a.example.b4xcolortemplate parent;
b4a.example.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 235;BA.debugLine="InitialColor = getSelectedHSVColor";
parent._vvvvvvvvvvvvv0 = parent._getvvvvvvvvvvvv2();
 //BA.debugLineNum = 236;BA.debugLine="xDialog = Dialog";
parent._vvvvvvvvvvvvv7 = _dialog;
 //BA.debugLineNum = 237;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 238;BA.debugLine="UpdateBarColor";
parent._vvvvvvvvvvv0();
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Private Sub Update";
 //BA.debugLineNum = 159;BA.debugLine="DrawColors";
_vvvvvvvvvv7();
 //BA.debugLineNum = 160;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
_vvvvvvvvvvv3(_dont_change,_dont_change);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Private Sub UpdateBarColor";
 //BA.debugLineNum = 248;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
if (_vvvvvvvvvvvvv7.IsInitialized /*boolean*/ () && _vvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 249;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
_vvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvv2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_getvvvvvvvvvvvv1());
 };
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DIALOGCLOSED"))
	return _dialogclosed(((Number)args[0]).intValue());
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel((b4a.example.b4xdialog) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
