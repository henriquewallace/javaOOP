package ativ02;
public class AulaOnline {
    double tempo;
    int nAlunos;
    String professor;
    String disciplina;
    boolean iniciar;
    void status() {
        System.out.println("Tempo de duração: " + this.tempo + " horas");
        System.out.println("Número de alunos: " + this.nAlunos);
        System.out.println("Nome do professor: " + this.professor);
        System.out.println("Nome da disciplina: " + this.disciplina);
        System.out.println("Aula começou: " + this.iniciar);
    }
    void tirarDuvida() {
        if (this.iniciar == false) {
            System.out.println("Você não pode perguntar.");
        }
        else {
            System.out.println("Perguntando...");
        }
    }
    void iniciar() {
        this.iniciar = true;
    }
    void fechar() {
        this.iniciar = false;
    }
}
