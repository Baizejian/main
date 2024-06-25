package com.bai.baseback.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
@Data
public class User {
    /**
     * id
     */
    @Id
    private int id;

    /**
     * username
     */
    private String userName;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
