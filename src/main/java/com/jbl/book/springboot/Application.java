package com.jbl.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// SpringBootApplication으로 스프링 부트의 자동 설정,
// Bean 읽기와 생성을 모두 자동으로 설정
// springbootapplication annotation의 위치부터 설정을 읽어 가기 때문에 이 클래스는 항상 프로젝트 최상단
//@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 아래의 소스로 내장 WAS 동작
        // 외부 WAS를 두지 않고 내장 WAS를 실행 톰캣을 설치할 필요가 없게 되고, 스프링 부트로 만들어진
        // JAR(실행 가능한 Java 패키징 파일)로 실행 하면 됨
        // 내장 WAS를 권장하는 이유는 "언제 어디서나 같은 환경에서 스프링 부트 배포가 가능"
        SpringApplication.run(Application.class, args);
    }
}
