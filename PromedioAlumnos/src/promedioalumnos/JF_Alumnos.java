/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioalumnos;

import javax.swing.JOptionPane;



/**
 *
 * @author SergioMarquez
 */
public class JF_Alumnos extends javax.swing.JFrame {
    
    
     double cal_ser, cal_saber, cal_saber_hacer, promedio, porcentaje_ser, porcentaje_saber, porcentaje_hacer;
     String nombre;
     int alumnos;
     double acomulador = 0;
     double promedio_grupal;
    
    
    public JF_Alumnos() {
        initComponents();
        
       this.setLocationRelativeTo(null);
       this.setSize(400, 400);
       
       alumnos = Integer.parseInt(JOptionPane.showInputDialog("Numero de alumnos"));
    }
    
    
    public void promedio(){
 
        nombre = this.jtf_nombre.getText();
        cal_ser = Double.parseDouble(this.jtf_ser.getText());
        cal_saber = Double.parseDouble(this.jtf_saber.getText());
        cal_saber_hacer = Double.parseDouble(this.jtf_saber_hacer.getText());
        
        porcentaje_ser = cal_ser*.2;
        porcentaje_saber = cal_saber*.3;
        porcentaje_hacer = cal_saber_hacer*.50;
        
        promedio = porcentaje_ser + porcentaje_saber + porcentaje_hacer;
        
        JOptionPane.showMessageDialog(null,"Promedio del alumno "+nombre+" es: "+promedio,"Calculo de promedio",JOptionPane.DEFAULT_OPTION );
    
        acomulador = acomulador + promedio;
        
        //System.out.println(promedio);
        //System.out.println("Acomulador"+acomulador);
        
        
       
    }
    
    public void limpiarCampos(){
        
        this.jtf_nombre.setText("");
        this.jtf_saber.setText("");
        this.jtf_saber_hacer.setText("");
        this.jtf_ser.setText("");
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jl_titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jl_nombre = new javax.swing.JLabel();
        jl_ser = new javax.swing.JLabel();
        jl_saber = new javax.swing.JLabel();
        jl_saber_hacer = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_ser = new javax.swing.JTextField();
        jtf_saber = new javax.swing.JTextField();
        jtf_saber_hacer = new javax.swing.JTextField();
        jbtn_promediar = new javax.swing.JButton();
        jbtn_grupal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jl_titulo.setText("Registro de Calificaciones");
        jPanel1.add(jl_titulo);
        jl_titulo.setBounds(10, 10, 190, 30);

        jPanel2.setLayout(null);

        jl_nombre.setText("Nombre del alumno:");
        jPanel2.add(jl_nombre);
        jl_nombre.setBounds(10, 20, 130, 20);

        jl_ser.setText("Ser 20%");
        jPanel2.add(jl_ser);
        jl_ser.setBounds(20, 70, 90, 20);

        jl_saber.setText("Saber 30%");
        jPanel2.add(jl_saber);
        jl_saber.setBounds(20, 110, 90, 20);

        jl_saber_hacer.setText("Saber Hacer 50%");
        jPanel2.add(jl_saber_hacer);
        jl_saber_hacer.setBounds(20, 150, 120, 20);

        jtf_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(jtf_nombre);
        jtf_nombre.setBounds(140, 20, 120, 30);

        jtf_ser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_serKeyTyped(evt);
            }
        });
        jPanel2.add(jtf_ser);
        jtf_ser.setBounds(140, 70, 70, 30);

        jtf_saber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_saberKeyTyped(evt);
            }
        });
        jPanel2.add(jtf_saber);
        jtf_saber.setBounds(140, 110, 70, 30);

        jtf_saber_hacer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_saber_hacerKeyTyped(evt);
            }
        });
        jPanel2.add(jtf_saber_hacer);
        jtf_saber_hacer.setBounds(140, 150, 70, 30);

        jbtn_promediar.setText("Promediar");
        jbtn_promediar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_promediarMouseClicked(evt);
            }
        });
        jPanel2.add(jbtn_promediar);
        jbtn_promediar.setBounds(20, 200, 90, 30);

        jbtn_grupal.setText("Promedio Grupal");
        jbtn_grupal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_grupalMouseClicked(evt);
            }
        });
        jPanel2.add(jbtn_grupal);
        jbtn_grupal.setBounds(130, 200, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_promediarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_promediarMouseClicked
        promedio();
        limpiarCampos();
        
    }//GEN-LAST:event_jbtn_promediarMouseClicked

    private void jbtn_grupalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_grupalMouseClicked
        
       promedio_grupal =  acomulador / alumnos;
       JOptionPane.showMessageDialog(null, "El promedio del grupo es: " +promedio_grupal);    
        
    }//GEN-LAST:event_jbtn_grupalMouseClicked

    private void jtf_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nombreKeyTyped
        
       int caracteres = 20; 
       char  numero = evt.getKeyChar();
       if(! (numero < '0' || numero > '9'))evt.consume();
       
        if(this.jtf_nombre.getText().length()>=caracteres){
               evt.consume();
       JOptionPane.showMessageDialog(null, "Solo 20 caracteres");
       }
       
    }//GEN-LAST:event_jtf_nombreKeyTyped

    private void jtf_serKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_serKeyTyped
       
         int caracteres = this.jtf_ser.getText().length();
         if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
             evt.consume();
         }
         
         if(evt.getKeyChar()=='.'&&this.jtf_ser.getText().contains(".")){
             
             evt.consume();
         }
         
        else if(caracteres>=4){
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo 4 caracteres");
        }
        
        
             
    }//GEN-LAST:event_jtf_serKeyTyped

    private void jtf_saberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_saberKeyTyped
      
     int caracteres = this.jtf_saber.getText().length();
         if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
             evt.consume();
         }
         
         if(evt.getKeyChar()=='.'&&this.jtf_saber.getText().contains(".")){
             
             evt.consume();
         }
         
        else if(caracteres>=4){
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo 4 caracteres");
        }
        
        
    }//GEN-LAST:event_jtf_saberKeyTyped

    private void jtf_saber_hacerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_saber_hacerKeyTyped
     
        int caracteres = this.jtf_saber_hacer.getText().length();
         if(!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!='.'){
             evt.consume();
         }
         
         if(evt.getKeyChar()=='.'&&this.jtf_saber_hacer.getText().contains(".")){
             
             evt.consume();
         }
         
        else if(caracteres>=4){
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo 4 caracteres");
        }
        
        
    }//GEN-LAST:event_jtf_saber_hacerKeyTyped

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
            java.util.logging.Logger.getLogger(JF_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton jbtn_grupal;
    public javax.swing.JButton jbtn_promediar;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_saber;
    private javax.swing.JLabel jl_saber_hacer;
    private javax.swing.JLabel jl_ser;
    private javax.swing.JLabel jl_titulo;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_saber;
    public javax.swing.JTextField jtf_saber_hacer;
    public javax.swing.JTextField jtf_ser;
    // End of variables declaration//GEN-END:variables
}
