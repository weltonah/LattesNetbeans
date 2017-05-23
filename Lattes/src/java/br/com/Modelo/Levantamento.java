package br.com.Modelo;

import java.util.ArrayList;

public class Levantamento {
    private String tipoObra;
    private float totalValor;
    private ArrayList<Obras> obra;
    private int valida;
    private float valorItem;
    
    public Levantamento(){
            obra = new ArrayList<Obras>();
            this.valida = 0;
    }

    public String getTipoObra() {
            return tipoObra;
    }
    public void setTipoObra(String tipoObra) {
            this.tipoObra = tipoObra;
    }
    public float getTotalValor() {
            return totalValor;
    }
    public void setTotalValor(float totalValor) {
            this.totalValor = totalValor;
    }
    public ArrayList<Obras> getAgenda() {
            return obra;
    }
    public void AddObra(Obras obras){
            if( (obras.getValor() == 0) || (!obras.isValido()) ){
                this.obra.add(obras);
            }else{
                this.valida++;
                this.obra.add(obras);
            }
    }
    public void setAgenda(ArrayList<Obras> Obras) {
            this.obra = Obras;
    }
    public int getValida() {
        return valida;
    }
    public void setValida(int valida) {
        this.valida = valida;
    }
    public float getValorItem() {
        return valorItem;
    }

    public void setValorItem(float valorItem) {
        this.valorItem = valorItem;
    }
        
}
