package org.reservix.calculator.controller;

import org.reservix.calculator.entity.addEntity;
import org.reservix.calculator.repo.calcrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addcontroller {

    @Autowired
    private calcrepo repo;

    @PostMapping("/add")
    public addEntity add(@RequestBody addEntity en)
    {
        en.setOp("ADD");
        en.setResult(en.getNum1()+en.getNum2());
         return repo.save(en);
    }
}
