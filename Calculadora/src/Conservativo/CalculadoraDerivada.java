package Conservativo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.lsmp.djep.djep.DJep;
import org.lsmp.djep.groupJep.values.Polynomial;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;

public class CalculadoraDerivada extends javax.swing.JFrame {

    Derivadas1 derivada;

    public CalculadoraDerivada() {
        initComponents();
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texFuncion = new javax.swing.JTextField();
        my = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nx = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        texFuncion1 = new javax.swing.JTextField();
        texFuncionSalida2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        funcionP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mz = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nz = new javax.swing.JTextField();
        py = new javax.swing.JTextField();
        px = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de derivadas");

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("M");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 70, 9, 14);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("My");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 440, 14, 14);

        texFuncion.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(texFuncion);
        texFuncion.setBounds(70, 70, 244, 30);

        my.setEditable(false);
        my.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        my.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myActionPerformed(evt);
            }
        });
        jPanel1.add(my);
        my.setBounds(60, 440, 604, 30);

        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Derivar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 560, 76, 24);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Calculadora de derivadas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(36, 12, 290, 28);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 560, 76, 24);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Mz");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 330, 14, 14);

        nx.setEditable(false);
        nx.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(nx);
        nx.setBounds(60, 400, 604, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("P");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 150, 8, 14);

        texFuncion1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(texFuncion1);
        texFuncion1.setBounds(70, 110, 244, 30);

        texFuncionSalida2.setEditable(false);
        texFuncionSalida2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(texFuncionSalida2);
        texFuncionSalida2.setBounds(50, 520, 604, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("N");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 110, 9, 14);

        funcionP.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(funcionP);
        funcionP.setBounds(70, 150, 244, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Nx");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 400, 14, 14);

        mz.setEditable(false);
        mz.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(mz);
        mz.setBounds(60, 330, 604, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nz");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 230, 14, 14);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Py");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 190, 13, 14);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Px");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 290, 13, 14);

        nz.setEditable(false);
        nz.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(nz);
        nz.setBounds(60, 230, 604, 30);

        py.setEditable(false);
        py.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(py);
        py.setBounds(60, 190, 604, 30);

        px.setEditable(false);
        px.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(px);
        px.setBounds(60, 290, 604, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String funcion = texFuncion.getText();
        String funcion2 = texFuncion1.getText();
        String funcion3 = funcionP.getText();
        //&&!funcion3.isEmpty()
        if (!funcion.isEmpty()&&!funcion2.isEmpty()) {
            derivada = new Derivadas1();
            DJep djep = new DJep();
            derivada.setFuncionADerivar4(funcion2); // DN/DZ
            derivada.derivarZ();
            nz.setText(derivada.getFuncionDerivada4());  //Derivada de M con respecto a y
            System.out.println( djep.toString(derivada.getFuncionComp4()));
            derivada.setFuncionADerivar6(funcion);  // DM/DZ
            derivada.derivarZ();
            mz.setText(derivada.getFuncionDerivada6()); //Derivada de M con respecto a z
            derivada.setFuncionADerivar(funcion);   // DM/DY
             derivada.derivarY();
             my.setText(derivada.getFuncionDerivada()); //Derivada de N con respexto a Z
            derivada.setFuncionADerivar2(funcion2); // DN/DX
            derivada.derivarX();
            nx.setText(derivada.getFuncionDerivada2()); //Derivada de N con respecto a x
            derivada.setFuncionADerivar3(funcion3); // DP/DY
             derivada.derivarY();
              System.out.println( djep.toString(derivada.getFuncionComp3()));
            
             py.setText(derivada.getFuncionDerivada3()); //Derivada de P con respecto a y
             
              
            derivada.setFuncionADerivar5(funcion3); // DP/DX
            derivada.derivarX();
            
            px.setText(derivada.getFuncionDerivada5()); //Derivada de P con respecto a x
            
            
          
        }else{
            JOptionPane.showMessageDialog(null, "Campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if(my.getText().equals(nx.getText())){
            texFuncionSalida2.setText("Es Conservativo");
        }else{
            texFuncionSalida2.setText("No es Conservativo");
        }
        
        
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        texFuncion.setText("");
        my.setText("");
        texFuncion1.setText("");
        nx.setText("");
        texFuncionSalida2.setText("");
        nz.setText("");
        py.setText("");
        px.setText("");
        mz.setText("");
        funcionP.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void myActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraDerivada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField funcionP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField my;
    private javax.swing.JTextField mz;
    private javax.swing.JTextField nx;
    private javax.swing.JTextField nz;
    private javax.swing.JTextField px;
    private javax.swing.JTextField py;
    private javax.swing.JTextField texFuncion;
    private javax.swing.JTextField texFuncion1;
    private javax.swing.JTextField texFuncionSalida2;
    // End of variables declaration//GEN-END:variables

   
}
