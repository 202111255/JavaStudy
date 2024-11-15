package org.example.di04;

public class WriteAction {
    private BoardTO to;

    public WriteAction(BoardTO to) {
        System.out.println("WriteAction 생성자 호출");
        this.to = to;
    }

    public void execute() {
        System.out.println("execute() 호출 : " + this.to);
    }
}
