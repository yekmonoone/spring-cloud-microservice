package com.springcloudmicroservice.accountservice.entity;


import lombok.*;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Table("accounts")
public class Account implements Serializable {

    @PrimaryKey
    private String id = UUID.randomUUID().toString();

    @Setter
    @Column("uname")
    private String username;

    @Setter
    @Column("email")
    private String email;

    @Setter
    @Column("pwd")
    private String password;

    @Column("created_at")
    private Date created_at;

    @Column("is_active")
    private boolean active;

}