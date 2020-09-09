/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariokart;

/**
 *
 * @author julia
 */
public class MarioKart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Objeto um
        Piloto p1 = new Piloto();
        p1.nome = "Relampago Marquinhos";
        p1.vilao = false;
        Kart kart1 = new Kart();
        kart1.nome = "Sprinter";

        //Agragação
        kart1.piloto = p1;

        //Composicçao
        kart1.motor1.cilindradas = "50";
        kart1.motor1.velocidadeMaxima = 100;

        //Objeto dois
        Piloto p2 = new Piloto();
        p2.nome = "Sally";
        p2.vilao = true;
        Kart kart2 = new Kart();
        kart2.nome = "Blue Falcon";

        //Agragação
        kart2.piloto = p2;

        //Composicçao
        kart2.motor2.cilindradas = "100";
        kart2.motor2.velocidadeMaxima = 135;

        System.out.println("Informaões piloto 01");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Vilão: " + kart1.piloto.vilao);
        System.out.println("Kart: " + kart1.nome);
        System.out.println("Velocidade máxima: " + kart1.motor1.velocidadeMaxima);
        System.out.println("------------------------------ \n");

        System.out.println("Informaões piloto 02");
        System.out.println("Nome: " + kart2.piloto.nome);
        System.out.println("Vilão: " + p2.vilao);
        System.out.println("Kart: " + kart2.nome);
        System.out.println("Cilindradas: " + kart2.motor2.cilindradas);
        System.out.println("------------------------------ \n");

        //Açoes
        kart2.fazerDrift();
        kart1.soltarTurbo();
        p1.soltaSuperPoder();
        kart1.pular();
        
    }
}