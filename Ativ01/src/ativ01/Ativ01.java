package ativ01;
public class Ativ01 {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Iphone";
        c1.tela = 12.5;
        c1.cor = "Branco";
        c1.bateria = 50;
        c1.bloquear();
        c1.status();
        c1.telefonar();
    }
    
}
