package quick.notice.quicknotice;

import quick.notice.models.*;
import quick.notice.service.*;
import quick.notice.controller.ExController;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; //컴포넌트 스캔 안하면 컨트롤러 못 읽음

@MappedTypes(User.class)
@MapperScan("quick.notice.mapper")
@SpringBootApplication
@ComponentScan(basePackageClasses={ExController.class, Bcrypt.class, JWTManager.class}) //컨트롤러 읽기
public class QuicknoticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuicknoticeApplication.class, args);
	}

}
