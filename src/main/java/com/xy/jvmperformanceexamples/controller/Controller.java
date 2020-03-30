package com.xy.jvmperformanceexamples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;

/**
 * About JVM performance simulate case.
 *
 * @author rhyme
 * @date 2020年3月29日 19:52:14
 */
@RestController
public class Controller {

    /**
     * 死循环，CPU利用率近乎100%
     */
    @GetMapping("/cpu-100")
    public void endlessLoop() {
        while (true) {

        }
    }

    /**
     * 创建1024000个大小为1kb的文件,测试I/O的write
     */
    @GetMapping("/io-tough")
    public void ioTough() throws IOException {
        final int kb = 1024;
        final int fileCount = 1024000;

        for (int i = 0; i < fileCount; i++) {
            String pathname = "/tmp/iotest/" + Instant.now().toEpochMilli() + ".txt";
            File file = new File(pathname);
            try (FileOutputStream fileOutputStream = new FileOutputStream(file);) {
                // 每次输入1 byte，循环1024次
                for (int j = 0; j < kb; j++) {
                    fileOutputStream.write(new byte[1]);
                }
                fileOutputStream.flush();
            }
        }
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }
}
