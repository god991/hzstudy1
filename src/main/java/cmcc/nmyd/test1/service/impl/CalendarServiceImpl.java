package cmcc.nmyd.test1.service.impl;

import cmcc.nmyd.test1.dao.CalendarDao;
import cmcc.nmyd.test1.po.TblCalendar;
import cmcc.nmyd.test1.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {
    @Autowired
    public CalendarDao calendarDao;

    @Override
    public int calendarInsert(TblCalendar tblCalendar) {
        return calendarDao.calendarInsert(tblCalendar);

    }

    @Override
    public int calendarDel(int id) {
        return calendarDao.calendarDel(id);

    }

    @Override
    public int calendarUpdate(TblCalendar tblCalendar) {
        return calendarDao.calendarUpdate(tblCalendar);
    }

    @Override
    public List<TblCalendar> calendarGetOne(int id) {
        return calendarDao.calendarGetOne(id);
    }

    @Override
    public List<TblCalendar> calendarGetAll() {
        return calendarDao.calendarGetAll();
    }


}
