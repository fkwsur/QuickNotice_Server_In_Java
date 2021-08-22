package quick.notice.service;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Bcrypt {

  public String HashPassword(String password) {

    BCryptPasswordEncoder ecnoder = new BCryptPasswordEncoder();
    String hash = ecnoder.encode(password);
    return hash;
  }

  public Boolean CompareHash(String password, String DBpassword) {

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    if (encoder.matches(password, DBpassword)) {
      return true;
    } else {
      return false;
    }
  }


}