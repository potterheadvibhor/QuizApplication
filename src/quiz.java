import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class quiz extends JFrame implements ActionListener
 {
ImageIcon IMG;
JLabel backgroundimage,playername,queston_no,queston;
JButton NEXT,SUBMIT,fifty_50;
JRadioButton o1,o2,o3,o4;
ButtonGroup bg;
String [][]questions=new String[10][5];
String [][]answers=new String[10][2];
String [][]useranswers=new String[10][1];
int timer=10;
int count=0;
int ans_given=0;
int score=0;
String name1;
    quiz(String name)
    {
        setLayout(null);
        setTitle("quize");
this.name1=name;
System.out.println(name);
IMG=new ImageIcon("quiz.jpg");
backgroundimage=new JLabel(IMG);
backgroundimage.setBounds(0,0,1340,350);
add(backgroundimage);

playername=new JLabel("Potterhead: "+name);
playername.setBounds(550,350,400,50);
playername.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
playername.setForeground(new Color(30, 144, 254));
add(playername);
queston_no=new JLabel();
queston_no.setBounds(30,350,160,50);
queston_no.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
queston_no.setForeground(new Color(30, 144, 254));
add(queston_no);


questions[0][0] = "Who is Harry Potter's best friend?";
        questions[0][1] = "Ron";
        questions[0][2] = "Draco";
        questions[0][3] = "Neville";
        questions[0][4] = "Hermione";

        questions[1][0] = "Who is the Half-Blood Prince?";
        questions[1][1] = "Sirius";
        questions[1][2] = "Voldermort";
        questions[1][3] = "Snape";
        questions[1][4] = "Hagrid";

        questions[2][0] = "Which house does Harry Potter belong to?";
        questions[2][1] = "Gryffindor";
        questions[2][2] = "Hufflepuff";
        questions[2][3] = "Ravenclaw";
        questions[2][4] = "Slytherin";

        questions[3][0] = "Who is the Defense Against the Dark Arts teacher in the first book?";
        questions[3][1] = "McGonagall";
        questions[3][2] = "Lockhart";
        questions[3][3] = "Lupin";
        questions[3][4] = "Quirrell";

        questions[4][0] = "What is the name of Harry Potter's owl?";
        questions[4][1] = "Hedwig";
        questions[4][2] = "Crookshanks";
        questions[4][3] = "Scabbers";
        questions[4][4] = " Fawkes";

        questions[5][0] = "Who is the main antagonist in the Harry Potter series?";
        questions[5][1] = "Dumbledore";
        questions[5][2] = "Snape";
        questions[5][3] = "Voldemort";
        questions[5][4] = "Malfoy";

        questions[6][0] = "Which Triwizard Tournament task involves underwater challenges?";
        questions[6][1] = "First Task";
        questions[6][2] = "Secound Task";
        questions[6][3] = "Third Task";
        questions[6][4] = "There is no underwater task";

        questions[7][0] = "What is the name of Ron Weasley's pet rat?";
        questions[7][1] = "Scabbers";
        questions[7][2] = "Crookshanks";
        questions[7][3] = "Fang";
        questions[7][4] = "Trevor";

        questions[8][0] = "Who is the headmaster of Hogwarts School of Witchcraft and Wizardry?";
        questions[8][1] = "Snape";
        questions[8][2] = "Hagrid";
        questions[8][3] = "Dumbledore";
        questions[8][4] = "McGonagall";

        questions[9][0] = "Which spell is used to unlock doors?";
        questions[9][1] = "Alohomora";
        questions[9][2] = "Expecto Patronum";
        questions[9][3] = "Wingardium Leviosa";
        questions[9][4] = "Expelliarmus";


        answers[0][1] = "Hermione";
        answers[1][1] = "Snape";
        answers[2][1] = "Gryffindor";
        answers[3][1] = "Quirrell";
        answers[4][1] = "Hedwig";
        answers[5][1] = "Voldermort";
        answers[6][1] = "Secound Task";
        answers[7][1] = "Scabbers";
        answers[8][1] = "Dumbledore";
        answers[9][1] = "Alohomora";

queston=new JLabel();
queston.setBounds(80,410,700,50);
queston.setFont(new Font("Arial", Font.PLAIN, 18));
queston.setForeground(Color.black);
add(queston);

bg=new ButtonGroup();

o1=new JRadioButton();
o1.setBounds(80, 460, 300, 30);
o1.setFont(new Font("Arial", Font.PLAIN, 15));
o1.setForeground(Color.black);
o1.setBackground(Color.WHITE);
bg.add(o1);
add(o1);
o2=new JRadioButton();
o2.setBounds(80,500, 300, 30);
o2.setFont(new Font("Arial", Font.PLAIN, 15));
o2.setForeground(Color.black);
o2.setBackground(Color.WHITE);
bg.add(o2);
add(o2);
o3=new JRadioButton();
o3.setBounds(80, 540, 300, 30);
o3.setFont(new Font("Arial", Font.PLAIN, 15));
o3.setForeground(Color.black);
o3.setBackground(Color.WHITE);
bg.add(o3);
add(o3);
o4=new JRadioButton();
o4.setBounds(80, 580, 300, 30);
o4.setFont(new Font("Arial", Font.PLAIN, 15));
o4.setForeground(Color.black);
o4.setBackground(Color.WHITE);
bg.add(o4);
add(o4);

SUBMIT = new JButton("Submit");
        SUBMIT.setBounds(1000, 540, 120, 25);
        SUBMIT.setBackground(new Color(30, 144, 254));
        SUBMIT.setForeground(Color.WHITE);
        SUBMIT.addActionListener(this);
        SUBMIT.setEnabled(false);
        add(SUBMIT);
NEXT = new JButton("Next");
        NEXT.setBounds(1000, 580, 120, 25);
        NEXT.setBackground(new Color(30, 144, 254));
        NEXT.setForeground(Color.WHITE);
        NEXT.addActionListener(this);
        add(NEXT);
fifty_50 = new JButton("50_50");
        fifty_50.setBounds(1000, 500, 120, 25);
        fifty_50.setBackground(new Color(30, 144, 254));
        fifty_50.setForeground(Color.WHITE);
        fifty_50.addActionListener(this);
        add(fifty_50);

        Start(count);

        setVisible(true);
        setBounds(100,70,1340,700);
getContentPane().setBackground(Color.WHITE);
setResizable(false);
setDefaultCloseOperation(EXIT_ON_CLOSE);
repaint();
    }

 public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==NEXT)
        {
            o1.setEnabled(true);
    o2.setEnabled(true);
    o3.setEnabled(true);
    o4.setEnabled(true);
            repaint();
            ans_given =1;
            if(bg.getSelection()==null)
    {
        useranswers[count][0]="";
    }
    else
    {
useranswers[count][0]=bg.getSelection().getActionCommand();
    }
    if(count ==8)
    {
        NEXT.setEnabled(false);
        SUBMIT.setEnabled(true);

    }
            count++;
            Start(count);
        }
        if(e.getSource()==SUBMIT)
        {
            ans_given=1;
if(bg.getSelection()==null)
    {
        useranswers[count][0]="";
    }
    else
    {
useranswers[count][0]=bg.getSelection().getActionCommand();
    }
    for(int i=0;i<useranswers.length;i++)
    {
if(useranswers[i][0].equals(answers[i][1]))
{
    score +=10; 

}
    }
  dispose();
        new result(name1,score).setVisible(true);

        }
       else if(e.getSource()==fifty_50)
        {
if(count == 2|| count == 4|| count == 6|| count == 9)
{
    o2.setEnabled(false);
    o4.setEnabled(false);
   
}
else{
    o1.setEnabled(false);
    o3.setEnabled(false);
    
}
fifty_50.setEnabled(false);
        }
    }

    public void paint(Graphics g)   // paint
    {
super.paint(g);
String time="Time Left :"+ timer +" seconds";
g.setColor(Color.RED);
g.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));

