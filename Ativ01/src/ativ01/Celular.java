package ativ01;
public class Celular {
    String marca;
    double tela;
    String cor;
    int bateria;
    boolean bloqueado;
    void status() {      //Criação método
        System.out.println("Marca: " + this.marca);
        System.out.println("Tela: " + this.tela + " inches");
        System.out.println("Cor: " + this.cor);
        System.out.println("Bateria: " + this.bateria + "%");
        System.out.println("Bloqueado: " + this.bloqueado);
    }
    void telefonar() {
        if (this.bloqueado == true) {
            System.out.println("Erro! O celular não pode telefonar."); }
        else {
            System.out.println("Telefonando...");
        }
    }
    void bloquear() {
        this.bloqueado = true;
    }
     void desbloquear() {
        this.bloqueado = false;
    } 
}
