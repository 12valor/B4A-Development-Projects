package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class roundslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.roundslider");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.roundslider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvv0 = null;
public int _vvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public Object _vvvv7 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 90;BA.debugLine="cvs.Resize(Width, Height)";
_vvvvvvvv0.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 91;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 92;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.IsInitialized()==__c.False) { 
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();};
 //BA.debugLineNum = 93;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.Initialize((float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5),(float) (_height-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 94;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.SetLayoutAnimated((int) (0),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getLeft()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getTop()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth()),(int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getHeight()));
 //BA.debugLineNum = 95;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 11;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 12;BA.debugLine="Private mValue As Int = 75";
_vvvv1 = (int) (75);
 //BA.debugLineNum = 13;BA.debugLine="Private mMin, mMax As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 14;BA.debugLine="Private thumb As B4XBitmap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private pnl As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private xlbl As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private CircleRect As B4XRect";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 18;BA.debugLine="Private ValueColor As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private stroke As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private ThumbSize As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Private mThumbBorderColor As Int = 0xFF5B5B5B";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = ((int)0xff5b5b5b);
 //BA.debugLineNum = 23;BA.debugLine="Private mThumbInnerColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _vvv5.Color_White;
 //BA.debugLineNum = 24;BA.debugLine="Private mCircleFillColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _vvv5.Color_White;
 //BA.debugLineNum = 25;BA.debugLine="Private mCircleNonValueColor As Int = 0xFFB6B6B6";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = ((int)0xffb6b6b6);
 //BA.debugLineNum = 26;BA.debugLine="Private mRollOver As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
b4a.example.bcpath _p = null;
int _r = 0;
int _g = 0;
int _l = 0;
b4a.example.bitmapcreator _bc = null;
 //BA.debugLineNum = 70;BA.debugLine="Private Sub CreateThumb";
 //BA.debugLineNum = 71;BA.debugLine="Dim p As BCPath";
_p = new b4a.example.bcpath();
 //BA.debugLineNum = 72;BA.debugLine="Dim r As Int = 80dip";
_r = __c.DipToCurrent((int) (80));
 //BA.debugLineNum = 73;BA.debugLine="Dim g As Int = 8dip";
_g = __c.DipToCurrent((int) (8));
 //BA.debugLineNum = 74;BA.debugLine="Dim l As Int = 28dip";
_l = __c.DipToCurrent((int) (28));
 //BA.debugLineNum = 75;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 76;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
_bc._initialize(ba,(int) (2*_r+_g+__c.DipToCurrent((int) (3))),(int) (2*_r+_l+_g));
 //BA.debugLineNum = 77;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
