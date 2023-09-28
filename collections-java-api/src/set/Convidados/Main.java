package set.Convidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjunto1 = new ConjuntoConvidados();

        conjunto1.addConvidado("ernesto", "278");
        conjunto1.addConvidado("bruna", "159");
        conjunto1.addConvidado("nacho", "811");
        conjunto1.addConvidado("bruna", "159");
        conjunto1.addConvidado("bruna", "159");

        conjunto1.exibeConvidados();
        System.out.println(conjunto1.contaConvidados());

    }
}
