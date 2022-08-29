package com.portfolio.dsendra.Dto;

import javax.validation.constraints.NotBlank;


public class dtohys_actitud {
    @NotBlank
    private int porcentualE;
    
    
      

    public dtohys_actitud() {  
    }

    public dtohys_actitud( int porcentualE) {
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
