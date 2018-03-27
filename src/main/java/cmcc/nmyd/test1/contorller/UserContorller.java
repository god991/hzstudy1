package cmcc.nmyd.test1.contorller;

import cmcc.nmyd.test1.po.TblUser;
import cmcc.nmyd.test1.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserContorller {
    @Autowired
    private UserService userService;
    //private int intResult;

    //查询用户
    @RequestMapping("listUser")
    public Object getAllUser(HttpServletRequest req){
        int np=0;
        String strNp=req.getParameter("pageNum");
        strNp = strNp==null?"1":strNp;
        np=Integer.parseInt(strNp);
        return userService.getAllUser(np);
    }

    //获取单个用户信息
    @RequestMapping("getOneUser")
    public Object getOneUser(HttpServletRequest req){
        String userId=req.getParameter("userId");
        return userService.getOneUserById(userId);
    }

    //注册用户
    @RequestMapping("insertUser")
    public int insertUser(HttpServletRequest req){
        String userId=req.getParameter("userId");
        String userName=req.getParameter("userName");
        String pswd=req.getParameter("pswd");
        TblUser tblUser=new TblUser(userId,userName,pswd);
        tblUser.setStatus(1);
        return userService.insertOneUser(tblUser);
    }

    //更新名字
    @RequestMapping(value="updateUser")
    public int updateUser(HttpServletRequest req){
       // System.out.println(requestJso);
        TblUser tblUser=new TblUser();
        //tblUser.setUserId(reqMap.get("userId").toString());
        tblUser.setUserName(req.getParameter("userName"));
        tblUser.setPswd(req.getParameter("pswd"));
        System.out.println(req.toString());
        //tblUser.setStatus(Integer.parseInt(reqMap.get("status").toString()));
        return userService.updateUserById(tblUser);
    }

    //更新状态
    @RequestMapping("updatePost")
    @ResponseBody
    public int updateUserStatus(@RequestBody TblUser reqTblUser){
        System.out.println(reqTblUser);
        //String userId=req.getParameter("userId");
        //int intStatus=Integer.parseInt(req.getParameter("status"));
        //return userService.updateUserStatusById(userId,intStatus);
        return 1;
    }

    //更新
}
