
package jogovelha;
import javax.swing.JOptionPane;

public class GameVelha extends javax.swing.JFrame{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameVelha.class.getName());
    String simb = "0";
    String[] caminho = new String [9];
    int nj=0, j1 = 0, j2 = 0, emp = 0;
    String nome1 = "", nome2 = "";
    boolean enc=false;
    public GameVelha() {
        initComponents();
    }
    public void inicializar(){
        for(int i=0;i<9;i++){
            caminho[i]="";
        }
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        enc=false;
        estatistica();
        nj=0;
    }
    public void nomear(){
        nome1=JOptionPane.showInputDialog(null,"Digite o primeiro nome",1);
        nome2=JOptionPane.showInputDialog(null,"Digite o segundo nome",1);
        idNome.setText(nome1);
        estatistica();
    }
    public void estatistica(){
        estatistica1.setText(nome1+" = "+j1);
        estatistica2.setText(nome2+" = "+j2);
        estatistica3.setText("Empate = "+emp);
    }
    public String simbolo(){
        if(simb.equals("O")){
            simb="X";
            idNome.setText(nome2);
        }else{
            simb="O";
            idNome.setText(nome1);
    }
        nj++;
        return simb;
    }
    public void resultado(){
        int id=1;
        while((id<9)&&(enc == false)){
        if((caminho[id].length() ==3)){
            if((caminho[id]).equals("XXX")){
                JOptionPane.showMessageDialog(null,nome1 +", voce ganhou","Resuldado:",1);
                j1++;
                enc=true;
                inicializar();
            }else if((caminho[id].equals("OOO"))){
                JOptionPane.showMessageDialog(null, nome2 +", voce ganehou", "Resultado",1);
                j2++;
                enc = true;
                inicializar();
            }  
        }
        id++;
    }
        if((nj==9)&&(enc==false)){
        JOptionPane.showMessageDialog(null, "Jogo Empatado", "Resultado",1);
        emp++;
        inicializar();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        idNome = new javax.swing.JLabel();
        identificador2 = new javax.swing.JLabel();
        estatistica3 = new javax.swing.JLabel();
        estatistica = new javax.swing.JLabel();
        estatistica1 = new javax.swing.JLabel();
        estatistica2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b2.setToolTipText("");
        b2.addActionListener(this::b2ActionPerformed);
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 90, 68));

        b6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b6.setToolTipText("");
        b6.addActionListener(this::b6ActionPerformed);
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 90, 68));

        b9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b9.setToolTipText("");
        b9.addActionListener(this::b9ActionPerformed);
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 90, 68));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b5.setToolTipText("");
        b5.addActionListener(this::b5ActionPerformed);
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 68));

        b1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b1.setToolTipText("");
        b1.addActionListener(this::b1ActionPerformed);
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 68));

        b3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b3.setToolTipText("");
        b3.addActionListener(this::b3ActionPerformed);
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 90, 68));

        b4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b4.setToolTipText("");
        b4.addActionListener(this::b4ActionPerformed);
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, 68));

        b7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b7.setToolTipText("");
        b7.addActionListener(this::b7ActionPerformed);
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 68));

        b8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b8.setToolTipText("");
        b8.addActionListener(this::b8ActionPerformed);
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 68));

        idNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        idNome.setForeground(new java.awt.Color(255, 51, 51));
        idNome.setText("Turno do jogador:");
        getContentPane().add(idNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        identificador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        identificador2.setText("Turno do jogador:");
        getContentPane().add(identificador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        estatistica3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica3.setText("Estatitisca");
        getContentPane().add(estatistica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        estatistica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica.setText("Estatitisca");
        getContentPane().add(estatistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        estatistica1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica1.setText("Estatitisca");
        getContentPane().add(estatistica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 125, -1, 30));

        estatistica2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        estatistica2.setText("Estatitisca");
        getContentPane().add(estatistica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        pack();
    }// </editor-fold>                        

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(b3.getText().equals("")){
            b3.setText(simbolo());
            caminho[1]+=b3.getText();
            caminho[6]+=b3.getText();
        }
        if(nj>+5)resultado();
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(b6.getText().equals("")){
            b6.setText(simbolo());
            caminho[2]+=b6.getText();
            caminho[6]+=b6.getText();
        }
        if(nj >=5)resultado();
    }                                  

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(b1.getText().equals("")){
            b1.setText(simbolo());
            caminho[1]+=b1.getText();
            caminho[4]+=b1.getText();
            caminho[7]+=b1.getText();
        }
        if(nj >=5)resultado();
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(b2.getText().equals("")){
            b2.setText(simbolo());
            caminho[1]+=b2.getText();
            caminho[5]+=b2.getText();
        }
        if(nj >=5)resultado();
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(b4.getText().equals("")){
            b4.setText(simbolo());
            caminho[2]+=b4.getText();
            caminho[4]+=b4.getText();
        }
        if(nj >=5)resultado();
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(b5.getText().equals("")){
            b5.setText(simbolo());
            caminho[2]+=b5.getText();
            caminho[5]+=b5.getText();
            caminho[7]+=b5.getText();
            caminho[8]+=b5.getText();
        }
        if(nj >=5)resultado();
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
 
        if(b7.getText().equals("")){
            b7.setText(simbolo());
            caminho[3]+=b7.getText();
            caminho[4]+=b7.getText();
            caminho[8]+=b7.getText();
        }
        if(nj >=5)resultado();
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   

        if(b8.getText().equals("")){
            b8.setText(simbolo());
            caminho[3]+=b8.getText();
            caminho[5]+=b8.getText();
        }
        if(nf >=5)resultado();
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(b9.getText().equals("")){
            b9.setText(simbolo());
            caminho[3]+=b9.getText();
            caminho[6]+=b9.getText();
            caminho[7]+=b9.getText();
        }
    }                                  

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
       nomear();
       inicializar();
    }                                 

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new GameVelha().setVisible(true));
    }
                
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel estatistica;
    private javax.swing.JLabel estatistica1;
    private javax.swing.JLabel estatistica2;
    private javax.swing.JLabel estatistica3;
    private javax.swing.JLabel idNome;
    private javax.swing.JLabel identificador2;                  
}
