package test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("test.mapper")
@SpringBootApplication
public class JavaGetFinInforApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaGetFinInforApplication.class, args);
    }

}
