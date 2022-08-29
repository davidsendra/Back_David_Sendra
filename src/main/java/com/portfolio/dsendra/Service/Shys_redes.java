package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_redes;
import com.portfolio.dsendra.Repository.Rhys_redes;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_redes {
    @Autowired
    Rhys_redes rhys_redes ;  //aqui creamo la variable rhys_redes
    
    public List<hys_redes> list(){
        return rhys_redes.findAll();
    }
    
    public Optional<hys_redes> getOne(int id){
        return rhys_redes.findById (id);
    }
    
    public Optional<hys_redes> getByPorcentualE(int porcentualE){
        return rhys_redes.findByPorcentualE(porcentualE);
    }
    public void save (hys_redes redes){  // aqui creo variable redes
        rhys_redes.save (redes);
    }
    
    public void delete (int id){  // aqui creo variable redes
        rhys_redes.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_redes.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_redes.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
