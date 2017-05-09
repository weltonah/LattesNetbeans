package br.com.Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author igor
 */
public class Pesquisador implements Comparable<Pesquisador> {

    private String nomeCompleto;
    private String lattes;
    private String resumoCV;
    private Integer pontos = 0;
    private Map<String, Integer> avaliacao;
    private Map<String, Integer> naoComputado;
    private List<Avaliacao> avaliacoes;
    private Integer trabalhosEmEvento;
    private Integer artigosPublicados;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
    private String atualizacao;
    private String fileName;
    private Integer livrosPublicados = 0;
    private Integer capitulosPublicados = 0;
    private int patentesPublicados = 0;
    private int bancasMestrado = 0;
    private int bancasDoutorado = 0;
    private int bancasQualificacao = 0;

    public Pesquisador() {
        avaliacao = new LinkedHashMap<>();
        naoComputado = new LinkedHashMap<>();
        avaliacoes = new ArrayList<>();
    }

    public Pesquisador(String nomeCompleto) {
        this();
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getLattes() {
        return lattes;
    }

    public void setLattes(String lattes) {
        this.lattes = lattes;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Map<String, Integer> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Map<String, Integer> avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getTrabalhosEmEvento() {
        return trabalhosEmEvento;
    }

    public void setTrabalhosEmEvento(Integer trabalhosEmEvento) {
        this.trabalhosEmEvento = trabalhosEmEvento;
    }

    public Integer getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setArtigosPublicados(Integer artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }

    public void setAtualizacao(String dataHora) {
        this.atualizacao = (dataHora);

    }

    public String getAtualizacao() {
        return this.atualizacao;
    }

    public void addAvaliacao(String motivo, Integer pontos) {
        this.avaliacao.put(motivo, pontos);
    }

    public void addNaoComputado(String motivo, Integer pontos) {
        this.naoComputado.put(motivo, pontos);
    }

    void addPontos(int i) {
        this.pontos += i;
    }

    @Override
    public int compareTo(Pesquisador o) {
        return this.getPontos() - o.getPontos();
    }

    public void setFileName(String name) {
        this.fileName = name;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Map<String, Integer> getNaoComputado() {
        return naoComputado;
    }

    public void setNaoComputado(Map<String, Integer> naoComputado) {
        this.naoComputado = naoComputado;
    }

    public void setLivrosPublicados(Integer length) {
        this.livrosPublicados = length;
    }

    public Integer getLivrosPublicados() {
        return this.livrosPublicados;
    }

    public void setCapitulosPublicados(Integer length) {
        this.capitulosPublicados = length;
    }

    public Integer getCapitulosPublicados() {
        return this.capitulosPublicados;
    }

    public void setPatentesPublicados(int length) {
        this.patentesPublicados = length;
    }

    public int getPatentesPublicados() {
        return patentesPublicados;
    }

    public void setBancasMestrado(int length) {
        this.bancasMestrado = length;
    }

    public int getBancasMestrado() {
        return bancasMestrado;
    }

    public void setBancasDoutorado(int length) {
        this.bancasDoutorado = length;
    }

    public int getBancasDoutorado() {
        return bancasDoutorado;
    }

    public void setBancasQualificacao(int length) {
        this.bancasQualificacao = length;
    }

    public int getBancasQualificacao() {
        return bancasQualificacao;
    }

    public String getResumoCV() {
        return resumoCV;
    }

    public void setResumoCV(String resumoCV) {
        this.resumoCV = resumoCV;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public void addAvaliacao(String tipo, String log, int pontos) {
        this.avaliacoes.add(new Avaliacao(tipo, log, pontos));
        this.addPontos(pontos);
    }

    public void addAvaliacao(String tipo, String log, int pontos, boolean trienio) {
        this.avaliacoes.add(new Avaliacao(tipo, log, trienio ? pontos : 0, trienio));
        this.addPontos(trienio ? pontos : 0);
    }

    public List<Avaliacao> getAvaliacoesNoTrienio() {
        List<Avaliacao> total = new ArrayList<>();
        for (Avaliacao avaliacaoDentro : avaliacoes) {
            if (avaliacaoDentro.isTrienio()) {
                total.add(avaliacaoDentro);
            }
        }
        return total;
    }

    public List<Avaliacao> getAvaliacoesForaTrienio() {
        List<Avaliacao> total = new ArrayList<>();
        for (Avaliacao avaliacaoDentro : avaliacoes) {
            if (!avaliacaoDentro.isTrienio()) {
                total.add(avaliacaoDentro);
            }
        }
        return total;
    }
    public List<Avaliacao> getAtualizacaoLista(){
    	List<Avaliacao> total = new ArrayList<>();
        for (Avaliacao avaliacaoDentro : avaliacoes) {
                total.add(avaliacaoDentro);
        }
        return total;
    }
    public class TotalCount {

        private Integer total = 0;
        private Integer count = 0;

        public TotalCount(Integer t, Integer c) {
            total = t;
            count = c;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public void addAndInc(Integer t) {
            this.total += t;
            this.count++;
        }

    }

    public Map<String, TotalCount> getAvaliacaoSumario() {
        int t = 0;
        Map<String, TotalCount> total = new LinkedHashMap<>();
        for (Avaliacao avaliacaoDentro : avaliacoes) {
            if (!avaliacaoDentro.isTrienio()) {
                continue;
            }
            t = addAndCountAvaliacao(total, avaliacaoDentro, t);
        }
        total.put("Total", new TotalCount(t, null));
        return total;
    }

    public Map<String, TotalCount> getAvaliacaoSumarioForaTrienio() {
        int t = 0;
        Map<String, TotalCount> total = new LinkedHashMap<>();
        for (Avaliacao avaliacaoFora : avaliacoes) {
            if (avaliacaoFora.isTrienio()) {
                continue;
            }
            t = addAndCountAvaliacao(total, avaliacaoFora, t);
        }
        total.put("Total", new TotalCount(t, null));
        return total;
    }

    private int addAndCountAvaliacao(Map<String, TotalCount> total, Avaliacao avaliacaoDentro, int t) {
        if (!total.containsKey(avaliacaoDentro.getTipo())) {
            total.put(avaliacaoDentro.getTipo(), new TotalCount(avaliacaoDentro.getPontos(), 1));
        } else {
            total.get(avaliacaoDentro.getTipo()).addAndInc(avaliacaoDentro.getPontos());
        }
        t += avaliacaoDentro.getPontos();
        return t;
    }

}
