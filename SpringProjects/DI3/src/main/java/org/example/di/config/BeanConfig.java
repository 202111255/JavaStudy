package org.example.di.config;

import org.example.di.model.DatabaseDAO;
import org.example.di.model.MySQLDatabaseDAO;
import org.example.di.model.OracleDatabaseDAO;
import org.example.di.service.DatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("mysql")
    public MySQLDatabaseDAO mySQLDatabaseDAO() {
        return new MySQLDatabaseDAO();
    }

    @Bean
    public DatabaseService service() {
        return new DatabaseService();
    }

    @Bean("oracle")
    public OracleDatabaseDAO oracleDatabaseDAO() {
        return new OracleDatabaseDAO();
    }
}
