package com.example.demo.entity.generic;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

/**
 * 
 * @author João Vitor Lopes
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    
    public abstract Integer getId();

    public abstract void setId(Integer id);

}
