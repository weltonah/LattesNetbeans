package br.com.Analise;

import java.util.List;
import org.w3c.dom.Document;

import br.com.Modelo.Criterios;
import br.com.Modelo.Pesquisador;
import br.com.Modelo.Resultado;

/**
 *
 * @author igor
 */
interface Avaliador {

    public Resultado avaliar2(Document document, Criterios crit)  throws Exception;
    public List<Object> getResultado();
}
