package br.com.Analise;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.Modelo.Criterios;
import br.com.Modelo.Levantamento;
import br.com.Modelo.Obras;
import br.com.Modelo.Pesquisador;
import br.com.Modelo.Resultado;


public class AvaliadorDefault{

    public static final int ANO_TRIENIO = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo")).getYear() -4;
    private float DEDICACAO_EXCLUSIVA = 10;
    private float ARTIGO_COMPLETO_INDEXADO_PUBLICADO = 15;
    private float MAX_ARTIGO_COMPLETO_INDEXADO_PUBLICADO = -1;
    private float ARTIGO_COMPLETO_ACEITO = 8;
    private float MAX_ARTIGO_COMPLETO_ACEITO = -1;
    private float LIVRO_PUBLICADO = 20;
    private float MAX_LIVRO_PUBLICADO = -1;
    private float LIVRO_CAPITULO = 10;
    private float MAX_LIVRO_CAPITULO = -1;
    private float LIVRO_ORGANIZACAO = 5;
    private float MAX_LIVRO_ORGANIZACAO = -1;
    private float TRABALHO_COMPLETO_EVENTO = 3;
    private float MAX_TRABALHO_COMPLETO_EVENTO = -1;
    private float TRABALHO_COMPLETO_EVENTO_NAC = 4;
    private float TRABALHO_COMPLETO_EVENTO_INTE = 6;
    private float MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE = -1;
    private float PATENTE_NACIONAL = 10;
    private float MAX_PATENTE_NACIONAL = -1;
    private float PATENTE_INTERNACIONAL = 15;
    private float MAX_PATENTE_INTERNACIONAL = -1;
    private float BANCA_MS_EXTERNA = 5;
    private float MAX_BANCA_MS_EXTERNA = -1;
    private float BANCA_DR_EXTERNA = 7;
    private float MAX_BANCA_DR_EXTERNA = -1;
    private float BANCA_QL_EXTERNA = 7;
    private float MAX_BANCA_QL_EXTERNA = -1;
    private float ORIENTACAO_DR_AND = 0;
    private float MAX_ORIENTACAO_DR_AND = -1;
    private float ORIENTACAO_DR_CONC = 0;
    private float MAX_ORIENTACAO_DR_CONC = -1;
    private float ORIENTACAO_DR_AND_CONC = 0;
    private float MAX_ORIENTACAO_DR_AND_CONC = -1;
    private float COORIENTACAO_DR_AND_CONC = 5;
    private float MAX_COORIENTACAO_DR_AND_CONC = -1;
    private float COORIENTACAO_DR_CONC = 0;
    private float MAX_COORIENTACAO_DR_CONC = -1;
    private float ORIENTACAO_MS_AND = 10;
    private float MAX_ORIENTACAO_MS_AND = -1;
    private float ORIENTACAO_MS_CONC = 10;
    private float MAX_ORIENTACAO_MS_CONC = -1;
    private float ORIENTACAO_MS_AND_CONC = 10;
    private float MAX_ORIENTACAO_MS_AND_CONC = -1;
    private float COORIENTACAO_MS_AND_CONC = 3;
    private float MAX_COORIENTACAO_MS_AND_CONC = -1;
    private float COORIENTACAO_MS_CONC = 0;
    private float MAX_COORIENTACAO_MS_CONC = -1;
    private float ORIENTACAO_TFC = 0;
    private float MAX_ORIENTACAO_TFC = -1;
    private float ORIENTACAO_IC = 3;
    private float MAX_ORIENTACAO_IC = -1;
    private float DOUTOR = 0;
    private float ORIENTACAO_EXTENSAO = 0;
    private float MAX_ORIENTACAO_EXTENSAO = -1;
    private float ORIENTACAO_TP = 0;
    private float MAX_ORIENTACAO_TP = -1;

    public void avaliar() {
    }
    
