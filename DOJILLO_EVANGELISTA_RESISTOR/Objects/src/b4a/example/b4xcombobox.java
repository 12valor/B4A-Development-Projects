package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcombobox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xcombobox");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xcombobox.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _vvv2 = "";
public Object _vvv3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvv4 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public int _vvvvvvvvvvvvvvv3 = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _vvvvvvvvvvvvvvv4 = null;
public int _vvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvv6 = 0;
public Object _vvvv7 = null;
public String _vvvvvvvvvvvvvvv7 = "";
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 56;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
_vvv4.GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
_vvv2 = "";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
_vvv3 = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
_vvv4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 7;BA.debugLine="Private LastSelectedIndex As Int";
_vvvvvvvvvvvvvvv3 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Public cmbBox As Spinner";
_vvvvvvvvvvvvvvv4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Public DelayBeforeChangeEvent As Int";
_vvvvvvvvvvvvvvv5 = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private DelayIndex As Int";
_vvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
_vvvv7 = new Object();
 //BA.debugLineNum = 21;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
_vvvvvvvvvvvvvvv7 = "Cancel";
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _cmbbox_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Private Sub CmbBox_ItemClick (Position As Int, Val";
 //BA.debugLineNum = 158;BA.debugLine="RaiseEvent";
_vvvvvvvvvvvvvv6();
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 33;BA.debugLine="mBase = Base";
_vvv4 = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvvv7 = _vvv4.getTag();
 //BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
_vvv4.setTag(this);
 //BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="cmbBox.Initialize(\"cmbBox\")";
_vvvvvvvvvvvvvvv4.Initialize(ba,"cmbBox");
 //BA.debugLineNum = 43;BA.debugLine="cmbBox.TextSize = xlbl.TextSize";
_vvvvvvvvvvvvvvv4.setTextSize(_xlbl.getTextSize());
 //BA.debugLineNum = 44;BA.debugLine="mBase.AddView(cmbBox, 0, 0, mBase.Width, mBase.He";
_vvv4.AddView((android.view.View)(_vvvvvvvvvvvvvvv4.getObject()),(int) (0),(int) (0),_vvv4.getWidth(),_vvv4.getHeight());
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv1(int _index) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub GetItem(Index As Int) As String";
 //BA.debugLineNum = 131;BA.debugLine="Return cmbBox.GetItem(Index)";
if (true) return _vvvvvvvvvvvvvvv4.GetItem(_index);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub getSelectedIndex As Int";
 //BA.debugLineNum = 100;BA.debugLine="Return cmbBox.SelectedIndex";
if (true) return _vvvvvvvvvvvvvvv4.getSelectedIndex();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return 0;
}
public String  _getvvvvvvvvvvvvvvv1() throws Exception{
int _i = 0;
 //BA.debugLineNum = 121;BA.debugLine="Public Sub getSelectedItem As String";
 //BA.debugLineNum = 122;BA.debugLine="Dim i As Int = getSelectedIndex";
_i = _getvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 123;BA.debugLine="If i = -1 Then Return \"\"";
if (_i==-1) { 
if (true) return "";};
 //BA.debugLineNum = 124;BA.debugLine="Return GetItem(i)";
if (true) return _vvvvvvvvvvvvvv1(_i);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public int  _getvvvvvvvvvvvvvvv2() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 80;BA.debugLine="Return cmbBox.Size";
if (true) return _vvvvvvvvvvvvvvv4.getSize();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return 0;
}
public int  _vvvvvvvvvvvvvv5(String _item) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub IndexOf(Item As String) As Int";
 //BA.debugLineNum = 91;BA.debugLine="Return cmbBox.IndexOf(Item)";
if (true) return _vvvvvvvvvvvvvvv4.IndexOf(_item);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
_vvv2 = _eventname;
 //BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
_vvv3 = _callback;
 //BA.debugLineNum = 27;BA.debugLine="LastSelectedIndex = -1";
_vvvvvvvvvvvvvvv3 = (int) (-1);
 //BA.debugLineNum = 28;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if (_vvv5.getIsB4J()) { 
_vvvvvvvvvvvvvvv5 = (int) (500);};
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public void  _vvvvvvvvvvvvvv6() throws Exception{
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(this);
rsub.resume(ba, null);
}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(b4a.example.b4xcombobox parent) {
this.parent = parent;
}
b4a.example.b4xcombobox parent;
int _index = 0;
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
 //BA.debugLineNum = 138;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = parent._getvvvvvvvvvvvvvv0();
 //BA.debugLineNum = 139;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._vvvvvvvvvvvvvvv3==_index) { 
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
 //BA.debugLineNum = 140;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent._vvvvvvvvvvvvvvv5>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 141;BA.debugLine="DelayIndex = DelayIndex + 1";
parent._vvvvvvvvvvvvvvv6 = (int) (parent._vvvvvvvvvvvvvvv6+1);
 //BA.debugLineNum = 142;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = parent._vvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 143;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
parent.__c.Sleep(ba,this,parent._vvvvvvvvvvvvvvv5);
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
 //BA.debugLineNum = 144;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_myindex!=parent._vvvvvvvvvvvvvvv6) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 146;BA.debugLine="LastSelectedIndex = index";
parent._vvvvvvvvvvvvvvv3 = _index;
 //BA.debugLineNum = 147;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (true) break;

case 17:
//if
this.state = 20;
if (parent._vvv5.SubExists(ba,parent._vvv3,parent._vvv2+"_SelectedIndexChanged",(int) (1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 148;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndex";
parent.__c.CallSubNew2(ba,parent._vvv3,parent._vvv2+"_SelectedIndexChanged",(Object)(_index));
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _vvvvvvvv6(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub SetItems(Items As List)";
 //BA.debugLineNum = 64;BA.debugLine="cmbBox.Clear";
_vvvvvvvvvvvvvvv4.Clear();
 //BA.debugLineNum = 65;BA.debugLine="cmbBox.AddAll(Items)";
_vvvvvvvvvvvvvvv4.AddAll(_items);
 //BA.debugLineNum = 72;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if (_items.getSize()>0) { 
_setvvvvvvvvvvvvvv0((int) (0));};
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvv0(int _i) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
 //BA.debugLineNum = 107;BA.debugLine="LastSelectedIndex = i";
_vvvvvvvvvvvvvvv3 = _i;
 //BA.debugLineNum = 109;BA.debugLine="cmbBox.SelectedIndex = i";
_vvvvvvvvvvvvvvv4.setSelectedIndex(_i);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
