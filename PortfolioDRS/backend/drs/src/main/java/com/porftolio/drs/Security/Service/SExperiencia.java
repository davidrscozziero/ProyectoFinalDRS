
package com.porftolio.drs.Security.Service;

import com.porftolio.drs.Entity.Experiencia;
import com.porftolio.drs.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;
    
    public List<Experiencia> list() {
    return rExperiencia.findAll();
}
    public Optional <Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }
    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }
    public void save(Experiencia expe){
        rExperiencia.save(expe);
    }
    public void delete(int id){
        rExperiencia.deleteById(id);
    }
    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }
    public boolean exitsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }
}