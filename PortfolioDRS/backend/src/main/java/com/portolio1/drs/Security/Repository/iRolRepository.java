
package com.portolio1.drs.Security.Repository;

import com.portolio1.drs.Security.Entity.Rol;
import com.portolio1.drs.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
    
}
