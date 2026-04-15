package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xdialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xdialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvv2 = null;
public int _vvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvv0 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvv2 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvv3 = false;
public int _vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvv5 = null;
public Object _vvvvvvvvvvvvvvvvvvvvvvv6 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _vvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int[] _vvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.collections.Map _vvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _background_click() throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Private Sub Background_Click";
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public String  _background_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Private Sub Background_Touch (Action As Int, X As";
 //BA.debugLineNum = 258;BA.debugLine="End Sub";
return "";
}
public b4a.example.bitmapcreator  _vvvvvvvvvvvvvvvvvvvv3(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
b4a.example.bitmapcreator _bc = null;
int _reducescale = 0;
int _count = 0;
b4a.example.bitmapcreator._argbcolor[] _clrs = null;
b4a.example.bitmapcreator._argbcolor _temp = null;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
 //BA.debugLineNum = 290;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As BitmapCreat";
 //BA.debugLineNum = 291;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 292;BA.debugLine="Dim ReduceScale As Int = BlurReduceScale";
_reducescale = _vvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 293;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
_bc._initialize(ba,(int) (_bmp.getWidth()/(double)_reducescale/(double)_bmp.getScale()),(int) (_bmp.getHeight()/(double)_reducescale/(double)_bmp.getScale()));
 //BA.debugLineNum = 294;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
_bc._copypixelsfrombitmap(_bmp);
 //BA.debugLineNum = 295;BA.debugLine="Dim count As Int = 2";
_count = (int) (2);
 //BA.debugLineNum = 296;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = new b4a.example.bitmapcreator._argbcolor[(int) (3)];
{
int d0 = _clrs.length;
for (int i0 = 0;i0 < d0;i0++) {
_clrs[i0] = new b4a.example.bitmapcreator._argbcolor();
}
}
;
 //BA.debugLineNum = 297;BA.debugLine="Dim temp As ARGBColor";
_temp = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 298;BA.debugLine="Dim m As Int";
_m = 0;
 //BA.debugLineNum = 299;BA.debugLine="For steps = 1 To count";
{
final int step9 = 1;
final int limit9 = _count;
_steps = (int) (1) ;
for (;_steps <= limit9 ;_steps = _steps + step9 ) {
 //BA.debugLineNum = 300;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step10 = 1;
final int limit10 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit10 ;_y = _y + step10 ) {
 //BA.debugLineNum = 301;BA.debugLine="For x = 0 To 2";
{
final int step11 = 1;
final int limit11 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit11 ;_x = _x + step11 ) {
 //BA.debugLineNum = 302;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
_bc._getargb(_x,_y,_clrs[_x]);
 }
};
 //BA.debugLineNum = 304;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
_vvvvvvvvvvvvvvvvvvvvv2(_bc,(int) (1),_y,_clrs,_temp);
 //BA.debugLineNum = 305;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 306;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
final int step16 = 1;
final int limit16 = (int) (_bc._mwidth-2);
_x = (int) (2) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
 //BA.debugLineNum = 307;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
_bc._getargb((int) (_x+1),_y,_clrs[_m]);
 //BA.debugLineNum = 308;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
 //BA.debugLineNum = 309;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_vvvvvvvvvvvvvvvvvvvvv2(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 //BA.debugLineNum = 312;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step22 = 1;
final int limit22 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit22 ;_x = _x + step22 ) {
 //BA.debugLineNum = 313;BA.debugLine="For y = 0 To 2";
{
final int step23 = 1;
final int limit23 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit23 ;_y = _y + step23 ) {
 //BA.debugLineNum = 314;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
_bc._getargb(_x,_y,_clrs[_y]);
 }
};
 //BA.debugLineNum = 316;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
_vvvvvvvvvvvvvvvvvvvvv2(_bc,_x,(int) (1),_clrs,_temp);
 //BA.debugLineNum = 317;BA.debugLine="m = 0";
_m = (int) (0);
 //BA.debugLineNum = 318;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
final int step28 = 1;
final int limit28 = (int) (_bc._mheight-2);
_y = (int) (2) ;
for (;_y <= limit28 ;_y = _y + step28 ) {
 //BA.debugLineNum = 319;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
_bc._getargb(_x,(int) (_y+1),_clrs[_m]);
 //BA.debugLineNum = 320;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
 //BA.debugLineNum = 321;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
_vvvvvvvvvvvvvvvvvvvvv2(_bc,_x,_y,_clrs,_temp);
 }
};
 }
};
 }
};
 //BA.debugLineNum = 325;BA.debugLine="Return bc";
if (true) return _bc;
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public String  _button_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
 //BA.debugLineNum = 236;BA.debugLine="Private Sub Button_Click";
 //BA.debugLineNum = 237;BA.debugLine="Dim b As B4XView = Sender";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 238;BA.debugLine="If ButtonsState.GetDefault(b.Tag, True) = False T";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvv1.GetDefault(_b.getTag(),(Object)(__c.True))).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 239;BA.debugLine="Close(b.Tag)";
