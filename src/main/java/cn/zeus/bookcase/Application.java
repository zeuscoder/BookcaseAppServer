package cn.zeus.bookcase;

import cn.zeus.bookcase.boot.config.BCBootConfig;
import org.springframework.boot.SpringApplication;

/**
 * Created by lvzimou on 16-8-19.
 */
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BCBootConfig.class, args);
    }
}
