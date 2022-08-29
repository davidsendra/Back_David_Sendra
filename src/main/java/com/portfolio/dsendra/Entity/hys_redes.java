package com.portfolio.dsendra.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    
    @Entity
public class hys_redes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int porcentualE;
    
    //contrucctores

    public hys_redes() {
    }

    public hys_redes( int porcentualE) {
        this.porcentualE = porcentualE;
    }

    //geteres and seters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPorcentualE() {
        return porcentualE;
    }

    public void setPorcentualE(int porcentualE) {
        this.porcentualE = porcentualE;
    }
    
    
}