    public Resultado avaliar2(Document document , Criterios crit) throws Exception {
        
    	 DEDICACAO_EXCLUSIVA = crit.getDedicacaoExclusiva();
         ARTIGO_COMPLETO_INDEXADO_PUBLICADO = crit.getArtCompPerioInd();
         ARTIGO_COMPLETO_ACEITO = crit.getArtCompAceitoPublic();
         LIVRO_PUBLICADO = crit.getLivro();
         LIVRO_CAPITULO = crit.getCapLivro();
         LIVRO_ORGANIZACAO = crit.getOrgLivro();
         TRABALHO_COMPLETO_EVENTO = crit.getTrabEvento();
         TRABALHO_COMPLETO_EVENTO_NAC = crit.getTrabEventoNaci();
         TRABALHO_COMPLETO_EVENTO_INTE = crit.getTrabEventoInter();
         PATENTE_NACIONAL = crit.getDepPatenteNac();
         PATENTE_INTERNACIONAL = crit.getDepPatenteInt();
         BANCA_MS_EXTERNA = crit.getBancMestr();
         BANCA_DR_EXTERNA = crit.getBancDout();
         BANCA_QL_EXTERNA = crit.getBancQualDout();
         ORIENTACAO_DR_AND = crit.getOriDoutAnd();
         ORIENTACAO_DR_CONC = crit.getOriDoutConc();
         ORIENTACAO_DR_AND_CONC = crit.getOriDoutAndConc();
         COORIENTACAO_DR_AND_CONC = crit.getCoriDoutAndConc();
         COORIENTACAO_DR_CONC = crit.getCoriDoutConc();
         ORIENTACAO_MS_AND = crit.getOriMestAnd();
         ORIENTACAO_MS_CONC = crit.getOriMestConc();
         ORIENTACAO_MS_AND_CONC = crit.getOriMestAndConc();
         COORIENTACAO_MS_CONC = crit.getCoriMestConc();
         COORIENTACAO_MS_AND_CONC = crit.getCoriMestAndConc();
         ORIENTACAO_IC = crit.getOriIcAndConc();
         ORIENTACAO_TFC = crit.getOriTfc();
        
         DOUTOR = crit.getDoutor();
        XPathFactory xPathfactory = XPathFactory.newInstance();
        XPath xpath = xPathfactory.newXPath();
        Resultado result = new Resultado();
        if(crit.getArea().equals("exata")){
            setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
            avaliaArtigosPublicados(xpath, result, document);
            avaliaArtigosAceitos(xpath, result, document);
            
            avaliaLivrosPublicados(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            avaliaLivrosOrganizado(xpath, result, document);
            
            avaliaTrabalhoEmEventosGeral(xpath, result, document);
            setPatentes(xpath, result, document);
            
            setBancaMestrado(xpath, result, document);
            setBancaDoutorado(xpath, result, document);
            setBancaQualificacao(xpath, result, document);
            setOrientacaoDouAndConclu(xpath, result, document);
            setCorientacaoDouAndConclu(xpath, result, document);
            setOrientacaoMesAndConclu(xpath, result, document);
            setCorientacaoMesAndConclu(xpath, result, document);
            
            serOrientacaoIC(xpath, result, document);
        }
        if(crit.getArea().equals("biologica")){
        	setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
         // Fator de impacto
		//Artigos completos em periódico indexados (dependo do fator de impacto)*	  *: 5pontos FI<0.5;    15 pontos 0.5<FI<3.0;   20 pontos FI>3.0					
		//Artigos completos aceitos para publicação (depende do fator de impacto)**	**: 3pontos FI<0.5;    8 pontos 0.5<FI<3.0;     10 pontos FI>3.0			
           //** avaliaArtigosPublicados(xpath, result, document); // Não esta sendo avaliado o fator de impacto
           //** avaliaArtigosAceitos(xpath, result, document); // Não esta sendo avaliado o fator de impacto
            //avaliaTrabalhoEmEventos(xpath, result, document);
            avaliaLivrosPublicados(xpath, result, document);
          //  avaliaLivrosOrganizado(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            setPatentes(xpath, result, document);
            setBancaMestrado(xpath, result, document);
            setBancaDoutorado(xpath, result, document);
            setBancaQualificacao(xpath, result, document);
            setOrientacaoDouAndConclu(xpath, result, document);
            setCorientacaoDouAndConclu(xpath, result, document);
            setOrientacaoMesAndConclu(xpath, result, document);
            setCorientacaoMesAndConclu(xpath, result, document);
            
            serOrientacaoIC(xpath, result, document);
        }
        if(crit.getArea().equals("eng")){
            MAX_ORIENTACAO_IC = 24;
            MAX_ORIENTACAO_TFC =12;
            MAX_ORIENTACAO_MS_AND = 9;
            MAX_ORIENTACAO_DR_AND = 3;
            MAX_BANCA_QL_EXTERNA = 3;
            MAX_BANCA_DR_EXTERNA = 3;
            MAX_BANCA_MS_EXTERNA = 6;
            MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE = 9;
            
            setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
//            Artigos completos publicados em periódicos JCR>0,5 ou A1 ou A2
//            Artigos completos publicados em periódicos JCR<0,5 ou B1 ou B2
//            Artigos completos publicados em periódicos sem JCR ou B3,B4,B5
//            Artigos completos publicados em periódicos sem JCR ou C
           // avaliaArtigosPublicados(xpath, result, document);
           // avaliaArtigosAceitos(xpath, result, document);
            avaliaLivrosPublicados(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            avaliaLivrosOrganizado(xpath, result, document);
            // maximo 9 de inter+nacional
            avaliaTrabalhoEmEventosNacInte(xpath, result, document);
            
            setPatentes(xpath, result, document);
            // maximo 6
            //setBancaMestrado(xpath, result, document);
            // maxima 3
             //setBancaDoutorado(xpath, result, document);
            //maximo 3
            //setBancaQualificacao(xpath, result, document);
            
            setOrientacaoDouAnd(xpath, result, document);
            setOrientacaoMesAnd(xpath, result, document);
                    
            setOrientacaoDoutoradoCon(xpath, result, document);
            setOrientacaoMestradoCon(xpath, result, document);
            
            setCorientacaoDoutoradoCon(xpath, result, document);
            setCorientacaoMestradoCon(xpath, result, document);
            
//            maximo 3 Orientação de Doutorado em Andamento
//            maximo 9 Orientação de Mestrado em Andamento
//            maximo 24 Orientação Iniciação Científica andamento/concluída 
            serOrientacaoIC(xpath, result, document);
            serOrientacaoTFC(xpath, result, document);
        }
        if(crit.getArea().equals("saude")){
        	setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
            avaliaArtigosPublicados(xpath, result, document);
            avaliaArtigosAceitos(xpath, result, document);
            avaliaLivrosPublicados(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            avaliaLivrosOrganizado(xpath, result, document);
            avaliaTrabalhoEmEventosGeral(xpath, result, document);
            setPatentes(xpath, result, document);
//            setBancaMestrado(xpath, result, document);
//            setBancaDoutorado(xpath, result, document);
//            setBancaQualificacao(xpath, result, document);
            setOrientacaoDouAndConclu(xpath, result, document);
            setCorientacaoDouAndConclu(xpath, result, document);
            setOrientacaoMesAndConclu(xpath, result, document);
            setCorientacaoMesAndConclu(xpath, result, document);
            
            serOrientacaoIC(xpath, result, document);
        }
        if(crit.getArea().equals("social")){
            MAX_LIVRO_CAPITULO = 12;
            MAX_LIVRO_ORGANIZACAO = 3;
            MAX_LIVRO_PUBLICADO = 3;
            MAX_TRABALHO_COMPLETO_EVENTO = 18;
            MAX_BANCA_DR_EXTERNA = 18;
            MAX_BANCA_MS_EXTERNA = 18;
            MAX_BANCA_QL_EXTERNA =18;
            MAX_ORIENTACAO_DR_AND_CONC=18;
            MAX_COORIENTACAO_DR_AND_CONC=18;
            MAX_ORIENTACAO_MS_AND_CONC=18;
            MAX_COORIENTACAO_MS_AND_CONC=18;
            MAX_ORIENTACAO_IC =18;
            setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
            avaliaDoutor(xpath, result, document);
//            Artigos completos períodicos A (qualis área)
//            Artigos completos períodicos B1 e B2 (qualis área)
//            Artigos completos em periódico  B3 e B5 (qualis área)
//            Artigos completos em periódico  C (qualis área)
//            Artigos aceitos completos períodicos A (qualis área)
//            Artigos aceitos completos períodicos B1 e B12 (qualis área)
//            Artigos aceitos completos em periódico  B3 e B5 (qualis área)
//            Artigos aceitos completos em periódico  C (qualis área)          
//            avaliaArtigosPublicados(xpath, result, document);
//            avaliaArtigosAceitos(xpath, result, document);
            
            avaliaLivrosPublicados(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            avaliaLivrosOrganizado(xpath, result, document);
            avaliaTrabalhoEmEventosGeral(xpath, result, document);
            setPatentes(xpath, result, document);
            setBancaMestrado(xpath, result, document);
            setBancaDoutorado(xpath, result, document);
            setBancaQualificacao(xpath, result, document);
            setOrientacaoDouAndConclu(xpath, result, document);
            setCorientacaoDouAndConclu(xpath, result, document);
            setOrientacaoMesAndConclu(xpath, result, document);
            setCorientacaoMesAndConclu(xpath, result, document);
            serOrientacaoIC(xpath, result, document);
            
        }
        if(crit.getArea().equals("humanas")){
        	setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
            avaliaArtigosPublicados(xpath, result, document);
            avaliaArtigosAceitos(xpath, result, document);
            avaliaLivrosPublicados(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            avaliaLivrosOrganizado(xpath, result, document);
            avaliaTrabalhoEmEventosGeral(xpath, result, document);
            setPatentes(xpath, result, document);
            setBancaMestrado(xpath, result, document);
            setBancaDoutorado(xpath, result, document);
            setBancaQualificacao(xpath, result, document);
            setOrientacaoDouAndConclu(xpath, result, document);
            setCorientacaoDouAndConclu(xpath, result, document);
            setOrientacaoMesAndConclu(xpath, result, document);
            setCorientacaoMesAndConclu(xpath, result, document);
            serOrientacaoIC(xpath, result, document);
        }
        if(crit.getArea().equals("letras")){
        	setNomeCompleto(xpath, result, document);
            setAtualizacao(xpath, document, result);
            setLattes(xpath, result, document);
            setResumoCV(xpath, result, document);
            avaliaVinculoDedicacaoExclusiva(xpath, result, document);
            avaliaArtigosPublicados(xpath, result, document);
            avaliaArtigosAceitos(xpath, result, document);
            avaliaLivrosPublicados(xpath, result, document);
            avaliaCapitulosPublicados(xpath, result, document);
            avaliaLivrosOrganizado(xpath, result, document);
            avaliaTrabalhoEmEventosGeral(xpath, result, document);
            setPatentes(xpath, result, document);
            setBancaMestrado(xpath, result, document);
            setBancaDoutorado(xpath, result, document);
            setBancaQualificacao(xpath, result, document);
            setOrientacaoDouAndConclu(xpath, result, document);
            setCorientacaoDouAndConclu(xpath, result, document);
            setOrientacaoMesAndConclu(xpath, result, document);
            setCorientacaoMesAndConclu(xpath, result, document);
            serOrientacaoIC(xpath, result, document);
        }
        return result;
    }
    private void avaliaArtigosPublicados(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ARTIGO-PUBLICADO");
        NodeList artigos = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Artigos completos em periódico indexados");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < artigos.getLength(); i++) {
            Node artigoNode = artigos.item(i);
            String titulo = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-ARTIGO").getTextContent();
            String periodico = artigoNode.getChildNodes().item(1).getAttributes().getNamedItem("TITULO-DO-PERIODICO-OU-REVISTA").getTextContent();
            Integer ano = Integer.valueOf(artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DO-ARTIGO").getTextContent());
            String log = "[ARTIGO] (" + ano + ") " + titulo + " - " + periodico;
            obra = new Obras();
            if (artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA").getTextContent().equalsIgnoreCase("COMPLETO")) {
            	obra.setNome(log);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_ARTIGO_COMPLETO_INDEXADO_PUBLICADO && MAX_ARTIGO_COMPLETO_INDEXADO_PUBLICADO>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ARTIGO_COMPLETO_INDEXADO_PUBLICADO && MAX_ARTIGO_COMPLETO_INDEXADO_PUBLICADO>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ARTIGO_COMPLETO_INDEXADO_PUBLICADO);
                }
                else{
                        comp = comp+ARTIGO_COMPLETO_INDEXADO_PUBLICADO;
                        aux++;
                        obra.setValor(ARTIGO_COMPLETO_INDEXADO_PUBLICADO);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ARTIGO_COMPLETO_INDEXADO_PUBLICADO);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    private void avaliaArtigosAceitos(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ARTIGO-ACEITO-PARA-PUBLICACAO");
        NodeList artigos = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Artigos completos aceitos para publicação");
        Obras obra;
        float comp=0,aux =0;
        for (int i = 0; i < artigos.getLength(); i++) {
            Node artigoNode = artigos.item(i);
            String titulo = artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-ARTIGO").getTextContent();
            String periodico = artigoNode.getChildNodes().item(1).getAttributes().getNamedItem("TITULO-DO-PERIODICO-OU-REVISTA").getTextContent();
            Integer ano = Integer.valueOf(artigoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DO-ARTIGO").getTextContent());
            String log = "Artigo (" + ano + ") " + titulo + " - " + periodico;
            obra = new Obras();
            	obra.setNome(log);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_ARTIGO_COMPLETO_ACEITO && MAX_ARTIGO_COMPLETO_ACEITO>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ARTIGO_COMPLETO_ACEITO && MAX_ARTIGO_COMPLETO_ACEITO>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ARTIGO_COMPLETO_ACEITO);
                }
                else{
                        comp = comp+ARTIGO_COMPLETO_ACEITO;
                        aux++;
                        obra.setValor(ARTIGO_COMPLETO_ACEITO);
                }
                levante.AddObra(obra);
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ARTIGO_COMPLETO_ACEITO);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    private void avaliaLivrosPublicados(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//LIVRO-PUBLICADO-OU-ORGANIZADO");
        NodeList livros = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Livros publicados");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < livros.getLength(); i++) {
            Node livroNode = livros.item(i);
            String titulo = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-LIVRO").getTextContent();
            String tipo = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
            Integer ano = Integer.valueOf(livroNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equals("LIVRO_PUBLICADO")) {
            	obra.setNome("Livro Publicado (" + ano + ")" + titulo);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_LIVRO_PUBLICADO && MAX_LIVRO_PUBLICADO>0)){
                    obra.setValido(false);
                    if(aux>=MAX_LIVRO_PUBLICADO && MAX_LIVRO_PUBLICADO >0)
                            obra.setValor(-1);
                    else
                    obra.setValor(LIVRO_PUBLICADO);
                }
                else{
                    comp = comp+LIVRO_PUBLICADO;
                    aux++;
                    obra.setValor(LIVRO_PUBLICADO);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(LIVRO_PUBLICADO);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    private void avaliaLivrosOrganizado(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//LIVRO-PUBLICADO-OU-ORGANIZADO");
        NodeList livros = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Organização de livros");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < livros.getLength(); i++) {
            Node livroNode = livros.item(i);
            String titulo = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-LIVRO").getTextContent();
            String tipo = livroNode.getChildNodes().item(0).getAttributes().getNamedItem("TIPO").getTextContent();
            Integer ano = Integer.valueOf(livroNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equals("LIVRO_ORGANIZADO_OU_EDICAO")) {
            	obra.setNome("Livro Organizado (" + ano + ")" + titulo);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_LIVRO_ORGANIZACAO && MAX_LIVRO_ORGANIZACAO>0)){
                    obra.setValido(false);
                    if(aux>=MAX_LIVRO_ORGANIZACAO && MAX_LIVRO_ORGANIZACAO >0)
                            obra.setValor(-1);
                    else
                    obra.setValor(LIVRO_ORGANIZACAO);
                }
                else{ 
                    comp = comp+LIVRO_ORGANIZACAO;
                    aux++;
                    System.out.println(LIVRO_ORGANIZACAO);
                    obra.setValor(LIVRO_ORGANIZACAO);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(LIVRO_ORGANIZACAO);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    private void avaliaCapitulosPublicados(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//CAPITULO-DE-LIVRO-PUBLICADO");
        NodeList capitulos = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Capitulos de livros");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < capitulos.getLength(); i++) {
            Node capLivroNode = capitulos.item(i);
            String titulo = capLivroNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-CAPITULO-DO-LIVRO").getTextContent();
            Integer ano = Integer.valueOf(capLivroNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            obra.setNome("Capítulo de livro (" + ano + ") " + titulo);
        	if(ano <= ANO_TRIENIO || (aux>=MAX_LIVRO_CAPITULO && MAX_LIVRO_CAPITULO>0)){
                    obra.setValido(false);
                    if(aux>=MAX_LIVRO_CAPITULO && MAX_LIVRO_CAPITULO >0)
                            obra.setValor(-1);
                    else
                    obra.setValor(LIVRO_CAPITULO);
                }
                else{
                    comp = comp+LIVRO_CAPITULO;
                    aux++;
                    obra.setValor(LIVRO_CAPITULO);
                }
                levante.AddObra(obra);
        }
        levante.setTotalValor(comp);
        levante.setValorItem(LIVRO_CAPITULO);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    private void avaliaTrabalhoEmEventosGeral(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//TRABALHO-EM-EVENTOS");
        NodeList trabalhos = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Trabalhos completos em eventos");
        Levantamento levante2 = new Levantamento();
        levante2.setTipoObra("Trabalhos em eventos");
        Obras obra;
        float comp=0,aux = 0;
        for (int i = 0; i < trabalhos.getLength(); i++) {
            Node trabalhoNode = trabalhos.item(i);
            String titulo = trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            Integer ano = Integer.valueOf(trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DO-TRABALHO").getTextContent());
            String nat = trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA").getTextContent();
            obra = new Obras();
            if (nat.equalsIgnoreCase("COMPLETO")) {
            	obra.setNome("Trabalho completo em evento (" + ano + ") " + nat + ": " + titulo);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_TRABALHO_COMPLETO_EVENTO && MAX_TRABALHO_COMPLETO_EVENTO>0)){
                    obra.setValido(false);
                    if(aux>=MAX_TRABALHO_COMPLETO_EVENTO && MAX_TRABALHO_COMPLETO_EVENTO>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(TRABALHO_COMPLETO_EVENTO);
                }
                else{
                        comp = comp+TRABALHO_COMPLETO_EVENTO;
                        aux++;
                        obra.setValor(TRABALHO_COMPLETO_EVENTO);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(TRABALHO_COMPLETO_EVENTO);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    private void avaliaTrabalhoEmEventosNacInte(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//TRABALHO-EM-EVENTOS");
        NodeList trabalhos = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Trabalhos completos em eventos nacionais");
        Levantamento levante2 = new Levantamento();
        levante2.setTipoObra("Trabalhos completos em eventos internacionais");
        Obras obra;
        float comp=0,incomp = 0, aux=0;
        for (int i = 0; i < trabalhos.getLength(); i++) {
            Node trabalhoNode = trabalhos.item(i);
            String titulo = trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            Integer ano = Integer.valueOf(trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DO-TRABALHO").getTextContent());
            String nat = trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA").getTextContent();
            String log = "[Trab. Eventos] (" + ano + ") " + nat + ": " + titulo;
            obra = new Obras();
            if (nat.equalsIgnoreCase("COMPLETO")) {
                String pais = trabalhoNode.getChildNodes().item(1).getAttributes().getNamedItem("CLASSIFICACAO-DO-EVENTO").getTextContent();
                if(pais.equalsIgnoreCase("INTERNACIONAL")){
                    obra.setNome("Trabalho completo em evento (" + ano + ") " + nat + ": " + titulo);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE && MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE>0)){
                            obra.setValido(false);
                            if(aux>=MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE && MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE>0)
                                obra.setValor(-1);
                            else
                            obra.setValor(TRABALHO_COMPLETO_EVENTO_INTE);
                    }
                    else{
                        comp = comp+TRABALHO_COMPLETO_EVENTO_INTE;
                        aux++;
                        obra.setValor(TRABALHO_COMPLETO_EVENTO_INTE);
                    }
                    levante2.AddObra(obra);
                }
            }
        }
        expr = xpath.compile("//TRABALHO-EM-EVENTOS");
        trabalhos = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < trabalhos.getLength(); i++) {
            Node trabalhoNode = trabalhos.item(i);
            String titulo = trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            Integer ano = Integer.valueOf(trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("ANO-DO-TRABALHO").getTextContent());
            String nat = trabalhoNode.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA").getTextContent();
            String log = "[Trab. Eventos] (" + ano + ") " + nat + ": " + titulo;
            obra = new Obras();
            if (nat.equalsIgnoreCase("COMPLETO")) {
                String pais = trabalhoNode.getChildNodes().item(1).getAttributes().getNamedItem("CLASSIFICACAO-DO-EVENTO").getTextContent();
                if(!pais.equalsIgnoreCase("INTERNACIONAL")){
                    obra.setNome("Trabalho completo em evento (" + ano + ") " + nat + ": " + titulo);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE && MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE>0)){
                            obra.setValido(false);
                            if(aux>=MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE && MAX_TRABALHO_COMPLETO_EVENTO_NAC_INTE>0)
                                obra.setValor(-1);
                            else
                            obra.setValor(TRABALHO_COMPLETO_EVENTO_NAC);
                    }
                    else{
                            incomp = incomp+TRABALHO_COMPLETO_EVENTO_NAC;
                            aux++;
                            obra.setValor(TRABALHO_COMPLETO_EVENTO_NAC);
                    }
                    levante.AddObra(obra);
                }
            }
        }
        levante.setTotalValor(incomp);
        levante.setValorItem(TRABALHO_COMPLETO_EVENTO_NAC);
        levante2.setTotalValor(comp);
        levante2.setValorItem(TRABALHO_COMPLETO_EVENTO_INTE);
        result.AddLevante(levante2);
        result.AddLevante(levante);
        result.someTotal(comp+incomp);
    }
    
        
    private void setResumoCV(XPath xpath, Resultado result, Document document) throws XPathExpressionException {
        XPathExpression expr = xpath.compile("string(//RESUMO-CV/@TEXTO-RESUMO-CV-RH)");
        result.setResumoCV(expr.evaluate(document));
    }

    private void setLattes(XPath xpath, Resultado result, Document document) throws XPathExpressionException {
        XPathExpression expr = xpath.compile("string(/CURRICULO-VITAE/@NUMERO-IDENTIFICADOR)");
        result.setLattes(expr.evaluate(document));
    }

    private void setAtualizacao(XPath xpath, Document document, Resultado result) throws XPathExpressionException {
        XPathExpression expr = xpath.compile("string(/CURRICULO-VITAE[1]/@DATA-ATUALIZACAO)");
        StringBuilder sb = new StringBuilder(expr.evaluate(document));
        expr = xpath.compile("string(/CURRICULO-VITAE[1]/@HORA-ATUALIZACAO)");
        sb.append(expr.evaluate(document));//1122334444556677

        sb.insert(12, ":");
        sb.insert(10, ":");
        sb.insert(8, " ");
        sb.insert(4, "/");
        sb.insert(2, "/");
        result.setAtualizacao(sb.toString());
    }

    private void setNomeCompleto(XPath xpath, Resultado result, Document document) throws XPathExpressionException {
        XPathExpression expr = xpath.compile("string(/*/DADOS-GERAIS[1]/@NOME-COMPLETO)");
        result.setNomeCompleto(expr.evaluate(document));
    }

    
    
    private void avaliaVinculoDedicacaoExclusiva(XPath xpath, Resultado result, Document document) throws XPathExpressionException {
        XPathExpression expr = xpath.compile("//ATUACAO-PROFISSIONAL");
        String dexc = expr.evaluate(document);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Regime de Dedicação Exclusiva");
        Obras obra = new Obras();
        NodeList dedicacao = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        levante.setTotalValor(0);
        obra.setValido(true);
        obra.setValor(0);
        obra.setNome("Não possui  o regime de Dedicação Exclusiva");
        for (int i = 0; i < dedicacao.getLength(); i++) {
            Node dedicacaoNode = dedicacao.item(i);
            String local = dedicacaoNode.getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
            if(local.equals("Universidade Federal de Juiz de Fora")){
                NodeList vinculo = dedicacaoNode.getChildNodes();
                for (int j = 0; j < vinculo.getLength(); j++) {
                    Node vinculoNode = vinculo.item(j);
                    if(vinculoNode.getNodeName().equals("VINCULOS")
                    && vinculoNode.getAttributes().getNamedItem("FLAG-DEDICACAO-EXCLUSIVA").getTextContent().equals("SIM")
                    && vinculoNode.getAttributes().getNamedItem("ANO-FIM").getTextContent().equals("")){
                        levante.setTotalValor(DEDICACAO_EXCLUSIVA);
                        obra.setValor(DEDICACAO_EXCLUSIVA);
                        result.someTotal(DEDICACAO_EXCLUSIVA);
                        obra.setNome("Possui o regime de Dedicação Exclusiva");
                        i = dedicacao.getLength();
                        break;
                    }
                }
            }
        }
        levante.AddObra(obra);
        levante.setValorItem(DEDICACAO_EXCLUSIVA);
        result.AddLevante(levante);
    }

    
    private void avaliaDoutor(XPath xpath, Resultado result, Document document) throws XPathExpressionException {
        XPathExpression expr = xpath.compile("//FORMACAO-ACADEMICA-TITULACAO/DOUTORADO");
        NodeList doutor = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        String dexc = expr.evaluate(document);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Doutor");
        Obras obra = new Obras();
        if (0 < doutor.getLength()) {
        	levante.setTotalValor(DOUTOR);
        	obra.setValor(DOUTOR);
        	result.someTotal(DOUTOR);
        	obra.setNome("Possui doutorado");
        } else {
        	levante.setTotalValor(0);
        	obra.setValido(true);
        	obra.setValor(0);
        	obra.setNome("Não possui  doutorado");
        }
        levante.AddObra(obra);
        levante.setValorItem(DOUTOR);
        result.AddLevante(levante);
    }

    private void setPatentes(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//DADOS-BASICOS-DA-PATENTE");
        NodeList patentes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Depósitos de patentes internacionais");
        Levantamento levante2 = new Levantamento();
        levante2.setTipoObra("Depósitos de patentes nacionais");
        Obras obra;
        float comp=0,incomp = 0,aux=0;
        for (int i = 0; i < patentes.getLength(); i++) {
            Node patenteNode = patentes.item(i);
            String titulo = patenteNode.getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = patenteNode.getAttributes().getNamedItem("PAIS").getTextContent();
            Integer ano = Integer.valueOf(patenteNode.getAttributes().getNamedItem("ANO-DESENVOLVIMENTO").getTextContent());
            obra = new Obras();
            if (!tipo.equals("Brasil")) {
            	obra.setNome("Patente  Internacional: " + titulo);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_PATENTE_INTERNACIONAL && MAX_PATENTE_INTERNACIONAL>0)){
                        obra.setValido(false);
                        if(aux>=MAX_PATENTE_INTERNACIONAL && MAX_PATENTE_INTERNACIONAL>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(PATENTE_INTERNACIONAL);
                    }
                    else{
                            comp = comp+PATENTE_INTERNACIONAL;
                            aux++;
                            obra.setValor(PATENTE_INTERNACIONAL);
                    }
                    levante.AddObra(obra);
            } else {
            	obra.setNome("Patente Nacional: " + "(" + ano + ") " + titulo);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_PATENTE_NACIONAL && MAX_PATENTE_NACIONAL>0)){
                        obra.setValido(false);
                        if(aux>=MAX_PATENTE_NACIONAL && MAX_PATENTE_NACIONAL>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(PATENTE_NACIONAL);
                    }
                    else{
                            incomp = incomp+PATENTE_NACIONAL;
                            aux++;
                            obra.setValor(PATENTE_NACIONAL);
                    }
                    levante2.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(PATENTE_INTERNACIONAL);
        levante2.setTotalValor(incomp);
        levante2.setValorItem(PATENTE_NACIONAL);
        result.AddLevante(levante2);
        result.AddLevante(levante);
        result.someTotal(comp+incomp);
    }

    private void setBancaMestrado(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//PARTICIPACAO-EM-BANCA-DE-MESTRADO");
        NodeList bancasDeMestrado = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Banca de Mestrado externa ao programa");
        Obras obra;
        float comp=0, aux=0;
        for (int i = 0; i < bancasDeMestrado.getLength(); i++) {
            Node bancaDeMestrado = bancasDeMestrado.item(i);
            String titulo = bancaDeMestrado.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String instituticao = bancaDeMestrado.getChildNodes().item(1).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
            Integer ano = Integer.valueOf(bancaDeMestrado.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!instituticao.equalsIgnoreCase("Universidade Federal de Juiz de Fora")) {
            	obra.setNome("Banca de Mestrado: (" + ano + ") " + titulo + " - " + instituticao);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_BANCA_MS_EXTERNA && MAX_BANCA_MS_EXTERNA>0)){
                    obra.setValido(false);
                    if(aux>=MAX_BANCA_MS_EXTERNA && MAX_BANCA_MS_EXTERNA>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(BANCA_MS_EXTERNA);
                }
                else{
                        comp = comp+BANCA_MS_EXTERNA;
                        aux++;
                        obra.setValor(BANCA_MS_EXTERNA);
                }
                levante.AddObra(obra);
            } 
        }
        levante.setTotalValor(comp);
        levante.setValorItem(BANCA_MS_EXTERNA);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    private void setBancaDoutorado(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//PARTICIPACAO-EM-BANCA-DE-DOUTORADO");
        NodeList bancasDeDoutorado = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Banca de Doutorado externa ao programa");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < bancasDeDoutorado.getLength(); i++) {
            Node bancaDeDoutorado = bancasDeDoutorado.item(i);
            String titulo = bancaDeDoutorado.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String instituicao = bancaDeDoutorado.getChildNodes().item(1).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
            Integer ano = Integer.valueOf(bancaDeDoutorado.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!instituicao.equalsIgnoreCase("Universidade Federal de Juiz de Fora")) {
            	obra.setNome("Banca de Doutorado: " + "(" + ano + ")" + titulo + " - " + instituicao);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_BANCA_DR_EXTERNA && MAX_BANCA_DR_EXTERNA>0)){
                        obra.setValido(false);
                        if(aux>=MAX_BANCA_DR_EXTERNA && MAX_BANCA_DR_EXTERNA>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(BANCA_DR_EXTERNA);
                    }
                    else{
                            comp = comp+BANCA_DR_EXTERNA;
                            aux++;
                            obra.setValor(BANCA_DR_EXTERNA);
                    }
                    levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(BANCA_DR_EXTERNA);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    private void setBancaQualificacao(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//PARTICIPACAO-EM-BANCA-DE-EXAME-QUALIFICACAO");
        NodeList bancasDeQualificacao = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Banca de Qualificação de Doutorado externa ao programa");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < bancasDeQualificacao.getLength(); i++) {
            Node bancaDeQualificacao = bancasDeQualificacao.item(i);
            String titulo = bancaDeQualificacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String local = bancaDeQualificacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-INSTITUICAO").getTextContent();
            String natureza = bancaDeQualificacao.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA").getTextContent();
            Integer ano = Integer.valueOf(bancaDeQualificacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!local.equalsIgnoreCase("Universidade Federal de Juiz de Fora") && natureza.equalsIgnoreCase("Exame de qualificação de doutorado")) {
            	obra.setNome( "Banca de Qualificação de Doutorado (" + ano + ") " + titulo + " - " + local);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_BANCA_QL_EXTERNA && MAX_BANCA_QL_EXTERNA>0)){
                        obra.setValido(false);
                        if(aux>=MAX_BANCA_QL_EXTERNA && MAX_BANCA_QL_EXTERNA>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(BANCA_QL_EXTERNA);
                    }
                    else{
                            comp = comp+BANCA_QL_EXTERNA;
                            aux++;
                            obra.setValor(BANCA_QL_EXTERNA);
                    }
                    levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(BANCA_QL_EXTERNA);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    //ok
    private void setOrientacaoDouAndConclu(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Doutorado em andamento/concluída");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
                obra.setNome("Orientação de Doutorado em Andamento (" + ano + ") " + titulo + "," + aluno);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_DR_AND_CONC && MAX_ORIENTACAO_DR_AND_CONC>0)){
                        obra.setValido(false);
                        if(aux>=MAX_ORIENTACAO_DR_AND_CONC && MAX_ORIENTACAO_DR_AND_CONC>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(ORIENTACAO_DR_AND_CONC);
                    }
                    else{
                            comp = comp+ORIENTACAO_DR_AND_CONC;
                            aux++;
                            obra.setValor(ORIENTACAO_DR_AND_CONC);
                    }
                    levante.AddObra(obra);
            }
        }
        
        expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
        NodeList orientacoesDoutoradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < orientacoesDoutoradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Orientação de Doutorado concluída ("+ ano + ") " + titulo + ", " + aluno);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_DR_AND_CONC && MAX_ORIENTACAO_DR_AND_CONC>0)){
                        obra.setValido(false);
                        if(aux>=MAX_ORIENTACAO_DR_AND_CONC && MAX_ORIENTACAO_DR_AND_CONC>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(ORIENTACAO_DR_AND_CONC);
                    }
                    else{
                            comp = comp+ORIENTACAO_DR_AND_CONC;
                            aux++;
                            obra.setValor(ORIENTACAO_DR_AND_CONC);
                    }
                    levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_DR_AND_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    //ok
    private void setCorientacaoDouAndConclu(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
        NodeList orientacoesDoutoradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Co-orientação de Doutorado andamento/concluída");
        Obras obra;
        float comp = 0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Co-orientação de Doutorado concluída ("+ ano + ") " + titulo + ", " + aluno);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_COORIENTACAO_DR_AND_CONC && MAX_COORIENTACAO_DR_AND_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_COORIENTACAO_DR_AND_CONC && MAX_COORIENTACAO_DR_AND_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(COORIENTACAO_DR_AND_CONC);
                }
                else{
                        comp = comp+COORIENTACAO_DR_AND_CONC;
                        aux++;
                        obra.setValor(COORIENTACAO_DR_AND_CONC);
                }
                levante.AddObra(obra);
            }
        }
        
        expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
                obra.setNome("Co-orientação  de Doutorado em Andamento (" + ano + ") " + titulo + "," + aluno);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_COORIENTACAO_DR_AND_CONC && MAX_COORIENTACAO_DR_AND_CONC>0)){
                        obra.setValido(false);
                        if(aux>=MAX_COORIENTACAO_DR_AND_CONC && MAX_COORIENTACAO_DR_AND_CONC>0)
                                obra.setValor(-1);
                        else
                        obra.setValor(COORIENTACAO_DR_AND_CONC);
                    }
                    else{
                            comp = comp+COORIENTACAO_DR_AND_CONC;
                            aux++;
                            obra.setValor(COORIENTACAO_DR_AND_CONC);
                    }
                    levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(COORIENTACAO_DR_AND_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    //ok
    private void setOrientacaoMesAndConclu(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Mestrado em andamento/concluída");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
                obra.setNome("Orientação de Mestrado em Andamento (" + ano + ") " + titulo + "," + aluno);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_MS_AND_CONC && MAX_ORIENTACAO_MS_AND_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ORIENTACAO_MS_AND_CONC && MAX_ORIENTACAO_MS_AND_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ORIENTACAO_MS_AND_CONC);
                }
                else{
                        comp = comp+ORIENTACAO_MS_AND_CONC;
                        aux++;
                        obra.setValor(ORIENTACAO_MS_AND_CONC);
                }
                levante.AddObra(obra);
            }
        }
        
        expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
        NodeList orientacoesMestradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < orientacoesMestradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesMestradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Orientação de Mestrado em concluída ("+ ano + ") " + titulo + ", " + aluno);
                if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_MS_AND_CONC && MAX_ORIENTACAO_MS_AND_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ORIENTACAO_MS_AND_CONC && MAX_ORIENTACAO_MS_AND_CONC>0)
                            obra.setValor(-1);
                    else
                        obra.setValor(ORIENTACAO_MS_AND_CONC);
                }
                else{
                        comp = comp+ORIENTACAO_MS_AND_CONC;
                        aux++;
                        obra.setValor(ORIENTACAO_MS_AND_CONC);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_MS_AND_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    //ok
    private void setCorientacaoMesAndConclu(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
        NodeList orientacoesMestradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Co-orientação de Mestrado andamento/concluída");
        Obras obra;
        float comp = 0,aux=0;
        for (int i = 0; i < orientacoesMestradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesMestradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Co-orientação de Mestrado concluída ("+ ano + ") " + titulo + ", " + aluno);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_COORIENTACAO_MS_AND_CONC && MAX_COORIENTACAO_MS_AND_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_COORIENTACAO_MS_AND_CONC && MAX_COORIENTACAO_MS_AND_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(COORIENTACAO_MS_AND_CONC);
                }
                else{
                        comp = comp+COORIENTACAO_MS_AND_CONC;
                        aux++;
                        obra.setValor(COORIENTACAO_MS_AND_CONC);
                }
                levante.AddObra(obra);
            }
        }
        
        expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
                obra.setNome("Co-orientação de Mestrado em Andamento (" + ano + ") " + titulo + "," + aluno);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_COORIENTACAO_MS_AND_CONC && MAX_COORIENTACAO_MS_AND_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_COORIENTACAO_MS_AND_CONC && MAX_COORIENTACAO_MS_AND_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(COORIENTACAO_MS_AND_CONC);
                }
                else{
                        comp = comp+COORIENTACAO_MS_AND_CONC;
                        aux++;
                        obra.setValor(COORIENTACAO_MS_AND_CONC);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(COORIENTACAO_MS_AND_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    //ok
    private void setOrientacaoDouAnd(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-DOUTORADO");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Doutorado em andamento");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
                obra.setNome("Orientação  de Doutorado em Andamento (" + ano + ") " + titulo + "," + aluno);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_DR_AND && MAX_ORIENTACAO_DR_AND>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ORIENTACAO_DR_AND && MAX_ORIENTACAO_DR_AND>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ORIENTACAO_DR_AND);
                }
                else{
                        comp = comp+ORIENTACAO_DR_AND;
                        aux++;
                        obra.setValor(ORIENTACAO_DR_AND);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_DR_AND);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    //ok
    private void setOrientacaoMesAnd(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-MESTRADO");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Mestrado em andamento");
        Obras obra;
        float comp=0, aux=0;
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
                obra.setNome("Orientação de Mestrado em Andamento (" + ano + ") " + titulo + "," + aluno);
                    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_MS_AND && MAX_ORIENTACAO_MS_AND>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ORIENTACAO_MS_AND && MAX_ORIENTACAO_MS_AND>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ORIENTACAO_MS_AND);
                }
                else{
                        comp = comp+ORIENTACAO_MS_AND;
                        aux++;
                        obra.setValor(ORIENTACAO_MS_AND);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_MS_AND);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    //ok
    private void setOrientacaoDoutoradoCon(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
        NodeList orientacoesDoutoradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Doutorado concluída");
        Obras obra;
        float comp=0, aux=0;
        for (int i = 0; i < orientacoesDoutoradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Orientação de Doutorado concluída ("+ ano + ") " + titulo + ", " + aluno);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_DR_CONC && MAX_ORIENTACAO_DR_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ORIENTACAO_DR_CONC && MAX_ORIENTACAO_DR_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ORIENTACAO_DR_CONC);
                }
                else{
                        comp = comp+ORIENTACAO_DR_CONC;
                        aux++;
                        obra.setValor(ORIENTACAO_DR_CONC);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_DR_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }

    //ok
    private void setOrientacaoMestradoCon(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
        NodeList orientacoesMestradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Mestrado em concluída");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < orientacoesMestradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesMestradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Orientação de Mestrado em concluída ("+ ano + ") " + titulo + ", " + aluno);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_MS_CONC && MAX_ORIENTACAO_MS_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_ORIENTACAO_MS_CONC && MAX_ORIENTACAO_MS_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(ORIENTACAO_MS_CONC);
                }
                else{
                        comp = comp+ORIENTACAO_MS_CONC;
                        aux++;
                        obra.setValor(ORIENTACAO_MS_CONC);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_MS_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    //ok
    private void setCorientacaoDoutoradoCon(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO");
        NodeList orientacoesDoutoradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Co-orientação de Doutorado concluída");
        Obras obra;
        float comp = 0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Co-orientação de Doutorado concluída ("+ ano + ") " + titulo + ", " + aluno);
            	    if(ano <= ANO_TRIENIO || (aux>=MAX_COORIENTACAO_DR_CONC && MAX_COORIENTACAO_DR_CONC>0)){
                    obra.setValido(false);
                    if(aux>=MAX_COORIENTACAO_DR_CONC && MAX_COORIENTACAO_DR_CONC>0)
                            obra.setValor(-1);
                    else
                    obra.setValor(COORIENTACAO_DR_CONC);
                }
                else{
                        comp = comp+COORIENTACAO_DR_CONC;
                        aux++;
                        obra.setValor(COORIENTACAO_DR_CONC);
                }
                levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(COORIENTACAO_DR_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    //ok
    private void setCorientacaoMestradoCon(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//ORIENTACOES-CONCLUIDAS-PARA-MESTRADO");
        NodeList orientacoesMestradoConcluida = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Co-orientação de Mestrado concluída");
        Obras obra;
        float comp = 0, aux=0;
        for (int i = 0; i < orientacoesMestradoConcluida.getLength(); i++) {
            Node orientacao = orientacoesMestradoConcluida.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO").getTextContent();
            String tipo = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("TIPO-DE-ORIENTACAO").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTADO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if (!tipo.equalsIgnoreCase("ORIENTADOR_PRINCIPAL")) {
            	obra.setNome("Co-orientação de Mestrado concluída ("+ ano + ") " + titulo + ", " + aluno);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_COORIENTACAO_MS_CONC && MAX_COORIENTACAO_MS_CONC>0)){
                obra.setValido(false);
                if(aux>=MAX_COORIENTACAO_MS_CONC && MAX_COORIENTACAO_MS_CONC>0)
                        obra.setValor(-1);
                else
                obra.setValor(COORIENTACAO_MS_CONC);
            }
            else{
                    comp = comp+COORIENTACAO_MS_CONC;
                    aux++;
                    obra.setValor(COORIENTACAO_MS_CONC);
            }
            levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(COORIENTACAO_MS_CONC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    
    private void serOrientacaoIC(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação Iniciação Científica andamento/concluída ");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getAttributes().getNamedItem("TITULO").getTextContent();
            String natureza = orientacao.getAttributes().getNamedItem("NATUREZA").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if(natureza.equalsIgnoreCase("INICIACAO_CIENTIFICA")){
            	obra.setNome("Orientação de Iniciação Ciêntifica Concluida (" + ano + ") " + titulo);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_IC && MAX_ORIENTACAO_IC>0)){
                obra.setValido(false);
                if(aux>=MAX_ORIENTACAO_IC && MAX_ORIENTACAO_IC>0)
                        obra.setValor(-1);
                else
                obra.setValor(ORIENTACAO_IC);
            }
            else{
                    comp = comp+ORIENTACAO_IC;
                    aux++;
                    obra.setValor(ORIENTACAO_IC);
            }
            levante.AddObra(obra);
            }
        }
        
        expr = xpath.compile("//ORIENTACAO-EM-ANDAMENTO-DE-INICIACAO-CIENTIFICA");
        orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("TITULO-DO-TRABALHO").getTextContent();
            String natureza = orientacao.getChildNodes().item(0).getAttributes().getNamedItem("NATUREZA").getTextContent();
            String aluno = orientacao.getChildNodes().item(1).getAttributes().getNamedItem("NOME-DO-ORIENTANDO").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getChildNodes().item(0).getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if(natureza.equalsIgnoreCase("Iniciação Científica")){
            	obra.setNome("Orientação de Iniciação Ciêntifica em Andamento (" + ano + ") " + titulo + ", " + aluno);
            	if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_IC && MAX_ORIENTACAO_IC>0)){
                obra.setValido(false);
                if(aux>=MAX_ORIENTACAO_IC && MAX_ORIENTACAO_IC>0)
                        obra.setValor(-1);
                else
                obra.setValor(ORIENTACAO_IC);
            }
            else{
                    comp = comp+ORIENTACAO_IC;
                    aux++;
                    obra.setValor(ORIENTACAO_IC);
            }
            levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_IC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    private void serOrientacaoTFC(XPath xpath, Resultado result, Document document) throws XPathExpressionException, NumberFormatException {
        XPathExpression expr = xpath.compile("//DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS");
        NodeList orientacoesDoutoradoAndamento = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
        Levantamento levante = new Levantamento();
        levante.setTipoObra("Orientação de Trabalho de conclusão de Curso concluída ");
        Obras obra;
        float comp=0,aux=0;
        for (int i = 0; i < orientacoesDoutoradoAndamento.getLength(); i++) {
            Node orientacao = orientacoesDoutoradoAndamento.item(i);
            String titulo = orientacao.getAttributes().getNamedItem("TITULO").getTextContent();
            String natureza = orientacao.getAttributes().getNamedItem("NATUREZA").getTextContent();
            Integer ano = Integer.valueOf(orientacao.getAttributes().getNamedItem("ANO").getTextContent());
            obra = new Obras();
            if(natureza.equalsIgnoreCase("TRABALHO_DE_CONCLUSAO_DE_CURSO_GRADUACAO")){
            	obra.setNome("Orientação de Trabalho de conclusão de Curso Concluida (" + ano + ") " + titulo );
            	if(ano <= ANO_TRIENIO || (aux>=MAX_ORIENTACAO_TFC && MAX_ORIENTACAO_TFC>0)){
                obra.setValido(false);
                if(aux>=MAX_ORIENTACAO_TFC && MAX_ORIENTACAO_TFC>0)
                        obra.setValor(-1);
                else
                obra.setValor(ORIENTACAO_TFC);
            }
            else{
                    comp = comp+ORIENTACAO_TFC;
                    aux++;
                    obra.setValor(ORIENTACAO_TFC);
            }
            levante.AddObra(obra);
            }
        }
        levante.setTotalValor(comp);
        levante.setValorItem(ORIENTACAO_TFC);
        result.AddLevante(levante);
        result.someTotal(comp);
    }
    
    
}
