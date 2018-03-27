package cmcc.nmyd.test1.dao;

import cmcc.nmyd.test1.po.TblCalendar;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CalendarDao {

    @Insert("insert into tblcalendar(title,content,importance,finishDate,ifOK) " +
            "values(#{title},#{content},#{importance},#{finishDate},#{ifOK})")
    public int calendarInsert(TblCalendar tblCalendar);

    @Delete("delete from tblcalendar where id=#{id} limit 1")
    public int calendarDel(int id);

    @Update("Update tblcalendar set title=#{title} where id=#{id}")
    public  int calendarUpdate(TblCalendar tblCalendar);

    @Select("select * from tblcalendar where id=#{id}")
    public List<TblCalendar> calendarGetOne(int id);

    @Select("select * from tblcalendar ")
    public List<TblCalendar> calendarGetAll();
}
