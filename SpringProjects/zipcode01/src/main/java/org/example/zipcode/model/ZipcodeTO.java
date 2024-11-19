package org.example.zipcode.model;

import lombok.Setter;

@Setter
public class ZipcodeTO {
    private String zipcode;
    private String sido;
    private String gugun;
    private String dong;
    private String ri;
    private String bunji;
    private String seq;

    @Override
    public String toString() {
        return "[우편번호] " +
                "zipcode='" + zipcode + '\'' +
                ", sido='" + sido + '\'' +
                ", gugun='" + gugun + '\'' +
                ", dong='" + dong + '\'' +
                ", ri='" + ri + '\'' +
                ", bunji='" + bunji + '\'' +
                ", seq='" + seq + '\'';
    }
}
