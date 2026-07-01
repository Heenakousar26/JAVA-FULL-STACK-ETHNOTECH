package org.reservix.student.repo;



import org.reservix.student.entity.SEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SRepo extends JpaRepository<SEntity,Integer>{
    public SEntity findById(int id);
}