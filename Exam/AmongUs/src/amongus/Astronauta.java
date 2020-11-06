/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amongus;

/**
 *
 * @author Administrador
 */
public abstract class Astronauta {

    private static int auxqtdAustronauta = 0;
    private int qtdAustronauta;
    protected String nome;
    protected String cor;

    Skin skin = new Skin();
    Pet pet = new Pet();

    Astronauta() {
        auxqtdAustronauta++;
        this.qtdAustronauta = auxqtdAustronauta++;
    }
    
    public int getQtdAustronauta() {
        return qtdAustronauta;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        if (skin.getTipo() != null) {
            System.out.println("Skin: " + skin.getTipo());
        }
        if (pet.getPet() != null) {
            System.out.println("Pet: " + pet.getPet());
        }
    }

    public abstract void reportar();

    public abstract void votar();
}
