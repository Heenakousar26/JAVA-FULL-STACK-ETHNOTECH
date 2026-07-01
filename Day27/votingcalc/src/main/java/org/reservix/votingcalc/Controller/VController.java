package org.reservix.votingcalc.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.reservix.votingcalc.Service.VService;
import org.reservix.votingcalc.entity.VEntity;

@RestController
public class VController {
    @Autowired
    private VService ser;

    @PostMapping("/add")
    public VEntity add(@RequestBody VEntity v){
        return ser.storeData(v);
    }
}