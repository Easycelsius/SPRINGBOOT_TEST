package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;
import com.example.demo.repository.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.log4j.Log4j2;

@Service("boardService")
@Transactional
@Log4j2
public class BoardServiceImpl implements  BoardService {
    
    @Autowired
	private BoardRepository boardDAO;

    // 저장
    public void saveBoard(BoardDTO boardDTO){
        
        log.info("게시물 저장 시작");
        
        // 언제 사용?
        // BoardDTO dto = BoardDTO.builder()
        //                     .title(boardDTO.getTitle())
        //                     .name(boardDTO.getName())
        //                     .content(boardDTO.getContent())
        //                     .build();
        
        Board board = Board.builder().title(boardDTO.getTitle())
                            .writer(boardDTO.getWriter())
                            .content(boardDTO.getContent())
                            .build();

        Board result = boardDAO.save(board);
        log.info("게시물 저장 마무리 / " + result);
    }

    // 수정
    public void updateBoard(BoardDTO boardDTO){

    }

    // 글 삭제
    public void deleteBoard(BoardDTO boardDTO){

    }

    // 글 상세 조회
    public void getBoard(BoardDTO boardDTO){

    }

    // 글 목록 조회
    public List<Board> getBoardList(BoardDTO boardDTO){
        log.info("글 목록 조회");
        return boardDAO.findAll();
    }
}
