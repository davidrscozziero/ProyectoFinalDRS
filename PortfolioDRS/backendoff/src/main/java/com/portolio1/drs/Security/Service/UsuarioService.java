
package com.portolio1.drs.Security.Service;

import com.portolio1.drs.Security.Entity.Usuario;
import com.portolio1.drs.Security.Repository.iUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository isuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return isuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return isuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return isuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        isuarioRepository.save(usuario);
    }
}
