package test.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import test.entity.Title;

import java.util.List;

@Component
public interface Common {

    //登陆成功后查询用户的姓名
//    @Select("select sname from stu where sno=#{sno} and password=#{password}")
//    public String login(@Param("sno") String sno,@Param("password") String password);
    //查询文章列表
    @Select("select * from fincontent")
    public List<Title> titleinfor();


}
