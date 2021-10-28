package atividadevoounicamp;
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String mesextenso;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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
    
    public void statusData() {
        System.out.println("Data formatada: " + this.dia + "/" + this.mes + "/" + this.ano);
    }
    
}
