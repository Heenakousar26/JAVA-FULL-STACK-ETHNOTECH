package org.reservix.votingcalc.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.reservix.votingcalc.Repo.VRepo;
import org.reservix.votingcalc.entity.VEntity;

@Service
public class VService {

    @Autowired
    private VRepo repo;

    public VEntity storeData(VEntity v){
        if(v.getAge()>=18){
            v.setEligible(true);
        }
        return repo.save(v);
    }

}