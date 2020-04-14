/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dados.cliente;
import dados.vinhos;
import dados.fidelidade;
import dados.selecionado;
import dados.importa;
import dados.clienteRedux;
import dados.jsonUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.json.simple.parser.ParseException;


/**
 *
 * @author user
 */
public class MainWindow extends javax.swing.JFrame {

    //Listas e variáveis usadas no processamento:
    int i,j,k;
        
    ArrayList<cliente> pessoas = new ArrayList<cliente>();
    ArrayList<vinhos> carta = new ArrayList<vinhos>();
    DefaultListModel CLI = new DefaultListModel();
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importarBTN = new javax.swing.JButton();
        classificaBTN = new javax.swing.JButton();
        compraBTN = new javax.swing.JButton();
        fidelidadeBTN = new javax.swing.JButton();
        recomendaBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientesList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaDados = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vinhos Velasquez APP");

        importarBTN.setText("Importar");
        importarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarBTNActionPerformed(evt);
            }
        });

        classificaBTN.setText("Classificar Clientes");
        classificaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classificaBTNActionPerformed(evt);
            }
        });

        compraBTN.setText("Maior Compra");
        compraBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraBTNActionPerformed(evt);
            }
        });

        fidelidadeBTN.setText("Fidelidade");
        fidelidadeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fidelidadeBTNActionPerformed(evt);
            }
        });

        recomendaBTN.setText("Recomendar");
        recomendaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recomendaBTNActionPerformed(evt);
            }
        });

        clientesList.setVisibleRowCount(2);
        clientesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientesList);

        AreaDados.setColumns(20);
        AreaDados.setRows(5);
        jScrollPane2.setViewportView(AreaDados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista / Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Dados");

        jLabel3.setText("Para recomendação, clicar no nome desejado em \"Lista / Cliente\"!");

        jLabel4.setText("ATENÇÃO: Pressione \"Importar\" para obter dados da WEB!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(classificaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(importarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compraBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fidelidadeBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recomendaBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(importarBTN)
                                .addGap(18, 18, 18)
                                .addComponent(classificaBTN)
                                .addGap(18, 18, 18)
                                .addComponent(compraBTN)
                                .addGap(18, 18, 18)
                                .addComponent(fidelidadeBTN)
                                .addGap(18, 18, 18)
                                .addComponent(recomendaBTN))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    //Ação do botão "Importar":
    private void importarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarBTNActionPerformed
        //Cria objeto de busca de dados.
        importa cadastro= new importa();
        try {
            //Busca na web os dados de cadastro de cliente.
            cadastro.cadastroClientes();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //Busca na web os dados de compras de clientes.
            cadastro.cadastroCompras();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Cria objeto de leitura de Json e organização de dados.
        jsonUtil filler = new jsonUtil();
        try {
            filler.leJASONcadastro(pessoas);
        } catch (ParseException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            filler.leJASONcompras(pessoas, carta);
        } catch (ParseException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_importarBTNActionPerformed

    
    
    
    //Ação do botão "Classificar Clientes"
    private void classificaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classificaBTNActionPerformed
        // Cria uma lista para inserção na janela.
        
        ArrayList<clienteRedux> redux = new ArrayList<clienteRedux>();
        CLI.removeAllElements();
        AreaDados.setText("");
        for(int i = 0; i<=(pessoas.size()-1); i++){
            //System.out.println("Pessoa: "+pessoas.get(i).getNome()+" Valor total: "+pessoas.get(i).totalCompras());
            redux.add(new clienteRedux(pessoas.get(i).getNome(), pessoas.get(i).totalCompras())); 
        }
        //Classifica clientes por maior valor total de todas as compras.
        Collections.sort(redux);
        //Carrega a lista
        for(int i = 0; i<=(redux.size()-1); i++){
            CLI.addElement(redux.get(i).getNome()+"   "+"    Valor Total: "+redux.get(i).getVlrTotal());
        }
        //Apresenta a lista
        clientesList.setModel(CLI);  
    }//GEN-LAST:event_classificaBTNActionPerformed

    
    //Avalia a maior compra unitária e mostra os dados
    private void compraBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraBTNActionPerformed
        String nome;
        String cpf;
        String codigo;
        double valor;
        
        CLI.removeAllElements();
        AreaDados.setText("");
        
        //Insere primeiro registro no vetor.
        nome = pessoas.get(0).getNome();
        cpf = pessoas.get(0).getCpf();
        codigo = pessoas.get(0).valorCodigo(0);
        valor = pessoas.get(0).valorCompra(0);
       
        //Trada data de compra
        //Insere ano indicado na caixa de entrada
        String ano = "";
        int anoAux = 0;
        for(int i = 0; i<(pessoas.size()-1); i++){
                for(j = 0; j<(pessoas.get(i).numeroDeCompras()-1); j++){
                        ano = pessoas.get(i).dataCompra(j);
                        ano = ano.substring(ano.length()-4);
                        anoAux = Integer.parseInt(ano);
                    }
        }
       
        
        //Faz a seleção do cliente com maior valor de compra unitária. 
        for(int i = 0; i<(pessoas.size()-1); i++){
            for(j = 0; j<(pessoas.get(i).numeroDeCompras()); j++){
                String anoNota = pessoas.get(i).dataCompra(j);
                anoNota = anoNota.substring(anoNota.length()-4);
                int anoCompra = Integer.parseInt(anoNota);
                if((pessoas.get(i).valorCompra(j)>valor) ){
                    if(anoCompra >= anoAux){
                        nome = pessoas.get(i).getNome();
                        cpf = pessoas.get(i).getCpf();
                        codigo = pessoas.get(i).valorCodigo(j);
                        valor = pessoas.get(i).valorCompra(j);
                        ano = Integer.toString(anoCompra);
                    }
                }
            }
        }
        CLI.addElement(nome);
        clientesList.setModel(CLI);
        
        this.AreaDados.setText("CPF: "+cpf+"\n"+
                "Cod. Compra: "+codigo+"\n"+
                "Ano da Compra: "+ano+"\n"+
                "Valor da compra: : "+valor+"\n"
        );
        
    }//GEN-LAST:event_compraBTNActionPerformed

    
    
    //Ação do botão fidelidade. Deve marcar o cliente com o maior numero de compras na loja.
    private void fidelidadeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fidelidadeBTNActionPerformed
        String nome;
        String cpf;
        ArrayList<String> codigos;
        double valor;
        
        CLI.removeAllElements();
        AreaDados.setText("");
        
        ArrayList<fidelidade> fiel = new ArrayList<fidelidade>();
        for(int i = 0; i<(pessoas.size()); i++){
            //System.out.println("Pessoa: "+pessoas.get(i).getNome()+" Valor total: "+pessoas.get(i).totalCompras());
            fiel.add(new fidelidade(pessoas.get(i).getNome(), pessoas.get(i).numeroDeCompras())); 
        }
        
        System.out.println("\n\n");
        //Classifica clientes por maior valor total de todas as compras.
        Collections.sort(fiel);
        
        //Carrega a lista
        for(int i = 0; i<(fiel.size()); i++){
            CLI.addElement(fiel.get(i).getNome()+" Compras: "+fiel.get(i).getCompras());
        }
        //Apresenta a lista
        clientesList.setModel(CLI);
        
        
    }//GEN-LAST:event_fidelidadeBTNActionPerformed

    private void recomendaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recomendaBTNActionPerformed
           
        CLI.removeAllElements();
        AreaDados.setText("");

        //Monta lista de clientes:
        for(int i = 0; i<(pessoas.size()); i++){
            CLI.addElement(pessoas.get(i).getNome());
        }
        //Apresenta a lista
        clientesList.setModel(CLI);
        
    
        
    }//GEN-LAST:event_recomendaBTNActionPerformed

    private void clientesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesListMouseClicked
       
        AreaDados.setText("");
        
        //Base 1 para recomendação
        int tinto = 0;
        int branco = 0; 
        int rose = 0;
        
        //Base 2 para recomendação
        int cabSauv = 0;
        int carm = 0;
        int chard = 0;
        int sauvBla = 0;
        int petVer = 0;
        int syrah = 0;
        int malb = 0;
        int merlot = 0;
        int tempra = 0;
        int garna = 0;
        int muscFron = 0;
        int piNoir = 0;
        
        int vencedor = 0;
        
        String nome = "cliente";
        String vencCateg = "";
        String vencVari = "";
        String vencProd = "";
        ArrayList<String> produto = new ArrayList<String>();
        
        nome = clientesList.getSelectedValue();
        
        //busca pessoa na lista e monta rank de classificação
        for(int i = 0; i<(pessoas.size()-1); i++){
            if(nome.equals(pessoas.get(i).getNome())){
                for(int j = 0; j<(pessoas.get(i).numeroDeCompras()-1); j++){
                    for(int k = 0; k<(pessoas.get(i).nrVinCompra(j)); k++){
                        produto.add(pessoas.get(i).getVinho(j, k));
                        switch(pessoas.get(i).cateoria(j, k)){
                            case "Branco":
                                branco++;
                                break;
                            case "Tinto":
                                tinto++;
                                break;
                            case "Rosé":
                                rose++;
                                break;
                            default:
                                break;
                        }
                        
                        switch(pessoas.get(i).variedade(j, k)){
                            case "Cabernet Sauvignon":
                                cabSauv++;
                                break;
                            case "Carménère":
                                carm++;
                                break;
                            case "Chardonnay":
                                chard++;
                                break;
                            case "Sauvignon Blanc":
                                sauvBla++;
                                break;
                            case "Petit Verdot":
                                petVer++;
                                break;
                            case "Syrah":
                                syrah++;
                                break;
                            case "Malbec":
                                malb++;
                                break;
                            case "Merlot":
                                merlot++;
                                break;
                            case "Tempranillo":
                                tempra++; 
                                break;
                            case "Garnacha":
                                garna++;
                                break;
                            case "Muscat de Frontignon":
                                muscFron++;
                                break;
                            case "Pinot Noir":
                                piNoir++;
                                break;    
                        }
                        
                    }
                }
            }
            
        }
    
        //Seleção da categoria vencedora    
        if(branco>vencedor){
            vencedor = branco;
            vencCateg = "Branco";
        }

        if(tinto>vencedor){
            vencedor = tinto;
            vencCateg = "Tinto";
        }

        if(rose>vencedor){
            vencedor = rose;
            vencCateg = "Rosé";
        }

        vencedor = 0;

        //Seleção da variedade vencedora
        if(cabSauv>vencedor){
            vencedor = cabSauv;
            vencVari = "Cabernet Sauvignon";
        }

        if(carm>vencedor){
            vencedor = carm;
            vencVari = "Carménère";
        }

        if(chard>vencedor){
            vencedor = chard;
            vencVari = "Chardonnay";

        }

        if(sauvBla>vencedor){
            vencedor = sauvBla;
            vencVari = "Sauvignon Blanc";
        }

        if(petVer>vencedor){
            vencedor = petVer;
            vencVari = "Petit Verdot";
        }

        if(syrah>vencedor){
            vencedor = syrah;
            vencVari = "Syrah";
        }

        if(malb>vencedor){
            vencedor = malb;
            vencVari = "Malbec";
        }

        if(merlot>vencedor){
            vencedor = merlot;
            vencVari = "Merlot";
        }

        if(tempra>vencedor){
            vencedor = tempra;
            vencVari = "Tempranillo";
        }

        if(garna>vencedor){
            vencedor = garna;
            vencVari = "Garnacha";
        }

        if(muscFron>vencedor){
            vencedor = muscFron;
            vencVari = "Muscat de Frontignon";
        }

        if(piNoir>vencedor){
            vencedor = piNoir;
            vencVari = "Pinot Noir";
        }
      
        System.out.println("Categoria: "+vencCateg+" Variedade: "+vencVari);
        for(int i=0; i<produto.size(); i++){
            System.out.println("Produto: "+produto.get(i));
        }
    
        for(int l = 0; l<carta.size(); l++){
            if(carta.get(l).getVariedade().equals(vencVari)){
                if(carta.get(l).getCategoria().equals(vencCateg)){
                    for(int m = 0; m<produto.size(); m++){
                        if(!carta.get(l).getProduto().equals(produto.get(m))){
                            vencProd = produto.get(m);
                        }
                    }
                }
            }
            
        }
        
        if(!vencProd.isEmpty()){
            this.AreaDados.setText("Recomendação:\n"+
                               "Produto: "+vencProd+"\n"+
                               "Variedade: "+vencVari+"\n"+
                               "Categoria: "+vencCateg+"\n"
            );
        }else{
            this.AreaDados.setText("Cliente sem preferencia definida!");
        }
        
    }//GEN-LAST:event_clientesListMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDados;
    private javax.swing.JButton classificaBTN;
    private javax.swing.JList<String> clientesList;
    private javax.swing.JButton compraBTN;
    private javax.swing.JButton fidelidadeBTN;
    private javax.swing.JButton importarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton recomendaBTN;
    // End of variables declaration//GEN-END:variables
}