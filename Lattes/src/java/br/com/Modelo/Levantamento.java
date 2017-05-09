package br.com.Modelo;

import java.util.ArrayList;

public class Levantamento {
	private String tipoObra;
	private float totalValor;
	private ArrayList<Obras> obra;
	
	public Levantamento(){
		obra = new ArrayList<Obras>();
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
		this.obra.add(obras);
	}
	public void setAgenda(ArrayList<Obras> Obras) {
		this.obra = Obras;
	}

}
