/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

/**
 *
 * @author USUARIO
 */
public class FatorImpacto {
    private String name;
    private String issn;
    private float impacto;

    public FatorImpacto() {
        impacto = -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public float getImpacto() {
        return impacto;
    }

    public void setImpacto(float impacto) {
        this.impacto = impacto;
    }
    
}
