/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_trabalhador;

/**
 *
 * @author julia
 */
public class Trabalhador {
    
    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento; 

    public Trabalhador(String nome, String profissao, float salario, String rg, String dataNascimento) {
        this.nome = nome;
        this.profissao = profissao;
        this.salario = salario;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
    void recebeAumento(float valor){
        salario = salario + valor;
    }
    
    float calculaGanhoAnual(){
        return salario * 13;
    }
    
    void mostraFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Profissao: " + profissao);
        System.out.println("Salario: " + salario);
        System.out.println("Rg: " + rg);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("*************************************");
    }
    
}
