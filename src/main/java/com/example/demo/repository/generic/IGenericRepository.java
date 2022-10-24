package com.example.demo.repository.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.demo.entity.generic.BaseEntity;

@NoRepositoryBean
public interface IGenericRepository<T extends BaseEntity> extends JpaRepository<T, Integer> {
}
