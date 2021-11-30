package com.wjb.wiki;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * @author Administrator
 */
@SpringBootApplication
public class WikiApplication {
    private static final Logger LOG=LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(WikiApplication.class);
        Environment environment= app.run(args).getEnvironment();
        LOG.info("启动成功");
    }

}
