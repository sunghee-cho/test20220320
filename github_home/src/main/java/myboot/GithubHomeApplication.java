package myboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubHomeApplication.class, args);
		System.out.println("깃헙부트실행");
		System.out.println("수정후 깃헙 푸쉬");
		System.out.println("내가 또 수정후 깃헙 푸쉬");
	}

}
