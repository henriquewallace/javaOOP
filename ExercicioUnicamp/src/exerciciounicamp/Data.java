package exerciciounicamp;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesextenso;

    public Data(int dia, int mes, int ano, String mesextenso) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.mesextenso = mesextenso;
    }
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getMesextenso() {
        return mesextenso;
    }
    
    public void status() {
        System.out.println("Dia: " + this.dia);
        System.out.println("Mês: " + this.mes);
        System.out.println("Ano: " + this.ano);
        System.out.println("Mês por extenso: " + this.mesextenso);
        System.out.println("Data formatada: " + this.dia + "/" + this.mes + "/" + this.ano);
    }
    
}
