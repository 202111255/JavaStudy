package org.example.di04;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class BoardListTO {
    private ArrayList<String> userLists;
    private ArrayList<BoardTO> boardLists;
}