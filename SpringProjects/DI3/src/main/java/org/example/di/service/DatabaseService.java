package org.example.di.service;

import org.example.di.model.DatabaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class DatabaseService {

    @Autowired
    @Qualifier("oracle")
    private DatabaseDAO databaseDAO;

    public List<String> getList() {
        return databaseDAO.list();
    }
}
