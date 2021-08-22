package quick.notice.mapper;

import quick.notice.models.*;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

  @Select("select * from user")
  List<User> findAll();

  @Select("select * from user where user_id = #{user_id}")
  User findOne(String user_id);

  @Insert("insert into user(user_id, password, user_name, birth, gender, email, createdAt, updatedAt) values(#{user_id}, #{password}, #{user_name}, #{birth}, #{gender}, #{email}, now(), now())")
  void Create(User user);

  @Update("update user set id = #{id} where idx = #{idx}")
  void Update(User user);

  @Delete("delete from user where idx = #{idx}")
  void Delete(User user);

}