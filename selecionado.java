/*
 * Classe para seleção de recomendação
 */
package dados;

/**
 *
 * @author Mateus Ilha Morel
 */
public class selecionado {
    String variedade;
    String categoria;

    public selecionado() {
    }

    public selecionado(String variedade, String categoria) {
        this.variedade = variedade;
        this.categoria = categoria;
    }

    public String getVariedade() {
        return variedade;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
