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
    //Calling calcGUI method, set calculator title and size 
    super("Calculator");
    setSize(300, 350);
    calcGUI();

}
    
    public void calcGUI()
{
    // Creating Top panel for calculator text area
    JPanel topPanel = new JPanel();
    GridLayout topPanelLayout = new GridLayout(0,1);
    topPanel.setLayout(topPanelLayout);

    // creating centerpanellayout for calculator buttons from 0 to 9 and equals to =
    JPanel centerPanel = new JPanel();       
    GridLayout centerPanelLayout = new GridLayout(5,3,0,0);
    centerPanel.setLayout(centerPanelLayout);

    // creating rightpanel for operators and other functionalties button
    JPanel rightPanel = new JPanel();
    GridLayout rightPanelLayout = new GridLayout(5,2,8,5);
    rightPanel.setLayout(rightPanelLayout);

    //Adjusting text field font, alignment, size and value        
    calText.setFont(new Font("Arial", Font.BOLD, 24));
    calText.setHorizontalAlignment(JTextField.RIGHT);        
    calText.setPreferredSize(new Dimension(50,45));
    calText.setText("0");
    topPanel.add(calText);
    
    // adding panel to jframe
    add(topPanel, BorderLayout.NORTH);
    add(centerPanel, BorderLayout.CENTER);
    add(rightPanel,BorderLayout.EAST);
    
    // creating button 1 with action perform listner as well as color and adding to panel
    one.setActionCommand("1");
    one.addActionListener(this);
    one.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(one);
    
    // creating button 2 with action perform listner as well as color and adding to panel
    two.setActionCommand("2");
    two.addActionListener(this);
    two.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(two);
    
    // creating button 3 with action perform listner as well as color and adding to panel
    three.setActionCommand("3");
    three.addActionListener(this);
    three.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(three);
    
    // creating button 4 with action perform listner as well as color and adding to panel
    four.setActionCommand("4");
    four.addActionListener(this);
    four.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(four);
    
    // creating button 5 with action perform listner as well as color and adding to panel
    five.setActionCommand("5");
    five.setBackground(Color.decode("#c9c9c9"));
    five.addActionListener(this);
    centerPanel.add(five);
    
    // creating button 6 with action perform listner as well as color and adding to panel
    six.setActionCommand("6");
    six.addActionListener(this);
    six.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(six);
    
    // creating button 7 with action perform listner as well as color and adding to panel
    seven.setActionCommand("7");
    seven.addActionListener(this);
    seven.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(seven);
    
    // creating button 8 with action perform listner as well as color and adding to panel
    eight.setActionCommand("8");
    eight.addActionListener(this);
    eight.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(eight);
    
    // creating button 9 with action perform listner as well as color and adding to panel
    nine.setActionCommand("9");
    nine.addActionListener(this);
    nine.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(nine);
    
    // creating button abs with action perform listner as well as color and adding to panel
    abs.setActionCommand("+/-");
    abs.setBackground(Color.decode("#c9c9c9"));
    abs.addActionListener(this);
    centerPanel.add(abs);
    
    // creating button zero with action perform listner as well as color and adding to panel
    zero.setActionCommand("0");
    zero.setBackground(Color.decode("#c9c9c9"));
    zero.addActionListener(this);
    centerPanel.add(zero);
    
    // creating button point with action perform listner as well as color and adding to panel
    point.setActionCommand(".");
    point.addActionListener(this);
    point.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(point);
    
    // creating button = with action perform listner as well as color and adding to panel
    equals1.setActionCommand("=");
    equals1.addActionListener(this);
    equals1.setBorder(BorderFactory.createEmptyBorder());
    equals1.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(equals1);
    
    // creating button = with action perform listner as well as color and adding to panel
    equals2.setActionCommand("=");
    equals2.addActionListener(this);
    equals2.setBackground(Color.decode("#c9c9c9"));
    equals2.setBorder(BorderFactory.createEmptyBorder());
    centerPanel.add(equals2);
    
    // creating button = with action perform listner as well as color and adding to panel
    equals3.setActionCommand("=");
    equals3.addActionListener(this);
    equals3.setBackground(Color.decode("#c9c9c9"));
    equals3.setBorder(BorderFactory.createEmptyBorder());
    centerPanel.add(equals3);

    
    // creating button plus with action perform listner as well as color and adding to panel
    plus.setActionCommand("+");
    plus.addActionListener(this);
    plus.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(plus);
    
    // creating button backspace with action perform listner as well as color and adding to panel
    backspace.setActionCommand(">>");
    backspace.setBackground(Color.decode("#c9c9c9"));
    backspace.addActionListener(this);
    rightPanel.add(backspace);
    
    // creating button minus with action perform listner as well as color and adding to panel
    minus.setActionCommand("-");
    minus.addActionListener(this);
    minus.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(minus);
    
    // creating button clear with action perform listner as well as color and adding to panel
    clear.setActionCommand("C");
    clear.addActionListener(this);
    clear.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(clear);
    
    // creating button * with action perform listner as well as color and adding to panel
    times.setActionCommand("*");
    times.addActionListener(this);
    times.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(times);
    
    // creating button openBracket with action perform listner as well as color and adding to panel
    openBracket.setActionCommand("(");
    openBracket.addActionListener(this);
    openBracket.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(openBracket);

    // creating button divide with action perform listner as well as color and adding to panel
    divide.setActionCommand("/");
    divide.addActionListener(this);
    divide.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(divide);
    
    // creating button closeBracket with action perform listner as well as color and adding to panel
    closeBracket.setActionCommand(")");
    closeBracket.addActionListener(this);
    closeBracket.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(closeBracket);
    
    // creating button apostrophy with action perform listner as well as color and adding to panel
    apostrophy.setActionCommand("!");
    apostrophy.addActionListener(this);
    apostrophy.setBackground(Color.decode("#c9c9c9"));
    rightPanel.add(apostrophy);
    
    // creating button OFF with action perform listner as well as color and adding to panel
    off.setActionCommand("OFF");
    off.addActionListener(this);
    off.setBackground(Color.decode("#fdbb2d"));
    rightPanel.add(off);
}
    
