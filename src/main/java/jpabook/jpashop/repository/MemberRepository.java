package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Member member){
        em.persist(member);
//        return member.getId();
        // 커맨드와 쿼리를 분리하라는 원칙에 의해서 가급적이면 리턴값을 만들지 않고 id 정도만 조회 or void
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}

