/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicadeejercicios;

import java.awt.event.KeyEvent;

/**
 *
 * @author Guillermo
 */
public class Invertir extends javax.swing.JPanel {

    /**
     * Creates new form Invertir
     */
    private Interfaz inter;
    public Invertir(Interfaz inter) {
        initComponents();
        this.inter = inter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblTitulo1 = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        LblTitulo = new javax.swing.JLabel();
        LblTitulo3 = new javax.swing.JLabel();
        TFEntrada = new javax.swing.JTextField();
        TFSalida = new javax.swing.JTextField();

        LblTitulo1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        LblTitulo1.setForeground(new java.awt.Color(197, 226, 208));
        LblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo1.setText("Introduzca la palabra a invertir");
        LblTitulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnVolver.setBackground(new java.awt.Color(40, 51, 55));
        BtnVolver.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(197, 226, 208));
        BtnVolver.setText("Volver");
        BtnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(20, 20, 20), 4, true));
        BtnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVolverMouseExited(evt);
            }
        });
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        LblTitulo.setFont(new java.awt.Font("Consolas", 1, 32)); // NOI18N
        LblTitulo.setForeground(new java.awt.Color(197, 226, 208));
        LblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo.setText("INVERTIR");
        LblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblTitulo3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        LblTitulo3.setForeground(new java.awt.Color(197, 226, 208));
        LblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitulo3.setText("Resultado");
        LblTitulo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TFEntrada.setBackground(new java.awt.Color(67, 153, 161));
        TFEntrada.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        TFEntrada.setForeground(new java.awt.Color(40, 51, 55));
        TFEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFEntradaActionPerformed(evt);
            }
        });
        TFEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFEntradaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFEntradaKeyTyped(evt);
            }
        });

        TFSalida.setBackground(new java.awt.Color(67, 153, 161));
        TFSalida.setFont(new java.awt.Font("Consolas", 0, 30)); // NOI18N
        TFSalida.setForeground(new java.awt.Color(40, 51, 55));
        TFSalida.setEnabled(false);
        TFSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(TFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(BtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    //Ejercicio 9
    public void voltear(String cadena, int p, String palindromo){
        if (p<cadena.length()){
            palindromo+=cadena.charAt(cadena.length()-(p+1));
            p++;
            voltear(cadena, p, palindromo);
        }
        else{
            TFSalida.setText(palindromo);
        }
    }
    
    
    private void BtnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseEntered
        inter.ColorSelected(BtnVolver);
    }//GEN-LAST:event_BtnVolverMouseEntered

    private void BtnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseExited
        inter.ColorUnselected(BtnVolver);
    }//GEN-LAST:event_BtnVolverMouseExited

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        inter.op();
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void TFEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFEntradaActionPerformed

    private void TFEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFEntradaKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            voltear(TFEntrada.getText(), 0, "");
        }
    }//GEN-LAST:event_TFEntradaKeyPressed

    private void TFEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFEntradaKeyTyped

    }//GEN-LAST:event_TFEntradaKeyTyped

    private void TFSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel LblTitulo;
    private javax.swing.JLabel LblTitulo1;
    private javax.swing.JLabel LblTitulo3;
    private javax.swing.JTextField TFEntrada;
    private javax.swing.JTextField TFSalida;
    // End of variables declaration//GEN-END:variables
}
