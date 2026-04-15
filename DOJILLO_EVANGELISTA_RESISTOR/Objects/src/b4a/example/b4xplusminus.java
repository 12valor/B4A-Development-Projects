package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xplusminus extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xplusminus");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xplusminus.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public Object _vvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public String _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = null;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
public double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
public double _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = 0;
public b4a.example.b4xformatter _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = null;
public boolean _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
public int _vvvvvvvvvvvvvvv2 = 0;
public boolean _vvvvvvvvvv1 = false;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 84;BA.debugLine="If Formation = \"Horizontal\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).equals("Horizontal")) { 
 //BA.debugLineNum = 85;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, 0, ArrowsSize,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,(int) (_height));
 //BA.debugLineNum = 86;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width - ArrowsSize,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (_width-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6,(int) (_height));
 //BA.debugLineNum = 87;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }else if((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).equals("Vertical")) { 
 //BA.debugLineNum = 89;BA.debugLine="pnlPlus.SetLayoutAnimated(0, 0, 0, Width, Arrows";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 90;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),(int) (0),(int) (_height-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),(int) (_width),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 91;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }else {
 //BA.debugLineNum = 93;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.SetLayoutAnimated((int) (0),(int) (0),(int) (_height-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6),(int) (_width/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
 //BA.debugLineNum = 94;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width / 2, pnlMinus";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (_width/(double)2),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getTop(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getHeight());
 //BA.debugLineNum = 95;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6+__c.DipToCurrent((int) (5))));
 };
 //BA.debugLineNum = 97;BA.debugLine="lblMinus.SetLayoutAnimated(0, 0, 0, pnlMinus.Widt";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getHeight());
 //BA.debugLineNum = 98;BA.debugLine="lblPlus.SetLayoutAnimated(0, 0, 0, pnlPlus.Width,";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getWidth(),_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getHeight());
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 11;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 12;BA.debugLine="Public pnlPlus, pnlMinus As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public lblPlus, lblMinus As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public Formation As String";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "";
 //BA.debugLineNum = 15;BA.debugLine="Public mCyclic As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = false;
 //BA.debugLineNum = 16;BA.debugLine="Public mRapid As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = false;
 //BA.debugLineNum = 17;BA.debugLine="Public MainLabel As B4XView";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public ArrowsSize As Int = 30dip";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = __c.DipToCurrent((int) (30));
 //BA.debugLineNum = 19;BA.debugLine="Private mStringItems As List";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Private mStartRange, mInterval, mEndRange As Doub";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = 0;
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private mSelectedIndex As Int = -1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (-1);
 //BA.debugLineNum = 22;BA.debugLine="Private LoopIndex As Int";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public RapidPeriod1 As Int = 1000";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (int) (1000);
 //BA.debugLineNum = 24;BA.debugLine="Public RapidPeriod2 As Int = 30";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = (int) (30);
 //BA.debugLineNum = 25;BA.debugLine="Public Formatter As B4XFormatter";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = new b4a.example.b4xformatter();
 //BA.debugLineNum = 26;BA.debugLine="Private StringMode As Boolean";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = false;
 //BA.debugLineNum = 27;BA.debugLine="Private Size As Int";
_vvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 28;BA.debugLine="Public mHaptic As Boolean";
_vvvvvvvvvv1 = false;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _v7(String _text) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 247;BA.debugLine="Private Sub CreateLabel (text As String) As B4XVie";
 //BA.debugLineNum = 248;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 249;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 250;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 251;BA.debugLine="xlbl.Font = xui.CreateMaterialIcons(30)";
_xlbl.setFont(_vvv5.CreateMaterialIcons((float) (30)));
 //BA.debugLineNum = 252;BA.debugLine="xlbl.Text = text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 253;BA.debugLine="xlbl.TextColor = MainLabel.TextColor";
_xlbl.setTextColor(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTextColor());
 //BA.debugLineNum = 254;BA.debugLine="Return xlbl";
