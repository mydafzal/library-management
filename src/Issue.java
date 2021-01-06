

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.text.html.HTML.Tag.DD;
import sun.util.calendar.LocalGregorianCalendar.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author momal
 */
public class Issue extends javax.swing.JFrame {
   Connection con;
ResultSet rs;
PreparedStatement pst;

    /**
     * Creates new form Issue
     */
    public Issue() {
        super("Issue Book");
        initComponents();
        con=Connect.Connectdb();
    }
 public void SearchISBN()
    {
        String al=jTextField2.getText();
        String sql="select * from books where ISBN='"+al+"'";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        if (rs.next())
        {
            jTextField12.setText(rs.getString(1));
            jTextField13.setText(rs.getString(3));
            
            rs.close();
            pst.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }
    }
        catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, e);
                }
        
    }
 public void SearchAuthor()
    {
        String al=jTextField3.getText();
        String sql="select * from books where Author='"+al+"'";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        if (rs.next())
        {
            jTextField15.setText(rs.getString(1));
            jTextField16.setText(rs.getString(2));
            
            rs.close();
            pst.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }
    }
        catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, e);
                }
        
    }
 public void SearchName()
    {
          String al=jTextField1.getText();
        String sql="select * from books where Name='"+al+"'";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        if (rs.next())
        {
            jTextField9.setText(rs.getString(2));
            jTextField10.setText(rs.getString(3));            
            rs.close();
            pst.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }
    }
        catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, e);
                }
        
    }
 public void issuebyname()
 {
      String sql = "insert into Issue(Book_Name,ISBN,Author,Student_ID,Name,Father_Name,Department,Semester,Date) value(?,?,?,?,?,?,?,?,?)";
                try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,jTextField1.getText());
                    pst.setString(2,jTextField9.getText());
                    pst.setString(3,jTextField10.getText());
                    pst.setString(4,jTextField4.getText());
                    pst.setString(5,jTextField5.getText());
                    pst.setString(6,jTextField6.getText());
                    pst.setString(7,jTextField7.getText());
                    pst.setString(8,jTextField8.getText());
                    String date = dateChooserCombo1.getText();
                    pst.setString(9,date);
                    //dateChooserCombo1.setText("yyyy/MM/DD");
                    //pst.setDate(9, new java.sql.Date(new java.util.Date().getTime()));                     
                    //String strDate = DateFormat.getDateInstance().format(date);                     
                    //pst.setString(9,((JTextField)dateChooserCombo1.getDateEditor().getUiComponent()).getText());
                    //pst.setString(9, new "DateofIssue"("yyyy-MM-DD").format(dateChooserCombo1.getDate());
                    //pst.setDate(9, new java.sql.Date(dateChooserCombo1.Date().getTime()));                   
                    pst.execute();
                    
                  JOptionPane.showMessageDialog(null, "Book Issued");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
 }
 public void issuebyisbn()
 {
      String sql = "insert into Issue(Book_Name,ISBN,Author,Student_ID,Name,Father_Name,Department,Semester,Date) value(?,?,?,?,?,?,?,?,?)";
                try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,jTextField12.getText());
                    pst.setString(2,jTextField2.getText());
                    pst.setString(3,jTextField13.getText());
                    pst.setString(4,jTextField4.getText());
                    pst.setString(5,jTextField5.getText());
                    pst.setString(6,jTextField6.getText());
                    pst.setString(7,jTextField7.getText());
                    pst.setString(8,jTextField8.getText());
                    String date = dateChooserCombo1.getText();
                    pst.setString(9,date);
                    //pst.setString(9,((JTextField)dateChooserCombo1.getDateEditor().getUiComponent()).getText());
                    //pst.setString(11, new "DateofIssue"("yyyy-MM-DD").format(dateChooserCombo1.getDate());
                    //pst.setDate(9, new java.sql.Date(dateChooserCombo1.getDate().getTime()));
                   
                    pst.execute();
                    
                  JOptionPane.showMessageDialog(null, "Book Issued");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
 }
 public void issuebyauthor()
 {
     String sql = "insert into Issue(Book_Name,ISBN,Author,Student_ID,Name,Father_Name,Department,Semester,Date) value(?,?,?,?,?,?,?,?,?)";
                try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,jTextField15.getText());
                    pst.setString(2,jTextField16.getText());
                    pst.setString(3,jTextField3.getText());
                    pst.setString(4,jTextField4.getText());
                    pst.setString(5,jTextField5.getText());
                    pst.setString(6,jTextField6.getText());
                    pst.setString(7,jTextField7.getText());
                    pst.setString(8,jTextField8.getText());
                    String date = dateChooserCombo1.getText();
                    pst.setString(9,date);
                    //pst.setString(9,((JTextField)dateChooserCombo1.getDateEditor().getUiComponent()).getText());
                    //pst.setString(11, new "DateofIssue"("yyyy-MM-DD").format(dateChooserCombo1.getDate());
                    //pst.setDate(9, new java.sql.Date(dateChooserCombo1.getDate().getTime()));
                   
                    pst.execute();
                    
                  JOptionPane.showMessageDialog(null, "Book Issued");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog3 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog4 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog5 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)), "Book Details"));

        jLabel2.setText("By ISBN Number");

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel1.setText("By Book Name");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("By Author Name ");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel9.setText("ISBN Number");

        jTextField9.setEditable(false);

        jLabel10.setText("Author Name");

        jTextField10.setEditable(false);

        jLabel12.setText("Book Name");

        jTextField12.setEditable(false);

        jLabel13.setText("Author Name");

        jTextField13.setEditable(false);

        jLabel15.setText("Book Name");

        jTextField15.setEditable(false);

        jLabel16.setText("ISBN Number");

        jTextField16.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(557, 557, 557))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(288, 288, 288))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2))
                                    .addGap(43, 43, 43)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel9))
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(57, 57, 57)
                                            .addComponent(jButton1))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(72, 72, 72)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(26, 31, 487, 395);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Student Details"));

        jTextField7.setEditable(false);

        jTextField8.setEditable(false);

        jLabel4.setText("Student ID");

        jLabel6.setText("Father Name");

        jLabel8.setText("Semester");

        jTextField6.setEditable(false);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jLabel7.setText("Department");

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Name");

        jTextField5.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(26, 444, 487, 226);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Date of Issue", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setText("Issue by Book Name");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Issue by ISBN Number");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Issue by Author Name");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(531, 31, 205, 207);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgforwhole.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(-10, 260, 800, 470);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bgforwhole.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -190, 790, 470);

        setSize(new java.awt.Dimension(753, 717));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      SearchName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Home obj=new Home();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SearchISBN();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        SearchAuthor();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String al=jTextField4.getText();
        String sql="select * from Student where Student_ID='"+al+"'";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        if (rs.next())
        {
            jTextField5.setText(rs.getString(2));
            jTextField6.setText(rs.getString(3));
            jTextField7.setText(rs.getString(4));
            jTextField8.setText(rs.getString(5));
            rs.close();
            pst.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid ID");
        }
    }
        catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, e);
                }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        String sql = "insert into Issue(Book_Name,ISBN,Author,Student_ID,Name,Father_Name,Department,Semester,Date) value(?,?,?,?,?,?,?,?,?)";
                try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,jTextField1.getText());
                    pst.setString(2,jTextField9.getText());
                    pst.setString(3,jTextField10.getText());
                    pst.setString(4,jTextField4.getText());
                    pst.setString(5,jTextField5.getText());
                    pst.setString(6,jTextField6.getText());
                    pst.setString(7,jTextField7.getText());
                    pst.setString(8,jTextField8.getText());
                    String date = dateChooserCombo1.getText();
                    pst.setString(9,date);
                    //dateChooserCombo1.setText("yyyy/MM/DD");
                    //pst.setDate(9, new java.sql.Date(new java.util.Date().getTime()));                     
                    //String strDate = DateFormat.getDateInstance().format(date);                     
                    //pst.setString(9,((JTextField)dateChooserCombo1.getDateEditor().getUiComponent()).getText());
                    //pst.setString(9, new "DateofIssue"("yyyy-MM-DD").format(dateChooserCombo1.getDate());
                    //pst.setDate(9, new java.sql.Date(dateChooserCombo1.Date().getTime()));                   
                    pst.execute();
                    
                  JOptionPane.showMessageDialog(null, "Book Issued");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                } 
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         String sql = "insert into Issue(Book_Name,ISBN,Author,Student_ID,Name,Father_Name,Department,Semester,Date) value(?,?,?,?,?,?,?,?,?)";
                try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,jTextField12.getText());
                    pst.setString(2,jTextField2.getText());
                    pst.setString(3,jTextField13.getText());
                    pst.setString(4,jTextField4.getText());
                    pst.setString(5,jTextField5.getText());
                    pst.setString(6,jTextField6.getText());
                    pst.setString(7,jTextField7.getText());
                    pst.setString(8,jTextField8.getText());
                    String date = dateChooserCombo1.getText();
                    pst.setString(9,date);
                    //pst.setString(9,((JTextField)dateChooserCombo1.getDateEditor().getUiComponent()).getText());
                    //pst.setString(11, new "DateofIssue"("yyyy-MM-DD").format(dateChooserCombo1.getDate());
                    //pst.setDate(9, new java.sql.Date(dateChooserCombo1.getDate().getTime()));
                   
                    pst.execute();
                    
                  JOptionPane.showMessageDialog(null, "Book Issued");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String sql = "insert into Issue(Book_Name,ISBN,Author,Student_ID,Name,Father_Name,Department,Semester,Date) value(?,?,?,?,?,?,?,?,?)";
                try{
                    pst=con.prepareStatement(sql);
                    pst.setString(1,jTextField15.getText());
                    pst.setString(2,jTextField16.getText());
                    pst.setString(3,jTextField3.getText());
                    pst.setString(4,jTextField4.getText());
                    pst.setString(5,jTextField5.getText());
                    pst.setString(6,jTextField6.getText());
                    pst.setString(7,jTextField7.getText());
                    pst.setString(8,jTextField8.getText());
                    String date = dateChooserCombo1.getText();
                    pst.setString(9,date);
                    //pst.setString(9,((JTextField)dateChooserCombo1.getDateEditor().getUiComponent()).getText());
                    //pst.setString(11, new "DateofIssue"("yyyy-MM-DD").format(dateChooserCombo1.getDate());
                    //pst.setDate(9, new java.sql.Date(dateChooserCombo1.getDate().getTime()));
                   
                    pst.execute();
                    
                  JOptionPane.showMessageDialog(null, "Book Issued");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            SearchName();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            SearchISBN();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            SearchAuthor();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here: 
       if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
        String al=jTextField4.getText();
        String sql="select * from Student where Student_ID='"+al+"'";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
        if (rs.next())
        {
            jTextField5.setText(rs.getString(2));
            jTextField6.setText(rs.getString(3));
            jTextField7.setText(rs.getString(4));
            jTextField8.setText(rs.getString(5));
            rs.close();
            pst.close();
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid ID");
        }
    }
        catch (Exception e)
                {
                JOptionPane.showMessageDialog(null, e);
                }
    }
        
    }//GEN-LAST:event_jTextField4KeyPressed

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
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private datechooser.beans.DateChooserDialog dateChooserDialog3;
    private datechooser.beans.DateChooserDialog dateChooserDialog4;
    private datechooser.beans.DateChooserDialog dateChooserDialog5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
