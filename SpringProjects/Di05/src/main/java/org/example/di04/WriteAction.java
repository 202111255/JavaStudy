package org.example.di04;

public class WriteAction {
    private BoardTO to;

    public WriteAction() {
        System.out.println("WriteAction() 호출");
    }

    public WriteAction(BoardTO to) {
        System.out.println("WriteAction(BoardTO to) 호출");
        this.to = to;
    }
}
