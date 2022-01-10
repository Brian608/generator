package org.feather;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: generator
 * @description:
 * @author: 杜雪松(feather)
 * @since: 2022-01-10 23:06
 **/
@SpringBootApplication
@MapperScan("org.feather.mapper")
public class GeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(GeneratorApplication.class,args);
    }
}
