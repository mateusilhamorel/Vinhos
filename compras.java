/*
 * Classe para organizar compras de cada cliente
 * Esta é uma classe auxiliar para organização dos dados de cada compra
 */
package dados;

import java.util.ArrayList;
import dados.vinhos;


/**
 *
 * @author Mateus Ilha Morel
 */
public class compras {
    
    private String codigo;
    private String data;
    private String cliente;
    private double valorTotal;
    private ArrayList<vinhos> itens = new ArrayList<vinhos>();

    
    public compras() {
    }

    public compras(String codigo, String data, String cliente, double valorTotal) {
        this.codigo = codigo;
        this.data = data;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<vinhos> getItens() {
        return itens;
    }

    public void setItens(ArrayList<vinhos> itens) {
        this.itens = itens;
    }
    
    public void insereVinho(vinhos item){
        itens.add(item);
    }
    
    public String categoria(int i){
        return itens.get(i).getCategoria();
    }
    
    public String variedade(int i){
        return itens.get(i).getVariedade();
    }
    
    public int numeroItens(){
        return itens.size();
    }
    
    public String vinho(int i){
        return itens.get(i).getProduto();
    }
}
