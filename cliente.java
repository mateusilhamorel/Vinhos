/*
 * Classe para gerar objetyo cliente;
 * Dados do cliente devem ser inserifod em objetos desta classe
 */
package dados;

import dados.compras;
import java.util.ArrayList;

/**
 *
 * @author Mateus Ilha Morel
 */
public class cliente {
    
    private long id;
    private String nome;
    private String cpf;
    private ArrayList<compras> nota = new ArrayList<compras>();

    public cliente() {
    }

    public cliente(long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<compras> getNota() {
        return nota;
    }

    public void setNota(ArrayList<compras> nota) {
        this.nota = nota;
    }

    public void insereCompra(compras ticket){ 
        nota.add(ticket);     
    }
    
       
   public double totalCompras(){
       double total = 0;
       
       for(int i=0; i<=(nota.size()-1); i++){
           total = total + nota.get(i).getValorTotal();
       }
       return total;
   } 
   
   public double valorCompra(int i){
       double vlr;
       vlr = nota.get(i).getValorTotal();
       return vlr;
   }
   
   public String valorCodigo(int i){
       String code;
       code = nota.get(i).getCodigo();
       return code;
   }
   
   public int numeroDeCompras(){
       return nota.size();
   }
   
   public String dataCompra(int i){
       return nota.get(i).getData();
   }
   
   public String cateoria(int i, int j){
       return nota.get(i).categoria(j);
   }
   
   public String variedade(int i, int j){
       return nota.get(i).variedade(j);
   } 
   
   public int nrVinCompra(int i){
       return nota.get(i).numeroItens();
   }
   
   public String getVinho(int i, int j){
       return nota.get(i).vinho(j);
   }
    
}