_vvvvvvvvvvvvvvvvvvvv4((int)(BA.ObjectToNumber(_b.getTag())));
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Public ButtonsHeight As Int = 40dip";
_vvvvvvvvvvvvvvvvvvvvv7 = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 7;BA.debugLine="Public TitleBarHeight As Int = 30dip";
_vvvvvvvvvvvvvvvvvvvvv0 = __c.DipToCurrent((int) (30));
 //BA.debugLineNum = 8;BA.debugLine="Private ButtonWidth As Int = 80dip";
_vvvvvvvvvvvvvvvvvvvvvv1 = __c.DipToCurrent((int) (80));
 //BA.debugLineNum = 9;BA.debugLine="Public Base As B4XView";
_vvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Public BackgroundColor As Int = 0xFF555555 'base";
_vvvvvv6 = ((int)0xff555555);
 //BA.debugLineNum = 11;BA.debugLine="Public OverlayColor As Int = 0xaa000000";
_vvvvvvvvvvvvvvvvvvvvvv3 = ((int)0xaa000000);
 //BA.debugLineNum = 12;BA.debugLine="Public BorderColor As Int = 0xff000000";
_vvvvvvvvvvvvvvvvvvvvvv4 = ((int)0xff000000);
 //BA.debugLineNum = 13;BA.debugLine="Public BorderCornersRadius As Int = 2dip";
_vvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 14;BA.debugLine="Public BorderWidth As Int = 2dip";
_vvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 15;BA.debugLine="Public ButtonsColor As Int = 0xFF555555";
_vvvvvvvvvvvvvvvvvvvvvv7 = ((int)0xff555555);
 //BA.debugLineNum = 16;BA.debugLine="Public ButtonsTextColor As Int = 0xFF89D5FF";
_vvvvvvvvvvvvvvvvvvvvvv0 = ((int)0xff89d5ff);
 //BA.debugLineNum = 17;BA.debugLine="Private Background As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private BlurImageView As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Public BlurBackground As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 20;BA.debugLine="Private BlurReduceScale As Int";
_vvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public mParent As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public Title As Object = \"\"";
_vvvvvvvvvvvvvvvvvvvvvvv6 = (Object)("");
 //BA.debugLineNum = 23;BA.debugLine="Public TitleBarColor As Int = 0xFF0083B8";
_vvvvvvvvvvvvvvvvvvvvvvv7 = ((int)0xff0083b8);
 //BA.debugLineNum = 24;BA.debugLine="Public TitleBarTextColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 25;BA.debugLine="Public BodyTextColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvv1 = _vvv5.Color_White;
 //BA.debugLineNum = 26;BA.debugLine="Public TitleBar As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Public PutAtTop As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 28;BA.debugLine="Public TitleBarFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 29;BA.debugLine="Public ButtonsFont As B4XFont";
_vvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 30;BA.debugLine="Public ButtonsTextColorDisabled As Int = 0xFF8080";
_vvvvvvvvvvvvvvvvvvvvvvvv6 = ((int)0xff808080);
 //BA.debugLineNum = 31;BA.debugLine="Public VisibleAnimationDuration As Int = 100";
_vvvvvvvvvvvvvvvvvvvvvvvv7 = (int) (100);
 //BA.debugLineNum = 32;BA.debugLine="Public ButtonsOrder() As Int = Array As Int(xui.D";
_vvvvvvvvvvvvvvvvvvvvvvvv0 = new int[]{_vvv5.DialogResponse_Positive,_vvv5.DialogResponse_Negative,_vvv5.DialogResponse_Cancel};
 //BA.debugLineNum = 33;BA.debugLine="Public ButtonsState As Map";
_vvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public boolean  _vvvvvvvvvvvvvvvvvvvv4(int _result) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Public Sub Close (Result As Int) As Boolean";
 //BA.debugLineNum = 243;BA.debugLine="If getVisible Then";
if (_getvvvvvv4()) { 
 //BA.debugLineNum = 244;BA.debugLine="CallSubDelayed2(Me, \"CloseMessage\", Result)";
__c.CallSubDelayed2(ba,this,"CloseMessage",(Object)(_result));
 //BA.debugLineNum = 245;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 247;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return false;
}
public String  _vvvvvvvvvvvvvvvvvvvv5(Object _text,int _code) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _btn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xbtn = null;
int _numberofbuttons = 0;
 //BA.debugLineNum = 196;BA.debugLine="Private Sub CreateButton (Text As Object, Code As";
 //BA.debugLineNum = 197;BA.debugLine="If Text = \"\" Then Return";
if ((_text).equals((Object)(""))) { 
if (true) return "";};
 //BA.debugLineNum = 201;BA.debugLine="Dim btn As Label";
_btn = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 203;BA.debugLine="btn.Initialize(\"Button\")";
_btn.Initialize(ba,"Button");
 //BA.debugLineNum = 204;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xbtn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()));
 //BA.debugLineNum = 205;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xbtn, Tex";
_vvvvv3._vv3 /*String*/ (ba,_xbtn,_text);
 //BA.debugLineNum = 206;BA.debugLine="xbtn.Tag = Code";