public void actionPerformed(ActionEvent e)  
{
    // creating variable for operator , result, firstnumber as well as calcText for getting text from textfield
    String calcText;
    Double firstNumber=0.00;
    String operator = "";
    String result = "";
    calcText= calText.getText();
    String command = e.getActionCommand();
    
    // creating conditions for button 1 click
    if (command.equals("1")) {
        if(calcText == "0" || calcText == null){
            calcText = "1";
        }else{
        calcText += one.getText();
    }
    }
    
    // creating conditions for button 2 click
    if (command.equals("2")) {
        if(calcText == "0" || calcText == null){
        calcText = "2";
    }else{
        calcText += two.getText();
    }
    }
    
    // creating conditions for button 3 click
    if (command.equals("3")) {
        if(calcText == "0" || calcText == null){
        calcText = "3";
    }
    else{
        calcText += three.getText();
    }
    }
    
    // creating conditions for button 4 click
    if (command.equals("4")) {
        if(calcText == "0" || calcText == null){
        calcText = "4";
    }
    else{
        calcText += four.getText();
    }
     }
     
     // creating conditions for button 5 click
    if (command.equals("5")) {
        if(calcText == "0" || calcText == null){
        calcText = "5";
    }
    else{
        calcText += five.getText();
    }
     }
     
     // creating conditions for button 6 click
    if (command.equals("6")) {
        if(calcText == "0" || calcText == null){
        calcText = "6";
    }
    else{
        calcText += six.getText();
    }
    }
    
    // creating conditions for button 7 click
    if (command.equals("7")) {
        if(calcText == "0" || calcText == null){
        calcText = "7";
    }
    else{
        calcText += seven.getText();
    }
    }
    
    // creating conditions for button 8 click
    if (command.equals("8")) {
        if(calcText == "0" || calcText == null){
        calcText = "8";
    }
    else{
        calcText += eight.getText();
    }
     }
     
     // creating conditions for button 9 click
    if (command.equals("9")) {
        if(calcText == "0" || calcText == null){
        calcText = "9";
    }
    else{
        calcText += nine.getText();
    }
     }
     
     // creating conditions for button 0 click
    if (command.equals("0")) {
        if(calcText == "0" || calcText == null){
        calcText = "0";
    }
    else{
        calcText += zero.getText();
    }
     }
     
     // creating conditions for button point click
    if (command.equals(".")) {
        calcText += point.getText();
    }
    
    // creating conditions for button abs click
    if (command.equals("+/-")) {
        calcText += "abs";
    }
    
    // creating conditions for button + click
    if (command.equals("+")) {
        firstNumber = Double.parseDouble(calcText);
        operator = "+";
        calcText = "0";
    }
    
    // creating conditions for button minus click
    if (command.equals("-")) {
        //calcText += minus.getText();
        firstNumber = Double.parseDouble(calcText);
        operator = "-";
        calcText = "0";
    }
    
    // creating conditions for button multiply click
    if (command.equals("*")) {
        //calcText += times.getText();
        firstNumber = Double.parseDouble(calcText);
        operator = "*";
        calcText = "0";
    }
    
    // creating conditions for button divide click
    if (command.equals("/")) {
        //calcText += divide.getText();
        firstNumber = Double.parseDouble(calcText);
        operator = "/";
        calcText = "0";
    }
    
    // creating conditions for button factorial click
    if (command.equals("!")) {
        calcText += "factorial(";
    }
    
    // creating conditions for button openBracket click
    if (command.equals("(")) {
        calcText += openBracket.getText();
    }
    
    // creating conditions for button closeBracket click
    if (command.equals(")")) {
        calcText += closeBracket.getText();
    }
    
    // creating conditions for button off click
    if (command.equals("OFF")) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // creating conditions for button clear click
    if (command.equals(">>")) {
        int len = calcText.length();
        calcText = calcText.substring(0, len-1);
    }
    
    // creating conditions for button = click
    if (command.equals("=")) {
        Double secondNumber = 0.00;
        secondNumber = Double.parseDouble(calcText);
        if(operator == "+"){
            result= Double.toString(firstNumber + secondNumber);
            calcText = result;
        }
        if(operator == "-"){
            result= Double.toString(firstNumber - secondNumber);
            calcText = result;
        }
        if(operator == "*"){
            result= Double.toString(firstNumber * secondNumber);
            calcText = result;
        }
        if(operator == "/"){
            result= Double.toString(firstNumber / secondNumber);
            calcText = result;
        }
        
    }
    
    calText.setText(calcText);
    
}

    
//Creates an instance of our class so that we can run it  
public static void main(String[] args)  
{  
    // creating Calculator class object
  Calculator c=new Calculator();  
  
  // seting the jrame visible
  c.setVisible(true);
}

    
}
