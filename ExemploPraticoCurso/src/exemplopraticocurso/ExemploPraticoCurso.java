package exemplopraticocurso;

public class ExemploPraticoCurso {

    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco();
       c1.setDono("Henrique Wallace");
       c1.setNumConta(355465489);
       c1.abrirConta("cc");
       
       ContaBanco c2 = new ContaBanco();
       c2.setDono("Caio Eduardo");
       c2.setNumConta(35599989);
       c2.abrirConta("cp");
       
       c1.depositar(100);
       c2.depositar(500);
       c2.sacar(100);
       
       c1.sacar(150);
       c1.fecharConta();
       
       c1.statusC();
       c2.statusC();
  
    }
    
}
