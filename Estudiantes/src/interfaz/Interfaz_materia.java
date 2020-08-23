package interfaz;

import javax.swing.JOptionPane;

import consultasSql.control_materia;




/**
 *
 * @author bfaq
 * interfaz registro de materias
 */
public class Interfaz_materia extends javax.swing.JInternalFrame {

    
    public Interfaz_materia() {
        initComponents();
        limpiar();
    }

  
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_nommateria = new javax.swing.JTextField();
        jButton_registrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox_ih = new javax.swing.JComboBox();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre materia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Intensidad horaria");

        jButton_registrar.setText("Registrar");
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox_ih.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox_ih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_nommateria, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_ih, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(292, Short.MAX_VALUE)
                        .addComponent(jButton_registrar)
                        .addGap(18, 18, 18)))
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nommateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_ih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton_registrar))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiar()
    {
       jTextField_nommateria.setText("");
      
              
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose();
    }
    private void jComboBox_ihActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {
    control_materia mate = new control_materia();
    if(!jTextField_nommateria.getText().equals("") && jComboBox_ih != null && jTextField_nommateria.getText().length() >= 3 && jTextField_nommateria.getText().length() <= 20)
        {
        if(mate.ingresar_materia(jTextField_nommateria.getText(), Integer.parseInt(jComboBox_ih.getSelectedItem().toString())))
            
        {
        JOptionPane.showMessageDialog(null,"Se registro la materia ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
       
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Digita los campos obligatorios\n Minimo 3 carácteres, máximo 20");  
        }
    }
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox jComboBox_ih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_nommateria;
}
