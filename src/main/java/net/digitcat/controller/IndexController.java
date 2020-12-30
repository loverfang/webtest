package net.digitcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public String say(){
       return "{\"code\":200}";
    }
}
