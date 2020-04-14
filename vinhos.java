/*
 * Classe que organiza os dados de cada produto.
 */
package dados;

/**
 *
 * @author Mateus Ilha Morel
 */
public class vinhos {
    
    private String codigo;
    private String produto;       
    private String variedade;
    private String pais;
    private String categoria;
    private String safra;                       
    private double preco;     

    public vinhos() {
    }

    public vinhos(String codigo, String produto, String variedade, String pais, String categoria, String safra, double preco) {
        this.codigo = codigo;
        this.produto = produto;
        this.variedade = variedade;
        this.pais = pais;
        this.categoria = categoria;
        this.safra = safra;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getVariedade() {
        return variedade;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSafra() {
        return safra;
    }

    public void setSafra(String safra) {
        this.safra = safra;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
     
    
    
    
}
