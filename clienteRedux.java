/*
 * Classe de cliente reduzida para classificação
 */
package dados;




/**
 *
 * @author Mateus Ilha Morel
 */
public class clienteRedux implements Comparable<clienteRedux> {
    
    public String nome;
    public double vlrTotal;

    public clienteRedux() {
    }

    public clienteRedux(String nome, double vlrTotal) {
        this.nome = nome;
        this.vlrTotal = vlrTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(double vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    @Override
    public int compareTo(clienteRedux outro) {
        if(this.vlrTotal > outro.getVlrTotal()){
            return -1;
        }
        if(this.vlrTotal < outro.getVlrTotal()){
            return 1;
        }
        return 0;
    }
   
}

