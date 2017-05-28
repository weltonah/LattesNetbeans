/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ListaJCR {
    private ArrayList<FatorImpacto> Fi;
    
    public ListaJCR() {
        this.Fi = new ArrayList<FatorImpacto>();
    }
    
    public void addJCR(FatorImpacto factor){
       Fi.add(factor);
    }
    public FatorImpacto SelectJCR (int index){
        return Fi.get(index);
    }

    
    
    public ArrayList<FatorImpacto> getFi() {
        return Fi;
    }

    public void setFi(ArrayList<FatorImpacto> Fi) {
        this.Fi = Fi;
    }

    public int getSize() {
        return Fi.size();
    }
}
