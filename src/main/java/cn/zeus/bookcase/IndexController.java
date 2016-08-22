package cn.zeus.bookcase;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvzimou on 16-8-19.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    String home() {
        return "Welcome to Bookcase!";
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    String app() {
        return "Bookcase update!";
    }

}
