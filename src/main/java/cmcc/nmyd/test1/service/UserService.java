package cmcc.nmyd.test1.service;


import cmcc.nmyd.test1.po.TblUser;

import java.util.List;

public interface UserService {
    public int insertOneUser(TblUser tblUser);
    //public int delUserById(String userId);
    public  int updateUserNameById(String userId,String userName);
    //更新密码
    public int updatePswdById(String userId,String pswd);
    //更新状态
    public int updateUserStatusById(String userId,int intStatus);
    //更新用户信息
    public int updateUserById(TblUser tblUser);
    //查询单个用户
    public TblUser getOneUserById(String userId);
    //查询所有用户列表，分页
    public List<TblUser> getAllUser(int np);
}