_xbtn.setTag((Object)(_code));
 //BA.debugLineNum = 207;BA.debugLine="xbtn.SetColorAndBorder(ButtonsColor, 0dip, Border";
_xbtn.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvv7,__c.DipToCurrent((int) (0)),_vvvvvvvvvvvvvvvvvvvvvv4,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 208;BA.debugLine="xbtn.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xbtn.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 209;BA.debugLine="xbtn.TextColor = ButtonsTextColor";
_xbtn.setTextColor(_vvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 210;BA.debugLine="xbtn.Font = ButtonsFont";
_xbtn.setFont(_vvvvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 211;BA.debugLine="Dim numberOfButtons As Int = Base.NumberOfViews '";
_numberofbuttons = _vvvvvvvvvvvvvvvvvvvvvv2.getNumberOfViews();
 //BA.debugLineNum = 212;BA.debugLine="Base.AddView(xbtn, Base.Width - 4dip - numberOfBu";
_vvvvvvvvvvvvvvvvvvvvvv2.AddView((android.view.View)(_xbtn.getObject()),(int) (_vvvvvvvvvvvvvvvvvvvvvv2.getWidth()-__c.DipToCurrent((int) (4))-_numberofbuttons*(_vvvvvvvvvvvvvvvvvvvvvv1+__c.DipToCurrent((int) (5)))-_vvvvvvvvvvvvvvvvvvvvvv1),(int) (_vvvvvvvvvvvvvvvvvvvvvv2.getHeight()-_vvvvvvvvvvvvvvvvvvvvv7-__c.DipToCurrent((int) (4))),_vvvvvvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 214;BA.debugLine="If Code = xui.DialogResponse_Cancel Then xbtn.Req";
if (_code==_vvv5.DialogResponse_Cancel) { 
_xbtn.RequestFocus();};
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _vvvvvvvvvvvvvvvvvvvv6(int _resultcode) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
 //BA.debugLineNum = 218;BA.debugLine="Public Sub GetButton (ResultCode As Int) As B4XVie";
 //BA.debugLineNum = 219;BA.debugLine="For Each b As B4XView In Base.GetAllViewsRecursiv";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _vvvvvvvvvvvvvvvvvvvvvv2.GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
 //BA.debugLineNum = 220;BA.debugLine="If b.Tag = ResultCode Then Return b 'ignore";
if ((_b.getTag()).equals((Object)(_resultcode))) { 
if (true) return _b;};
 }
};
 //BA.debugLineNum = 222;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Null));
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public boolean  _getvvvvvv4() throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 193;BA.debugLine="Return Background.IsInitialized And Background.Pa";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized() && _vvvvvvvvvvvvvvvvvvvvvvv1.getParent().IsInitialized();
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
 //BA.debugLineNum = 37;BA.debugLine="BlurBackground = False";
_vvvvvvvvvvvvvvvvvvvvvvv3 = __c.False;
 //BA.debugLineNum = 38;BA.debugLine="If xui.IsB4i Then";
if (_vvv5.getIsB4i()) { 
 //BA.debugLineNum = 39;BA.debugLine="BlurReduceScale = 3";
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (3);
 }else if(_vvv5.getIsB4J()) { 
 //BA.debugLineNum = 41;BA.debugLine="BlurReduceScale = 1";
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (1);
 }else if(_vvv5.getIsB4A()) { 
 //BA.debugLineNum = 43;BA.debugLine="BlurReduceScale = 3";
_vvvvvvvvvvvvvvvvvvvvvvv4 = (int) (3);
 };
 //BA.debugLineNum = 45;BA.debugLine="mParent = Parent";
_vvvvvvvvvvvvvvvvvvvvvvv5 = _parent;
 //BA.debugLineNum = 51;BA.debugLine="TitleBarFont = xui.CreateDefaultBoldFont(16)";
_vvvvvvvvvvvvvvvvvvvvvvvv4 = _vvv5.CreateDefaultBoldFont((float) (16));
 //BA.debugLineNum = 52;BA.debugLine="ButtonsFont = xui.CreateDefaultBoldFont(15)";
_vvvvvvvvvvvvvvvvvvvvvvvv5 = _vvv5.CreateDefaultBoldFont((float) (15));
 //BA.debugLineNum = 53;BA.debugLine="TitleBarTextColor = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvv0 = _vvv5.Color_White;
 //BA.debugLineNum = 54;BA.debugLine="ButtonsState.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvv1.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv7(b4a.example3.customlistview _customlistview1,int _color) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Public Sub InternalAddStubToCLVIfNeeded(CustomList";
 //BA.debugLineNum = 347;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_vvvvv3._v5 /*String*/ (ba,_customlistview1,_color);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Public Sub InternalSetTextOrCSBuilderToLabel(xlbl";
 //BA.debugLineNum = 343;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
_vvvvv3._vv3 /*String*/ (ba,_xlbl,_text);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvv1(int _width,int _height) throws Exception{
int _top = 0;
 //BA.debugLineNum = 266;BA.debugLine="Public Sub Resize (Width As Int, Height As Int)";
 //BA.debugLineNum = 268;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - Ba";
_top = (int) (__c.Round(_vvvvvvvvvvvvvvvvvvvvvvv1.getHeight()/(double)2-_vvvvvvvvvvvvvvvvvvvvvv2.getHeight()/(double)2));
 //BA.debugLineNum = 269;BA.debugLine="If PutAtTop Then Top = 20dip";
if (_vvvvvvvvvvvvvvvvvvvvvvvv3) { 
_top = __c.DipToCurrent((int) (20));};
 //BA.debugLineNum = 270;BA.debugLine="Background.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
 //BA.debugLineNum = 271;BA.debugLine="Base.SetLayoutAnimated(200, Round(Background.Widt";
_vvvvvvvvvvvvvvvvvvvvvv2.SetLayoutAnimated((int) (200),(int) (__c.Round(_vvvvvvvvvvvvvvvvvvvvvvv1.getWidth()/(double)2-_vvvvvvvvvvvvvvvvvvvvvv2.getWidth()/(double)2)),_top,_vvvvvvvvvvvvvvvvvvvvvv2.getWidth(),_vvvvvvvvvvvvvvvvvvvvvv2.getHeight());
 //BA.debugLineNum = 272;BA.debugLine="If xui.IsB4J Then";
if (_vvv5.getIsB4J()) { 
 //BA.debugLineNum = 273;BA.debugLine="UpdateBlur";
_vvvvvvvvvvvvvvvvvvvvv6();
 };
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvv2(b4a.example.bitmapcreator _bc,int _x,int _y,b4a.example.bitmapcreator._argbcolor[] _clrs,b4a.example.bitmapcreator._argbcolor _temp) throws Exception{
b4a.example.bitmapcreator._argbcolor _c = null;
 //BA.debugLineNum = 328;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
 //BA.debugLineNum = 329;BA.debugLine="temp.Initialize";
_temp.Initialize();
 //BA.debugLineNum = 330;BA.debugLine="For Each c As ARGBColor In clrs";
{
final b4a.example.bitmapcreator._argbcolor[] group2 = _clrs;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = group2[index2];
 //BA.debugLineNum = 331;BA.debugLine="temp.r = temp.r + c.r";
_temp.r = (int) (_temp.r+_c.r);
 //BA.debugLineNum = 332;BA.debugLine="temp.g = temp.g + c.g";
_temp.g = (int) (_temp.g+_c.g);
 //BA.debugLineNum = 333;BA.debugLine="temp.b = temp.b + c.b";
_temp.b = (int) (_temp.b+_c.b);
 }
};
 //BA.debugLineNum = 335;BA.debugLine="temp.a = 255";
_temp.a = (int) (255);
 //BA.debugLineNum = 336;BA.debugLine="temp.r = temp.r / 3";
_temp.r = (int) (_temp.r/(double)3);
 //BA.debugLineNum = 337;BA.debugLine="temp.g = temp.g / 3";
_temp.g = (int) (_temp.g/(double)3);
 //BA.debugLineNum = 338;BA.debugLine="temp.b = temp.b / 3";
_temp.b = (int) (_temp.b/(double)3);
 //BA.debugLineNum = 339;BA.debugLine="bc.SetARGB(x, y, temp)";
_bc._setargb(_x,_y,_temp);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvv3(int _resultcode,boolean _enabled) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _b = null;
 //BA.debugLineNum = 226;BA.debugLine="Public Sub SetButtonState (ResultCode As Int, Enab";
 //BA.debugLineNum = 227;BA.debugLine="Dim b As B4XView = GetButton(ResultCode)";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b = _vvvvvvvvvvvvvvvvvvvv6(_resultcode);
 //BA.debugLineNum = 228;BA.debugLine="If b.IsInitialized Then";
if (_b.IsInitialized()) { 
 //BA.debugLineNum = 229;BA.debugLine="b.Enabled = Enabled";
_b.setEnabled(_enabled);
 //BA.debugLineNum = 230;BA.debugLine="If Enabled Then b.TextColor = ButtonsTextColor E";
if (_enabled) { 
_b.setTextColor(_vvvvvvvvvvvvvvvvvvvvvv0);}
else {
_b.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvv6);};
 //BA.debugLineNum = 231;BA.debugLine="ButtonsState.Put(ResultCode, Enabled)";
_vvvvvvvvvvvvvvvvvvvvvvvvv1.Put((Object)(_resultcode),(Object)(_enabled));
 };
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _show(Object _text,Object _yes,Object _no,Object _cancel) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_text,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xdialog parent,Object _text,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this._text = _text;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
}
b4a.example.b4xdialog parent;
Object _text;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 75;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 76;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = parent._vvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 77;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 100dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 78;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 79;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 83;BA.debugLine="lbl.SingleLine = False";
_lbl.setSingleLine(parent.__c.False);
 //BA.debugLineNum = 87;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="p.AddView(xlbl, 5dip, 0, p.Width - 10dip, p.Heigh";
