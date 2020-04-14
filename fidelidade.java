/*
 * Classe para organizar lista de fidelidade
 */
package dados;

/**
 *
 * @author Mateus Ilha Morel
 */
public class fidelidade implements Comparable<fidelidade> {
    
    public String nome;
    public int compras;

    public fidelidade() {
    }

    public fidelidade(String nome, int compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }
    
    @Override
    public int compareTo(fidelidade outro) {
        if(this.compras > outro.getCompras()){
            return -1;
        }
        if(this.compras < outro.getCompras()){
            return 1;
        }
        return 0;
    }
    
}
