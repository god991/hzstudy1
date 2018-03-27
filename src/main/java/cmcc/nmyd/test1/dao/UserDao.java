package cmcc.nmyd.test1.dao;

import cmcc.nmyd.test1.po.TblUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    //新增用户
    @Insert("insert into tblUser(userid,username,pswd) " +
            "values(#{userId},#{userName},#{pswd})")
    public int insertOneUser(TblUser tblUser);
    //删除用户，严格说这个不用
    @Delete("delete from tblUser where userid=#{userId} limit 1")
    public int delUserById(String userId);
    //根据用户ID更新用户信息
    @Update("Update tblUser set username=#{userName}" +
            " ,pswd=#{pswd},status=#{status},lastupdatetime=#{lastUpdateTime}" +
            "  ,updateBy=#{updateBy} where userid=#{userId}")
    public  int updateOneUser(TblUser tblUser);
    //查询单个用户
    @Select("select * from tblUser where userid=#{userId} limit 1")
    public TblUser getOneUserById(String userId);
    //查询所有用户列表，分页
    @Select("select * from tblUser order by createtime desc limit #{np},#{n} ")
    public List<TblUser> getAllUser(@Param("np")int np, @Param("n")int n);

}
