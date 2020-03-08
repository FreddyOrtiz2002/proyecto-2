package pryct2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
    public String clave;
    public short intentos=9;
    public NewJFrame() {
        setLocation(450, 200);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        palabraclave = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        bot1 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        botbusq = new javax.swing.JButton();
        vidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("digite la palabra para jugar");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        bot1.setText("definir");
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });

        botbusq.setText("realizar busqueda");
        botbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botbusqActionPerformed(evt);
            }
        });

        vidas.setText("vidas: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(palabraclave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addComponent(bot1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botbusq)))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabraclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botbusq))
                .addGap(18, 18, 18)
                .addComponent(vidas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        int tamañoP;
        tamañoP=palabraclave.getText().length();//sacar el tamaño de la palabra
        int cols=tamañoP;//se saca las columnas
        int rows=1;//se saca las filas
        tabla.setModel(new DefaultTableModel(rows+1,cols));//se define la tabla con esas caracteristicas
        tabla.disable();//desabilito la edicion de la tabla
        clave=palabraclave.getText();
        for (int columna=0; columna<cols;columna++)
        {
            tabla.setValueAt("letra"+(columna+1), 0, columna);
        }        
        vidas.setText(vidas.getText()+Integer.toString(intentos));
    }//GEN-LAST:event_bot1ActionPerformed

    private void botbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbusqActionPerformed
            char caracteres[]=new char[clave.length()];
            for(int indice=0;indice<clave.length();indice++)
            {
                caracteres[indice]=clave.charAt(indice);
            }
            short fallo=0;
            for(int j=0;j<clave.length();j++)
            {
                for(int indice=0;indice<txtbuscar.getText().length();indice++)
                {
                    if(txtbuscar.getText().charAt(indice)==caracteres[j])
                    {
                        tabla.setValueAt(txtbuscar.getText().charAt(indice), 1, j);
                    }else
                    {
                        fallo++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, fallo);
            JOptionPane.showMessageDialog(null, txtbuscar.getText().length());
            
            
            
            
        
        
        
        
        
    }//GEN-LAST:event_botbusqActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bot1;
    private javax.swing.JButton botbusq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField palabraclave;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel vidas;
    // End of variables declaration//GEN-END:variables

    private String String(short intentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
