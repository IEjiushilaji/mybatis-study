package rui.dao;


import org.apache.ibatis.annotations.*;
import rui.pojo.User;

import java.util.List;

public interface UserMapper {
    @Select(value = "select * from user")
    List<User> getUsers();

    //方法存在多个参数，所有的参数前面必须加上@Param注解
    @Select("select * from user where id = #{id} or name = #{name}")
    User getUserByID(@Param("id")int id,@Param("name")String name);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name = #{name},pwd = #{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{uid}")
    int deleteUser(@Param("uid") int id);
}
