package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_jscript;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_jscript extends JpaRepository<hys_jscript , Integer>{
    public Optional<hys_jscript> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
