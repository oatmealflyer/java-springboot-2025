package com.pknu.backboard.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pknu.backboard.entity.Board;
import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
  // 부가적인 기능이 더 필요
  Board findByTitle(String title); // 제목으로 검색.

  List<Board> findByTitleLike(String title); // 비슷한 제목으로 검색

  Page<Board> findAll(Pageable pageable); // 페이징 가능한 findAll() 새로 생성

    // 아래의 Query에 적혀있는 쿼리문으로 실행해서 결과를 내겠다는 설명
   // JPA 전용 쿼리
    @Query("select distinct b " + 
          "  from Board b " +
          "  left join Reply r on r.board = b " +   
          " where b.title like %:keyword% " +
          "    or b.content like %:keyword% " +           
          "    or r.content like %:keyword% ")
    // DB Standard 쿼리
    // @Query(value = "select distinct b.* " + 
    //                "  from Board b " +
    //                "  left join Reply r on r.board_bno = b.bno " +   
    //                " where b.title like concat('%', :keyword, '%') " +
    //                "    or b.content like concat('%', :keyword, '%') " +           
    //                "    or r.content like concat('%', :keyword, '%') ", nativeQuery = true)
  Page<Board> findAllByKeyword(@Param("keyword")String keyword,Pageable pageable);

  
}

