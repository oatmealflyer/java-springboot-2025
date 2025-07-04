package com.pknu.backboard.entity;

import java.time.LocalDateTime;
import java.util.List;

// import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

// Java에 동일한 패키지에서 많이 추가되면 * 로 생략 가능 
import jakarta.persistence.*;
import lombok.*;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import lombok.Getter;
// import lombok.Setter;

@Getter
@Setter // 롬복으로 Gettter/ Setter 자동화
@Entity // JPA 테이블 매핑 선언
@AllArgsConstructor
@NoArgsConstructor
@Builder //객체 생성을 간단하게, 체인메서드 사용가능 
public class Board {
  @Id // PK
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long bno; // Board 테이블의 PK, bno

  // @Column(name = "subject", length = 250)
  @Column(length = 250)
  private String title; // 게시판 제목

  @Column(length = 8000)
  private String content; // 게시글 내용

  //작성자 추가 
  @ManyToOne //사용자가 여러개의 글을 작성 가능 
  private Member writer; 

  @CreatedDate
  @Column(updatable = false) // 한번 작성후 수정하지 않음
  private LocalDateTime createDate; // 게시글 작성일

  @LastModifiedDate
  private LocalDateTime modifyDate; // 게시글 수정일

  // ERD 1:N를 만드는 법
  @OneToMany(mappedBy = "board", cascade = CascadeType.REMOVE) // 부모가 날라갔는데 자식도 날라가야지
  private List<Reply> replyList; // 같은 패키지 Entity 내에 들어있으니 별 문제 없죠

}
