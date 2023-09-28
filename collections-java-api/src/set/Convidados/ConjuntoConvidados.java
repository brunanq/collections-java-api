package set.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet= new HashSet<>();
    }

    public void addConvidado(String nome, String numeroConvite){
        Convidado convidado = new Convidado(nome, numeroConvite);
        convidadoSet.add(convidado);
    }

    public void removeConvidado(String codigo){
        for (Convidado convidado : convidadoSet) {
            if(codigo.equals(convidado.getNumeroConvite())){
                convidadoSet.remove(convidado);
                break;
            }
        }
    }

    public int contaConvidados(){
        return convidadoSet.size();
    }

    public void exibeConvidados(){
        for (Convidado convidado : convidadoSet) {
            System.out.println(convidado);
        }
    }

}
