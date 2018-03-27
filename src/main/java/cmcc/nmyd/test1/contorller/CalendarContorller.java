package cmcc.nmyd.test1.contorller;

import cmcc.nmyd.test1.po.TblCalendar;
import cmcc.nmyd.test1.service.CalendarService;
//import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class CalendarContorller {
    @Autowired
    private CalendarService calendarService;
    private int intInsert=-1;

    @RequestMapping("/insert1")
    public int calendarInsert(HttpServletRequest req){
        TblCalendar tblCalendar=new TblCalendar();
        tblCalendar.setTitle(req.getParameter("title"));
        intInsert=calendarService.calendarInsert(tblCalendar);
        return intInsert;
    }

    @RequestMapping("/insertAll")
    public int calendarInsertAll(HttpServletRequest req){
        String title=req.getParameter("title");
        String content=req.getParameter("content");
        int importance=Integer.parseInt(req.getParameter("importance"));
        int ifOK=Integer.parseInt(req.getParameter("ifOK"));
        Date finishDate=null;
        try {
            finishDate=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse(
                    req.getParameter("finishDate")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        //初始化存储对象
        TblCalendar tblCalendar=new TblCalendar(title,content,importance,finishDate,ifOK);
        return calendarService.calendarInsert(tblCalendar);
    }

    @RequestMapping("/del")
    public int calendarDel(HttpServletRequest req){
        int id=Integer.parseInt(req.getParameter("id"));
        intInsert=calendarService.calendarDel(id);
        return intInsert;
    }

    @RequestMapping("/update")
    public int calendarUpdate(HttpServletRequest req){
        TblCalendar tblCalendar=new TblCalendar();
        int id=Integer.parseInt(req.getParameter("id"));
        tblCalendar.setId(id);
        tblCalendar.setTitle(req.getParameter("title"));

        return calendarService.calendarUpdate(tblCalendar);
    }

    @RequestMapping("/getOne")
    public Object calendarGetOne(HttpServletRequest req){
        int id=Integer.parseInt(req.getParameter("id"));
        List<TblCalendar> listTbl=calendarService.calendarGetOne(id);
        //JSONArray jsonArray=JSONArray.fromObject(listTbl);
        //JSONArray jsonArray=JSONArray.fromObject(listTbl);
        return listTbl;
    }

    @RequestMapping("/getAll")
    public Object calendarGetAll(){
        List<TblCalendar> listTbl=calendarService.calendarGetAll();
        //JSONArray jsonArray=JSONArray.fromObject(listTbl);

        //return jsonArray.toString();
        return listTbl;
    }
}
