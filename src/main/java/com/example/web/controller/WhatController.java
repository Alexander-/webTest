package com.example.web.controller;

import com.example.web.WebApplication;
import com.example.web.book.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class WhatController
{
    Logger log = LogManager.getLogger(WhatController.class);

    @GetMapping("/asd")
    String what()
    {
        log.info("/asd");
        return "asdf";

    }


    @GetMapping(value = "/object" )
    Book object()
    {
        log.info("/object");
        ArrayList ok = new ArrayList();
        ok.add("asdf");
        ok.add("wer");
        Book book = new Book("ok", 20, LocalDateTime.now(), ok);
        return book;
    }

    @GetMapping("/throw")
    @ResponseBody String ok() throws Exception {
        log.info("/throw");
        throw new Exception("asd");

    }

    @ExceptionHandler({ Exception.class })
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String handleException() {
        return "some error";
    }
}