if(timer>0)
{
g.drawString(time, 1100, 410);
}
else
{
   g.drawString("Time out!!", 1100, 410);     
}
timer--;
try{
Thread.sleep(1000);
repaint();
}
catch(Exception e)
{
    e.printStackTrace();
}

if(ans_given==1)
{
ans_given=0;
timer=15;
}
else if(timer<0)
{
    timer=15;
    o1.setEnabled(true);
    o2.setEnabled(true);
    o3.setEnabled(true);
    o4.setEnabled(true);
     if(count ==8)
    {
        NEXT.setEnabled(false);
        SUBMIT.setEnabled(true);

    }
    if(count== 9)
    {
if(bg.getSelection()==null)
    {
        useranswers[count][0]="";
    }
    else
    {
useranswers[count][0]=bg.getSelection().getActionCommand();
    }
    for(int i=0;i<useranswers.length;i++ )
    {
if(useranswers[i][0].equals(answers[i][1]))
{
    score +=10; 

}
    }
  dispose();
    new result(name1,score).setVisible(true);
}
    else{
    if(bg.getSelection()==null)
    {
        useranswers[count][0]="";
    }
    else
    {
useranswers[count][0]=bg.getSelection().getActionCommand();
    }
    
    count++;
Start(count);
}}

 }

    public void Start(int  count)
    {

        queston_no.setText("Question No:"+(count+1) +".");
        System.out.println(count);

        queston.setText(questions[count][0]);
        o1.setText(questions[count][1]);
        o1.setActionCommand(questions[count][1]);
        o2.setText(questions[count][2]);
        o2.setActionCommand(questions[count][2]);
        o3.setText(questions[count][3]);
        o3.setActionCommand(questions[count][3]);
        o4.setText(questions[count][4]);
        o4.setActionCommand(questions[count][4]);
        bg.clearSelection();
        
    }
   
    public static void main(String []args)
    {
        new quiz("");
    }
}
