package com.portfolio.dsendra.Dto;

import javax.validation.constraints.NotBlank;


public class dtohys_html {
    @NotBlank
    private int porcentualE;
    
    
      //Constructores

    public dtohys_html() { // uno vacio 
    }

    public dtohys_html( int porcentualE) {
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
