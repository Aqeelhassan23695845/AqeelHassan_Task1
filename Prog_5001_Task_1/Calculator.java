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
  JTextField calText=new JTextField("",18);  
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
  JButton equals1=new JButton("");
  JButton equals2=new JButton("=");
  JButton equals3=new JButton("");
  JButton minus=new JButton("-");
  JButton zero=new JButton("0");
  JButton plus=new JButton("+");
  JButton clear=new JButton("C");
  JButton abs=new JButton("+/-");
  JButton openBracket=new JButton("(");
  JButton closeBracket=new JButton(")");
  JButton apostrophy=new JButton("!");
  JButton off=new JButton("OFF");
  JButton backspace=new JButton(">>");
  JButton point=new JButton(".");
  

/**
 * Constructor for objects of class Calculator using to Call calcGUI method and set title as well as size
 */
public Calculator()
{
    //creates two panels  
    super("Calculator");
    setSize(300, 350);
    calcGUI();

}
    
    public void calcGUI()
{
    // put your code here
    JPanel topPanel = new JPanel();
    GridLayout topPanelLayout = new GridLayout(0,1);
    topPanel.setLayout(topPanelLayout);

    JPanel centerPanel = new JPanel();       
    GridLayout centerPanelLayout = new GridLayout(5,3,0,0);
    centerPanel.setLayout(centerPanelLayout);

    JPanel rightPanel = new JPanel();
    GridLayout rightPanelLayout = new GridLayout(5,2,8,5);
    rightPanel.setLayout(rightPanelLayout);

    //JTextField calText= new JTextField();        
    calText.setFont(new Font("Arial", Font.BOLD, 24));
    calText.setHorizontalAlignment(JTextField.RIGHT);        
    calText.setPreferredSize(new Dimension(50,45));
    calText.setText("0");
    topPanel.add(calText);
    
    add(topPanel, BorderLayout.NORTH);
    add(centerPanel, BorderLayout.CENTER);
    add(rightPanel,BorderLayout.EAST);
    
    one.setActionCommand("1");
    one.addActionListener(this);
    one.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(one);
    
    two.setActionCommand("2");
    two.addActionListener(this);
    two.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(two);
    
    three.setActionCommand("3");
    three.addActionListener(this);
    three.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(three);
    
    four.setActionCommand("4");
    four.addActionListener(this);
    four.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(four);
    
    five.setActionCommand("5");
    five.setBackground(Color.decode("#c9c9c9"));
    five.addActionListener(this);
    centerPanel.add(five);
    
    six.setActionCommand("6");
    six.addActionListener(this);
    six.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(six);
    
    
    seven.setActionCommand("7");
    seven.addActionListener(this);
    seven.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(seven);
    
    eight.setActionCommand("8");
    eight.addActionListener(this);
    eight.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(eight);
    
    nine.setActionCommand("9");
    nine.addActionListener(this);
    nine.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(nine);
    
    abs.setActionCommand("+/-");
    abs.setBackground(Color.decode("#c9c9c9"));
    abs.addActionListener(this);
    centerPanel.add(abs);
    
    zero.setActionCommand("0");
    zero.setBackground(Color.decode("#c9c9c9"));
    zero.addActionListener(this);
    centerPanel.add(zero);
    
            
    point.setActionCommand(".");
    point.addActionListener(this);
    point.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(point);
    
    equals1.setActionCommand("=");
    equals1.addActionListener(this);
    equals1.setBorder(BorderFactory.createEmptyBorder());
    equals1.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(equals1);
    
    equals2.setActionCommand("=");
    equals2.addActionListener(this);
    equals2.setBackground(Color.decode("#c9c9c9"));
    equals2.setBorder(BorderFactory.createEmptyBorder());
    centerPanel.add(equals2);
    
    equals3.setActionCommand("=");
    equals3.addActionListener(this);
    equals3.setBackground(Color.decode("#c9c9c9"));
    equals3.setBorder(BorderFactory.createEmptyBorder());
    centerPanel.add(equals3);

    
    plus.setActionCommand("+");
    plus.addActionListener(this);
    plus.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(plus);
    
    backspace.setActionCommand(">>");
    backspace.setBackground(Color.decode("#c9c9c9"));
    backspace.addActionListener(this);
    rightPanel.add(backspace);
    
    minus.setActionCommand("-");
    minus.addActionListener(this);
    minus.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(minus);
    
    clear.setActionCommand("C");
    clear.addActionListener(this);
    clear.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(clear);
    
    times.setActionCommand("*");
    times.addActionListener(this);
    times.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(times);
    
    openBracket.setActionCommand("(");
    openBracket.addActionListener(this);
    openBracket.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(openBracket);

    divide.setActionCommand("/");
    divide.addActionListener(this);
    divide.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(divide);
    
    closeBracket.setActionCommand(")");
    closeBracket.addActionListener(this);
    closeBracket.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(closeBracket);
    
    apostrophy.setActionCommand("!");
    apostrophy.addActionListener(this);
    apostrophy.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(apostrophy);
    
    off.setActionCommand("OFF");
    off.addActionListener(this);
    off.setBackground(Color.decode("#fdbb2d"));
    rightPanel.add(off);
}
    
public void actionPerformed(ActionEvent e)  
{  
    String calcText;
    calcText= calText.getText();
    String command = e.getActionCommand();
    if (command.equals("1")) {
        calcText += one.getText();
    }
    if (command.equals("2")) {
        calcText += two.getText();
    }
    if (command.equals("3")) {
        calcText += three.getText();
    }
    if (command.equals("4")) {
        calcText += four.getText();
    }
    if (command.equals("5")) {
        calcText += five.getText();
    }
    if (command.equals("6")) {
        calcText += six.getText();
    }
    if (command.equals("7")) {
        calcText += seven.getText();
    }
    if (command.equals("8")) {
        calcText += eight.getText();
    }
    if (command.equals("9")) {
        calcText += nine.getText();
    }
    if (command.equals("0")) {
        calcText += zero.getText();
    }
    if (command.equals(".")) {
        calcText += point.getText();
    }
    if (command.equals("+/-")) {
        calcText += abs.getText();
    }
    if (command.equals("+")) {
        calcText += plus.getText();
    }
    if (command.equals("-")) {
        calcText += minus.getText();
    }
    if (command.equals("*")) {
        calcText += times.getText();
    }
    if (command.equals("/")) {
        calcText += divide.getText();
    }
    if (command.equals("!")) {
        calcText += apostrophy.getText();
    }
    if (command.equals("(")) {
        calcText += "(";
    }
    if (command.equals(")")) {
        calcText += ")";
    }
    if (command.equals("C")) {
        calcText = "";
    }
    if (command.equals("OFF")) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    if (command.equals(">>")) {
        int len = calcText.length();
        calcText = calcText.substring(0, len-1);
    }
    
    calText.setText(calcText);
}
    
//Creates an instance of our class so that we can run it  
public static void main(String[] args)  
{  
  Calculator c=new Calculator();    
  c.setVisible(true);
}

    
}
