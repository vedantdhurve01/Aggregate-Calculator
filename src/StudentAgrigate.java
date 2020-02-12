/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 *
 * @author vedant Dhurve 
 */
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class StudentAgrigate implements ActionListener{

JFrame f,f2;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1;
JButton b1,b2;
JCheckBox s1,s2,s3,s4,s5,s6,s7,s8;
JComboBox c1,c2;

String [] br={"Computer Sci & Eng.","Electrical","Mechanical","Information Tec.","Civil","Electronics & Comm.","Computer Tecno.","Chemical Eng."};
String [] yr={"1st Year","2nd Year","3rd Year","4th Year","Eng. Complited"};
String msg="",ob;
double per,total;
int even=0,odd=0,fst=0;
    public StudentAgrigate() {

       f=new JFrame(); 
       l1=new JLabel(new ImageIcon(StudentAgrigate.class.getResource("/image/image1.jpg")));
       l1.setBounds(10, 5, 500, 70);
       l2=new JLabel("Name :");
       l2.setBounds(130, 80, 100, 30);
       t1=new JTextField();
       t1.setBounds(200, 80, 150, 30);
       t1.setToolTipText("Enter Name");
       l3=new JLabel("Branch :");
       l3.setBounds(130, 130, 100, 30);
       c1=new JComboBox(br);
       c1.setBounds(200, 130, 150, 30);
       l4=new JLabel("Year :");
       l4.setBounds(130, 180, 150, 30);
       c2=new JComboBox(yr);
       c2.setBounds(200, 180, 150, 30);
       b1=new JButton("Enter Marks");
       b1.setBounds(180, 230, 120, 30);
       
       s1=new JCheckBox("Sem 1");
       s1.setBounds(130, 220, 80, 30);
       s1.setToolTipText("Enter 1st Sem Marks Out Of 625");
       s2=new JCheckBox("Sem 2");
       s2.setBounds(210, 220, 80, 30);
       s2.setToolTipText("Enter 1st Sem Marks Out Of 600");
       s3=new JCheckBox("Sem 3");
       s3.setBounds(290, 220, 80, 30);
       s3.setToolTipText("Enter 1st Sem Marks Out Of 650");
       s4=new JCheckBox("Sem 4");
       s4.setBounds(370, 220, 80, 30);
       s4.setToolTipText("Enter 1st Sem Marks Out Of 600");
       s5=new JCheckBox("Sem 5");
       s5.setBounds(130, 260, 80, 30);
       s5.setToolTipText("Enter 1st Sem Marks Out Of 650");
       s6=new JCheckBox("Sem 6");
       s6.setBounds(210, 260, 80, 30);
       s6.setToolTipText("Enter 1st Sem Marks Out Of 600");
       s7=new JCheckBox("Sem 7");
       s7.setBounds(290, 260, 80, 30);
       s7.setToolTipText("Enter 1st Sem Marks Out Of 650");
       s8=new JCheckBox("Sem 8");
       s8.setBounds(370, 260, 80, 30);
       s8.setToolTipText("Enter 1st Sem Marks Out Of 600");
       
       l5=new JLabel("(Odd Sem Out Of Marks Is 600)");
       l5.setBounds(150, 290, 400, 30);
       l6=new JLabel("(Even Sem Out Of Marks Is 650)");
       l6.setBounds(110, 320, 400, 30);
       l7=new JLabel("(1st Sem Marks Is 625)");
       l7.setBounds(300, 320, 400, 30);
       l8=new JLabel("(Vedant Dhurve)");
       l8.setBounds(410, 420, 100, 30);
       
       
       b2=new JButton(new ImageIcon(StudentAgrigate.class.getResource("/image/image2.png")));
       b2.setBounds(200, 360, 150, 40);
       
       
       
       
       
       f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);
       f.add(t1);f.add(c1);f.add(c2);f.add(b1);f.add(b2);
       f.add(s1);f.add(s2);f.add(s3);f.add(s4);f.add(s5);f.add(s6);f.add(s7);f.add(s8);
       
       f.setSize(530, 500);
       f.setLayout(null);
       f.setVisible(true);
       s1.setVisible(false);s2.setVisible(false);s3.setVisible(false);s4.setVisible(false);s5.setVisible(false);s6.setVisible(false);s7.setVisible(false);s8.setVisible(false);
       b2.setVisible(false);l5.setVisible(false);l6.setVisible(false);l7.setVisible(false);
       f.setDefaultCloseOperation(EXIT_ON_CLOSE);
              
      b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               b1.setVisible(false);
               b2.setVisible(true);
               l5.setVisible(true);l6.setVisible(true);l7.setVisible(true);
               String year ="";
               year+=c2.getItemAt(c2.getSelectedIndex());  
            
               if(year.equalsIgnoreCase("1st Year"))
               {
               s1.setVisible(true);s2.setVisible(true);
               s3.setVisible(false);s4.setVisible(false);s5.setVisible(false);s6.setVisible(false);s7.setVisible(false);s8.setVisible(false);
               }
               
               if(year.equalsIgnoreCase("2nd Year"))
               {
               s1.setVisible(true);s2.setVisible(true);
               s3.setVisible(true);s4.setVisible(true);
               s5.setVisible(false);s6.setVisible(false);s7.setVisible(false);s8.setVisible(false);
               }
               
                if(year.equalsIgnoreCase("3rd Year"))
               {
               s1.setVisible(true);s2.setVisible(true);
               s3.setVisible(true);s4.setVisible(true);
               s5.setVisible(true);s6.setVisible(true);
               s7.setVisible(false);s8.setVisible(false);
               }
                
               if((year.equalsIgnoreCase("4th Year"))||(year.equalsIgnoreCase("Eng. Complited")))
               {
               s1.setVisible(true);s2.setVisible(true);
               s3.setVisible(true);s4.setVisible(true);
               s5.setVisible(true);s6.setVisible(true);
               s7.setVisible(true);s8.setVisible(true);
               } 
            
                msg="   Name : "+t1.getText()+"\n--------------------------------------------------------\n";
               msg+="   Branch : "+c1.getItemAt(c1.getSelectedIndex())+"\n--------------------------------------------------------\n";
               msg+="   Semister : "+c2.getItemAt(c2.getSelectedIndex())+"\n--------------------------------------------------------\n";
               
           }
       });
      s1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
             
               ob=JOptionPane.showInputDialog("Enter 1st Semister Obtain Marks \n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
               fst=625;
               msg+="   1st Sem marks : "+m+"\n";
              
               
           }
       });
      
      s2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
              String ob=JOptionPane.showInputDialog(f,"Enter 2nd Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
               even=even+1;
               msg+="   2nd Sem marks : "+m+"\n";
               
           }
       });
      
      s3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
                String ob=JOptionPane.showInputDialog(f,"Enter 3rd Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
               odd=odd+1;
               msg+="   3rd Sem marks : "+m+"\n";
               
           }
       });
      
      s4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
             String ob=JOptionPane.showInputDialog(f,"Enter 4th Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
               even=even+1;
               msg+="   4th Sem marks : "+m+"\n";   
           }
       });
      
      s5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
                String ob=JOptionPane.showInputDialog(f,"Enter 5th Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
              odd=odd+1;
               msg+="   5th Sem marks : "+m+"\n";
               
           }
       });
      
      s6.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
               String ob=JOptionPane.showInputDialog(f,"Enter 6th Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
                even=even+1;
               msg+="   6th Sem marks : "+m+"\n";
               
           }
       });
      
      s7.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          
               String ob=JOptionPane.showInputDialog(f,"Enter 7th Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
               odd=odd+1;
               msg+="   7th Sem marks : "+m+"\n";
               
           }
       });
      
    
      s8.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          
                String ob=JOptionPane.showInputDialog(f,"Enter 8th Semister Obtain Marks\n             (Out Of 650)");
               int m=Integer.parseInt(ob);
               total=total+m;
               even=even+1;
               msg+="   8th Sem marks : "+m+"\n";
           }
       });
      
      
      
     b2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          msg+="________________________________\n   All Sem Marks : "+total;
          double div=(650*odd)+(600*even)+fst;  
          per=(total/div)*100.0;
               
               msg+="\n\nYour Engineering Aggrigates Is \n    "+per;
             //  JOptionPane.showInternalMessageDialog(f2,msg);
             JOptionPane.showMessageDialog(f2,msg);
            System.out.println(msg);
               
           }
       });
     
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        
    

   StudentAgrigate sa=new StudentAgrigate();

      
    }

    
}
    

