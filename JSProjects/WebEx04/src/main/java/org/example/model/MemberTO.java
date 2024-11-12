package org.example.model;


import lombok.*;

//@Getter
//@RequiredArgsConstructor
//@ToString
@Data
public class MemberTO {
    @NonNull String deptno;
    @NonNull String dname;
    String loc;
}
