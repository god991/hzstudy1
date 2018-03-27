package cmcc.nmyd.test1.po;

import java.util.Date;

public class TblCalendar {
    //字段映射
    /**
     *  `id` int(11) NOT NULL AUTO_INCREMENT,
     *   `title` varchar(255) DEFAULT NULL,
     *   `content` varchar(255) DEFAULT NULL,
     *   `importance` int(11) DEFAULT NULL,
     *   `finishDate` datetime DEFAULT NULL,
     *   `ifOK` int(11) DEFAULT NULL,
     *   `recordDate` datetime DEFAULT current_timestamp(),
     *   `img` varchar(255) DEFAULT NULL,
     *   `img1` varchar(255) DEFAULT NULL,
     */

    private int id;
    private String title;
    private String content;
    private int importance;
    private Date finishDate;
    private int ifOK;

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public int getIfOK() {
        return ifOK;
    }

    public void setIfOK(int ifOK) {
        this.ifOK = ifOK;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //构造函数

    public TblCalendar() {
    }

    public TblCalendar(String title, String content, int importance, Date finishDate, int ifOK) {
        this.title=title;
        this.content=content;
        this.importance=importance;
        this.finishDate=finishDate;
        this.ifOK=ifOK;
    }

    public TblCalendar(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    //Alt+insert 重写toString
    @Override
    public String toString() {
        return "TblCalendar{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
