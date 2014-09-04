/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Nurse.java
 *
 * Created on Jul 28, 2014, 9:26:48 PM
 */
package gui;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Anuradha
 */
public class Nurse extends javax.swing.JFrame {

    /** Creates new form Nurse */
    public Nurse() throws IOException {

        this.setName("Blood Bank Management System");
        initComponents();

        

        InputStream imgStream = this.getClass().getResourceAsStream("./drop.png");
        BufferedImage bi = ImageIO.read(imgStream);
        ImageIcon myImg = new ImageIcon(bi);
        this.setIconImage(myImg.getImage());

        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCalendar1 = new org.freixas.jcalendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
<<<<<<< HEAD
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
=======
        jButton36 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491
        jButton38 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
<<<<<<< HEAD
        jButton36 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
=======
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 02.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(204, 204, 204));

        jDesktopPane1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/images/red-blood-cells.png")))); // NOI18N

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 30.png"))); // NOI18N
        jButton17.setBounds(1280, 420, 90, 90);
        jDesktopPane1.add(jButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 30.png"))); // NOI18N
        jButton19.setBounds(1280, 420, 90, 90);
        jDesktopPane1.add(jButton19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Candy Vivian Icon 30.png"))); // NOI18N
        jButton20.setBounds(1280, 420, 90, 90);
        jDesktopPane1.add(jButton20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Packets to be discarded"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Done");

        jButton2.setText("Refresh");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel1.setBounds(870, 160, 300, 470);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
<<<<<<< HEAD
        jCalendar1.setBounds(870, 0, 315, 160);
=======
        jCalendar1.setBounds(870, 0, 301, 160);
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491
        jDesktopPane1.add(jCalendar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setBounds(200, 60, 1170, 650);
        jLayeredPane1.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Vijaya", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Karapitiya Blood Bank Management System - Nurse Form");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jLabel1.setBounds(360, 0, 710, 60);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton35.setText("Issue Register");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jButton35.setBounds(0, 180, 200, 30);
        jLayeredPane1.add(jButton35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton33.setText("Blood Discard");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jButton33.setBounds(0, 90, 200, 30);
        jLayeredPane1.add(jButton33, javax.swing.JLayeredPane.DEFAULT_LAYER);
=======
        jButton35.setBounds(0, 240, 200, 30);
        jLayeredPane1.add(jButton35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton33.setText("Blood Discard");
        jButton33.setBounds(0, 120, 200, 30);
        jLayeredPane1.add(jButton33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton22.setText("Blood Packet Details");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jButton22.setBounds(0, 150, 200, 30);
        jLayeredPane1.add(jButton22, javax.swing.JLayeredPane.DEFAULT_LAYER);
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491

        jButton22.setText("Blood Packet Details");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jButton22.setBounds(0, 120, 200, 30);
        jLayeredPane1.add(jButton22, javax.swing.JLayeredPane.DEFAULT_LAYER);
=======
        jButton25.setBounds(0, 90, 200, 30);
        jLayeredPane1.add(jButton25, javax.swing.JLayeredPane.DEFAULT_LAYER);
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491

        jButton18.setText("Blood Stock");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jButton18.setBounds(0, 60, 200, 30);
        jLayeredPane1.add(jButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);

<<<<<<< HEAD
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bb1.png"))); // NOI18N
        jLabel2.setBounds(0, 490, 200, 198);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nurse.jpg"))); // NOI18N
        jLabel4.setBounds(-10, 290, 240, 210);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton38.setText("Donor Details");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jButton38.setBounds(0, 270, 200, 30);
        jLayeredPane1.add(jButton38, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I03.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(300, 0, 60, 60);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 28));
        jLabel5.setText("Zeta trouble shoot");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 102, 255)));
        jLabel5.setBounds(1070, 0, 240, 60);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/final1.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 153, 255)));
        jLabel6.setBounds(1310, 0, 60, 76);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I05.jpg"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(240, 0, 60, 60);
        jLayeredPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I04.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
