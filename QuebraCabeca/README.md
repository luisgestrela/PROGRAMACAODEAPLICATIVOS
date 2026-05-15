import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class QuebraCabeca extends javax.swing.JFrame {
    private Timer timer;
    private int segundos = 0;
    ArrayList<Integer> lista = new ArrayList<>();
    int nj=0;
    JButton botao2 = new JButton();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(QuebraCabeca.class.getName());

    public QuebraCabeca() {
        initComponents();
        setLocationRelativeTo(null);
    }
   private void iniciarTimer() {
        timer = new Timer(1000, (ActionEvent e) -> {
            segundos++;
            // Atualiza a JLabel 'tempo' com minutos e segundos formatados
            int minutos = segundos / 60;
            int segundosRestantes = segundos % 60;
            tempo.setText(String.format("Tempo: %02d:%02d", minutos, segundosRestantes));
        });
        timer.start();
    }

    private void pararTimer() {
        if (timer != null) {
            timer.stop();
        }
    }
    
    public JButton idBotao(int p){
        switch(p){
            case 1 -> {
                return b1;
            }
            case 2 -> {
                return b2;
            }
            case 3 -> {
                return b3;
            }
            case 4 -> {
                return b4;
            }
            case 5 -> {
                return b5;
            }
            case 6 -> {
                return b6;
            }
            case 7 -> {
                return b7;
            }
            case 8 -> {
                return b8;
            }
            case 9 -> {
                return b9;
            }
            case 10 -> {
                return b10;
            }
            case 11 -> {
                return b11;
            }
            case 12 -> {
                return b12;
            }
            case 13 -> {
                return b13;
            }
            case 14 -> {
                return b14;
            }
            case 15 -> {
                return b15;
            }
            case 16 -> {
                return b16;
            }
        }        
        return null;
    }
    
    public void verificarVitoria() {
        boolean vitoria = true;

        for (int i = 0; i < 15; i++) {
            JButton botao = idBotao(i + 1);
            if (!botao.getText().equals(String.valueOf(i + 1))) {
                vitoria = false;
                break;
            }
        }

        // Verifica se o último botão está vazio (posição 16)
        if (!b16.getText().equals("")) {
            vitoria = false;
        }

        if (vitoria) {
            pararTimer();
            int resposta = JOptionPane.showConfirmDialog(
                null,
                "Parabéns! Você venceu!!! Deseja jogar novamente?",
                "Quebra-Cabeça",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            } else {
                embaralhar();
            }
        }
    }    
     
     


    public boolean verificarPossibilidade() {
        int inversoes = 0;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                int a = lista.get(i);
                int b = lista.get(j);
                if (a != 0 && b != 0 && a > b) {
                    inversoes++;
                }
            }
        }

        int posicaoZero = lista.indexOf(0);
        int linhaDoZero = 4 - (posicaoZero / 4); // linha do 0, de baixo pra cima

        return (linhaDoZero % 2 == 0 && inversoes % 2 != 0) ||
               (linhaDoZero % 2 != 0 && inversoes % 2 == 0);
    }
    
    public void embaralhar(){
        //Limpar a lista
        lista.clear();
        // Adicionando 15 números
        for (int i = 1; i <= 15; i++) {
            lista.add(i);              
        }

        // Adicionando uma posição em branco (0)
        lista.add(0);         
        
        // Embaralhando a lista e verificar a possibilidade se é possíbel chegar a vitória
        do {
            Collections.shuffle(lista);
        } while (!verificarPossibilidade());
        
        
        // Exibindo o resultado     
        b1.setText(lista.get(0) != 0 ? lista.get(0).toString() : "");
        b2.setText(lista.get(1) != 0 ? lista.get(1).toString() : "");
        b3.setText(lista.get(2) != 0 ? lista.get(2).toString() : "");
        b4.setText(lista.get(3) != 0 ? lista.get(3).toString() : "");
        b5.setText(lista.get(4) != 0 ? lista.get(4).toString() : "");
        b6.setText(lista.get(5) != 0 ? lista.get(5).toString() : "");
        b7.setText(lista.get(6) != 0 ? lista.get(6).toString() : "");
        b8.setText(lista.get(7) != 0 ? lista.get(7).toString() : "");
        b9.setText(lista.get(8) != 0 ? lista.get(8).toString() : "");
        b10.setText(lista.get(9) != 0 ? lista.get(9).toString() : "");
        b11.setText(lista.get(10) != 0 ? lista.get(10).toString() : "");
        b12.setText(lista.get(11) != 0 ? lista.get(11).toString() : "");
        b13.setText(lista.get(12) != 0 ? lista.get(12).toString() : "");
        b14.setText(lista.get(13) != 0 ? lista.get(13).toString() : "");
        b15.setText(lista.get(14) != 0 ? lista.get(14).toString() : "");
        b16.setText(lista.get(15) != 0 ? lista.get(15).toString() : "");  
        
        segundos = 0;
        nj = 0;
        jogadas.setText("0");
        tempo.setText("Tempo: 00:00");
        iniciarTimer();
    }
        public void mover(JButton botao1, int pos){         
        int posEsq=pos-1;
        int posDir=pos+1;
        int posTop=pos-4;
        int posDow=pos+4;
                     
        if((posEsq>0) && (posEsq<17)){     
            botao2=idBotao(posEsq);            
            if (botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");    
                nj++; 
                jogadas.setText(String.valueOf(nj));                                
            }
        }
        if((posDir>0) && (posDir<17)){
            botao2=idBotao(posDir); 
            if (botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");              
                nj++;    
                jogadas.setText(String.valueOf(nj));                
            }
        }
        if((posTop>0) && (posTop<17)){
            botao2=idBotao(posTop); 
            if (botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText(""); 
                nj++;           
                jogadas.setText(String.valueOf(nj));                             
            }
        }
        if((posDow>0) && (posDow<17)){
            botao2=idBotao(posDow); 
            if (botao2.getText().equals("")){
                botao2.setText(botao1.getText());
                botao1.setText("");       
                nj++;            
                jogadas.setText(String.valueOf(nj));                               
            }
        }             
        verificarVitoria();
    }
        
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        tempo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jogadas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b1.addActionListener(this::b1ActionPerformed);
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 115, 107));

        b2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b2.addActionListener(this::b2ActionPerformed);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 115, 107));

        b3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b3.addActionListener(this::b3ActionPerformed);
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 115, 107));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b4.addActionListener(this::b4ActionPerformed);
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 115, 107));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b5.addActionListener(this::b5ActionPerformed);
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 115, 107));

        b6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b6.addActionListener(this::b6ActionPerformed);
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 115, 107));

        b7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b7.addActionListener(this::b7ActionPerformed);
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 115, 107));

        b8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b8.addActionListener(this::b8ActionPerformed);
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 115, 107));

        b9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b9.addActionListener(this::b9ActionPerformed);
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 115, 107));

        b10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b10.addActionListener(this::b10ActionPerformed);
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 115, 107));

        b11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b11.addActionListener(this::b11ActionPerformed);
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 115, 107));

        b12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b12.addActionListener(this::b12ActionPerformed);
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 115, 107));

        b13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b13.addActionListener(this::b13ActionPerformed);
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 115, 107));

        b14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b14.addActionListener(this::b14ActionPerformed);
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 115, 107));

        b15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b15.addActionListener(this::b15ActionPerformed);
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 115, 107));

        b16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b16.addActionListener(this::b16ActionPerformed);
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 115, 107));

        tempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempo.setText("00:00:00");
        getContentPane().add(tempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 140, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Jogadas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 80, 30));

        jogadas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jogadas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jogadas.setText("0");
        getContentPane().add(jogadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 80, 30));

        pack();
    }                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b1,1);
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
      mover(b2,2);
    }                                  
    
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b3,3);
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b4,4);
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b5,5);
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
       mover(b6,6);
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b7,7);
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b8,8);
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        mover(b9,9);
    }                                  

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        mover(b10,10);
    }                                   

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        mover(b11,11);
    }                                   

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       mover(b12,12);
    }                                   

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        mover(b13,13);
    }                                   

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       mover(b14,14);
    }                                   

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        mover(b15,15);
    }                                   

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        mover(b16,16);
    }                                   

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        embaralhar();
    }                                 

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(() -> new QuebraCabeca().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jogadas;
    private javax.swing.JLabel tempo;                 
}
