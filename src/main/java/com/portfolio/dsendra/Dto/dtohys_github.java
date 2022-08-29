package com.portfolio.dsendra.Dto;

import javax.validation.constraints.NotBlank;


public class dtohys_github {
    @NotBlank
    private int porcentualE;
    
    
      

    public dtohys_github() {  
    }

    public dtohys_github( int porcentualE) {
        this.porcentualE = porcentualE;
    }
    
    //seter y geter

    public int getPorcentualE() {
        return porcentualE;
    }

    public void setPorcentualE(int porcentualE) {
        this.porcentualE = porcentualE;
    }
    
    
    
    
    
}
