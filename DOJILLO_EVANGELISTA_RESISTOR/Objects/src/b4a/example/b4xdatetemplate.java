package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.b4xdatetemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xdatetemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _vvv5 = null;
public int _vvvvvvvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvv2 = 0;
public float _vvvvvvvvvvvvvvvvv3 = 0f;
public float _vvvvvvvvvvvvvvvvv4 = 0f;
public float _vvvvvvvvvvvvvvvvv5 = 0f;
public int _vvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvvvvvvv0 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvv0 = null;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvv1 = null;
public long _vvvvvvvvvvvvvvvvvv2 = 0L;
public long _vvvvvvvvvvvvvvvvvv3 = 0L;
public int _vvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvv5 = 0;
public int _vvvvvvvvvvvvvvvvvv6 = 0;
public int _vvvvvvvvvvvvvvvvvv7 = 0;
public int _vvvvvvvvvvvv1 = 0;
public int _vvvvvvvvvvvvvvvvvv0 = 0;
public int _vvvvvvvvvvvvvvvvvvv1 = 0;
public anywheresoftware.b4a.objects.B4XCanvas _vvvvvvvvvvvvvvvvvvv2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _vvvvvvvvvvvvvvvvvvv3 = 0;
public int _vvvvvvvvvvvvvvvvvvv4 = 0;
public int _vvvvvvvvvvvvvvvvvvv5 = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _vvvvvvvvvvvvvvvvvvv6 = null;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvv7 = null;
public b4a.example.b4xdialog _vvvvvvvvvvvvvvvvvvv0 = null;
public boolean _vvvvvvvvvvvvvvvvvvvv1 = false;
public anywheresoftware.b4a.objects.collections.List _vvvvvvvvvvvvvvvvvvvv2 = null;
public b4a.example.dateutils _vvvv0 = null;
public b4a.example.main _vvvvv1 = null;
public b4a.example.starter _vvvvv2 = null;
public b4a.example.xuiviewsutils _vvvvv3 = null;
public String  _btnmonth_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
 //BA.debugLineNum = 160;BA.debugLine="Private Sub btnMonth_Click";
 //BA.debugLineNum = 161;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 162;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+_vvvvvvvvvvvvvvvvv1-1+(double)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 163;BA.debugLine="month = (m Mod 12) + 1";
_vvvvvvvvvvvvvvvvv1 = (int) ((_m%12)+1);
 //BA.debugLineNum = 164;BA.debugLine="DrawDays";
_vvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
 //BA.debugLineNum = 154;BA.debugLine="Private Sub btnYear_Click";
 //BA.debugLineNum = 155;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 156;BA.debugLine="year = year + btn.Tag";
_vvvvvvvvvvvvvvvvv2 = (int) (_vvvvvvvvvvvvvvvvv2+(double)(BA.ObjectToNumber(_btn.getTag())));
 //BA.debugLineNum = 157;BA.debugLine="DrawDays";
_vvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
_vvv5 = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 3;BA.debugLine="Private month, year As Int";
_vvvvvvvvvvvvvvvvv1 = 0;
_vvvvvvvvvvvvvvvvv2 = 0;
 //BA.debugLineNum = 4;BA.debugLine="Private boxW, boxH As Float";
_vvvvvvvvvvvvvvvvv3 = 0f;
_vvvvvvvvvvvvvvvvv4 = 0f;
 //BA.debugLineNum = 5;BA.debugLine="Private vCorrection As Float";
_vvvvvvvvvvvvvvvvv5 = 0f;
 //BA.debugLineNum = 6;BA.debugLine="Private tempSelectedDay As Int";
_vvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private dayOfWeekOffset As Int";
_vvvvvvvvvvvvvvvvv7 = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private daysInMonth As Int";
_vvvvvvvvvvvvvvvvv0 = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private cvs As B4XCanvas";
_vvvvvvvv0 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 12;BA.debugLine="Private cvsBackground As B4XCanvas";
_vvvvvvvvvvvvvvvvvv1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 13;BA.debugLine="Private selectedDate As Long";
_vvvvvvvvvvvvvvvvvv2 = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private PreviousSelectedDate As Long";
_vvvvvvvvvvvvvvvvvv3 = 0L;
 //BA.debugLineNum = 15;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_vvvvvvvvvvvvvvvvvv4 = 0;
