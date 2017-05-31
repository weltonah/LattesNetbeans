package br.com.Analise;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

import br.com.Modelo.Criterios;
import br.com.Modelo.Resultado;
import java.io.FileInputStream;

public class LattesMetricService {
/*
    public static Pesquisador getPesquisador(File file) throws Exception  {
        ZipFile zf = new ZipFile(file);
        ZipEntry ze = zf.entries().nextElement();
        InputStream stream = zf.getInputStream(ze);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document document = docBuilder.parse(stream);
        Avaliador avaliador = new AvaliadorDefault();
        Pesquisador pesquisador = avaliador.avaliar(document);
        pesquisador.setFileName(file.getName());
        zf.close();
        return pesquisador;
    }*/
    public static Resultado getPesquisador2(File file, Criterios crit) throws Exception  {
        String nome = file.getName();
        System.out.println(nome);
        System.out.println(nome.contains(".xml"));
        InputStream stream;ZipFile zf = null;
        Resultado result = null;
        if(nome.contains(".zip")){
            zf = new ZipFile(file);
            ZipEntry ze = zf.entries().nextElement();
            stream = zf.getInputStream(ze);
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document document = docBuilder.parse(stream);
            Avaliador avaliador = new AvaliadorDefault();
            result = avaliador.avaliar2(document, crit);
            result.setFileName(file.getName());
            zf.close();
        }
        else{
            stream = new FileInputStream(file);
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document document = docBuilder.parse(stream);
            Avaliador avaliador = new AvaliadorDefault();
            result = avaliador.avaliar2(document, crit);
            result.setFileName(file.getName());
        }
        return result;
    }
}
