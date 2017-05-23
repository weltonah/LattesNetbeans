package br.com.DAO;

import br.com.Modelo.Criterios;

public class CriterioDao {
	private Criterios crit;
	public CriterioDao(){
		
	}
	public Criterios preencher(String aux){
		if(aux.equals("exata")){
			float dedicacaoExclusiva= 10 ;
			float artCompPerioInd= 15 ;
			float artCompAceitoPublic= 8 ;
			float livro= 20 ;
			float capLivro=  10;
			float orgLivro=  5;
			float trabEvento = 3;
			float trabEventoInter=  0;
			float trabEventoNaci= 0 ;
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			float bancMestr=  5;
			float bancDout= 7 ;
			float bancQualDout=7  ;
			float oriDoutAndConc= 15 ;
			float oriDoutAnd=  0;
			float oriDoutConc=  0;
			float coriDoutAndConc= 5 ;
			float coriDoutConc=  0;
			float oriMestAndConc= 10 ;
			float oriMestAnd=  0;
			float oriMestConc=  0;
			float coriMestAndConc= 3 ;
			float coriMestConc=  0;
			float oriIcAndConc=  3;
			float proArtColNac=  0;
			float proArtIndNac=  0;
			float proArtColInt=  0;
			float proArtIndInt=  0;
			float doutor=  0;
			float oriTfc = 0;
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
		}
		if(aux.equals("biologica")){
			float dedicacaoExclusiva= 10 ;
			// Fator de impacto
			//Artigos completos em peri�dico indexados (dependo do fator de impacto)*	  *: 5pontos FI<0.5;    15 pontos 0.5<FI<3.0;   20 pontos FI>3.0					
			//Artigos completos aceitos para publica��o (depende do fator de impacto)**	**: 3pontos FI<0.5;    8 pontos 0.5<FI<3.0;     10 pontos FI>3.0			
			float artCompPerioInd= 15 ;
			float artCompAceitoPublic= 8 ;
			float livro= 15 ;
			float capLivro=  10;
			float orgLivro=  0;
			float trabEvento = 0;
			float trabEventoInter=  0;
			float trabEventoNaci= 0 ;
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			float bancMestr=  5;
			float bancDout= 7 ;
			float bancQualDout=7  ;
			float oriDoutAndConc= 15 ;
			float oriDoutAnd=  0;
			float oriDoutConc=  0;
			float coriDoutAndConc= 5 ;
			float coriDoutConc=  0;
			float oriMestAndConc= 10 ;
			float oriMestAnd=  0;
			float oriMestConc=  0;
			float coriMestAndConc= 3 ;
			float coriMestConc=  0;
			float oriIcAndConc=  3;
			float proArtColNac=  0;
			float proArtIndNac=  0;
			float proArtColInt=  0;
			float proArtIndInt=  0;
			float doutor=  0;
			float oriTfc = 0;
					
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
			}
		if(aux.equals("eng")){
			float dedicacaoExclusiva= 10 ;
			//Artigos completos publicados em peri�dicos JCR>0,5 ou A1 ou A2			
			//Artigos completos publicados em peri�dicos JCR<0,5 ou B1 ou B2			
			//Artigos completos publicados em peri�dicos sem JCR ou B3,B4,B5			
			//Artigos completos publicados em peri�dicos sem JCR ou C
			float artCompPerioInd= -1 ;
			float artCompAceitoPublic= -1 ;
			float livro= 15;
			float capLivro=  5;
			float orgLivro=  0;
			float trabEvento = 0;
			// Tara de 9 nos dois junto{
			float trabEventoInter=  6;
			float trabEventoNaci= 4 ;
			// }
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			// tara 6
			float bancMestr=  1;
			// tara 3
			float bancDout= 2;
			// tara 3
			float bancQualDout= (float) 1.5;
			float oriDoutAndConc= 0 ;
			// tara 3
			float oriDoutAnd=  3;
			float oriDoutConc=  10;
			float coriDoutAndConc= 0 ;
			float coriDoutConc=  2;
			float oriMestAndConc= 0 ;
			// tara 9
			float oriMestAnd=  (float) 1.5;
			float oriMestConc=  5;
			float coriMestAndConc= -1 ;
			float coriMestConc=  1;
			// tara 24
			float oriIcAndConc=  3;
			float proArtColNac=  -1;
			float proArtIndNac=  0;
			float proArtColInt=  0;
			float proArtIndInt=  0;
			float doutor=  0;
			// tara 12
			float oriTfc = (float) 0.5;
			
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
			}
		if(aux.equals("saude")){
			float dedicacaoExclusiva= 10 ;
			float artCompPerioInd= 20 ;
			float artCompAceitoPublic=10 ;
			float livro= 20 ;
			float capLivro=  15;
			float orgLivro=  10;
			float trabEvento = 5;
			float trabEventoInter=  0;
			float trabEventoNaci= 0 ;
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			float bancMestr=  5;
			float bancDout= 7 ;
			float bancQualDout=7  ;
			float oriDoutAndConc= 15 ;
			float oriDoutAnd=  0;
			float oriDoutConc=  0;
			float coriDoutAndConc= 5 ;
			float coriDoutConc=  0;
			float oriMestAndConc= 10 ;
			float oriMestAnd=  0;
			float oriMestConc=  0;
			float coriMestAndConc= 3 ;
			float coriMestConc=  0;
			float oriIcAndConc=  3;
			float proArtColNac=  0;
			float proArtIndNac=  0;
			float proArtColInt=  0;
			float proArtIndInt=  0;
			float doutor=  0;
			float oriTfc = 0;
			
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
			
		}
		if(aux.equals("social")){
			
			float dedicacaoExclusiva= 10 ;
//			Artigos completos per�odicos A (qualis �rea)			
//			Artigos completos per�odicos B1 e B2 (qualis �rea)			
//			Artigos completos em peri�dico  B3 e B5 (qualis �rea)			
//			Artigos completos em peri�dico  C (qualis �rea)			
//			Artigos aceitos completos per�odicos A (qualis �rea)			
//			Artigos aceitos completos per�odicos B1 e B12 (qualis �rea)			
//			Artigos aceitos completos em peri�dico  B3 e B5 (qualis �rea)			
//			Artigos aceitos completos em peri�dico  C (qualis �rea)			
			float artCompPerioInd= -1 ;
			float artCompAceitoPublic= -1 ;
			float livro= 20 ;
			float capLivro=  15;
			float orgLivro=  10;
			float trabEvento = 5;
			float trabEventoInter=  0;
			float trabEventoNaci= 0 ;
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			float bancMestr=  5;
			float bancDout= 7 ;
			float bancQualDout=7  ;
			float oriDoutAndConc= 15 ;
			float oriDoutAnd=  0;
			float oriDoutConc=  0;
			float coriDoutAndConc= 5 ;
			float coriDoutConc=  0;
			float oriMestAndConc= 10 ;
			float oriMestAnd=  0;
			float oriMestConc=  0;
			float coriMestAndConc= 3 ;
			float coriMestConc=  0;
			float oriIcAndConc=  3;
			float proArtColNac=  0;
			float proArtIndNac=  0;
			float proArtColInt=  0;
			float proArtIndInt=  0;
			float doutor=  10;
			float oriTfc = 0;
			
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
		}
		if(aux.equals("humanas")){
			float dedicacaoExclusiva= 10 ;
			float artCompPerioInd= 30 ;
			float artCompAceitoPublic= 15 ;
			float livro= 50 ;
			float capLivro=  10;
			float orgLivro=  50;
			float trabEvento = 5;
			float trabEventoInter=  0;
			float trabEventoNaci= 0 ;
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			float bancMestr=  5;
			float bancDout= 7 ;
			float bancQualDout=7  ;
			float oriDoutAndConc= 15 ;
			float oriDoutAnd=  0;
			float oriDoutConc=  0;
			float coriDoutAndConc= 5 ;
			float coriDoutConc=  0;
			float oriMestAndConc= 10 ;
			float oriMestAnd=  0;
			float oriMestConc=  0;
			float coriMestAndConc= 3 ;
			float coriMestConc=  0;
			float oriIcAndConc=  3;
			float proArtColNac=  0;
			float proArtIndNac=  0;
			float proArtColInt=  0;
			float proArtIndInt=  0;
			float doutor=  0;
			float oriTfc = 0;
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
			
		}
		if(aux.equals("letras")){
			float dedicacaoExclusiva= 10 ;
			float artCompPerioInd= 30 ;
			float artCompAceitoPublic= 15;
			float livro= 30 ;
			float capLivro=  30;
			float orgLivro=  50;
			float trabEvento = 10;
			float trabEventoInter=  0;
			float trabEventoNaci= 0 ;
			float depPatenteNac= 10 ;
			float depPatenteInt= 15 ;
			float bancMestr=  5;
			float bancDout= 7 ;
			float bancQualDout=7  ;
			float oriDoutAndConc= 15 ;
			float oriDoutAnd=  0;
			float oriDoutConc=  0;
			float coriDoutAndConc= 5 ;
			float coriDoutConc=  0;
			float oriMestAndConc= 10 ;
			float oriMestAnd=  0;
			float oriMestConc=  0;
			float coriMestAndConc= 3 ;
			float coriMestConc=  0;
			float oriIcAndConc=  3;
			float proArtColNac=  5;
			float proArtIndNac=  10;
			float proArtColInt=  10;
			float proArtIndInt=  15;
			float doutor=  0;
			float oriTfc = 0;
			crit = new Criterios(aux,dedicacaoExclusiva,artCompPerioInd,artCompAceitoPublic
					,livro,capLivro,orgLivro,trabEvento,trabEventoInter,trabEventoNaci,
					depPatenteNac,depPatenteInt,bancMestr,bancDout,bancQualDout,oriDoutAndConc,
					oriDoutAnd,oriDoutConc,coriDoutAndConc,coriDoutConc,oriMestAndConc
					,oriMestAnd,oriMestConc,coriMestAndConc,coriMestConc,oriIcAndConc,proArtColNac,
					proArtIndNac,proArtColInt,proArtIndInt,doutor,oriTfc);
		}
		return crit;
	}
}
