package exercicio1;

public class Leao extends Felino {

    Leao(String nome, Double peso) {
        super(nome, peso);
    }

    @Override
    public boolean getDomestico() {
        return false;
    }
}
