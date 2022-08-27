package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_html;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_html extends JpaRepository<hys_html , Integer>{
    public Optional<hys_html> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
