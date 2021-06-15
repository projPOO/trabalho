/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vacinas;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class arquivoTXT {
    
   public static String read(String pCaminhoArquivo) throws IOException{
       String conteudo = "";
       try{
               FileReader arq = new FileReader(pCaminhoArquivo);
               BufferedReader lerArq = new BufferedReader(arq);
               String line = "";
               try{
                   line = lerArq.readLine();
                   while(line != null){
                       conteudo += line;
                       line=lerArq.readLine();
                        System.out.println("\n " + line);
                        
                   }
                   arq.close();
               }catch (IOException e){
                   e.printStackTrace();
               }
       }catch (FileNotFoundException ex){
          conteudo = "erro: arquivo não encontrado!";
       }
       if(conteudo.contains("erro")){
           return "";
       }else{
           return conteudo;
       }
       
   }
    
    public static void SalvarDados(String pCaminhoArquivo, String pTextoEscrever){
        try(
                FileWriter criadorDeArquivos = new FileWriter(pCaminhoArquivo, true);
                BufferedWriter buffer = new BufferedWriter(criadorDeArquivos);
                PrintWriter escritorDeArquivos = new PrintWriter(buffer);
                
                ){
            escritorDeArquivos.append(pTextoEscrever);
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
            
        
    }
  
}