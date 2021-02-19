package io.github.tanghuibo.javaopensreamtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghuibo
 * @date 2021/2/19下午9:03
 */
@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("test")
    public String test(@RequestParam("timeout") Integer timeout) throws InterruptedException {
        Thread.sleep(timeout);
        return "ok";
    }
}
