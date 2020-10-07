/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayempresa;

/**
 *
 * @author julia
 */
public class Empresa {
    
    public String cnpj;
    public String endereco;
    
    public Contato[] contatos;

    public Empresa(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    
    public void exibirInfos(){
        System.out.println("-----(Empresa)-----");
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("\n");
        
        System.out.println("-----(Contatos)-----");
        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null){
                System.out.println("Nome: " + contatos[i].nome);
                System.out.println("Telefone: " + contatos[i].telefone);
                System.out.println("Email: " + contatos[i].email);
                System.out.println("Data de Nascimento: " + contatos[i].dataNascimento);
                System.out.println("-----------------------------------------");
            }
            
        }
    }
}
