package org.example.model2;

public class WriteAction {
    private BoardTO to;

    public WriteAction() {
        System.out.println("WriteAction() 생성자 호출");
        this.to = new BoardTO();
    }

    public WriteAction(BoardTO to) {
        System.out.println("WriteAction(BoardTO to) 생성자 호출");
        this.to = to;
    }

    public void execute() {
        System.out.println("execute() 호출: " +to);
    }
}
