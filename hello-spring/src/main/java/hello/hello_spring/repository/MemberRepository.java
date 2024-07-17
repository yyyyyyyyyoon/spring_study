package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.Optional;
import java.util.List;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name); //Optional로 감싸서 null 반환
    List<Member> findAll();
}
