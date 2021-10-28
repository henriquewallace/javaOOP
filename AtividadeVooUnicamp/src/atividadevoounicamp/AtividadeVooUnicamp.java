package atividadevoounicamp;

public class AtividadeVooUnicamp {

    public static void main(String[] args) {
        Voo v1 = new Voo(13, 5796, 100);
        v1.proximoLivre(10);
        v1.setLivre(true);
        v1.statusVoo();
        v1.verifica();
    }
    
}
