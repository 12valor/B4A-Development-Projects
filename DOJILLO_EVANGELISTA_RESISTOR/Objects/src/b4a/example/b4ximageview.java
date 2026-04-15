package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4ximageview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4ximageview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public Object _vvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 41;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 7;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Public mBase As B4XView";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private iv As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private mResizeMode As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 13;BA.debugLine="Private mRound As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 14;BA.debugLine="Private mBitmap As B4XBitmap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Public mBackgroundColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 16;BA.debugLine="Private mCornersRadius As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 120;BA.debugLine="mBitmap = Null";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 121;BA.debugLine="iv.SetBitmap(Null)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetBitmap((android.graphics.Bitmap)(__c.Null));
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
 //BA.debugLineNum = 25;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 26;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 27;BA.debugLine="Tag = mBase.Tag";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 28;BA.debugLine="mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 29;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
 //BA.debugLineNum = 31;BA.debugLine="iv = iiv";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
 //BA.debugLineNum = 32;BA.debugLine="mRound =Props.Get(\"Round\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = BA.ObjectToBoolean(_props.Get((Object)("Round")));
 //BA.debugLineNum = 33;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
 //BA.debugLineNum = 34;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvv5.PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
 //BA.debugLineNum = 35;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
 //BA.debugLineNum = 36;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 37;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub getBitmap As B4XBitmap";
 //BA.debugLineNum = 131;BA.debugLine="Return mBitmap";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public int  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub getCornersRadius As Int";
 //BA.debugLineNum = 57;BA.debugLine="Return mCornersRadius";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return 0;
}
public String  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub getResizeMode As String";
 //BA.debugLineNum = 68;BA.debugLine="Return mResizeMode";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public boolean  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub getRoundedImage As Boolean";
 //BA.debugLineNum = 46;BA.debugLine="Return mRound";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return false;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
_vvv2 = _eventname;
 //BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
_vvv3 = _callback;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
 //BA.debugLineNum = 112;BA.debugLine="setBitmap(LoadBitmapSample(Dir, FileName, mBase.W";
_setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_dir,_filename,_vvv4.getWidth(),_vvv4.getHeight()).getObject())));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
 //BA.debugLineNum = 125;BA.debugLine="mBitmap = Bmp";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _bmp;
 //BA.debugLineNum = 126;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_vvvvv3._vv2 /*String*/ (ba,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,_bmp);
 //BA.debugLineNum = 127;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(int _i) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub setCornersRadius (i As Int)";
 //BA.debugLineNum = 61;BA.debugLine="mCornersRadius = i";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _i;
 //BA.debugLineNum = 62;BA.debugLine="UpdateClip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(String _s) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Public Sub setResizeMode(s As String)";
 //BA.debugLineNum = 72;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)) { 
if (true) return "";};
 //BA.debugLineNum = 73;BA.debugLine="mResizeMode = s";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _s;
 //BA.debugLineNum = 74;BA.debugLine="Update";
_vvvvvvvvvvv7();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(boolean _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
 //BA.debugLineNum = 50;BA.debugLine="If b = mRound Then Return";
if (_b==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
if (true) return "";};
 //BA.debugLineNum = 51;BA.debugLine="mRound = b";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _b;
 //BA.debugLineNum = 52;BA.debugLine="UpdateClip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvv7() throws Exception{
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
 //BA.debugLineNum = 77;BA.debugLine="Public Sub Update";
 //BA.debugLineNum = 78;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 79;BA.debugLine="UpdateClip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4();
 //BA.debugLineNum = 80;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
 //BA.debugLineNum = 81;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight());
 //BA.debugLineNum = 82;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
 //BA.debugLineNum = 84;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (_vvv4.getWidth());
 //BA.debugLineNum = 85;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (_vvv4.getHeight());
 break; }
case 1: {
 //BA.debugLineNum = 87;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(_vvv4.getWidth()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth(),_vvv4.getHeight()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight()));
 //BA.debugLineNum = 88;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth()*_r);
 //BA.debugLineNum = 89;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight()*_r);
 break; }
case 2: {
 //BA.debugLineNum = 91;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (_vvv4.getWidth());
 //BA.debugLineNum = 92;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
 //BA.debugLineNum = 94;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (_vvv4.getHeight());
 //BA.debugLineNum = 95;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
 //BA.debugLineNum = 97;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(_vvv4.getWidth()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth(),_vvv4.getHeight()/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight()));
 //BA.debugLineNum = 98;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth()*_r);
 //BA.debugLineNum = 99;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight()*_r);
 break; }
case 5: {
 //BA.debugLineNum = 101;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getWidth());
 //BA.debugLineNum = 102;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4.getHeight());
 break; }
default: {
 //BA.debugLineNum = 104;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("910354715","Invalid resize mode: "+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,0);
 break; }
}
;
 //BA.debugLineNum = 106;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),(int) (__c.Round(_vvv4.getWidth()/(double)2-_imageviewwidth/(double)2)),(int) (__c.Round(_vvv4.getHeight()/(double)2-_imageviewheight/(double)2)),(int) (__c.Round(_imageviewwidth)),(int) (__c.Round(_imageviewheight)));
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 135;BA.debugLine="Private Sub UpdateClip";
 //BA.debugLineNum = 136;BA.debugLine="If mRound Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 137;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
_vvv4.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(int) (0),(int) (0),(int) (__c.Min(_vvv4.getWidth()/(double)2,_vvv4.getHeight()/(double)2)));
 }else {
 //BA.debugLineNum = 139;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
_vvv4.SetColorAndBorder(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 };
 //BA.debugLineNum = 161;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_vvv4.getObject()));
 //BA.debugLineNum = 162;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(mRound Or";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6>0)});
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
