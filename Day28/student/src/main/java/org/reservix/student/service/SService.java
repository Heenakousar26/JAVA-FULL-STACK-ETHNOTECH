package org.reservix.student.service;



import org.reservix.student.entity.SEntity;
import org.reservix.student.repo.SRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SService {

    @Autowired
    private SRepo repo;

    public SEntity store(SEntity e)
    {
        if(e.getAge()>0)
        {
            return repo.save(e);
        }
        return null;
    }
    public List<SEntity> getAll()
    {
        return repo.findAll();

    }
    public SEntity getId(int id){
        return repo.findById(id);
    }
}