_p.AddView((android.view.View)(_xlbl.getObject()),parent.__c.DipToCurrent((int) (5)),(int) (0),(int) (_p.getWidth()-parent.__c.DipToCurrent((int) (10))),_p.getHeight());
 //BA.debugLineNum = 89;BA.debugLine="xlbl.TextColor = BodyTextColor";
_xlbl.setTextColor(parent._vvvvvvvvvvvvvvvvvvvvvvvv1);
 //BA.debugLineNum = 90;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(parent._vvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 91;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Tex";
parent._vvvvv3._vv3 /*String*/ (ba,_xlbl,_text);
 //BA.debugLineNum = 92;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
_xlbl.SetTextAlignment("CENTER","LEFT");
 //BA.debugLineNum = 93;BA.debugLine="Wait For (ShowCustom(p, Yes, No, Cancel)) Complet";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvv4(_p,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 94;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvv4(anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) throws Exception{
ResumableSub_ShowCustom rsub = new ResumableSub_ShowCustom(this,_content,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowCustom extends BA.ResumableSub {
public ResumableSub_ShowCustom(b4a.example.b4xdialog parent,anywheresoftware.b4a.objects.B4XViewWrapper _content,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this._content = _content;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
}
b4a.example.b4xdialog parent;
anywheresoftware.b4a.objects.B4XViewWrapper _content;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
boolean _includetitle = false;
int _temptitlebarheight = 0;
int _height = 0;
int _width = 0;
int _top = 0;
boolean _removetitle = false;
int _i = 0;
int _btype = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
int _result = 0;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;
int step49;
int limit49;
anywheresoftware.b4a.BA.IterableList group77;
int index77;
int groupLen77;
anywheresoftware.b4a.BA.IterableList group81;
int index81;
int groupLen81;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 98;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
if (true) break;

case 1:
//for
this.state = 8;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group1 = parent._vvvvvvvvvvvvvvvvvvvvvvv5.GetAllViewsRecursive();
index1 = 0;
groupLen1 = group1.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 8;
if (index1 < groupLen1) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));}
if (true) break;

