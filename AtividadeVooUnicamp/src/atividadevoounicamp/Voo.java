package atividadevoounicamp;
public class Voo {
     int data;
    private int horario;
    private int ocupmax;
    private int numerovoo;
    private boolean livre;
    private int proximoLivre;

    Data d1 = new Data(28, 11, 2021);
  
    public Voo(int horario, int numerovoo, int ocupmax) {
        this.horario = horario;
        this.numerovoo = numerovoo;
        this.ocupmax = ocupmax;
    }
    public int proximoLivre(int l) {
        return this.proximoLivre = l + 1;
    }
    public void verifica() {
        if (livre == false) {
            System.out.println("A cadeira está ocupada.");
        }
        else {
            System.out.println("A cadeira está livre.");
        }
    }

    public boolean isLivre() {
        return livre;
    }

    public void setLivre(boolean livre) {
        this.livre = livre;
    }
    
    public void statusVoo() {
        System.out.println("DADOS DO VOO:");
        System.out.println("Número do vôo: " + this.numerovoo);
        System.out.println("Data: " + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAno());
        System.out.println("Horário: " + this.horario + ":00");
        System.out.println("Ocupação máxima: " +  this.ocupmax);
        System.out.println("Próxima cadeira livre: " + this.proximoLivre);
        System.out.println("Livre: " + this.livre);
    }
}