_vvvvvvvvvvvvvvvvvv5 = 0;
_vvvvvvvvvvvvvvvvvv6 = 0;
 //BA.debugLineNum = 16;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_vvvvvvvvvvvvvvvvvv7 = ((int)0xff001bbd);
 //BA.debugLineNum = 17;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_vvvvvvvvvvvv1 = ((int)0xff0ba29b);
 //BA.debugLineNum = 18;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_vvvvvvvvvvvvvvvvvv0 = _vvv5.Color_White;
 //BA.debugLineNum = 19;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_vvvvvvvvvvvvvvvvvvv1 = _vvv5.Color_Gray;
 //BA.debugLineNum = 20;BA.debugLine="Private cvsDays As B4XCanvas";
_vvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 21;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public FirstDay As Int = 0";
_vvvvvvvvvvvvvvvvvvv3 = (int) (0);
 //BA.debugLineNum = 23;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_vvvvvvvvvvvvvvvvvvv4 = (int) (1970);
_vvvvvvvvvvvvvvvvvvv5 = (int) (2030);
 //BA.debugLineNum = 24;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private pnlDialog As B4XView";
_vvvvvvvvvvvvvvvvvvv6 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Public MonthsNames As List";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 32;BA.debugLine="Private mDialog As B4XDialog";
_vvvvvvvvvvvvvvvvvvv0 = new b4a.example.b4xdialog();
 //BA.debugLineNum = 33;BA.debugLine="Public CloseOnSelection As Boolean = True";
_vvvvvvvvvvvvvvvvvvvv1 = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="Public DaysOfWeekNames As List";
_vvvvvvvvvvvvvvvvvvvv2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(int _action,float _x,float _y) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 167;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
 //BA.debugLineNum = 168;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _dayspanefg;
 //BA.debugLineNum = 169;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
_vvvvvvvvvvvvvvvv3(_x,_y,_action!=_p.TOUCH_ACTION_UP);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(int _result) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
 //BA.debugLineNum = 194;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=_vvv5.DialogResponse_Positive) { 
 //BA.debugLineNum = 195;BA.debugLine="setDate(PreviousSelectedDate)";
_setvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvv3);
 };
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvv0(anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
 //BA.debugLineNum = 91;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
 //BA.debugLineNum = 92;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 93;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*_vvvvvvvvvvvvvvvvv3),(float) (_y*_vvvvvvvvvvvvvvvvv4),(float) (_x*_vvvvvvvvvvvvvvvvv3+_vvvvvvvvvvvvvvvvv3),(float) (_y*_vvvvvvvvvvvvvvvvv4+_vvvvvvvvvvvvvvvvv4));
 //BA.debugLineNum = 94;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv1() throws Exception{
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
 //BA.debugLineNum = 62;BA.debugLine="Private Sub DrawDays";
 //BA.debugLineNum = 63;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
_lblmonth.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvv7.Get((int) (_vvvvvvvvvvvvvvvvv1-1))));
 //BA.debugLineNum = 64;BA.debugLine="lblYear.Text = year";
_lblyear.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 65;BA.debugLine="SetYearsButtonState";
_vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 66;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
_vvvvvvvv0.ClearRect(_vvvvvvvv0.getTargetRect());
 //BA.debugLineNum = 67;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
_vvvvvvvvvvvvvvvvvv1.ClearRect(_vvvvvvvvvvvvvvvvvv1.getTargetRect());
 //BA.debugLineNum = 68;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_vvvv0._setdate(ba,_vvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvv1,(int) (1))-1);
 //BA.debugLineNum = 69;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
_vvvvvvvvvvvvvvvvv7 = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-_vvvvvvvvvvvvvvvvvvv3)%7);
 //BA.debugLineNum = 70;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