case 65:
//C
this.state = 64;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 99;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
if (true) break;

case 4:
//if
this.state = 7;
if (_v.getTag()!= null && (_v.getTag()).equals((Object)("b4xdialog_background"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 100;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
 //BA.debugLineNum = 101;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 65;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 104;BA.debugLine="ButtonsState.Clear";
parent._vvvvvvvvvvvvvvvvvvvvvvvvv1.Clear();
 //BA.debugLineNum = 105;BA.debugLine="Dim Background As B4XView = xui.CreatePanel(\"back";
parent._vvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._vvvvvvvvvvvvvvvvvvvvvvv1 = parent._vvv5.CreatePanel(ba,"background");
 //BA.debugLineNum = 106;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
parent._vvvvvvvvvvvvvvvvvvvvvvv1.setTag((Object)("b4xdialog_background"));
 //BA.debugLineNum = 107;BA.debugLine="If BlurBackground Then";
if (true) break;

case 9:
//if
this.state = 14;
if (parent._vvvvvvvvvvvvvvvvvvvvvvv3) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 108;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 109;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 110;BA.debugLine="BlurImageView = iv";
parent._vvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 111;BA.debugLine="Background.AddView(BlurImageView, 0, 0, Backgrou";
parent._vvvvvvvvvvvvvvvvvvvvvvv1.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvvv2.getObject()),(int) (0),(int) (0),parent._vvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),parent._vvvvvvvvvvvvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 112;BA.debugLine="Background.Color = xui.Color_Transparent";
parent._vvvvvvvvvvvvvvvvvvvvvvv1.setColor(parent._vvv5.Color_Transparent);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 114;BA.debugLine="Background.Color = OverlayColor";
parent._vvvvvvvvvvvvvvvvvvvvvvv1.setColor(parent._vvvvvvvvvvvvvvvvvvvvvv3);
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 117;BA.debugLine="Dim p As Panel = Background";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent._vvvvvvvvvvvvvvvvvvvvvvv1.getObject()));
 //BA.debugLineNum = 118;BA.debugLine="p.Elevation = 4dip";