_p._initialize(ba,(float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
 //BA.debugLineNum = 78;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r+_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
 //BA.debugLineNum = 79;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
_p._lineto((float) (_r+_g),(float) (2*_r+_l+_g));
 //BA.debugLineNum = 80;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
_p._lineto((float) (_r-_l+_g),(float) (2*_r-__c.DipToCurrent((int) (2))+_g));
 //BA.debugLineNum = 81;BA.debugLine="bc.DrawPath(p, mThumbBorderColor, True, 0)";
_bc._drawpath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.True,(int) (0));
 //BA.debugLineNum = 82;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbInnerColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,__c.True,(int) (0));
 //BA.debugLineNum = 83;BA.debugLine="bc.DrawCircle(r + g, r + g, r, mThumbBorderColor,";
_bc._drawcircle((float) (_r+_g),(float) (_r+_g),(float) (_r),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.False,__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 84;BA.debugLine="thumb = bc.Bitmap";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _bc._getbitmap();
 //BA.debugLineNum = 85;BA.debugLine="ThumbSize = thumb.Height / 4";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getHeight()/(double)4);
 //BA.debugLineNum = 86;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 38;BA.debugLine="cvs.Initialize(mBase)";
_vvvvvvvv0.Initialize(_vvv4);
 //BA.debugLineNum = 39;BA.debugLine="mMin = Props.Get(\"Min\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
 //BA.debugLineNum = 40;BA.debugLine="mMax = Props.Get(\"Max\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
 //BA.debugLineNum = 41;BA.debugLine="mValue = mMin";
_vvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
 //BA.debugLineNum = 42;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = _vvv5.CreatePanel(ba,"pnl");
 //BA.debugLineNum = 43;BA.debugLine="xlbl = Lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="xlbl.Visible = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setVisible(__c.True);
 //BA.debugLineNum = 45;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 46;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 47;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = _vvv5.PaintOrColorToColor(_props.Get((Object)("ValueColor")));
 //BA.debugLineNum = 48;BA.debugLine="mRollOver = Props.GetDefault(\"RollOver\", False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = BA.ObjectToBoolean(_props.GetDefault((Object)("RollOver"),(Object)(__c.False)));
 //BA.debugLineNum = 49;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if (_vvv5.getIsB4A() || _vvv5.getIsB4i()) { 
 //BA.debugLineNum = 50;BA.debugLine="stroke = 8dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (8));
 }else if(_vvv5.getIsB4J()) { 
 //BA.debugLineNum = 52;BA.debugLine="stroke = 6dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = __c.DipToCurrent((int) (6));
 };
 //BA.debugLineNum = 54;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvv2() throws Exception{
int _radius = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _b4jstrokeoffset = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _dest = null;
int _r = 0;
int _cx = 0;
int _cy = 0;
 //BA.debugLineNum = 98;BA.debugLine="Public Sub Draw";
 //BA.debugLineNum = 99;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvv0.ClearRect(_vvvvvvvv0.getTargetRect());
 //BA.debugLineNum = 100;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth()/(double)2);
 //BA.debugLineNum = 101;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
_vvvvvvvv0.DrawCircle(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterY(),(float) (_radius),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2,__c.False,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 //BA.debugLineNum = 102;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 103;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((_vvvv1-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)/(double)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)*360);
 //BA.debugLineNum = 104;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
 //BA.debugLineNum = 105;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if (_vvv5.getIsB4J()) { 
_b4jstrokeoffset = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5/(double)2);};
 //BA.debugLineNum = 106;BA.debugLine="If mValue = mMax Then";
if (_vvvv1==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 107;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Ce";
_vvvvvvvv0.DrawCircle(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterY(),(float) (_radius),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.False,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 }else {
 //BA.debugLineNum = 109;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.C";
_p.InitializeArc(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterY(),(float) (_radius+_b4jstrokeoffset),(float) (-90),(float) (_angle));
 //BA.debugLineNum = 110;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
_vvvvvvvv0.DrawPath(_p,_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4,__c.False,(float) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5));
 };
 //BA.debugLineNum = 112;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
_vvvvvvvv0.DrawCircle(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterX(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterY(),(float) (_radius-_b4jstrokeoffset),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1,__c.True,(float) (0));
 //BA.debugLineNum = 113;BA.debugLine="Dim dest As B4XRect";
_dest = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 114;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6/(double)2+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5/(double)2);
 //BA.debugLineNum = 115;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterX()+_r*__c.CosD(_angle-90));
 //BA.debugLineNum = 116;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterY()+_r*__c.SinD(_angle-90));
 //BA.debugLineNum = 117;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
_dest.Initialize((float) (_cx-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()/(double)8),(float) (_cy-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6/(double)2),(float) (_cx+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getWidth()/(double)8),(float) (_cy+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6/(double)2));
 //BA.debugLineNum = 118;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
_vvvvvvvv0.DrawBitmapRotated((android.graphics.Bitmap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),_dest,(float) (_angle));
 //BA.debugLineNum = 119;BA.debugLine="cvs.Invalidate";
_vvvvvvvv0.Invalidate();
 //BA.debugLineNum = 120;BA.debugLine="xlbl.Text = mValue";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2.setText(BA.ObjectToCharSequence(_vvvv1));
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public int  _getvvv1() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub getValue As Int";
 //BA.debugLineNum = 183;BA.debugLine="Return mValue";
