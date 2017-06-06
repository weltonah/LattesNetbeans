/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class Log {
    public File file;
    private FileOutputStream fos;
    String arq;
    public Log(String a){
     arq=a;   
    }
    public void grava(String ip, String msg){
        //file = new File("/home/ciro/Documents/projetos/pgmc4/build/web/docs/log.txt");
        // file = new File("/usr/local/apache-tomcat-8.0.15/webapps/pgmc/docs/log.txt");
        // file = new File("C:\\Users\\Ciro\\Documents\\Projetos\\pgmc5\\web\\docs\\log.txt");
        file = new File(arq);
        SimpleDateFormat ano = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
        String a = ano.format(new Date());
        msg= "["+a+"] "+ ip +":\t"+ msg +"\n";
        try {
            fos = new FileOutputStream(file,true);
            fos.write(msg.getBytes());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
