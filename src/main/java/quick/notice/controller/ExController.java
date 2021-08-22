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
public class ExController {

  private UserMapper userMapper;
  private Bcrypt bcrypt;
  private JWTManager jwt;

  public ExController(UserMapper userMapper, JWTManager jwt, Bcrypt bcrypt) {
    this.userMapper = userMapper;
    this.bcrypt = bcrypt;
    this.jwt = jwt;
  }

  // create
  @PostMapping("/user") 
  public ResponseEntity<Map<String,String>> CreateUser(@RequestBody User req) {
    String hashpassword = bcrypt.HashPassword(req.getPassword());
    req.setPassword(hashpassword);
    userMapper.Create(req);
    Map<String,String> map = new HashMap<>();
    map.put("result", "success");

    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  // read
  @GetMapping("/users")
  public List<User> AllUser() {
    return userMapper.findAll();
  }

  @PostMapping("/login")
  public ResponseEntity<Map<String, String>> Login(@RequestBody ReqUser req) {
    User user = new User();
    user = userMapper.findOne(req.getId());
    Boolean result = bcrypt.CompareHash(req.getPassword(), user.getPassword());
    Map<String,String> map = new HashMap<>();

    if (result) {
      String token = jwt.CreateToken(user.getId());

      map.put("result", token);
      return new ResponseEntity<>(map, HttpStatus.OK);
      } else {
          map.put("result", "password is not correct");
          return new ResponseEntity<>(map, HttpStatus.OK);        
      }
  }

  // update
  @PostMapping("/update") 
  public ResponseEntity<Map<String,String>> UpdateUser(@RequestBody User req) {
    userMapper.Update(req);
    
    Map<String,String> map = new HashMap<>();
    map.put("result", "success");

    return new ResponseEntity<>(map, HttpStatus.OK);
  }

  // delete
  @PostMapping("/delete") 
  public ResponseEntity<Map<String,String>> DeleteUser(@RequestBody User req) {
    userMapper.Delete(req);
    
    Map<String,String> map = new HashMap<>();
    map.put("result", "success");

    return new ResponseEntity<>(map, HttpStatus.OK);
  }


  @GetMapping("/hello") // get /api/hello
  public ResponseEntity<Map<String,String>> Hello() { // ResponseEntity 리턴타입 Map 키와 값을 하나의 쌍으로 저장
    Map<String,String> map = new HashMap<>(); // map 선언, HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션
    map.put("result", "hello world"); // map에 값 넣기

    return new ResponseEntity<>(map, HttpStatus.OK); // 생성자로 ResponseEntity를 만들어서 map이랑 status클라이언트에 보내줌
  }

}