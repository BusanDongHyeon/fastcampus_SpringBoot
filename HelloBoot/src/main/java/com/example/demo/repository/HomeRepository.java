package com.example.demo.repository;

import com.example.demo.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Member, Long> {

    /*public class EntityManagerFactory implements HomeRepository{
     public List<Member> findAll(){
        SQL="slelect * from member";
        return "전체회원목록"
    }
    }*/
}
