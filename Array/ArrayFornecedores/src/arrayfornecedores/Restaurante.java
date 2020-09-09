/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfornecedores;

/**
 *
 * @author julia
 */
public class Restaurante {

    public String nome;
    public String endereco;
    public String cnpj;

    public Fornecedor[] fornecedores = new Fornecedor[5];

    public Restaurante(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;

        for (int i = 0; i < fornecedores.length; i++) {
            if (fornecedores[i] == null) {
                fornecedores[i] = new Fornecedor();

            }

        }
    }

    public void exibirInfos() {
        
        System.out.println("------ Restaurante ------");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("\n");
        
        System.out.println("------ Fornecedores ------");
        for (int i = 0; i < fornecedores.length; i++) {
            if(fornecedores[i].tipo != null){
                System.out.println("Tipo: " + fornecedores[i].tipo);
                System.out.println("Quantidades: " + fornecedores[i].quantidade + " Kg");
                System.out.println("-----------------------------");
            }
            
        }
        

    }

}
