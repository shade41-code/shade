package com.baozun.shade.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User implements Serializable{
    
    private static final long serialVersionUID = -6249397911566315813L;

    @Id
    @GeneratedValue
    private Integer id;
    
    @Column
    private String username;
    
    @Column
    private String password;
    
    private Date birthday;

}