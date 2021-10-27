package aula002;
public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;
    public void status() {        //Visibilidade publica
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    public void rabiscar() {       //Visibilidade publica
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar."); }
        else {
            System.out.println("Estou rabiscando..."); }
    }
    public void tampar() {        //Visibilidade privada
        this.tampada = true;    
    }
    public void destampar() {     //Visibilidade privada
        this.tampada = false;
    }
}
