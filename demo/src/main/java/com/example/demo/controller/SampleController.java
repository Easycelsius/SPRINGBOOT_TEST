package com.example.demo.controller;

import com.example.demo.dto.BoardDTO;
import com.example.demo.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class SampleController {

    @Autowired
	BoardService boardService;

    @RequestMapping(value = {"/board.do", "/insertBoard.do"})
    public String insertBoard() {
        log.info("board.do 요청");
        return "views/insertBoard";
    }

    @RequestMapping("/saveBoard.do")
    public String saveBoard(BoardDTO boardDTO) {
        
        log.info("saveBoard.do 요청");
        boardService.saveBoard(boardDTO);
        
        return "redirect:/getBoardList.do";
    }

    @RequestMapping("/getBoardList.do")
    public String getBoardList(Model m) {
        log.info("getBoardList.do 요청");

        // 서비스단으로 내려보내기 위한 의미없는 객체 생성
        BoardDTO boardDTO = new BoardDTO();

        // 모델에 데이터 실어보내기
        m.addAttribute("boardList", boardService.getBoardList(boardDTO));

        return "views/getBoardList";
    }
    
}
