package com.portfolio.dsendra.Dto;

import javax.validation.constraints.NotBlank;


public class dtohys_jscript {
    @NotBlank
    private int porcentualE;
    
    
      

    public dtohys_jscript() {  
    }

    public dtohys_jscript( int porcentualE) {
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
