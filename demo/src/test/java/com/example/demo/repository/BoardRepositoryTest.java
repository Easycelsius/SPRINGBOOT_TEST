package com.example.demo.repository;

import java.util.stream.IntStream;

import com.example.demo.entity.Board;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardRepositoryTest {
    /* 
        insert -> save(엔티티 객체)
        select -> findById(키 타입), getOne(키 타입)
        update -> save(엔티티 타입)
        delete -> deleteById(키 타입), delete(엔티티 객체)
    */

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void testInsertDummies(){
        IntStream.rangeClosed(1,100).forEach(i->{
            Board board = Board.builder().title("Sample..."+i).build();
            boardRepository.save(board);
        });
    }
}
