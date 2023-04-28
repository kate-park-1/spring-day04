package spring.mvcex.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// entity , data object , RDB mapping
// table로 매핑될때 달라지는 부분을 정의
// 컬럼 - RDB의 테이블의 컬럼으로 매핑될때 달라지는 부분을 정의
// PK , AI , not null ...
@Getter
@Setter
@AllArgsConstructor
public class Member {
  private Long id;
  private String username;
  private int age;
}
