package cn.zeus.bookcase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvzimou on 16-8-19.
 */
@RestController
public class IndexController {

    @RequestMapping("")
    String home() {
        return "Welcome to Bookcase!";
    }

    @RequestMapping("app")
    String app() {
        return "Bookcase update!";
    }

}
