package com.example.springbootdeveploper.repository;

import com.example.springbootdeveploper.service.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