_p.setElevation((float) (parent.__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 120;BA.debugLine="If mParent.Width = 0 Or mParent.Height = 0 Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent._vvvvvvvvvvvvvvvvvvvvvvv5.getWidth()==0 || parent._vvvvvvvvvvvvvvvvvvvvvvv5.getHeight()==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 121;BA.debugLine="Log(\"Warning: dialog shown with zero sized paren";
parent.__c.LogImpl("96684696","Warning: dialog shown with zero sized parent.",0);
 if (true) break;

case 18:
//C
this.state = 19;
;
 //BA.debugLineNum = 123;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
parent._vvvvvvvvvvvvvvvvvvvvvvv5.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),parent._vvvvvvvvvvvvvvvvvvvvvvv5.getWidth(),parent._vvvvvvvvvvvvvvvvvvvvvvv5.getHeight());
 //BA.debugLineNum = 124;BA.debugLine="UpdateBlur";
parent._vvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 125;BA.debugLine="Base = xui.CreatePanel(\"\")";
parent._vvvvvvvvvvvvvvvvvvvvvv2 = parent._vvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 126;BA.debugLine="Base.SetColorAndBorder(BackgroundColor, BorderWid";
parent._vvvvvvvvvvvvvvvvvvvvvv2.SetColorAndBorder(parent._vvvvvv6,parent._vvvvvvvvvvvvvvvvvvvvvv6,parent._vvvvvvvvvvvvvvvvvvvvvv4,parent._vvvvvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 127;BA.debugLine="Base.RequestFocus";
parent._vvvvvvvvvvvvvvvvvvvvvv2.RequestFocus();
 //BA.debugLineNum = 128;BA.debugLine="Dim IncludeTitle As Boolean = Title <> \"\"";
_includetitle = (parent._vvvvvvvvvvvvvvvvvvvvvvv6).equals((Object)("")) == false;
 //BA.debugLineNum = 129;BA.debugLine="Dim TempTitleBarHeight As Int = 0";
_temptitlebarheight = (int) (0);
 //BA.debugLineNum = 130;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_includetitle) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 131;BA.debugLine="TempTitleBarHeight = TitleBarHeight";
_temptitlebarheight = parent._vvvvvvvvvvvvvvvvvvvvv0;
 if (true) break;

case 22:
//C
this.state = 23;
;
 //BA.debugLineNum = 133;BA.debugLine="Dim height As Int = Content.Height + ButtonsHeigh";
_height = (int) (_content.getHeight()+parent._vvvvvvvvvvvvvvvvvvvvv7+parent.__c.DipToCurrent((int) (3))+parent.__c.DipToCurrent((int) (3))+_temptitlebarheight);
 //BA.debugLineNum = 134;BA.debugLine="Dim width As Int = Content.Width + 4dip";
_width = (int) (_content.getWidth()+parent.__c.DipToCurrent((int) (4)));
 //BA.debugLineNum = 135;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - he";
_top = (int) (parent.__c.Round(parent._vvvvvvvvvvvvvvvvvvvvvvv1.getHeight()/(double)2-_height/(double)2));
 //BA.debugLineNum = 136;BA.debugLine="Dim RemoveTitle As Boolean";
_removetitle = false;
 //BA.debugLineNum = 137;BA.debugLine="If PutAtTop Then";
if (true) break;

case 23:
//if
this.state = 32;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvv3) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 138;BA.debugLine="Top = 20dip";
_top = parent.__c.DipToCurrent((int) (20));
 //BA.debugLineNum = 139;BA.debugLine="If Background.Height - Top - height < 200dip The";
if (true) break;

case 26:
//if
this.state = 31;
if (parent._vvvvvvvvvvvvvvvvvvvvvvv1.getHeight()-_top-_height<parent.__c.DipToCurrent((int) (200))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
_removetitle = parent.__c.True;
if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;
;
 //BA.debugLineNum = 141;BA.debugLine="If RemoveTitle Or Background.Height < height Then";

case 32:
//if
this.state = 35;
if (_removetitle || parent._vvvvvvvvvvvvvvvvvvvvvvv1.getHeight()<_height) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 142;BA.debugLine="Top = 1dip";
_top = parent.__c.DipToCurrent((int) (1));
 //BA.debugLineNum = 143;BA.debugLine="IncludeTitle = False";
_includetitle = parent.__c.False;
 //BA.debugLineNum = 144;BA.debugLine="height = height - TempTitleBarHeight - 3dip";
_height = (int) (_height-_temptitlebarheight-parent.__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 145;BA.debugLine="TempTitleBarHeight = 0";
_temptitlebarheight = (int) (0);
 if (true) break;

case 35:
//C
this.state = 36;
;
 //BA.debugLineNum = 147;BA.debugLine="Background.AddView(Base, Round(Background.Width /";
parent._vvvvvvvvvvvvvvvvvvvvvvv1.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvv2.getObject()),(int) (parent.__c.Round(parent._vvvvvvvvvvvvvvvvvvvvvvv1.getWidth()/(double)2-_width/(double)2)),_top,(int) (parent.__c.Round(_width)),(int) (parent.__c.Round(_height)));
 //BA.debugLineNum = 149;BA.debugLine="For i = ButtonsOrder.Length - 1 To 0 Step - 1";
if (true) break;

case 36:
//for
this.state = 47;
step49 = -1;
limit49 = (int) (0);
_i = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvv0.length-1) ;
this.state = 66;
if (true) break;

case 66:
//C
this.state = 47;
if ((step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49)) this.state = 38;
if (true) break;

case 67:
//C
this.state = 66;
_i = ((int)(0 + _i + step49)) ;
if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 150;BA.debugLine="Dim btype As Int = ButtonsOrder(i)";
_btype = parent._vvvvvvvvvvvvvvvvvvvvvvvv0[_i];
 //BA.debugLineNum = 151;BA.debugLine="Select btype";
if (true) break;

case 39:
//select
this.state = 46;
switch (BA.switchObjectToInt(_btype,parent._vvv5.DialogResponse_Cancel,parent._vvv5.DialogResponse_Negative,parent._vvv5.DialogResponse_Positive)) {
case 0: {
this.state = 41;
if (true) break;
}
case 1: {
this.state = 43;
if (true) break;
}
case 2: {
this.state = 45;
if (true) break;
}
}
if (true) break;

