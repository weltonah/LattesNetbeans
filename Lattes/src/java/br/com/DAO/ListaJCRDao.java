/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.Modelo.FatorImpacto;
import br.com.Modelo.ListaJCR;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author USUARIO
 */
public class ListaJCRDao {
    private ListaJCR jcr;
    
    public ListaJCRDao(File serverFile) throws IOException  {
        jcr = new ListaJCR();
        System.out.println(serverFile.exists());
        BufferedReader br = null;int i =0;
        br = new BufferedReader(new FileReader(serverFile));
        String line;
        String cvsSplitBy = ";";line = br.readLine();
        while ((line = br.readLine()) != null) {
            String[] linha = line.split(cvsSplitBy);
            FatorImpacto factor = new FatorImpacto();
            factor.setName(linha[0]);
            factor.setIssn(linha[1]);
            if(linha[2].equals("Not Available")){
                factor.setImpacto(-1);
            }else{
            float aux = Float.parseFloat(linha[2]);
                factor.setImpacto(aux);
            }
            jcr.addJCR(factor);
            //System.out.println("Nome " + factor.getName()
            //        + " ISSN =" + factor.getIssn() + " fator =" + factor.getImpacto() + "int i = " + i);
            i++;
        }
        System.out.println(jcr.getSize());
        br.close();
    }
    public float buscaFI(int ISSN){
        float fi =-1;
        
        
        
        return fi;
    }
    
}
