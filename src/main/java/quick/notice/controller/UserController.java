package quick.notice.controller; // 자기 위치를 명시

import quick.notice.models.*;
import quick.notice.mapper.*;
import quick.notice.service.*;

// 프레임워크에 탑재된 기능 가져오기
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

// 자바 가지고 있는 내장 모듈
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Iterator;

@RestController // restApi를 작성할 수 있는 컨트롤러
@RequestMapping("/api") // url을 api로 지정
@CrossOrigin(origins="*", allowedHeaders="*") // cors허용
public class UserController {

  private UserMapper userMapper;
  private Bcrypt bcrypt;
  private JWTManager jwt;

  public UserController(UserMapper userMapper, JWTManager jwt, Bcrypt bcrypt) {
    this.userMapper = userMapper;
    this.bcrypt = bcrypt;
    this.jwt = jwt;
  }

  // signup
  @PostMapping("/signup") 
  public ResponseEntity<Map<String,String>> SignUp(@RequestBody User req)  {
    try{
      String hashpassword = bcrypt.HashPassword(req.getPassword());
      req.setPassword(hashpassword);
      userMapper.Create(req);
      Map<String,String> map = new HashMap<>();
      map.put("result", "success");
      return new ResponseEntity<>(map, HttpStatus.OK);
    }catch(Exception e){
      Map<String,String> map = new HashMap<>();
      map.put("result", e.toString());
      return new ResponseEntity<>(map, HttpStatus.OK);
    }
  }

    // CheckId
    @PostMapping("/idcheck") 
    public ResponseEntity<Map<String,String>> CheckId(@RequestBody User req)  {
      try{
        User user = new User();
        user = userMapper.findOne(req.getUser_id());
        Map<String,String> map = new HashMap<>();
        if (user != null) {
          map.put("result", "이미 중복된 아이디가 있습니다.");
        return new ResponseEntity<>(map, HttpStatus.OK);
          } else {
            map.put("result", "사용할 수 있는 아이디입니다.");
            return new ResponseEntity<>(map, HttpStatus.OK);    
          }
      }catch(Exception e){
        Map<String,String> map = new HashMap<>();
        map.put("result", e.toString());
        return new ResponseEntity<>(map, HttpStatus.OK);
      }
    }

}