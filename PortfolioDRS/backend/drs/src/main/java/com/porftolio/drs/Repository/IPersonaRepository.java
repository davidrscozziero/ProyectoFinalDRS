
package com.porftolio.drs.Repository;

import com.porftolio.drs.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
