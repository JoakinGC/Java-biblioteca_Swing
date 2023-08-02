/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package biblioteca.biblioteca2;

import biblioteca.biblioteca2.views.Devoluciones;
import biblioteca.biblioteca2.views.Libro;
import biblioteca.biblioteca2.views.Prestamos;
import biblioteca.biblioteca2.views.Principal;
import biblioteca.biblioteca2.views.Reporte;
import biblioteca.biblioteca2.views.Usuario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

/**
 *
 * @author USUARIO
 */
public class biblioteca2 extends javax.swing.JPanel {

    /**
     * Creates new form biblioteca2
     */
    public biblioteca2() {
        initComponents();
        InitStyles();
        setDate();
        InitContent();
    }
    
    private  void InitContent() {
        ShowJPanel(new Principal());
    }
    
    public  static void ShowJPanel(JPanel p) {
        p.setSize(1000, 500);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    
    
    private void setDate(){
        
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        Fecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    
    }
    
    private void InitStyles(){
        mensaje.putClientProperty( "FlatLaf.style", "font: 14 $light.font" );
        mensaje.setForeground(Color.black);
        jLabel1.putClientProperty( "FlatLaf.style", "font: bold $h3.regular.font" );
        jLabel1.setForeground(Color.white);
        Fecha.putClientProperty( "FlatLaf.style", "font:24 $light.font" );
        Fecha.setForeground(Color.white);
        title.putClientProperty( "FlatLaf.style", "font:24 $light.font" );
        title.setForeground(Color.white);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        prestamos1 = new javax.swing.JButton();
        libros = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        devoluciones = new javax.swing.JButton();
        usuarios = new javax.swing.JButton();
        cabeza = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMinimumSize(new java.awt.Dimension(1223, 1020));

        menu.setBackground(new java.awt.Color(13, 171, 161));
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menu.setPreferredSize(new java.awt.Dimension(270, 431));

        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Libreria");

        prestamos1.setBackground(new java.awt.Color(21, 101, 192));
        prestamos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-plus.png"))); // NOI18N
        prestamos1.setText("Prestamo");
        prestamos1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        prestamos1.setBorderPainted(false);
        prestamos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prestamos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        prestamos1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        prestamos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamos1ActionPerformed(evt);
            }
        });

        libros.setBackground(new java.awt.Color(21, 101, 192));
        libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book-open-page-variant.png"))); // NOI18N
        libros.setText("Libros");
        libros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        libros.setBorderPainted(false);
        libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        libros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        libros.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosActionPerformed(evt);
            }
        });

        reportes.setBackground(new java.awt.Color(21, 101, 192));
        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file-chart.png"))); // NOI18N
        reportes.setText("Reportes");
        reportes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        reportes.setBorderPainted(false);
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        devoluciones.setBackground(new java.awt.Color(21, 101, 192));
        devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar-multiple-check.png"))); // NOI18N
        devoluciones.setText("Devoluciones");
        devoluciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        devoluciones.setBorderPainted(false);
        devoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devoluciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        devoluciones.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionesActionPerformed(evt);
            }
        });

        usuarios.setBackground(new java.awt.Color(21, 101, 192));
        usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-multiple.png"))); // NOI18N
        usuarios.setText("Usuarios");
        usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        usuarios.setBorderPainted(false);
        usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addComponent(prestamos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(devoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
            .addComponent(usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(libros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addGap(153, 153, 153)
                .addComponent(prestamos1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(devoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(libros, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(reportes, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(563, 563, 563))
        );

        cabeza.setBackground(new java.awt.Color(25, 118, 210));
        cabeza.setPreferredSize(new java.awt.Dimension(872, 150));

        jLabel1.setText("Administración / Control / Biblioteca");

        Fecha.setText("Hoy es {dayname} {day} de {month} del {year}");

        javax.swing.GroupLayout cabezaLayout = new javax.swing.GroupLayout(cabeza);
        cabeza.setLayout(cabezaLayout);
        cabezaLayout.setHorizontalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE))
                .addContainerGap())
        );
        cabezaLayout.setVerticalGroup(
            cabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabezaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1105, 1105, 1105))
        );

        mensaje.setText("Biblioteca FEMPA");

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cabeza, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(mensaje)
                .addGap(166, 166, 166)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(cabeza, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucionesActionPerformed
        ShowJPanel(new Devoluciones());
    }//GEN-LAST:event_devolucionesActionPerformed

    private void prestamos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamos1ActionPerformed
        ShowJPanel(new Prestamos());
    }//GEN-LAST:event_prestamos1ActionPerformed

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        ShowJPanel(new Usuario());
    }//GEN-LAST:event_usuariosActionPerformed

    private void librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosActionPerformed
        ShowJPanel(new Libro());
    }//GEN-LAST:event_librosActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        ShowJPanel(new Reporte());
    }//GEN-LAST:event_reportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JPanel cabeza;
    private static javax.swing.JPanel content;
    private javax.swing.JButton devoluciones;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton libros;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JButton prestamos1;
    private javax.swing.JButton reportes;
    private javax.swing.JLabel title;
    private javax.swing.JButton usuarios;
    // End of variables declaration//GEN-END:variables
}
