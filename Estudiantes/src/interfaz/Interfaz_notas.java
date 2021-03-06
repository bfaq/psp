
package interfaz;
/**
 * Interfaz para asignaci�n de nota del estudiante por cada curso
 */
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import consultasSql.control_notas;
import estudiantes.Operacion;


public class Interfaz_notas extends javax.swing.JInternalFrame {
    
	
    private JButton jButton1,jButton2,jButton3;
    private JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JTextField jTextField_codigo,jTextField_est,jTextField_nota1, jTextField_nota2, jTextField_nota3, jTextField_nota;
   
    
    
    private Object[][] datostabla;    
    control_notas cont = new control_notas();
    public Interfaz_notas() {
    	setTitle("Registro notas psp3");
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  
    private void initComponents() {
    	
        jTextField_est = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jTextField_codigo = new JTextField();
       
        jTextField_nota1 = new JTextField();
        jTextField_nota2 = new JTextField();
        jTextField_nota3 = new JTextField();
      
        
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("No carnet");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo");
        
        
         	
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nota parcial 1: ");
        
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nota parcial 2: ");
        
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nota examen: ");
        
        
       
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(26)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel1)
        						.addGap(18)
        						.addComponent(jTextField_est, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
        						.addGap(29)
        						.addComponent(jButton1)))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jButton3)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel4)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jTextField_nota1))
        								.addGroup(layout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(jLabel2)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jTextField_codigo, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jLabel5)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jTextField_nota2)))
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        									.addComponent(jLabel3))
        								.addGroup(layout.createSequentialGroup()
        									.addGap(18)
        									.addComponent(jLabel6)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addComponent(jTextField_nota3, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						
        						.addComponent(jButton2))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(33)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField_est, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1))
        			.addGap(28)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField_codigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField_nota1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6)
        				.addComponent(jTextField_nota3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField_nota2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton3)
        				.addComponent(jButton2))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);
        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

   
    this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String[] columnas = {"No carnet","Codigo","Materia"};
        datostabla = cont.consulta_materia_notas(jTextField_est.getText());
        DefaultTableModel datostcli = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datostcli);
       
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String doc, mate;
    Double nota1,nota2,nota3;
    
    doc = jTextField_est.getText();
    mate = jTextField_codigo.getText();

    

    
   
    
    if(!doc.equals("") && !mate.equals("") && !jTextField_nota1.getText().equals("") && !jTextField_nota2.getText().equals("") && !jTextField_nota3.getText().equals(""))
    {
    	
        try {
        	nota1 = Double.parseDouble(jTextField_nota1.getText());
            nota2 = Double.parseDouble(jTextField_nota2.getText());
            nota3 = Double.parseDouble(jTextField_nota3.getText());
            if(nota1 >=0 && nota1 <=5 && nota2 >=0 && nota2 <=5 && nota3 >=0 && nota3 <=5) {
            	Operacion resultado = new Operacion(nota1, nota2,nota3);
            	String notif = resultado.mostrar();
                if(cont.ingresar_notas(doc, mate, resultado.mostrarNota()))
                {
                	JOptionPane.showMessageDialog(null,"Se registro la nota con �xito \n"+notif,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                	jTextField_codigo.setText("");
                	       
                }
                else
                {
                	JOptionPane.showMessageDialog(null, "Nota ya registrada para este alumno y curso", "Error",JOptionPane.WARNING_MESSAGE); 
                }
            }else {
            	JOptionPane.showMessageDialog(null, "Por favor Ingresa las notas en rangos de 0 a 5", "Error",JOptionPane.WARNING_MESSAGE); 
            }
        	
            
        }catch(NumberFormatException ex){
        	JOptionPane.showMessageDialog(null, "Rellena los campos, Solo se admiten valores n�mericos", "Error",JOptionPane.WARNING_MESSAGE); 
      	
        }
         
    }
    else
    {
    	JOptionPane.showMessageDialog(null, "Faltan registros", "Error",JOptionPane.WARNING_MESSAGE);  
    }    
       
                           
                
    }//GEN-LAST:event_jButton3ActionPerformed


}
