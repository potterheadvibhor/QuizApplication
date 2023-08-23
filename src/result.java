import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class result extends JFrame implements ActionListener
{
    
    String name1;
JLabel heading,backgroundimage,score;
ImageIcon IMG;
JButton PlayAgain;
int score1;

    result(String name,int score2)
    {
        this.name1=name;
        this.score1=score2;
        try{
        conn c=new conn();
              String q="insert into studenttable values('"+name1+"','"+score1+"')";
              c.s.executeUpdate(q);
        }
        catch(Exception exc)
        {
            exc.printStackTrace();
        }

        System.out.println(name1);
        setLayout(null);
setTitle("Result");

heading=new JLabel("Thanks "+name1+" for playing Hogwarts Quize");
heading.setBounds(50,20,700,30);
heading.setFont(new Font("Kristen ITC", Font.BOLD, 30));
heading.setForeground(new Color(30, 144, 254));
add(heading);

IMG=new ImageIcon("score.png");
Image reset=IMG.getImage();
reset=reset.getScaledInstance(300, 250, java.awt.Image.SCALE_SMOOTH);
IMG=new ImageIcon(reset);
backgroundimage=new JLabel(IMG);
backgroundimage.setBounds(0, 200, 300, 250);
add(backgroundimage);

score=new JLabel("Your Score is "+score2);
score.setBounds(350, 200, 300, 30);
score.setFont(new Font("Kristen ITC", Font.BOLD, 26));
score.setForeground(new Color(128,0,128));
add(score);

PlayAgain=new JButton("Play Again");
PlayAgain.setBounds(380, 270, 120, 30);
        PlayAgain.setBackground(new Color(30, 144, 254));
        PlayAgain.setForeground(Color.WHITE);
        PlayAgain.addActionListener(this);
        add(PlayAgain);

setBounds(300,70,730,600);
getContentPane().setBackground(Color.WHITE);
setResizable(false);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
   
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==PlayAgain)
{
    dispose();
new rules(name1).setVisible(true);
}
}
    
    public static void main(String []args)
    {
new result("",0);
    }
}