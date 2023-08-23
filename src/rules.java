import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class rules extends JFrame implements ActionListener
{
    JButton rules,exit;
    JLabel heading;
    String name1;
    rules(String name)
    {
        this.name1=name;
        if(!name.equals(""))
        {
            
        
        System.out.println(name1);
        setLayout(null);
setTitle("Rules");

heading=new JLabel("Welcome "+name1+" to Hogwarts Quize");
heading.setBounds(50,20,700,30);
heading.setFont(new Font("Kristen ITC", Font.BOLD, 30));
heading.setForeground(new Color(30, 144, 254));
add(heading);
heading=new JLabel("Rules");
heading.setBounds(20,80,700,30);
heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
heading.setForeground(new Color(30, 144, 254));
add(heading);

rules = new JButton("Start");
        rules.setBounds(200, 500, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

 exit= new JButton("Exit");
        exit.setBounds(350, 500, 120, 25);
        exit.setBackground(new Color(30, 144, 254));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

JLabel rules  = new JLabel();
        rules.setBounds(20, 115, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
           "<html>"+
           "1. You are trained to be a magician answer magically" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is Hermione's friend" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. Mandatory to answer atleast 5 question" + "<br><br>" +
            "<html>"
            );
        add(rules);

setBounds(300,70,700,600);
getContentPane().setBackground(Color.WHITE);
setResizable(false);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
else
{
dispose();
            new login().setVisible(true);
}
}
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==exit)
        {
            dispose();
            new login().setVisible(true);
        }
        if(e.getSource()==rules)
        {
             
        System.out.println(name1);
            dispose();
            new quiz(name1).setVisible(true);
        }
    }
    public static void main(String []args)
    {
new rules("");
    }
}