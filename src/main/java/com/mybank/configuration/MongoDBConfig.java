package com.mybank.configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by mmazigh on 22/04/2015.
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.mybank.repository")
@PropertySource(value = "classpath:mongo-config.properties")
public class MongoDBConfig extends AbstractMongoConfiguration{

    @Value("${MONGO_DB_HOST}")
    private String MONGO_DB_HOST;

    @Value("${MONGO_DB_PORT}")
    private int MONGO_DB_PORT;

    @Value("${DB}")
    private String DB;

    @Override
    protected String getDatabaseName() {
        return DB;
    }

    @Bean
    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(MONGO_DB_HOST,MONGO_DB_PORT);
    }
}
