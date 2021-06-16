/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vacinas;



import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfissionalDaSaude extends Pessoa {

    private String crm;

    public ProfissionalDaSaude() {
        super();
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void cadastrarProfissional(ArrayList<ProfissionalDaSaude> profSaude, Scanner teclado, ProfissionalDaSaude s) {
        System.out.println("-------------------------------");
        System.out.println("Cadastrar PROFISSIONAL DA SAUDE");
        System.out.println("-------------------------------");
        System.out.println("Informe o Nome:");
        s.nome = teclado.next();
        System.out.println("Informe o CPF:");
        s.cpf = teclado.next();
        System.out.println("Informe a Idade:");
        s.idade = teclado.nextInt();
        System.out.println("Informe o CRM:");
        s.crm = teclado.next();
        profSaude.add(s);
    }

    public void imprimirProssional(ArrayList<ProfissionalDaSaude> profSaude) {
        int i = 1;
        System.out.println("-------------------------------------");
        System.out.println("Total de Profissionais da Saude :" + profSaude.size());
        System.out.println("-------------------------------------");
        for (ProfissionalDaSaude s1 : profSaude) {
            System.out.println(i++ + "- Nome     : " + s1.nome);
            System.out.println("   CRM      : " + s1.crm);
            System.out.println("   CPF      : " + s1.cpf);
            System.out.println("   Idade    : " + s1.idade);
            System.out.println("-------------------------------------");
        }
    }

}
