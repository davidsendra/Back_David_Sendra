package com.portfolio.dsendra.Repository;
import com.portfolio.dsendra.Entity.hys_java;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rhys_java extends JpaRepository<hys_java , Integer>{
    public Optional<hys_java> findByPorcentualE (int porcentualE);
    public boolean existsByPorcentualE (int porcentualE);
    
}
