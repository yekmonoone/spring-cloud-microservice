package com.springcloudmicroservice.accountservice.repository;

import com.springcloudmicroservice.accountservice.entity.Account;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories
public interface AccountRepository extends CassandraRepository<Account, String> {

}
