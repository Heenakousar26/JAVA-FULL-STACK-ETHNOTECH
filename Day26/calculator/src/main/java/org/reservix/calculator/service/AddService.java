package org.reservix.calculator.service;

import org.reservix.calculator.entity.addEntity;
import org.reservix.calculator.repo.calcrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddService {

    @Autowired
    private calcrepo.Calcrepo repo;

    public addEntity add(addEntity en){
        en.setResult(en.getNum1()+ en.getNum2());
      return repo.save(en);



    }


}
