/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectInterface;
import ProjectTools.*;
import ProjectClasses.*; 
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
 */
public class CheckIn extends javax.swing.JFrame {
    
    public static String reservation = "";
    public static inicio ini;

    /**
     * Creates new form checkInCheckOut
     */
    public CheckIn(inicio ini) {
        initComponents();
        this.ini = ini;
        ini.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        x = new javax.swing.JButton();
        loadReservation = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        x.setText("x");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, -1));

        loadReservation.setText("load");
        loadReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadReservationActionPerformed(evt);
            }
        });
        getContentPane().add(loadReservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
        this.dispose();
        inicio ini = new inicio();
        ini.setVisible(true);
    }//GEN-LAST:event_xActionPerformed

    private void loadReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadReservationActionPerformed
        String fname = JOptionPane.showInputDialog(null,"Ingrese el nombre: ", "Nombre");      
        while (!fname.chars().allMatch(Character::isLetter) & fname != null){
            fname = JOptionPane.showInputDialog(null,"Ingrese un nombre valido: ", "Nombre");
        }
        String lname = JOptionPane.showInputDialog(null,"Ingrese el apellido: ", "Apellido");      
        while (!lname.chars().allMatch(Character::isLetter) & fname != null){
            lname = JOptionPane.showInputDialog(null,"Ingrese un apellido valido: ", "Apellido");    
        }
        String auxname = fname + " " + lname;
        String data2 = CSVreader.getCsv("Booking_hotel - Habitaciones.csv");
        String data3 = CSVreader.getCsv("Booking_hotel - Estado.csv");
        String data1 = CSVreader.getCsv("Booking_hotel - General.csv");
        SimpleList myList = Parser.parseReservation(data1);
        HashTable myHashtable = Parser.parseHabitaciones(data2);
        myHashtable = Parser.parseEstado(data3, myHashtable);
        NodoLista aux = myList.getHead();
        while (aux != null){
           Reservation reserva = (Reservation) aux.getData();
           if(reserva.getFirstName().equalsIgnoreCase(fname) & reserva.getLastName().equalsIgnoreCase(lname)){
                Status estado = Converter.checkIn(reserva,myHashtable);
                String data = Parser.reverseParseStatus(estado);
                CSVreader.putCsv(data, "Booking_hotel - Estado.csv");
                System.out.println("Resgistro exitoso!");
                this.dispose();
                inicio ini = new inicio();
                ini.setVisible(true);
           }
           aux = aux.getPnext();
        }
        System.out.println("Resgistro fallido :(");
        this.dispose();
        inicio ini = new inicio();
        ini.setVisible(true);
    }//GEN-LAST:event_loadReservationActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn(ini).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loadReservation;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables
}
