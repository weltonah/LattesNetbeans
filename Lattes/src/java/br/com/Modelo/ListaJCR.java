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
    private int size;


    public ListaJCR(ArrayList<FatorImpacto> Fi) {
        this.Fi = new ArrayList<FatorImpacto>();
    }
    
    public ArrayList<FatorImpacto> getFi() {
        return Fi;
    }

    public void setFi(ArrayList<FatorImpacto> Fi) {
        this.Fi = Fi;
    }
}
