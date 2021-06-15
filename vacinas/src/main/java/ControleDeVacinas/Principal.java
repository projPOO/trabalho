/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeVacinas;



import com.mycompany.vacinas.Endereco;
import com.mycompany.vacinas.Paciente;
import com.mycompany.vacinas.ProfissionalDaSaude;
import com.mycompany.vacinas.Telefone;
import com.mycompany.vacinas.arquivoTXT;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ProfissionalDaSaude> profSaude = new ArrayList();
        ArrayList<Paciente> pacientes = new ArrayList();
        
        int opcao, i = 1, d1 = 0, d2 = 0, d0 = 0;
     
        String opcao2;
        
        do {
            opcao = Principal.menuPrincipal(teclado);
            Paciente p = new Paciente();
            ProfissionalDaSaude s = new ProfissionalDaSaude();
            switch (opcao) {
                case 1:
                    p.cadastrarPaciente(pacientes, teclado, p);
                 
                    int cont = p.estatisticas(teclado, p);
                    if (cont == 2) {
                        d2++;
                        d1++;
                    }else if (cont == 1) {
                        d1++;
                    } else {
                        d0++;
                    }
                   
                    break;
                case 2:
                    s.cadastrarProfissional(profSaude, teclado, s);
                    break;
                case 3:
                    p.imprimir(pacientes, p);
                    System.out.println("Digite 1 para voltar para o menu:");
                    opcao2 = teclado.next();
                    break;
                case 4:
                    s.imprimirProssional(profSaude);
                    System.out.println("--------------------------------");
                    System.out.println("Digite 1 para voltar para o menu:");
                    opcao2 = teclado.next();

                    break;
                case 5:
                    System.out.println("--------------");
                    System.out.println("Estatisticas :");
                    System.out.println("--------------");
                    p.estatisticasPessoas(pacientes, p);
                    System.out.println("Pessoas que tomaram 1 dose :" + d1);
                    System.out.println("Pessoas que tomaram 2 doses:" + d2);
                    System.out.println("Pessoas que tomaram 0 doses:" + d0);
                    System.out.println("--------------------------------");
                    System.out.println("Digite 1 para voltar para o menu:");
                    opcao2 = teclado.next();

                    break;
                case 6:
                    p.relatorio(pacientes, p);
                    System.out.println("--------------");
                    System.out.println("Relatorio Criado :");
                    System.out.println("--------------");
                    opcao2 = teclado.next();
                    break;
                case 7:
                    System.out.println("--------------");
                    System.out.println("lendo arquivo... :");
                    System.out.println("--------------");
                    p.lerRelatorio();
                    opcao2 = teclado.next();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            
        } while (opcao != 0);
        
        teclado.close();

    }

    public static int menuPrincipal(Scanner teclado) {
        System.out.println("\n\n### Controle de Vacinas ###");
        System.out.println("\n=========================");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Cadastrar Profissional da Saude");
        System.out.println("3 - Listar Pacientes");
        System.out.println("4 - Listar Profissionais da Saude");
        System.out.println("5 - Estatisticas");
        System.out.println("6 - Relatorio");
        System.out.println("7 - Ler Relatorio");
        System.out.println("0 - Sair          ");
        System.out.println("=========================\n");
        System.out.print("\nDigite sua opção: ");
        return teclado.nextInt();
    }

}
