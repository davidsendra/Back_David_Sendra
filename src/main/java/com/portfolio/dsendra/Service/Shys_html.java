package com.portfolio.dsendra.Service;
import com.portfolio.dsendra.Entity.hys_html;
import com.portfolio.dsendra.Repository.Rhys_html;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Shys_html {
    @Autowired
    Rhys_html rhys_html ;  //aqui creamo la variable rhys_html
    
    public List<hys_html> list(){
        return rhys_html.findAll();
    }
    
    public Optional<hys_html> getOne(int id){
        return rhys_html.findById (id);
    }
    
    public Optional<hys_html> getByPorcentualE(int porcentualE){
        return rhys_html.findByPorcentualE(porcentualE);
    }
    public void save (hys_html html){  // aqui creo variable html
        rhys_html.save (html);
    }
    
    public void delete (int id){  // aqui creo variable html
        rhys_html.deleteById (id);
    }
    
   public boolean existsById(int id){
         return rhys_html.existsById(id);
     }
     
     public boolean existsByPorcentualE(int porcentualE){  // nombreE
         return rhys_html.existsByPorcentualE(porcentualE);   // nombreE
     }
}
    
