package org.example.di.model;

import java.util.Arrays;
import java.util.List;

public class MySQLDatabaseDAO implements DatabaseDAO{

    @Override
    public List<String> list() {
        return Arrays.asList("홍길동 1", "박문수 1");
    }
}
