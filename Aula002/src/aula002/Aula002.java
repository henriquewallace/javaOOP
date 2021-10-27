package aula002;

public class Aula002 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();    //Criando Objeto c1
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
    
}
