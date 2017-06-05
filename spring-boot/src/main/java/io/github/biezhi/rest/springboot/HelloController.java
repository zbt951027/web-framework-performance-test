package io.github.biezhi.rest.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    String hello() {
        return "Hello World";
    }

    @RequestMapping("/helloAsync")
    @ResponseBody
    @Async
    String helloAsync() {
        return "Hello World";
    }
}
