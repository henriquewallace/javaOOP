package aula002;

public class Aula002 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();    //Criando Objeto c1
        c1.cor = "Azul";             //Chamando o atributo
        c1.ponta = 0.5;              //Chamando o atributo
        c1.modelo = "BIC Cristal";   //Chamando o atributo
        c1.carga = 50;               //Chamando o atributo
        c1.tampar();                 //Chamando o método
        c1.status();                 //Chamando o método
        c1.rabiscar();               //Chamando o método
        
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 1.0;
        c2.modelo = "Tilibra";
        c2.carga = 78;
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
    
}
