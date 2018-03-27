package cmcc.nmyd.test1.service.impl;

import cmcc.nmyd.test1.dao.UserDao;
import cmcc.nmyd.test1.po.TblUser;
import cmcc.nmyd.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserDao userDao;
    //private int intResult;
    private TblUser tblUser=null;

    @Override //插入
    public int insertOneUser(TblUser tblUser) {
        return userDao.insertOneUser(tblUser);
    }

    @Override  //更新名字
    public int updateUserNameById(String userId, String userName) {
        tblUser=this.getOneUserById(userId);
        tblUser.setUserName(userName);
        return userDao.updateOneUser(tblUser);
    }

    @Override //更新密码
    public int updatePswdById(String userId,String pswd) {
        tblUser=this.getOneUserById(userId);
        tblUser.setPswd(pswd);
        return userDao.updateOneUser(tblUser);
    }

    @Override //更新状态
    public int updateUserStatusById(String userId, int intStatus) {
        tblUser=this.getOneUserById(userId);
        tblUser.setStatus(intStatus);
        return userDao.updateOneUser(tblUser);
    }

    @Override //更新用户所有字段
    public int updateUserById(TblUser tblUser1) {
        tblUser=this.getOneUserById(tblUser1.getUserId());
        tblUser.setUserName(tblUser1.getUserName());
        tblUser.setPswd(tblUser1.getPswd());
        tblUser.setLastUpdateTime(new Date());
        tblUser.setStatus(tblUser1.getStatus());
        return userDao.updateOneUser(tblUser);
    }

    @Override   //根据ID查单个用户
    public TblUser getOneUserById(String userId) {
        return userDao.getOneUserById(userId);
    }

    @Override
    public List<TblUser> getAllUser(int np) {
        int n=10;
        return userDao.getAllUser((np-1)*n,n);
    }
}
