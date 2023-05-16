
package com.portfolio.aaf.Security.Service;

import com.portfolio.aaf.Security.Entity.Rol;
import com.portfolio.aaf.Security.Enums.RolNombre;
import com.portfolio.aaf.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//transactional para persistencia de datos por cuakquier problema de conexion
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
