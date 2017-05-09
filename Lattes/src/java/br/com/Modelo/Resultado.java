package br.com.Modelo;

import java.util.ArrayList;

public class Resultado {
	private String fileName;
	private String nomeCompleto;
	private float totalCrit;
	private float totalValor;
	private String resumoCV;
	private String atualizacao;
	private String Lattes;
	private ArrayList<Levantamento> levante;
	
	public Resultado(){
		levante = new ArrayList<Levantamento>();
	}
	public float getTotalCrit() {
		return totalCrit;
	}
	public void setTotalCrit(float totalCrit) {
		this.totalCrit = totalCrit;
	}
	public void someTotal(float i){
		this.totalValor = totalValor +i;
	}
	public float getTotalValor() {
		return totalValor;
	}
	public void setTotalValor(float totalValor) {
		this.totalValor = totalValor;
	}
	public ArrayList<Levantamento> getObras() {
		return levante;
	}
	public void AddLevante(Levantamento leve){
		levante.add(leve);
	}
	public void setObras(ArrayList<Levantamento> obras) {
		levante = obras;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getResumoCV() {
		return resumoCV;
	}
	public void setResumoCV(String resumoCV) {
		this.resumoCV = resumoCV;
	}
	public ArrayList<Levantamento> getLevante() {
		return levante;
	}
	public void setLevante(ArrayList<Levantamento> levante) {
		this.levante = levante;
	}
	public String getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
	}
	public String getLattes() {
		return Lattes;
	}
	public void setLattes(String lattes) {
		Lattes = lattes;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	
}
