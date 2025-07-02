package com.pknu.backboard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pknu.backboard.entity.Board;
import com.pknu.backboard.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

//어노테이션 있는 것들은 각각 패키지 모듈 만들기 
@Service
@RequiredArgsConstructor
public class BoardService {

  @Autowired
  private final BoardRepository boardRepository;

  // SELECT * FROM board
  public List<Board> getBoardList() {
    return this.boardRepository.findAll(); // SELECT *
  }

  // SELECT * FROM board WHERE bno = ?
  public Board getBoardOne(Long bno) {
    Optional<Board> opBoard = this.boardRepository.findById(bno);
    if (opBoard.isPresent()) {
      return opBoard.get();
    } else {
      throw new RuntimeException("board not found");
    }
  }
}
