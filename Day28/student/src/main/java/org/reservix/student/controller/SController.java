package org.reservix.student.controller;



import org.reservix.student.service.SService;
import org.reservix.student.entity.SEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SController {
    @Autowired
    private SService ser;

    @PostMapping("/get")
    public SEntity add(@RequestBody SEntity s)
    {
        return ser.store(s);
    }
    @GetMapping("/getAll")
    public List< SEntity> getAll()
    {
        return ser.getAll();
    }
    @GetMapping("/id")
    public SEntity get(int id)
    {
        return ser.getId(1);
    }

}