case 41:
//C
this.state = 46;
 //BA.debugLineNum = 153;BA.debugLine="CreateButton(Cancel, btype)";
parent._vvvvvvvvvvvvvvvvvvvv5(_cancel,_btype);
 if (true) break;

case 43:
//C
this.state = 46;
 //BA.debugLineNum = 155;BA.debugLine="CreateButton(No, btype)";
parent._vvvvvvvvvvvvvvvvvvvv5(_no,_btype);
 if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 157;BA.debugLine="CreateButton(Yes, btype)";
parent._vvvvvvvvvvvvvvvvvvvv5(_yes,_btype);
 if (true) break;

case 46:
//C
this.state = 67;
;
 if (true) break;
if (true) break;

case 47:
//C
this.state = 48;
;
 //BA.debugLineNum = 160;BA.debugLine="Base.Visible = False";
parent._vvvvvvvvvvvvvvvvvvvvvv2.setVisible(parent.__c.False);
 //BA.debugLineNum = 161;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 48:
//if
this.state = 51;
if (_includetitle) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 162;BA.debugLine="TitleBar = xui.CreatePanel(\"TitleBar\")";
parent._vvvvvvvvvvvvvvvvvvvvvvvv2 = parent._vvv5.CreatePanel(ba,"TitleBar");
 //BA.debugLineNum = 163;BA.debugLine="TitleBar.Color = TitleBarColor";
parent._vvvvvvvvvvvvvvvvvvvvvvvv2.setColor(parent._vvvvvvvvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 164;BA.debugLine="Base.AddView(TitleBar, 2dip, 2dip, Content.Width";
parent._vvvvvvvvvvvvvvvvvvvvvv2.AddView((android.view.View)(parent._vvvvvvvvvvvvvvvvvvvvvvvv2.getObject()),parent.__c.DipToCurrent((int) (2)),parent.__c.DipToCurrent((int) (2)),_content.getWidth(),_temptitlebarheight);
 //BA.debugLineNum = 165;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 166;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 167;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 168;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(xlbl, Ti";
parent._vvvvv3._vv3 /*String*/ (ba,_xlbl,parent._vvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 169;BA.debugLine="xlbl.TextColor = TitleBarTextColor";
_xlbl.setTextColor(parent._vvvvvvvvvvvvvvvvvvvvvvv0);
 //BA.debugLineNum = 170;BA.debugLine="xlbl.Font = TitleBarFont";
_xlbl.setFont(parent._vvvvvvvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 171;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 172;BA.debugLine="TitleBar.AddView(xlbl, 0, 0, TitleBar.Width, Tit";
parent._vvvvvvvvvvvvvvvvvvvvvvvv2.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),parent._vvvvvvvvvvvvvvvvvvvvvvvv2.getWidth(),parent._vvvvvvvvvvvvvvvvvvvvvvvv2.getHeight());
 if (true) break;

case 51:
//C
this.state = 52;
;
 //BA.debugLineNum = 174;BA.debugLine="Content.RemoveViewFromParent";
_content.RemoveViewFromParent();
 //BA.debugLineNum = 175;BA.debugLine="Base.AddView(Content, 2dip, 2dip + TempTitleBarHe";
parent._vvvvvvvvvvvvvvvvvvvvvv2.AddView((android.view.View)(_content.getObject()),parent.__c.DipToCurrent((int) (2)),(int) (parent.__c.DipToCurrent((int) (2))+_temptitlebarheight),_content.getWidth(),_content.getHeight());
 //BA.debugLineNum = 176;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
parent._vvvvvvvvvvvvvvvvvvvvvv2.SetVisibleAnimated(parent._vvvvvvvvvvvvvvvvvvvvvvvv7,parent.__c.True);
 //BA.debugLineNum = 177;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 52:
//for
this.state = 55;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group77 = parent._vvvvvvvvvvvvvvvvvvvvvvv1.GetAllViewsRecursive();
index77 = 0;
groupLen77 = group77.getSize();
this.state = 68;
if (true) break;

case 68:
//C
this.state = 55;
if (index77 < groupLen77) {
this.state = 54;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group77.Get(index77)));}
if (true) break;

case 69:
//C
this.state = 68;
index77++;
if (true) break;

case 54:
//C
this.state = 69;
 //BA.debugLineNum = 178;BA.debugLine="v.Enabled = True";
_v.setEnabled(parent.__c.True);
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
 //BA.debugLineNum = 180;BA.debugLine="Wait For CloseMessage (Result As Int)";
parent.__c.WaitFor("closemessage", ba, this, null);
this.state = 70;
return;
case 70:
//C
this.state = 56;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 181;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 56:
//for
this.state = 59;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group81 = parent._vvvvvvvvvvvvvvvvvvvvvvv1.GetAllViewsRecursive();
index81 = 0;
groupLen81 = group81.getSize();
this.state = 71;
if (true) break;

case 71:
//C
this.state = 59;
if (index81 < groupLen81) {
this.state = 58;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group81.Get(index81)));}
if (true) break;

case 72:
//C
this.state = 71;
index81++;
if (true) break;

