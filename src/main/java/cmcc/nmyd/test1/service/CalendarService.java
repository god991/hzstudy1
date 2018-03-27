package cmcc.nmyd.test1.service;

import cmcc.nmyd.test1.dao.CalendarDao;
import cmcc.nmyd.test1.po.TblCalendar;

import java.util.List;

public interface CalendarService {
    public int calendarInsert(TblCalendar tblCalendar);

    public int calendarDel(int id);

    public int calendarUpdate(TblCalendar tblCalendar);

    public List<TblCalendar> calendarGetOne(int id);

    public List<TblCalendar> calendarGetAll();
}
