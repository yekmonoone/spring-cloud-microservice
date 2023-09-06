package com.springcloudmicroservice.accountservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    @Value("${springcloud.cassandra.keyspace.name}")
    private String keyspaceName;

    @Value("${springcloud.cassandra.contact-points}")
    private String contactPoint;

    @Value("${springcloud.cassandra.port}")
    private int port;


    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    protected int getPort() {
        return port;
    }

    @Override
    protected String getContactPoints() {
        return contactPoint;
    }
}
