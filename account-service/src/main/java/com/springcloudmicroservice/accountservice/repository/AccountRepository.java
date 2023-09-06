package com.springcloudmicroservice.accountservice.repository;

import com.springcloudmicroservice.accountservice.entity.Account;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<Account, String> {

}
