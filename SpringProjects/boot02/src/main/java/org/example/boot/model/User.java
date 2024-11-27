package org.example.boot.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public class User {
    @Value("${user.name}")
    private String fullname;
    @Value("${user.age}")
    private int age;
}