_vvvvvvvvvvvvvvvvv0 = _vvvv0._numberofdaysinmonth(ba,_vvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 71;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (_vvvvvvvvvvvvvvvvv2==_vvvvvvvvvvvvvvvvvv4 && _vvvvvvvvvvvvvvvvv1==_vvvvvvvvvvvvvvvvvv5) { 
 //BA.debugLineNum = 73;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
_vvvvvvvvvvvvvvv0(_vvvvvvvv0,_vvvvvvvvvvvv1,(int) ((_vvvvvvvvvvvvvvvvvv6-1+_vvvvvvvvvvvvvvvvv7)%7),(int) ((_vvvvvvvvvvvvvvvvvv6-1+_vvvvvvvvvvvvvvvvv7)/(double)7));
 };
 //BA.debugLineNum = 76;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = _vvv5.CreateDefaultBoldFont((float) (14));
 //BA.debugLineNum = 77;BA.debugLine="For day = 1 To daysInMonth";
{
final int step13 = 1;
final int limit13 = _vvvvvvvvvvvvvvvvv0;
_day = (int) (1) ;
for (;_day <= limit13 ;_day = _day + step13 ) {
 //BA.debugLineNum = 78;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+_vvvvvvvvvvvvvvvvv7)/(double)7);
 //BA.debugLineNum = 79;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
_vvvvvvvv0.DrawText(ba,BA.NumberToString(_day),(float) ((((_vvvvvvvvvvvvvvvvv7+_day-1)%7)+0.5)*_vvvvvvvvvvvvvvvvv3),(float) ((_row+0.5)*_vvvvvvvvvvvvvvvvv4+_vvvvvvvvvvvvvvvvv5),_daysfont,_vvvvvvvvvvvvvvvvvv0,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 //BA.debugLineNum = 82;BA.debugLine="cvsBackground.Invalidate";
_vvvvvvvvvvvvvvvvvv1.Invalidate();
 //BA.debugLineNum = 83;BA.debugLine="cvs.Invalidate";
_vvvvvvvv0.Invalidate();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public long  _getvvvvvvvvvvvvvvvv0() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub getDate As Long";
 //BA.debugLineNum = 99;BA.debugLine="Return selectedDate";
if (true) return _vvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.b4xdialog _dialog) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
 //BA.debugLineNum = 173;BA.debugLine="Return pnlDialog";
if (true) return _vvvvvvvvvvvvvvvvvvv6;
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public String  _vvvvvvvvvvvvvvvv3(double _x,double _y,boolean _move) throws Exception{
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
 //BA.debugLineNum = 123;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
 //BA.debugLineNum = 124;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)_vvvvvvvvvvvvvvvvv3);
_boxy = (int) (_y/(double)_vvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 125;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-_vvvvvvvvvvvvvvvvv7);
 //BA.debugLineNum = 126;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=_vvvvvvvvvvvvvvvvv0;
 //BA.debugLineNum = 127;BA.debugLine="If move Then";
if (_move) { 
 //BA.debugLineNum = 128;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==_vvvvvvvvvvvvvvvvv6) { 
if (true) return "";};
 //BA.debugLineNum = 129;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
_vvvvvvvvvvvvvvvvvv1.ClearRect(_vvvvvvvvvvvvvvvvvv1.getTargetRect());
 //BA.debugLineNum = 130;BA.debugLine="tempSelectedDay = newSelectedDay";
_vvvvvvvvvvvvvvvvv6 = _newselectedday;
 //BA.debugLineNum = 131;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 132;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
_vvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvv1,_vvvvvvvvvvvvvvvvvv7,_boxx,_boxy);
 };
 }else {
 //BA.debugLineNum = 135;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
_vvvvvvvvvvvvvvvvvv1.ClearRect(_vvvvvvvvvvvvvvvvvv1.getTargetRect());
 //BA.debugLineNum = 136;BA.debugLine="If validDay Then";
if (_validday) { 
 //BA.debugLineNum = 137;BA.debugLine="SelectDay(newSelectedDay)";
_vvvvvvvvvvvvvvvv5(_newselectedday);
 //BA.debugLineNum = 138;BA.debugLine="If CloseOnSelection Then";
if (_vvvvvvvvvvvvvvvvvvvv1) { 
 //BA.debugLineNum = 139;BA.debugLine="Hide";
_vvvvvvvvvvvvvvvv4();
 }else {
 //BA.debugLineNum = 141;BA.debugLine="DrawDays";
_vvvvvvvvvvvvvvvv1();
 };
 };
 };
 //BA.debugLineNum = 146;BA.debugLine="cvsBackground.Invalidate";
_vvvvvvvvvvvvvvvvvv1.Invalidate();
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv4() throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Private Sub Hide";
 //BA.debugLineNum = 150;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
_vvvvvvvvvvvvvvvvvvv0._vvvvvvvvvvvvvvvvvvvv4 /*boolean*/ (_vvv5.DialogResponse_Positive);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 38;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
_vvvvvvvvvvvvvvvvvvv6 = _vvv5.CreatePanel(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
_vvvvvvvvvvvvvvvvvvv6.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 40;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
_vvvvvvvvvvvvvvvvvvv6.LoadLayout("DateTemplate",ba);
 //BA.debugLineNum = 41;BA.debugLine="pnlDialog.Tag = Me";
_vvvvvvvvvvvvvvvvvvv6.setTag(this);
 //BA.debugLineNum = 42;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
_vvvvvvvvvvvvvvvvv1 = __c.DateTime.GetMonth(__c.DateTime.getNow());
 //BA.debugLineNum = 43;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
_vvvvvvvvvvvvvvvvv2 = __c.DateTime.GetYear(__c.DateTime.getNow());
 //BA.debugLineNum = 44;BA.debugLine="MonthsNames = DateUtils.GetMonthsNames";
_vvvvvvvvvvvvvvvvvvv7 = _vvvv0._getmonthsnames(ba);
 //BA.debugLineNum = 45;BA.debugLine="selectedDate = DateTime.Now";
_vvvvvvvvvvvvvvvvvv2 = __c.DateTime.getNow();
 //BA.debugLineNum = 46;BA.debugLine="setDate(selectedDate)";
_setvvvvvvvvvvvvvvvv0(_vvvvvvvvvvvvvvvvvv2);
 //BA.debugLineNum = 47;BA.debugLine="cvs.Initialize(DaysPaneFg)";
_vvvvvvvv0.Initialize(_dayspanefg);
 //BA.debugLineNum = 48;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
_vvvvvvvvvvvvvvvvvv1.Initialize(_dayspanebg);
 //BA.debugLineNum = 49;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
_vvvvvvvvvvvvvvvvv3 = (float) (_vvvvvvvv0.getTargetRect().getWidth()/(double)7);
 //BA.debugLineNum = 50;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
_vvvvvvvvvvvvvvvvv4 = (float) (_vvvvvvvv0.getTargetRect().getHeight()/(double)6);
 //BA.debugLineNum = 51;BA.debugLine="vCorrection = 5dip";
_vvvvvvvvvvvvvvvvv5 = (float) (__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 52;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
_vvvvvvvvvvvvvvvvvvv2.Initialize(_daystitlespane);
 //BA.debugLineNum = 58;BA.debugLine="DaysOfWeekNames.Initialize";
_vvvvvvvvvvvvvvvvvvvv2.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="DaysOfWeekNames.AddAll(DateUtils.GetDaysNames)";
_vvvvvvvvvvvvvvvvvvvv2.AddAll(_vvvv0._getdaysnames(ba));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv5(int _day) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Private Sub SelectDay(day As Int)";
 //BA.debugLineNum = 116;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
_vvvvvvvvvvvvvvvvvv2 = _vvvv0._setdate(ba,_vvvvvvvvvvvvvvvvv2,_vvvvvvvvvvvvvvvvv1,_day);
 //BA.debugLineNum = 117;BA.debugLine="selectedDay = day";
_vvvvvvvvvvvvvvvvvv6 = _day;
 //BA.debugLineNum = 118;BA.debugLine="selectedMonth = month";
_vvvvvvvvvvvvvvvvvv5 = _vvvvvvvvvvvvvvvvv1;
 //BA.debugLineNum = 119;BA.debugLine="selectedYear = year";
_vvvvvvvvvvvvvvvvvv4 = _vvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvv0(long _date) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub setDate(date As Long)";
 //BA.debugLineNum = 104;BA.debugLine="If lblYear.IsInitialized = False Then";
if (_lblyear.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 105;BA.debugLine="selectedDate = date";
_vvvvvvvvvvvvvvvvvv2 = _date;
 //BA.debugLineNum = 106;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
 //BA.debugLineNum = 108;BA.debugLine="year = DateTime.GetYear(date)";
_vvvvvvvvvvvvvvvvv2 = __c.DateTime.GetYear(_date);
 //BA.debugLineNum = 109;BA.debugLine="month = DateTime.GetMonth(date)";
_vvvvvvvvvvvvvvvvv1 = __c.DateTime.GetMonth(_date);
 //BA.debugLineNum = 110;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
_vvvvvvvvvvvvvvvv5(__c.DateTime.GetDayOfMonth(_date));
 //BA.debugLineNum = 111;BA.debugLine="lblYear.Text = year";
_lblyear.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvv2));
 //BA.debugLineNum = 112;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
_lblmonth.setText(BA.ObjectToCharSequence(_vvvvvvvvvvvvvvvvvvv7.Get((int) (_vvvvvvvvvvvvvvvvv1-1))));
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub SetYearsButtonState";
 //BA.debugLineNum = 87;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
_btnyearleft.setEnabled(_vvvvvvvvvvvvvvvvv2>_vvvvvvvvvvvvvvvvvvv4);
 //BA.debugLineNum = 88;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
_btnyearright.setEnabled(_vvvvvvvvvvvvvvvvv2<_vvvvvvvvvvvvvvvvvvv5);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.example.b4xdialog _dialog) throws Exception{
ResumableSub_Show rsub = new ResumableSub_Show(this,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.b4xdatetemplate parent,b4a.example.b4xdialog _dialog) {
this.parent = parent;
this._dialog = _dialog;
}
b4a.example.b4xdatetemplate parent;
b4a.example.b4xdialog _dialog;
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 177;BA.debugLine="Dim days As List = DaysOfWeekNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = parent._vvvvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 178;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = parent._vvv5.CreateDefaultBoldFont((float) (14));
 //BA.debugLineNum = 179;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
parent._vvvvvvvvvvvvvvvvvvv2.ClearRect(parent._vvvvvvvvvvvvvvvvvvv2.getTargetRect());
 //BA.debugLineNum = 180;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = (int) (parent._vvvvvvvvvvvvvvvvvvv3+7-1);
_i = parent._vvvvvvvvvvvvvvvvvvv3 ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 181;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
 //BA.debugLineNum = 182;BA.debugLine="If d.Length > 2 Then d = d.SubString2(0, 2)";
if (true) break;

case 4:
//if
this.state = 9;
if (_d.length()>2) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_d = _d.substring((int) (0),(int) (2));
if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 183;BA.debugLine="cvsDays.DrawText(d, (i - FirstDay + 0.5) * boxW,";
parent._vvvvvvvvvvvvvvvvvvv2.DrawText(ba,_d,(float) ((_i-parent._vvvvvvvvvvvvvvvvvvv3+0.5)*parent._vvvvvvvvvvvvvvvvv3),(float) (parent.__c.DipToCurrent((int) (20))),_daysfont,parent._vvvvvvvvvvvvvvvvvvv1,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 185;BA.debugLine="cvsDays.Invalidate";
parent._vvvvvvvvvvvvvvvvvvv2.Invalidate();
 //BA.debugLineNum = 186;BA.debugLine="mDialog = Dialog";
parent._vvvvvvvvvvvvvvvvvvv0 = _dialog;
 //BA.debugLineNum = 187;BA.debugLine="DrawDays";
parent._vvvvvvvvvvvvvvvv1();
 //BA.debugLineNum = 188;BA.debugLine="PreviousSelectedDate = selectedDate";
parent._vvvvvvvvvvvvvvvvvv3 = parent._vvvvvvvvvvvvvvvvvv2;
 //BA.debugLineNum = 189;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
 //BA.debugLineNum = 190;BA.debugLine="SetYearsButtonState";
parent._vvvvvvvvvvvvvvvv7();
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
