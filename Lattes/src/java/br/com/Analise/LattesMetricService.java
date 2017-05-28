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

public class LattesMetricService {

    public static Resultado getPesquisador2(File file, Criterios crit) throws Exception  {
        ZipFile zf = new ZipFile(file);
        ZipEntry ze = zf.entries().nextElement();
        InputStream stream = zf.getInputStream(ze);
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document document = docBuilder.parse(stream);
        AvaliadorDefault avaliador = new AvaliadorDefault();
        Resultado result = avaliador.avaliar2(document, crit);
        result.setFileName(file.getName());
        zf.close();
        return result;
    }
    
}
