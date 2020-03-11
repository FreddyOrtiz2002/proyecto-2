package pryct2;

import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
    public String clave;
    public short intentos;
    public short contador1=0;
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
        letras = new javax.swing.JLabel();
        dibujo = new javax.swing.JLabel();

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

        letras.setText("letras que no estan:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(letras, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(palabraclave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addComponent(bot1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(botbusq))
                            .addComponent(vidas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(dibujo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(letras, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dibujo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        contador1=0;
        int tamañoP;
        intentos=9;
        vidas.setText("vidas: "+intentos);
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
        for(int i=0;i<clave.length();i++)
        {
            if(clave.charAt(i)==' ')
            {
                tabla.setValueAt("_", 1, i);
                contador1++;
            }
        }
    }//GEN-LAST:event_bot1ActionPerformed
    private void botbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbusqActionPerformed
            char caracteres[]=new char[clave.length()];
            for(int indice=0;indice<clave.length();indice++)
            {
                caracteres[indice]=clave.charAt(indice);
            }
            short fallo=0,contador=0;
            if(txtbuscar.getText().length()==1)
            {
                for(int j=0;j<clave.length();j++)
                {
                        if(txtbuscar.getText().charAt(0)==caracteres[j])
                        {
                            tabla.setValueAt(txtbuscar.getText().charAt(0), 1, j);
                            contador1++;
                        }else
                        {
                            fallo++;
                        }
                }
                if(fallo==clave.length())
                {
                    intentos--;
                    vidas.setText("vidas: "+intentos);
                    letras.setText(letras.getText()+" "+txtbuscar.getText().charAt(0));
                }
                txtbuscar.setText("");
                if(contador1==clave.length())
                {
                    vidas.setText("GANASTE");
                }  
                if(intentos==0)
                {
                    vidas.setText("PERDISTE LA PALABRA ERA: "+clave);
                }
            }else
            {
                for(int j=0;j<clave.length();j++)
                {
                    for(int i=0;i<txtbuscar.getText().length();i++)
                    {
                    if(txtbuscar.getText().charAt(i)==caracteres[j])
                        {
                            contador++;
                        }else
                        {
                            fallo++;
                        }
                    }
                }
                
                if(contador==clave.length())
                {
                    for(int j=0;j<clave.length();j++)
                    {
                        tabla.setValueAt(clave.charAt(j), 1, j);
                    }
                    vidas.setText("GANASTE");
                    txtbuscar.setText("");
                }
                if(intentos==0)
                {
                    vidas.setText("PERDISTE LA PALABRA ERA: "+clave);
                }
            }
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
    private javax.swing.JLabel dibujo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel letras;
    private javax.swing.JPasswordField palabraclave;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel vidas;
    // End of variables declaration//GEN-END:variables
    private String String(short intentos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
