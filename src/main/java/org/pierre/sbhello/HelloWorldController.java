package org.pierre.sbhello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("world")
    String helloWorld() {
        return "Hello World - v4!";
    }

}
