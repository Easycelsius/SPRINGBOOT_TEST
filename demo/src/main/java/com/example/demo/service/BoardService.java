package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BoardDTO;
import com.example.demo.entity.Board;

public interface BoardService {
    
    // 저장
    void saveBoard(BoardDTO boardDTO);

    // 수정
    void updateBoard(BoardDTO boardDTO);

    // 글 삭제
    void deleteBoard(BoardDTO boardDTO);

    // 글 상세 조회
    void getBoard(BoardDTO boardDTO);

    // 글 목록 조회
    List<Board> getBoardList(BoardDTO boardDTO);
}
