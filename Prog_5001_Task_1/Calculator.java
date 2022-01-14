// Import important library as requirement
//swing for frame, awt for controls, and event for button events
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;

/**
 * Write a description of class Calculator here.
 *
 * @author (Aqeel Hassan)
 * @version (13.01.22)
 */
public class Calculator extends JFrame implements ActionListener
{
    //creates our controls  
  JTextField ansTextField=new JTextField("",18);  
  JButton one=new JButton("1");  
  JButton two=new JButton("2");  
  JButton three=new JButton("3");  
  JButton four=new JButton("4");  
  JButton five=new JButton("5");  
  JButton six=new JButton("6");  
  JButton seven=new JButton("7");
  JButton eight=new JButton("8");  
  JButton nine=new JButton("9");
  JButton times=new JButton("*");  
  JButton divide=new JButton("/");  
  JButton equals=new JButton("=");  
  JButton minus=new JButton("-");
  
 //declares three variables  
  int intNum1,intNum2;  
  String strOperator;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        //creates two panels  
   
       JPanel topPanel=new JPanel();
       topPanel.setBackground(Color.gray);
       GridLayout panelTopLayout = new GridLayout(0,1);
       topPanel.setLayout(panelTopLayout);
       
       JPanel panelCenter=new JPanel();  
       panelCenter.setBackground(Color.gray);
       GridLayout panelCenterLayout = new GridLayout(4,3);
       panelCenterLayout.setHgap(5);
       panelCenterLayout.setVgap(5);
       topPanel.setLayout(panelCenterLayout);
       
       JPanel rightPanel=new JPanel();
       GridLayout panelRightLayout = new GridLayout(4,2);
       topPanel.setLayout(panelRightLayout);
       //create two layouts 
       
       //prepare our buttons to accept an event  
       one.addActionListener(this);  
       two.addActionListener(this);
       three.addActionListener(this);  
       four.addActionListener(this);
       five.addActionListener(this);  
       six.addActionListener(this);
       seven.addActionListener(this);  
       eight.addActionListener(this);
       nine.addActionListener(this); 
       times.addActionListener(this);  
       minus.addActionListener(this);
       divide.addActionListener(this);  
       equals.addActionListener(this);
       
       
         
       //adds the textbox to the top panel  
       topPanel.add(ansTextField);  
       //applies flow layout to bottom panel  
       //panelCenter.setLayout(panelCenterLayout);  
       //add the buttons to the bottom panel  
       panelCenter.add(one);  
       panelCenter.add(two);  
       panelCenter.add(three);  
       panelCenter.add(four);  
       panelCenter.add(five);  
       panelCenter.add(six);  
       panelCenter.add(seven);  
       panelCenter.add(eight);  
       panelCenter.add(nine);  
         
       
       
       panelCenter.setLayout(panelCenterLayout);
       
       rightPanel.add(times);
       rightPanel.add(minus);
       rightPanel.add(divide);
       rightPanel.add(equals);
       rightPanel.setLayout(panelRightLayout);
       add(rightPanel, BorderLayout.EAST);
       add(panelCenter, BorderLayout.WEST);
       add(topPanel, BorderLayout.NORTH);
       //setup our frame  
       setSize(400,600);  
       setLocation(0,0);  
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       setTitle("Calculator");  
       setVisible(true);  
       
    }
    
    public void actionPerformed(ActionEvent e)  
    {  
    
    }
    
    //Creates an instance of our class so that we can run it  
    public static void main(String[] args)  
    {  
      Calculator c=new Calculator();    
    }

    
}