if (true) return _vvvv1;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
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
public String  _pnl_touch(int _action,float _x,float _y) throws Exception{
int _dx = 0;
int _dy = 0;
float _dist = 0f;
int _angle = 0;
int _newvalue = 0;
 //BA.debugLineNum = 123;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
 //BA.debugLineNum = 124;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
 //BA.debugLineNum = 125;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterX());
 //BA.debugLineNum = 126;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getCenterY());
 //BA.debugLineNum = 127;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (__c.Sqrt(__c.Power(_dx,2)+__c.Power(_dy,2)));
 //BA.debugLineNum = 128;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3.getWidth()/(double)2) { 
 //BA.debugLineNum = 129;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (__c.Round(__c.ATan2D(_dy,_dx)));
 //BA.debugLineNum = 130;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
 //BA.debugLineNum = 131;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
 //BA.debugLineNum = 132;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7+_angle/(double)360*(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7));
 //BA.debugLineNum = 133;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_newvalue)));
 //BA.debugLineNum = 134;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=_vvvv1) { 
 //BA.debugLineNum = 135;BA.debugLine="If mRollOver = False Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3==__c.False) { 
 //BA.debugLineNum = 136;BA.debugLine="If Abs(NewValue - mValue) > (mMax - mMin) / 2";
if (__c.Abs(_newvalue-_vvvv1)>(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)/(double)2) { 
 //BA.debugLineNum = 137;BA.debugLine="If mValue >= (mMax + mMin) / 2 Then";
if (_vvvv1>=(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7)/(double)2) { 
 //BA.debugLineNum = 138;BA.debugLine="mValue = mMax";
_vvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0;
 }else {
 //BA.debugLineNum = 140;BA.debugLine="mValue = mMin";
_vvvv1 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7;
 };
 }else {
 //BA.debugLineNum = 143;BA.debugLine="mValue = NewValue";
_vvvv1 = _newvalue;
 };
 }else {
 //BA.debugLineNum = 146;BA.debugLine="mValue = NewValue";
_vvvv1 = _newvalue;
 };
 //BA.debugLineNum = 148;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Valu";
if (_vvv5.SubExists(ba,_vvv3,_vvv2+"_ValueChanged",(int) (1))) { 
 //BA.debugLineNum = 149;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChange";
__c.CallSubNew2(ba,_vvv3,_vvv2+"_ValueChanged",(Object)(_vvvv1));
 };
 };
 //BA.debugLineNum = 152;BA.debugLine="Draw";
_vvvvvvvv2();
 };
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(int _nonvaluecolor,int _innercolor) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub SetCircleColor (NonValueColor As Int, I";
 //BA.debugLineNum = 65;BA.debugLine="mCircleNonValueColor = NonValueColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _nonvaluecolor;
 //BA.debugLineNum = 66;BA.debugLine="mCircleFillColor = InnerColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _innercolor;
 //BA.debugLineNum = 67;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(int _newmin,int _newmax) throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Public Sub SetRange(NewMin As Int, NewMax As Int)";
 //BA.debugLineNum = 177;BA.debugLine="mMin = NewMin";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _newmin;
 //BA.debugLineNum = 178;BA.debugLine="mMax = NewMax";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _newmax;
 //BA.debugLineNum = 179;BA.debugLine="setValue(mValue)";
_setvvv1(_vvvv1);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(int _bordercolor,int _innercolor) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub SetThumbColor(BorderColor As Int, Inner";
 //BA.debugLineNum = 58;BA.debugLine="mThumbBorderColor = BorderColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _bordercolor;
 //BA.debugLineNum = 59;BA.debugLine="mThumbInnerColor = InnerColor";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _innercolor;
 //BA.debugLineNum = 60;BA.debugLine="CreateThumb";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 61;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _setvvv1(int _v) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Public Sub setValue (v As Int)";
 //BA.debugLineNum = 171;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
_vvvv1 = (int) (__c.Max(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7,__c.Min(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0,_v)));
 //BA.debugLineNum = 172;BA.debugLine="Draw";
_vvvvvvvv2();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
