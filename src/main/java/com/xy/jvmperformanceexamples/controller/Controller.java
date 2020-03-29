package com.xy.jvmperformanceexamples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * About JVM performance simulate case.
 *
 * @date 2020年3月29日 19:52:14
 * @author rhyme
 */
@RestController
public class Controller {

    /**
     * 死循环
     */
    @RequestMapping("/cpu-100")
    public void endlessLoop(){
        while (true){

        }
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, world!";
    }
}
