/*
 * Esta classe contém os métodos para manipulação dos arquivos json importados.
 */
package dados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;


/**
 *
 * @author Mateus Ilha Morel
 */
public class jsonUtil {
    
    public void leJASONcadastro(ArrayList<cliente> pessoas) throws ParseException{
        
        String caminho;
        caminho = System.getProperty("user.dir");
        //JSONObject JSObject;
        JSONParser parser = new JSONParser();
        cliente pessoa = new cliente();
        try{
            JSONArray dadosClientes = (JSONArray)parser.parse(new FileReader(caminho+"\\cadastro.txt"));
            for(Object obj : dadosClientes){
            //Extrai cadastros
                JSONObject JSObject = (JSONObject) obj;
                long id = (long) JSObject.get("id");
                String nome = (String) JSObject.get("nome");
                String cpf = (String) JSObject.get("cpf");
                //Trata cpf
                cpf = cpf.replace(".", "");
                cpf = cpf.replace("-", "");
                if(cpf.length()<12){
                    cpf = "0"+cpf;
                }
                //adiciona novo item na lista de clientes
                pessoas.add(new cliente(id, nome, cpf));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        
    }
    
    
    public void leJASONcompras(ArrayList<cliente> pessoas, ArrayList<vinhos> carta) throws ParseException{
         
        String caminho;
        caminho = System.getProperty("user.dir");
        
        JSONParser parser = new JSONParser();
        
        try{
            JSONArray dadosCompras = (JSONArray)parser.parse(new FileReader(caminho+"\\compras.txt"));
            for(Object obj : dadosCompras){
            //Extrai cada compra
                JSONObject JSObject = (JSONObject) obj;
                
                vinhos item = new vinhos();
                
                int cont, index;
                
                String codigo = (String) JSObject.get("codigo");
                String data = (String) JSObject.get("data");
                //deve tratar cpf para acertar o valor (remove caracteres especiais)
                String cpfCompra = (String) JSObject.get("cliente");
                cpfCompra = cpfCompra.replace(".", "");
                if(cpfCompra.length()<12){
                    cpfCompra = "0"+cpfCompra;
                }
                //Converte o recebimento do valor double do Json 
                //(Biblioteca encontrou problemas para obter valor double)
                String valorConvert = JSObject.get("valorTotal").toString();
                double valorTotal = Double.parseDouble(valorConvert); 
                 
                //varrendo a lista de clientes    
                for(cont=0; cont<pessoas.size(); cont++){
                    String comparaCpf = pessoas.get(cont).getCpf();
                    //verifica se o cpf da compra é igual o do cliente
                    if(comparaCpf.equals(cpfCompra)){
                         
                        compras nota = new compras(codigo, data, cpfCompra, valorTotal);

                        //obtém vinhos comprados
                        JSONArray itens = (JSONArray) JSObject.get("itens");
                        for(Object vin : itens){
                            JSONObject JSONvin = (JSONObject) vin;
                            String codVenda = (String )JSONvin.get("codigo");
                            String produto = (String) JSONvin.get("produto");
                            String variedade = (String) JSONvin.get("variedade");
                            String pais = (String) JSONvin.get("pais");
                            String categoria = (String) JSONvin.get("categoria");
                            String safra = (String) JSONvin.get("safra");
                            String preco2 = JSONvin.get("preco").toString();
                            double preco = Double.parseDouble(preco2);
                            vinhos garrafa = new vinhos(codVenda, produto, variedade, pais, categoria, safra, preco);
                            nota.insereVinho(garrafa);
                            

                            //Monta carta de vinhos para consulta.
                            if(carta.isEmpty()){
                                carta.add(garrafa);
                            }else{
                                   for(index=0; index<carta.size(); index++){
                                       String prodComp = carta.get(index).getProduto();
                                       String variaComp = carta.get(index).getVariedade();
                                       String catComp = carta.get(index).getCategoria();
                                       String safComp = carta.get(index).getSafra();                                       
                                       if(!produto.equals(prodComp)){
                                           //System.out.println("Produto da compra: "+produto+" Produto da carta: "+prodComp);
                                           carta.add(garrafa);
                                           break;
                                       }else if(!variedade.equals(variaComp)){
                                           //System.out.println("Variedade da compra: "+variedade+" Variedade da carta: "+variaComp);
                                           carta.add(garrafa);
                                            break;
                                       }else if(!categoria.equals(catComp)){
                                           //System.out.println("Categoria da compra: "+categoria+" Categosria da carta: "+catComp);
                                           carta.add(garrafa);
                                           break; 
                                       }else if(!safra.equals(safComp)){
                                           //System.out.println("Safra da compra: "+safra+" Safra da carta: "+safComp);
                                           carta.add(garrafa);
                                           break; 
                                       }
                                   }
                               
                            } 
                       }
                        //insere na lista de compras do cliente os dados da compra
                       pessoas.get(cont).insereCompra(nota); 
                    }    
                }

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
    public void imprimeListagem (ArrayList<cliente> pessoas){
        int i,j,k;
        
        for(i=0; i<(pessoas.size()-1); i++){
            System.out.println(pessoas.get(i).getId());
            System.out.println(pessoas.get(i).getNome());
            System.out.println(pessoas.get(i).getCpf());
            for(j=0; j<(pessoas.get(i).getNota().size()-1); j++){
                System.out.println("   "+pessoas.get(i).getNota().get(j).getCodigo());
                System.out.println("   "+pessoas.get(i).getNota().get(j).getData());
                System.out.println("   "+pessoas.get(i).getNota().get(j).getCliente());
                System.out.println("   "+pessoas.get(i).getNota().get(j).getValorTotal());
                for(k=0; k<(pessoas.get(i).getNota().get(j).getItens().size()); k++){
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getCodigo());
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getProduto());
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getVariedade());
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getPais());
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getCategoria());
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getSafra());
                    System.out.println("       "+pessoas.get(i).getNota().get(j).getItens().get(k).getPreco());
                }
              }
        }
            System.out.println("\n");
        
    }
    
    public void imprimeCarta(ArrayList<vinhos> carta){
        int i;
        
        for(i=0; i<carta.size(); i++){
            System.out.println(carta.get(i).getCodigo());
            System.out.println(carta.get(i).getProduto());
            System.out.println(carta.get(i).getVariedade());
            System.out.println(carta.get(i).getPais());
            System.out.println(carta.get(i).getCategoria());
            System.out.println(carta.get(i).getSafra());
            System.out.println(carta.get(i).getPreco());
            
        }
        System.out.println("\n");
        
    }
    
    
}
