import java.util.ArrayList;

public class Pessoa {
    String Nome;
    float Dinheiro;
    static ArrayList<Pessoa> Lista = new ArrayList<Pessoa>();
    public Pessoa(String nome,float dinheiro)
    {
        Nome = nome;
        Dinheiro = dinheiro;
        Lista.add(this);
    }
}
