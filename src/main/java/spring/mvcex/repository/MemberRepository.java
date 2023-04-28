package spring.mvcex.repository;


import spring.mvcex.domain.Member;

import java.util.List;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long id);
    List<Member> findAll();
}
