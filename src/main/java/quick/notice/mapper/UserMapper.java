package quick.notice.mapper;

import quick.notice.models.*;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

  @Select("select * from user")
  List<User> findAll();

  @Select("select * from user where id = #{id}")
  User findOne(String id);

  @Insert("insert into user(id, password) values(#{id}, #{password})")
  void Create(User user);

  @Update("update user set id = #{id} where idx = #{idx}")
  void Update(User user);

  @Delete("delete from user where idx = #{idx}")
  void Delete(User user);

}