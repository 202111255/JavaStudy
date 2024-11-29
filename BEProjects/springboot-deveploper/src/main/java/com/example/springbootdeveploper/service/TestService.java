package com.example.springbootdeveploper.service;

import com.example.springbootdeveploper.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
}

