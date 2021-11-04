package exemplopraticocurso;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t) {
        this.setStatus(true);
        this.setTipo(t);
        if (t == "cc") {
            this.setSaldo(50); }
        else if (t == "cp") {
            this.setSaldo(150); }
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.status = false;
        System.out.println("Conta fechada com sucesso"); }
        else {
            System.out.println("ERRO! Conta não pode ser fechada");
        }
    }
    
    public void depositar(double valor) {
        if (this.status = true) {
        this.setSaldo(this.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso");}
        else {
            System.out.println("Impossível depositar"); }
    }
    
    public void sacar(double valor) {
        if (this.status == true) {
            if (this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso");}
            else {
            System.out.println("ERRO! Você não possui saldo suficiente"); }}
        else {
            System.out.println("Impossível sacar");
        }
    }
    
    public void pagarMensal() {
        double v = 0;
        if (this.getTipo() == "cc") {
            v = 12;
        }
        else if (this.getTipo() == "cp") {
            v = 20;
        }
        if (this.status = true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }
        else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    public void statusC() {
        System.out.println("------------------");
        System.out.println("Nome: " + this.getDono());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Conta aberta? " + this.isStatus());
    }
}
