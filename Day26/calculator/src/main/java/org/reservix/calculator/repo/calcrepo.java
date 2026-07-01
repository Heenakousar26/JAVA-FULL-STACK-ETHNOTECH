package org.reservix.calculator.repo;


import org.reservix.calculator.entity.addEntity;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface calcrepo extends JpaRepository<addEntity,Integer>{

    }