if (true) return _xlbl;
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub Decrement";
 //BA.debugLineNum = 183;BA.debugLine="If mSelectedIndex <= 0 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3<=0) { 
 //BA.debugLineNum = 184;BA.debugLine="If mCyclic Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 185;BA.debugLine="mSelectedIndex = Size";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _vvvvvvvvvvvvvvv2;
 }else {
 //BA.debugLineNum = 187;BA.debugLine="mSelectedIndex = 0";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (0);
 //BA.debugLineNum = 188;BA.debugLine="LoopIndex = LoopIndex + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+1);
 //BA.debugLineNum = 189;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 192;BA.debugLine="SetIndex(mSelectedIndex - 1, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3-1),__c.True);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 40;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 40;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 41;BA.debugLine="MainLabel = lbl";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 43;BA.debugLine="Dim pnl As B4XView = Props.Get(\"page\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_props.Get((Object)("page"))));
 //BA.debugLineNum = 53;BA.debugLine="pnlPlus = xui.CreatePanel(\"pnlArrow\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 = _vvv5.CreatePanel(ba,"pnlArrow");
 //BA.debugLineNum = 54;BA.debugLine="pnlMinus = xui.CreatePanel(\"pnlArrow\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _vvv5.CreatePanel(ba,"pnlArrow");
 //BA.debugLineNum = 56;BA.debugLine="pnlPlus.Tag = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.setTag((Object)(__c.True));
 //BA.debugLineNum = 57;BA.debugLine="pnlMinus.Tag = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.setTag((Object)(__c.False));
 //BA.debugLineNum = 58;BA.debugLine="Formation = Props.Get(\"Orientation\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = BA.ObjectToString(_props.Get((Object)("Orientation")));
 //BA.debugLineNum = 59;BA.debugLine="mCyclic = Props.Get(\"Cyclic\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = BA.ObjectToBoolean(_props.Get((Object)("Cyclic")));
 //BA.debugLineNum = 60;BA.debugLine="mRapid = Props.Get(\"Rapid\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = BA.ObjectToBoolean(_props.Get((Object)("Rapid")));
 //BA.debugLineNum = 61;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
_vvvvvvvvvv1 = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
 //BA.debugLineNum = 62;BA.debugLine="Formatter.GetDefaultFormat.FormatFont = MainLabel";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.b4xformatter._b4xformatdata*/ ().FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getFont();
 //BA.debugLineNum = 63;BA.debugLine="Formatter.GetDefaultFormat.TextColor = MainLabel.";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 /*b4a.example.b4xformatter._b4xformatdata*/ ().TextColor /*int*/  = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getTextColor();
 //BA.debugLineNum = 64;BA.debugLine="If Formation = \"Horizontal\" Then";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2).equals("Horizontal")) { 
 //BA.debugLineNum = 65;BA.debugLine="lblPlus = CreateLabel(Chr(0xE315))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _v7(BA.ObjectToString(__c.Chr(((int)0xe315))));
 //BA.debugLineNum = 66;BA.debugLine="lblMinus = CreateLabel(Chr(0xE314))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _v7(BA.ObjectToString(__c.Chr(((int)0xe314))));
 }else {
 //BA.debugLineNum = 68;BA.debugLine="lblPlus = CreateLabel(Chr(0xE316))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _v7(BA.ObjectToString(__c.Chr(((int)0xe316))));
 //BA.debugLineNum = 69;BA.debugLine="lblMinus = CreateLabel(Chr(0xE313))";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _v7(BA.ObjectToString(__c.Chr(((int)0xe313))));
 };
 //BA.debugLineNum = 71;BA.debugLine="lblMinus.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 72;BA.debugLine="lblPlus.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 73;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 74;BA.debugLine="mBase.AddView(MainLabel, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 75;BA.debugLine="mBase.AddView(pnlPlus, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 76;BA.debugLine="mBase.AddView(pnlMinus, 0, 0, 0, 0)";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 77;BA.debugLine="pnlPlus.AddView(lblPlus, 0, 0, 0, 0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 78;BA.debugLine="pnlMinus.AddView(lblMinus, 0, 0, 0, 0)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.AddView((android.view.View)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 79;BA.debugLine="SetIndex(-1, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (-1),__c.False);
 //BA.debugLineNum = 80;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
_base_resize(_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public Object  _getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub getSelectedValue As Object";
 //BA.debugLineNum = 118;BA.debugLine="Return GetValueImpl (mSelectedIndex)";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public Object  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(int _index) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Private Sub GetValueImpl (Index As Int) As Object";
 //BA.debugLineNum = 131;BA.debugLine="If StringMode Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 132;BA.debugLine="Return mStringItems.Get(Index)";
if (true) return _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.Get(_index);
 }else {
 //BA.debugLineNum = 134;BA.debugLine="If Index = Size - 1 Then";
if (_index==_vvvvvvvvvvvvvvv2-1) { 
 //BA.debugLineNum = 135;BA.debugLine="Return mEndRange";
if (true) return (Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2);
 }else {
 //BA.debugLineNum = 137;BA.debugLine="Return mStartRange + Index * mInterval";
if (true) return (Object)(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0+_index*_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1);
 };
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6() throws Exception{
double _v1 = 0;
double _v2 = 0;
 //BA.debugLineNum = 162;BA.debugLine="Public Sub Increment";
 //BA.debugLineNum = 163;BA.debugLine="If mSelectedIndex = Size - 3 And StringMode = Fal";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3==_vvvvvvvvvvvvvvv2-3 && _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0==__c.False) { 
 //BA.debugLineNum = 164;BA.debugLine="Dim v1 As Double = GetValueImpl(mSelectedIndex +";
_v1 = (double)(BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+1))));
 //BA.debugLineNum = 165;BA.debugLine="Dim v2 As Double = GetValueImpl(mSelectedIndex +";
