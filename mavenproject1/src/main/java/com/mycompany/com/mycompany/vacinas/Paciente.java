/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.com.mycompany.vacinas;


import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.com.mycompany.vacinas.arquivoTXT;
import java.io.IOException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Paciente extends Pessoa {

    private String dose1;
    private String dose2;
    private String aplicador;
    private Telefone telefone;
    private Endereco endereco;
    public int menor;
    public int adulto;
    public int idoso;
    public int mediaP;
 
    public int total;
    public Paciente() {
        super();
    }

    public String getDose1() {
        return dose1;
    }

    public String getDose2() {
        return dose2;
    }

    public void setDose1(String dose1) {
        this.dose1 = dose1;
    }

    public void setDose2(String dose2) {
        this.dose2 = dose2;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getAplicador() {
        return aplicador;
    }

    public void setAplicador(String aplicado) {
        this.aplicador = aplicado;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public int getMenor() {
        return menor;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public int getAdulto() {
        return adulto;
    }

    public void setAdulto(int adulto) {
        this.adulto = adulto;
    }

    public int getIdoso() {
        return idoso;
    }

    public void setIdoso(int idoso) {
        this.idoso = idoso;
    }

    public float getMediaP() {
        return mediaP;
    }

    public void setMediaP(int mediaP) {
        this.mediaP = (int) mediaP;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    

    public void cadastrarPaciente(ArrayList<Paciente> pacientes, Scanner teclado, Paciente p) {
        float mediaP;
        
        Telefone t = new Telefone();
        Endereco e = new Endereco();
        System.out.println("------------------");
        System.out.println("Cadastrar PACIENTE");
        System.out.println("------------------");
        System.out.println("Informe o Nome:");
        p.nome = teclado.next();
        System.out.println("Informe o CPF:");
        p.cpf = teclado.next();
        System.out.println("Informe a Idade:");
        p.idade = teclado.nextInt();
        
       
       
        //Telefone
        System.out.println("-------Telefone-------");
        System.out.println("Informe o tipo do Telefone:");
        t.setTipo(teclado.next());
        System.out.println("Informe o DDD:");
        t.setDdd(teclado.next());
        System.out.println("Informe o numero:");
        t.setNumero(teclado.next());
        p.setTelefone(t);

        //Endereço
        System.out.println("-------Endereço-------");
        System.out.println("Informe a Rua:");
        e.setRua(teclado.next());
        System.out.println("Informe a Cidade:");
        e.setCidade(teclado.next());
        System.out.println("Informe o Estado:");
        e.setEstado(teclado.next());
        System.out.println("Informe o cep:");
        e.setCep(teclado.next());
        p.setEndereco(e);

        pacientes.add(p);

    }

    public int estatisticas(Scanner teclado, Paciente p) {
        int tomou, tomou2, opcao;
        System.out.println("O paciente ja tomou a primeira DOSE?");
        System.out.println(" (Digite 1 para SIM e 2 para NÃO)");
        tomou = teclado.nextInt(); 
         if (tomou == 1) {
            p.dose1 = "OK!";
            System.out.println("O paciente ja tomou a segunda DOSE?");
            System.out.println(" (Digite 1 para SIM e 2 para NÃO)");
            tomou2 = teclado.nextInt();
            if (tomou2 == 1) {
                p.dose2 = "OK!";
                return 2;

            } else if (tomou2 == 2){
                System.out.println("Informe a Data para marcação da Segunda DOSE:");
                p.dose2 = teclado.next();
                return 1;      
                }
            }else {
             System.out.println("Informe a Data para marcação da Primeira DOSE:");
        p.dose1 = teclado.next();
        p.dose2 = " - ";
        return 3;
         }
        return 1;

        }
        
    public void estatisticasPessoas(ArrayList<Paciente> pacientes, Paciente p){
        for(Paciente p1: pacientes){
       
            if(p1.idade < 19){
             p.menor++;
        }else if((p1.idade > 18) && (p1.idade < 60)){
            p.adulto++;
        }else{
           p.idoso++;
        }
    }
     
         p.total = p.menor + p.adulto + p.idoso;
         p.mediaP= (p.menor + p.adulto + p.idoso)/3;
         
                    System.out.println("total de pacientes cadastrados :" + p.total);
                    System.out.println("total de pacientes cadastrados :" + p.menor);
                    System.out.println("total de pacientes cadastrados :" + p.adulto);
                    System.out.println("total de pacientes cadastrados :" + p.idoso);
                    System.out.println("total de pacientes cadastrados :" + p.mediaP);
                   
                   
    }
       
    public void relatorio(ArrayList<Paciente> pacientes, Paciente p){
        int i=1;
        int men=0, ad=0, ido=0, tot=0;
        for (Paciente p1 : pacientes) {
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt","Nome :" + p1.nome);
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "CPF : " + p1.cpf);
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Idade: " + Integer.toString(p1.idade));
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt","Telefone :" +  p1.telefone.getTipo() + " - (" + p1.telefone.getDdd() + ") " + p1.telefone.getNumero());
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Endereço :" + p1.endereco.getCep() + " - " + p1.endereco.getEstado() + " - " + p1.endereco.getCidade() + " - " + p1.endereco.getRua());
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt","Primeira Dose:" + p1.dose1);
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Segunda Dose :" + p1.dose2);
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "-------------------------------------");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            
            
          
           
        }
            estatisticasPessoas(pacientes, p);
            tot = p.total;
            men= p.menor;
            ad= p.adulto;
            ido= p.idoso;
          
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Total de Pacientes: " + Integer.toString(tot));
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Total de pacientes menores de Idade: " + Integer.toString(men));
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Total de pacientes Adultos: " + Integer.toString(ad));
            arquivoTXT.SalvarDados( "pacientesVac.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt","Total de pacientes Idosos: " + Integer.toString(ido));
            arquivoTXT.SalvarDados( "pacientesVac1.txt", "\n");
            arquivoTXT.SalvarDados( "pacientesVac.txt", "Media de pacientes: " + p.mediaP);
    }
 
    public void lerRelatorio() throws IOException{
        try{
        String linha= arquivoTXT.read("pacientesVac.txt");
       
       
            
               
            }catch(Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            
            
        }

    
        

    public void imprimir(ArrayList<Paciente> pacientes, Paciente p) {
        int i = 1;
        float media=0;
        System.out.println("-------------------------------------");
        System.out.println("Total de Pacientes Cadastrados :" + pacientes.size());
        System.out.println("-------------------------------------");
        for (Paciente p1 : pacientes) {
            System.out.println(i++ + "- Nome     : " + p1.nome);
            System.out.println("   CPF      : " + p1.cpf);
            System.out.println("   Idade    : " + p1.idade);
            System.out.println("   Telefone : " + p1.telefone.getTipo() + " - (" + p1.telefone.getDdd() + ") " + p1.telefone.getNumero());
            System.out.println("   Endereco : " + p1.endereco.getCep() + " - " + p1.endereco.getEstado() + " - " + p1.endereco.getCidade() + " - " + p1.endereco.getRua());
            System.out.println("   Dose 1   : " + p1.dose1);
            System.out.println("   Dose 2   : " + p1.dose2);
            System.out.println("-------------------------------------");
          
           
        }
           
           
            
    }

}