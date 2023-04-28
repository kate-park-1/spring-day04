package spring.mvcex.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Controller <-> View
@Getter
@Setter
public class MemberDTO {
  private Long id;
  private String username;
  private int age;
}
