/*
 * Classe para importação de dados para o aplicativo.
 * Deve buscar arquivos JSON em um endereço específico.
 */
package dados;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.io.IOException;




/**
 *
 * @author Mateus Ilha Morel
 */
public class importa {
 
       
    
    //Método para recebimento dos dados da web.
    public void cadastroClientes() throws IOException {
        
        String caminho;
        caminho = System.getProperty("user.dir");
        
        URL url = new URL("http://www.mocky.io/v2/598b16291100004705515ec5");
        File file = new File(caminho+"\\cadastro.txt");

        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = is.read()) != -1) {
            fos.write(bytes);
        }
        is.close();

        fos.close();   
    }
    
    //Método para recebimento do cadastro das compras via web.
    public void cadastroCompras() throws IOException {
        String caminho;
        caminho = System.getProperty("user.dir");
        
        URL url = new URL("http://www.mocky.io/v2/598b16861100004905515ec7");
        File file = new File(caminho+"\\compras.txt");

        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream(file);

        int bytes = 0;

        while ((bytes = is.read()) != -1) {
            fos.write(bytes);
        }
        is.close();

        fos.close(); 
    }
    
    
}