_v2 = (double)(BA.ObjectToNumber(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+2))));
 //BA.debugLineNum = 166;BA.debugLine="If Formatter.Format(v1) = Formatter.Format(v2) T";
if ((_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (_v1)).equals(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ (_v2))) { 
 //BA.debugLineNum = 167;BA.debugLine="mSelectedIndex = mSelectedIndex + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+1);
 };
 };
 //BA.debugLineNum = 170;BA.debugLine="If mSelectedIndex >= Size - 1 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3>=_vvvvvvvvvvvvvvv2-1) { 
 //BA.debugLineNum = 171;BA.debugLine="If mCyclic Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3) { 
 //BA.debugLineNum = 172;BA.debugLine="mSelectedIndex = -1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (-1);
 }else {
 //BA.debugLineNum = 174;BA.debugLine="mSelectedIndex = Size - 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = (int) (_vvvvvvvvvvvvvvv2-1);
 //BA.debugLineNum = 175;BA.debugLine="LoopIndex = LoopIndex + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+1);
 //BA.debugLineNum = 176;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 179;BA.debugLine="SetIndex(mSelectedIndex + 1, True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3+1),__c.True);
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 31;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 32;BA.debugLine="mEventName = EventName";
_vvv2 = _eventname;
 //BA.debugLineNum = 33;BA.debugLine="mCallBack = Callback";
_vvv3 = _callback;
 //BA.debugLineNum = 34;BA.debugLine="Formatter.Initialize";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._initialize /*String*/ (ba);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
 //BA.debugLineNum = 259;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _pnlarrow_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Private Sub pnlArrow_Touch (Action As Int, X As Fl";
 //BA.debugLineNum = 196;BA.debugLine="Touch(Action = lblPlus.TOUCH_ACTION_DOWN, Action";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(_action==_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.TOUCH_ACTION_DOWN,_action!=_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.TOUCH_ACTION_MOVE,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(int _i,boolean _raiseevent) throws Exception{
Object _value = null;
 //BA.debugLineNum = 142;BA.debugLine="Private Sub SetIndex(i As Int, RaiseEvent As Boole";
 //BA.debugLineNum = 143;BA.debugLine="If i >= Size Then i = -1";
if (_i>=_vvvvvvvvvvvvvvv2) { 
_i = (int) (-1);};
 //BA.debugLineNum = 144;BA.debugLine="mSelectedIndex = i";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 = _i;
 //BA.debugLineNum = 145;BA.debugLine="If mSelectedIndex = -1 Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3==-1) { 
 //BA.debugLineNum = 146;BA.debugLine="MainLabel.Text = \"\"";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setText(BA.ObjectToCharSequence(""));
 }else {
 //BA.debugLineNum = 148;BA.debugLine="Dim value As Object = GetValueImpl (mSelectedInd";
_value = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3);
 //BA.debugLineNum = 149;BA.debugLine="If StringMode Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 150;BA.debugLine="InternalSetTextOrCSBuilderToLabel(MainLabel, va";
_vvvvvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5,_value);
 }else {
 //BA.debugLineNum = 152;BA.debugLine="MainLabel.Text = Formatter.Format(value)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 /*String*/ ((double)(BA.ObjectToNumber(_value)))));
 };
 //BA.debugLineNum = 154;BA.debugLine="If RaiseEvent And xui.SubExists(mCallBack, mEven";
