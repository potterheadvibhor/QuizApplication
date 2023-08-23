import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
public class login extends JFrame  implements KeyListener,ActionListener
{
    JLabel backgroundimage,enter_your_name,logo;
    ImageIcon IMG;
    JTextField Enter_name;
    JButton rules,exit;
   
    login()
    {
setLayout(null);
setTitle("Login");

IMG=new ImageIcon("login.jpeg");
backgroundimage=new JLabel(IMG);
backgroundimage.setBounds(0,0,600,500);
add(backgroundimage);

logo=new JLabel("Only for Potterheads");
logo.setBounds(760,70,400,50);
logo.setFont(new Font("Kristen ITC", Font.BOLD, 30));
logo.setForeground(new Color(30, 144, 254));
add(logo);

enter_your_name=new JLabel("Enter Your Name");
enter_your_name.setBounds(850,150,300,50);
enter_your_name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
enter_your_name.setForeground(new Color(30, 144, 254));
add(enter_your_name);

Enter_name=new JTextField("Enter Your Name");
Enter_name.setBounds(800, 220, 250, 25);
Enter_name.setFont(new Font("Times New Roman", Font.BOLD, 15));
Enter_name.setForeground(new Color(30, 144, 254));
Enter_name.addKeyListener(this);
add(Enter_name);

 rules = new JButton("Rules");
        rules.setBounds(800, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

 exit= new JButton("Exit");
        exit.setBounds(930, 270, 120, 25);
        exit.setBackground(new Color(30, 144, 254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);


setBounds(100,70,1200,500);
getContentPane().setBackground(Color.WHITE);
setResizable(false);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exit)
        {
            dispose();
        }
        if(e.getSource()==rules)
        {
            String   s1=Enter_name.getText();
            if(!s1.equals("Enter Your Name"))
            {
            dispose();
            new rules(s1).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Please enter your name");
            Enter_name.setText("Enter Your Name");
        }
        }
    }
    public void keyPressed(KeyEvent e)
    {
      String   s1=Enter_name.getText();
      if(s1.equals("Enter Your Name"))
      {
        Enter_name.setText("");
      }

    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e)
    {
        String   s1=Enter_name.getText().trim();
      if(s1.equals(""))
      {
        Enter_name.setText("Enter Your Name");
      }
    }

    public static void main(String []args)
    {
new login();
    }
}
