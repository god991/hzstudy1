package cmcc.nmyd.test1.po;

import java.util.Date;

public class TblUser {
    /**
     * `userId` varchar(20) NOT NULL,
     *   `username` varchar(40) NOT NULL,
     *   `pswd` varchar(50) NOT NULL DEFAULT '',
     *     `createtime` datetime NOT NULL DEFAULT current_timestamp(),
     *   `updatetime` datetime NOT NULL DEFAULT current_timestamp(),
     */
    private String userId;
    private String userName;
    private String pswd;
    private int status;
    private Date createTime;
    private Date lastUpdateTime;
    private String updateBy;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public TblUser() {
    }

    public TblUser(String userId, String username, String pswd) {
        this.userId = userId;
        this.userName = username;
        this.pswd = pswd;
        //this.updatetime =
    }

    public TblUser(String userId, String userName, String pswd, int status, Date createTime, Date lastUpdateTime, String updateBy) {
        this.userId = userId;
        this.userName = userName;
        this.pswd = pswd;
        this.status = status;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
        this.updateBy = updateBy;
    }

    public TblUser(String userId, String userName, String pswd, int status) {
        this.userId = userId;
        this.userName = userName;
        this.pswd = pswd;
        this.status = status;
    }


    public TblUser(String userId, String userName, String pswd, int status, Date lastUpdateTime) {
        this.userId = userId;
        this.userName = userName;
        this.pswd = pswd;
        this.status = status;
        this.lastUpdateTime = lastUpdateTime;
    }
}
