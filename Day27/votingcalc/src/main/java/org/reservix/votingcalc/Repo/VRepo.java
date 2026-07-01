package org.reservix.votingcalc.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.reservix.votingcalc.entity.VEntity;

public interface VRepo extends JpaRepository<VEntity,Integer> {

}
