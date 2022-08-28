package com.portfolio.dsendra.Dto;

import javax.validation.constraints.NotBlank;


public class dtohys_java {
    @NotBlank
    private int porcentualE;
    
    
      

    public dtohys_java() {  
    }

    public dtohys_java( int porcentualE) {
        this.porcentualE = porcentualE;
    }
    
    

    public int getPorcentualE() {
        return porcentualE;
    }

    public void setPorcentualE(int porcentualE) {
        this.porcentualE = porcentualE;
    }
    
    
    
    
    
}
