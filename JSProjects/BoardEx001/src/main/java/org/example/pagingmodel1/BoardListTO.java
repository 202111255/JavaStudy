package org.example.pagingmodel1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class BoardListTO {
    // 페이징에 필요한 요소
    private int cpage;
    private int recordPerPage;
    private int blockPerPage;
    private int totalPage;
    private int totalRecord;
    private int startBlock;
    private int endBlock;

    // 게시판 데이터
    private ArrayList<BoardTO> boardLists;

    public BoardListTO() {
        this.cpage = 1;
        this.recordPerPage = 10;
        this.blockPerPage = 5;
        this.totalPage = 1;
        this.totalRecord = 0;
    }
}