if (_raiseevent && _vvv5.SubExists(ba,_vvv3,_vvv2+"_valuechanged",(int) (1))) { 
 //BA.debugLineNum = 155;BA.debugLine="CallSub2(mCallBack, mEventName & \"_valuechanged";
__c.CallSubNew2(ba,_vvv3,_vvv2+"_valuechanged",_value);
 };
 };
 //BA.debugLineNum = 158;BA.debugLine="lblPlus.Enabled = Size > 0 And (mCyclic Or mSelec";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0.setEnabled(_vvvvvvvvvvvvvvv2>0 && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3<_vvvvvvvvvvvvvvv2-1));
 //BA.debugLineNum = 159;BA.debugLine="lblMinus.Enabled = Size > 0 And (mCyclic Or mSele";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.setEnabled(_vvvvvvvvvvvvvvv2>0 && (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 || _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3>0));
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(double _startrange,double _endrange,double _interval) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Public Sub SetNumericRange (StartRange As Double,";
 //BA.debugLineNum = 109;BA.debugLine="Size = Ceil((EndRange - StartRange) / Interval) +";
_vvvvvvvvvvvvvvv2 = (int) (__c.Ceil((_endrange-_startrange)/(double)_interval)+1);
 //BA.debugLineNum = 110;BA.debugLine="mStartRange = StartRange";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = _startrange;
 //BA.debugLineNum = 111;BA.debugLine="mEndRange = EndRange";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = _endrange;
 //BA.debugLineNum = 112;BA.debugLine="mInterval = Interval";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 = _interval;
 //BA.debugLineNum = 113;BA.debugLine="StringMode = False";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.False;
 //BA.debugLineNum = 114;BA.debugLine="SetIndex(0, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (0),__c.False);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(Object _v) throws Exception{
double _n = 0;
 //BA.debugLineNum = 121;BA.debugLine="Public Sub setSelectedValue (v As Object)";
 //BA.debugLineNum = 122;BA.debugLine="If StringMode Then";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0) { 
 //BA.debugLineNum = 123;BA.debugLine="SetIndex(mStringItems.IndexOf(v), False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.IndexOf(_v),__c.False);
 }else {
 //BA.debugLineNum = 125;BA.debugLine="Dim n As Double = v";
_n = (double)(BA.ObjectToNumber(_v));
 //BA.debugLineNum = 126;BA.debugLine="SetIndex(Min(Size - 1, Max(0, Round((n - mStartR";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (__c.Min(_vvvvvvvvvvvvvvv2-1,__c.Max(0,__c.Round((_n-_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0)/(double)_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)))),__c.False);
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(anywheresoftware.b4a.objects.collections.List _list) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub SetStringItems (list As List)";
 //BA.debugLineNum = 102;BA.debugLine="mStringItems = list";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 = _list;
 //BA.debugLineNum = 103;BA.debugLine="StringMode = True";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 = __c.True;
 //BA.debugLineNum = 104;BA.debugLine="Size = mStringItems.Size";
_vvvvvvvvvvvvvvv2 = _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7.getSize();
 //BA.debugLineNum = 105;BA.debugLine="SetIndex(-1, False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7((int) (-1),__c.False);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(boolean _up) throws Exception{
ResumableSub_StartDownLoop rsub = new ResumableSub_StartDownLoop(this,_up);
rsub.resume(ba, null);
}
public static class ResumableSub_StartDownLoop extends BA.ResumableSub {
public ResumableSub_StartDownLoop(b4a.example.b4xplusminus parent,boolean _up) {
this.parent = parent;
this._up = _up;
}
b4a.example.b4xplusminus parent;
boolean _up;
int _myindex = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 235;BA.debugLine="LoopIndex = LoopIndex + 1";
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+1);
 //BA.debugLineNum = 236;BA.debugLine="If mRapid = False Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 237;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4;
 //BA.debugLineNum = 238;BA.debugLine="Sleep(RapidPeriod1)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5);
this.state = 19;
return;
case 19:
//C
this.state = 7;
;
 //BA.debugLineNum = 239;BA.debugLine="Do While MyIndex = LoopIndex";
if (true) break;

case 7:
//do while
this.state = 18;
while (_myindex==parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 240;BA.debugLine="If Up Then Increment Else Decrement";
if (true) break;

case 10:
//if
this.state = 17;
if (_up) { 
this.state = 12;
;}
else {
this.state = 14;
;}if (true) break;

case 12:
//C
this.state = 17;
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
if (true) break;

case 14:
//C
this.state = 17;
parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
if (true) break;

case 17:
//C
this.state = 7;
;
 //BA.debugLineNum = 241;BA.debugLine="Sleep(RapidPeriod2)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6);
this.state = 20;
return;
case 20:
//C
this.state = 7;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4(boolean _start,boolean _stop,anywheresoftware.b4a.objects.B4XViewWrapper _pnl) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Private Sub Touch (Start As Boolean, Stop As Boole";
 //BA.debugLineNum = 200;BA.debugLine="If pnl.GetView(0).Enabled = False Then Return";
if (_pnl.GetView((int) (0)).getEnabled()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 201;BA.debugLine="If Start Then";
if (_start) { 
 //BA.debugLineNum = 202;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (_vvvvvvvvvv1) { 
_vvvvv3._v0 /*String*/ (ba,_pnl);};
 //BA.debugLineNum = 203;BA.debugLine="If pnl.Tag = True Then";
if ((_pnl.getTag()).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 204;BA.debugLine="Increment";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6();
 //BA.debugLineNum = 205;BA.debugLine="StartDownLoop(True)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.True);
 }else {
 //BA.debugLineNum = 207;BA.debugLine="Decrement";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3();
 //BA.debugLineNum = 208;BA.debugLine="StartDownLoop(False)";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(__c.False);
 };
 }else if(_stop) { 
 //BA.debugLineNum = 211;BA.debugLine="LoopIndex = LoopIndex + 1";
_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 = (int) (_vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4+1);
 };
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
