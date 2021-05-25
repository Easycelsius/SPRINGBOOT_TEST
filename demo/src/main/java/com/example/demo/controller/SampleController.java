package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class SampleController {

    @RequestMapping("/board.do")
    public String insertBoard() {
        log.info("board.do 요청");
        return "views/insertBoard";
    }

    @RequestMapping("/saveBoard.do")
    public String saveBoard() {
        log.info("saveBoard.do 요청");
        return "views/getBoardList";
    }

    @RequestMapping("/getBoardList.do")
    public String getBoardList() {
        log.info("saveBoard.do 요청");
        return "views/getBoardList";
    }

    
}
