package com.example.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/**
 * @author daFa
 * @create 2019年5月23日08:56:47
 */
@RestController
@RequestMapping("/upload")
@Slf4j
public class DemoController {

    /**
     * 简单上传文件
     * localhost:1999/upload/
     * @param file
     */
    @PostMapping("/")
    public Mono upload(@RequestPart("file") FilePart file) throws IOException {
        Path tempFilePath = Files.createTempFile("", file.filename());
        file.transferTo(tempFilePath.toFile());
        File tempFile = new File(tempFilePath.toString());
        return Mono.just(tempFile.toString());
    }

}
