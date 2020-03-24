
package javaapplication6;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class deepanjali extends JFrame
{
    JButton btnSubmit, btnCancel; 
    JLabel lab, lblbg;;
    
    public deepanjali()
    {
        //setSize(500,500);
        setTitle("ELECTRONIC MEDICAL RECORD SYSTEM");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setLayout(null);
        AddControls();
        lblbg= new JLabel();
        
        ImageIcon img= new ImageIcon("E:\\images\\12.jpg");
        lblbg.setIcon(img);
        add(lblbg);
        
    }
    public void AddControls()
            
    {
     btnSubmit= new JButton("SIGN IN");
     //btnSubmit.setSize(100,50);
     //btnSubmit.setLocation(600,400);
     btnSubmit.setBounds(650,400,100,50);
      btnSubmit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
      btnSubmit.setForeground(Color.BLUE);
     add(btnSubmit);
     btnSubmit.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             signUp obj1 = new signUp();
            obj1.setVisible(true);
            deepanjali.this.setVisible(false);
             
         }
     });
     btnCancel= new JButton("LOGIN");
     btnCancel.setBounds(650,500,100,50);
     btnCancel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
     btnCancel.setForeground(Color.BLUE);
     add(btnCancel);
     btnCancel.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
          login obj =new login();
              obj.setVisible(true);
              deepanjali.this.setVisible(false);  
         }
     });
     lab = new JLabel("THE PATIENT'S BOOK");
     lab.setForeground(Color.black);
     lab.setFont(new Font("Arial",  Font.BOLD,50));
     lab.setBounds(50,0, 650, 303);
    add(lab); 
            
            
            
    }
    
}