case 58:
//C
this.state = 72;
 //BA.debugLineNum = 182;BA.debugLine="v.Enabled = False";
_v.setEnabled(parent.__c.False);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
;
 //BA.debugLineNum = 184;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
parent._vvvvvvvvvvvvvvvvvvvvvv2.SetVisibleAnimated(parent._vvvvvvvvvvvvvvvvvvvvvvvv7,parent.__c.False);
 //BA.debugLineNum = 185;BA.debugLine="If VisibleAnimationDuration > 0 Then";
if (true) break;

case 60:
//if
this.state = 63;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvv7>0) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 //BA.debugLineNum = 186;BA.debugLine="Sleep(VisibleAnimationDuration)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvvv7);
this.state = 73;
return;
case 73:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
 //BA.debugLineNum = 188;BA.debugLine="Background.RemoveViewFromParent";
parent._vvvvvvvvvvvvvvvvvvvvvvv1.RemoveViewFromParent();
 //BA.debugLineNum = 189;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _closemessage(int _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _vvvvvvvvvvvvvvvvvvvvv5(Object _dialogtemplate,Object _yes,Object _no,Object _cancel) throws Exception{
ResumableSub_ShowTemplate rsub = new ResumableSub_ShowTemplate(this,_dialogtemplate,_yes,_no,_cancel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ShowTemplate extends BA.ResumableSub {
public ResumableSub_ShowTemplate(b4a.example.b4xdialog parent,Object _dialogtemplate,Object _yes,Object _no,Object _cancel) {
this.parent = parent;
this._dialogtemplate = _dialogtemplate;
this._yes = _yes;
this._no = _no;
this._cancel = _cancel;
}
b4a.example.b4xdialog parent;
Object _dialogtemplate;
Object _yes;
Object _no;
Object _cancel;
anywheresoftware.b4a.objects.B4XViewWrapper _content = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 66;BA.debugLine="Dim content As B4XView = CallSub2(DialogTemplate,";
_content = new anywheresoftware.b4a.objects.B4XViewWrapper();
_content = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.CallSubNew2(ba,_dialogtemplate,"GetPanel",parent)));
 //BA.debugLineNum = 67;BA.debugLine="CallSub2(DialogTemplate, \"Show\", Me)";
parent.__c.CallSubNew2(ba,_dialogtemplate,"Show",parent);
 //BA.debugLineNum = 68;BA.debugLine="Wait For (ShowCustom(content , Yes, No, Cancel))";
parent.__c.WaitFor("complete", ba, this, parent._vvvvvvvvvvvvvvvvvvvvv4(_content,_yes,_no,_cancel));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 69;BA.debugLine="CallSub2(DialogTemplate, \"DialogClosed\", Result)";
parent.__c.CallSubNew2(ba,_dialogtemplate,"DialogClosed",(Object)(_result));
 //BA.debugLineNum = 70;BA.debugLine="PutAtTop = False";
parent._vvvvvvvvvvvvvvvvvvvvvvvv3 = parent.__c.False;
 //BA.debugLineNum = 71;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _stub_click() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Private Sub Stub_Click";
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvv6() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _source = null;
b4a.example.bitmapcreator _blurred = null;
 //BA.debugLineNum = 277;BA.debugLine="Private Sub UpdateBlur";
 //BA.debugLineNum = 278;BA.debugLine="If BlurBackground = False Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvv3==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 279;BA.debugLine="Background.Visible = False";
_vvvvvvvvvvvvvvvvvvvvvvv1.setVisible(__c.False);
 //BA.debugLineNum = 280;BA.debugLine="Dim source As B4XBitmap = Background.Parent.Snaps";
_source = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_source = _vvvvvvvvvvvvvvvvvvvvvvv1.getParent().Snapshot();
 //BA.debugLineNum = 281;BA.debugLine="If source.Width > Background.Width Or source.Heig";
if (_source.getWidth()>_vvvvvvvvvvvvvvvvvvvvvvv1.getWidth() || _source.getHeight()>_vvvvvvvvvvvvvvvvvvvvvvv1.getHeight()) { 
 //BA.debugLineNum = 282;BA.debugLine="source = source.Crop(0, 0, Background.Width, Bac";
_source = _source.Crop((int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvv1.getHeight());
 };
 //BA.debugLineNum = 284;BA.debugLine="Background.Visible = True";
_vvvvvvvvvvvvvvvvvvvvvvv1.setVisible(__c.True);
 //BA.debugLineNum = 285;BA.debugLine="BlurImageView.SetLayoutAnimated(0, 0, 0, Backgrou";
_vvvvvvvvvvvvvvvvvvvvvvv2.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvv1.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvv1.getHeight());
 //BA.debugLineNum = 286;BA.debugLine="Dim blurred As BitmapCreator = Blur(source)";
_blurred = _vvvvvvvvvvvvvvvvvvvv3(_source);
 //BA.debugLineNum = 287;BA.debugLine="blurred.SetBitmapToImageView(blurred.Bitmap, Blur";
_blurred._setbitmaptoimageview(_blurred._getbitmap(),_vvvvvvvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