=======
        jButton36.setText("Item Stock");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jButton36.setBounds(0, 210, 200, 30);
        jLayeredPane1.add(jButton36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bb1.png"))); // NOI18N
        jLabel2.setBounds(0, 490, 200, 198);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nurse.jpg"))); // NOI18N
        jLabel4.setBounds(-10, 290, 240, 210);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton37.setText("Donor Details");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jButton37.setBounds(0, 180, 200, 30);
        jLayeredPane1.add(jButton37, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton38.setText("Donor Details");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jButton38.setBounds(0, 270, 200, 30);
        jLayeredPane1.add(jButton38, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I03.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jButton6.setBounds(180, 0, 60, 60);
        jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I07.jpg"))); // NOI18N
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jButton11.setBounds(120, 0, 60, 60);
        jLayeredPane1.add(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I08.png"))); // NOI18N
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
=======
        jButton4.setBounds(300, 0, 60, 60);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 1, 28)); // NOI18N
        jLabel5.setText("Zeta trouble shoot");
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 102, 255)));
        jLabel5.setBounds(1070, 0, 240, 60);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/final1.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 153, 255)));
        jLabel6.setBounds(1310, 0, 60, 76);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I05.jpg"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(240, 0, 60, 60);
        jLayeredPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I04.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(180, 0, 60, 60);
        jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I07.jpg"))); // NOI18N
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jButton9.setBounds(60, 0, 60, 60);
        jLayeredPane1.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I02.png"))); // NOI18N
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.setBounds(0, 0, 60, 60);
        jLayeredPane1.add(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton36.setText("Item Stock");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jButton36.setBounds(0, 210, 200, 30);
        jLayeredPane1.add(jButton36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton25.setText("Blood Issue");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
=======
        jButton11.setBounds(120, 0, 60, 60);
        jLayeredPane1.add(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I08.png"))); // NOI18N
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jButton25.setBounds(0, 150, 200, 30);
        jLayeredPane1.add(jButton25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton37.setText("Donor Details");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jButton37.setBounds(0, 240, 200, 30);
        jLayeredPane1.add(jButton37, javax.swing.JLayeredPane.DEFAULT_LAYER);
=======
        jButton9.setBounds(60, 0, 60, 60);
        jLayeredPane1.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/I02.png"))); // NOI18N
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(0, 153, 255)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.setBounds(0, 0, 60, 60);
        jLayeredPane1.add(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491

        jMenu1.setText("File");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Save");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Print");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Cut");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Copy");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Paste");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try {
            BloodStock stock = new BloodStock();
            stock.setClosable(true);
            jDesktopPane1.add(stock);
            stock.setBounds(0, 0, 1190, 650);
            jDesktopPane1.setRequestFocusEnabled(true);
            stock.setMaximum(true);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = stock.getSize();
            stock.setLocation((desktopSize.width - jInternalFrameSize.width) / 2, 0);
            stock.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jButton18ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        BloodIssue issue = new BloodIssue(jDesktopPane1.getSize());

        issue.setClosable(true);
        issue.setMaximizable(true);
        jDesktopPane1.add(issue);
        jDesktopPane1.setRequestFocusEnabled(true);
        issue.show();
}//GEN-LAST:event_jButton25ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        IssueRegister issue = new IssueRegister(jDesktopPane1.getSize());

        issue.setClosable(true);
        issue.setMaximizable(true);
        jDesktopPane1.add(issue);
        jDesktopPane1.setRequestFocusEnabled(true);
        issue.show();
}//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        ItemManagement items = new ItemManagement(jDesktopPane1.getSize());

        items.setClosable(true);
        items.setMaximizable(true);
        jDesktopPane1.add(items);
        jDesktopPane1.setRequestFocusEnabled(true);
        items.show();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        bloodPacketForm packetForm = new bloodPacketForm(jDesktopPane1.getSize());

        packetForm.setClosable(true);
        packetForm.setMaximizable(true);
        jDesktopPane1.add(packetForm);
        jDesktopPane1.setRequestFocusEnabled(true);
        packetForm.show();

    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            ChangePassword p = new ChangePassword();
            p.setClosable(true);
            jDesktopPane1.add(p);
            p.show();
        } catch (IOException ex) {
            Logger.getLogger(MedicalOfficer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Personalize p = new Personalize(this, true);
        p.setClosable(true);
        jDesktopPane1.add(p);
        p.show();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed
<<<<<<< HEAD

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        DiscardedBlood discardedBlood = new DiscardedBlood(jDesktopPane1.getSize());

        discardedBlood.setClosable(true);
        discardedBlood.setMaximizable(true);
        jDesktopPane1.add(discardedBlood);
        jDesktopPane1.setRequestFocusEnabled(true);
        discardedBlood.show();
    }//GEN-LAST:event_jButton33ActionPerformed
=======
>>>>>>> b4e7ee09262877c0f8696409dd1258149040a491

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new Nurse().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private org.freixas.jcalendar.JCalendar jCalendar1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
