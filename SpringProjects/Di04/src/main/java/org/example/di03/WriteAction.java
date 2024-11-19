package org.example.di03;

import lombok.Setter;

@Setter
public class WriteAction {
    private BoardTO to;

    public void execute() {
        System.out.println("execute() 호출 : " + this.to);
    }
}
