package org.myself;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author haoxinlei
 */
@Slf4j
@SpringBootApplication
//@MapperScan("org.myself.code.Mapper")
public class InitClass {

    public static void main(String[] args) {
        SpringApplication.run(InitClass.class);
        log.info("服务启动成功");

        log.info("开始加载环境变量");

        log.info("完成加载环境变量");

    }

}