// Import important library as requirement
//swing for frame, awt for controls, and event for button events
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
  JButton backspace=new JButton("<<");
  JButton point=new JButton(".");
  Label headerLabel =new Label("My PROG5001 - Calculator(Version)");

/**
 * Constructor for objects of class Calculator using to Call calcGUI method and set title as well as size
 */
public Calculator()
{
    //Calling calcGUI method, set calculator title and size 
    super("Calculator");
    setSize(350, 420);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    calcGUI();

}
    
    public void calcGUI()
{
    // Creating Top panel for calculator text area
    JPanel topPanel = new JPanel();
    topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridLayout topPanelLayout = new GridLayout(0,1);
    topPanelLayout.setVgap(10);
    topPanel.setLayout(topPanelLayout);

    // creating centerpanellayout for calculator buttons from 0 to 9 and equals to =
    JPanel centerPanel = new JPanel();  
    centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridLayout centerPanelLayout = new GridLayout(5,3,0,0);
    centerPanelLayout.setHgap(10);
    centerPanelLayout.setVgap(10);
    centerPanel.setLayout(centerPanelLayout);

    // creating rightpanel for operators and other functionalties button
    JPanel rightPanel = new JPanel();
    rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 0,10, 10));
    GridLayout rightPanelLayout = new GridLayout(5,2,8,5);
    rightPanelLayout.setHgap(10);
    rightPanelLayout.setVgap(10);
    rightPanel.setLayout(rightPanelLayout);
    
    // adding header label
    headerLabel.setBackground(Color.decode("#a5c3e6"));
    topPanel.add(headerLabel);

    //Adjusting text field font, alignment, size and value        
    calText.setFont(new Font("Arial", Font.BOLD, 24));
    calText.setHorizontalAlignment(JTextField.RIGHT);        
    calText.setPreferredSize(new Dimension(50,45));
    topPanel.add(calText);
    
    // adding panel to jframe
    add(topPanel, BorderLayout.NORTH);
    add(centerPanel, BorderLayout.CENTER);
    add(rightPanel,BorderLayout.EAST);
    
    // creating button 1 with action perform listner as well as color and adding to panel
    one.setActionCommand("1");
    one.addActionListener(this);
    one.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(one);
    
    // creating button 2 with action perform listner as well as color and adding to panel
    two.setActionCommand("2");
    two.addActionListener(this);
    two.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(two);
    
    // creating button 3 with action perform listner as well as color and adding to panel
    three.setActionCommand("3");
    three.addActionListener(this);
    three.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(three);
    
    // creating button 4 with action perform listner as well as color and adding to panel
    four.setActionCommand("4");
    four.addActionListener(this);
    four.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(four);
    
    // creating button 5 with action perform listner as well as color and adding to panel
    five.setActionCommand("5");
    five.setBackground(Color.decode("#cbcbcb"));
    five.addActionListener(this);
    centerPanel.add(five);
    
    // creating button 6 with action perform listner as well as color and adding to panel
    six.setActionCommand("6");
    six.addActionListener(this);
    six.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(six);
    
    // creating button 7 with action perform listner as well as color and adding to panel
    seven.setActionCommand("7");
    seven.addActionListener(this);
    seven.setBackground(Color.decode("#c9c9c9"));
    centerPanel.add(seven);
    
    // creating button 8 with action perform listner as well as color and adding to panel
    eight.setActionCommand("8");
    eight.addActionListener(this);
    eight.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(eight);
    
    // creating button 9 with action perform listner as well as color and adding to panel
    nine.setActionCommand("9");
    nine.addActionListener(this);
    nine.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(nine);
    
    // creating button abs with action perform listner as well as color and adding to panel
    abs.setActionCommand("+/-");
    abs.setBackground(Color.decode("#cbcbcb"));
    abs.addActionListener(this);
    centerPanel.add(abs);
    
    // creating button zero with action perform listner as well as color and adding to panel
    zero.setActionCommand("0");
    zero.setBackground(Color.decode("#cbcbcb"));
    zero.addActionListener(this);
    centerPanel.add(zero);
    
    // creating button point with action perform listner as well as color and adding to panel
    point.setActionCommand(".");
    point.addActionListener(this);
    point.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(point);
    
    // creating button = with action perform listner as well as color and adding to panel
    equals1.setActionCommand("=");
    equals1.addActionListener(this);
    equals1.setBorder(BorderFactory.createEmptyBorder());
    equals1.setBackground(Color.decode("#cbcbcb"));
    centerPanel.add(equals1);
    
    // creating button = with action perform listner as well as color and adding to panel
    equals2.setActionCommand("=");
    equals2.addActionListener(this);
    equals2.setBackground(Color.decode("#cbcbcb"));
    equals2.setBorder(BorderFactory.createEmptyBorder());
    centerPanel.add(equals2);
    
    // creating button = with action perform listner as well as color and adding to panel
    equals3.setActionCommand("=");
    equals3.addActionListener(this);
    equals3.setBackground(Color.decode("#cbcbcb"));
    equals3.setBorder(BorderFactory.createEmptyBorder());
    centerPanel.add(equals3);

    
    // creating button plus with action perform listner as well as color and adding to panel
    plus.setActionCommand("+");
    plus.addActionListener(this);
    plus.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(plus);
    
    // creating button backspace with action perform listner as well as color and adding to panel
    backspace.setActionCommand("<<");
    backspace.setBackground(Color.decode("#cbcbcb"));
    backspace.addActionListener(this);
    rightPanel.add(backspace);
    
    // creating button minus with action perform listner as well as color and adding to panel
    minus.setActionCommand("-");
    minus.addActionListener(this);
    minus.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(minus);
    
    // creating button clear with action perform listner as well as color and adding to panel
    clear.setActionCommand("C");
    clear.addActionListener(this);
    clear.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(clear);
    
    // creating button * with action perform listner as well as color and adding to panel
    times.setActionCommand("*");
    times.addActionListener(this);
    times.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(times);
    
    // creating button openBracket with action perform listner as well as color and adding to panel
    openBracket.setActionCommand("(");
    openBracket.addActionListener(this);
    openBracket.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(openBracket);

    // creating button divide with action perform listner as well as color and adding to panel
    divide.setActionCommand("/");
    divide.addActionListener(this);
    divide.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(divide);
    
    // creating button closeBracket with action perform listner as well as color and adding to panel
    closeBracket.setActionCommand(")");
    closeBracket.addActionListener(this);
    closeBracket.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(closeBracket);
    
    // creating button apostrophy with action perform listner as well as color and adding to panel
    apostrophy.setActionCommand("!");
    apostrophy.addActionListener(this);
    apostrophy.setBackground(Color.decode("#cbcbcb"));
    rightPanel.add(apostrophy);
    
    // creating button OFF with action perform listner as well as color and adding to panel
    off.setActionCommand("OFF");
    off.addActionListener(this);
    off.setBackground(Color.decode("#f6b79d"));
    rightPanel.add(off);
}
    
public void actionPerformed(ActionEvent e)  
{
    // creating variable for operator , result, firstnumber as well as calcText for getting text from textfield
    String calcText;
    String abs="+";
    calcText= calText.getText();
    String command = e.getActionCommand();
    
    // creating conditions for button 1 click
    if (command.equals("1")) {
        if(calcText.equals("0")){
            calcText = "1";
        }else{
        calcText += one.getText();
    }
    }
    
    // creating conditions for button 2 click
    if (command.equals("2")) {
        if(calcText.equals("0")){
        calcText = "2";
    }else{
        calcText += two.getText();
    }
    }
    
    // creating conditions for button 3 click
    if (command.equals("3")) {
        if(calcText.equals("0")){
        calcText = "3";
    }
    else{
        calcText += three.getText();
    }
    }
    
    // creating conditions for button 4 click
    if (command.equals("4")) {
        if(calcText.equals("0")){
        calcText = "4";
    }
    else{
        calcText += four.getText();
    }
     }
     
     // creating conditions for button 5 click
    if (command.equals("5")) {
        if(calcText.equals("0")){
        calcText = "5";
    }
    else{
        calcText += five.getText();
    }
     }
     
     // creating conditions for button 6 click
    if (command.equals("6")) {
        if(calcText.equals("0")){
        calcText = "6";
    }
    else{
        calcText += six.getText();
    }
    }
    
    // creating conditions for button 7 click
    if (command.equals("7")) {
        if(calcText.equals("0")){
        calcText = "7";
    }
    else{
        calcText += seven.getText();
    }
    }
    
    // creating conditions for button 8 click
    if (command.equals("8")) {
        if(calcText.equals("0")){
        calcText = "8";
    }
    else{
        calcText += eight.getText();
    }
     }
     
     // creating conditions for button 9 click
    if (command.equals("9")) {
        if(calcText.equals("0")){
        calcText = "9";
    }
    else{
        calcText += nine.getText();
    }
     }
     
     // creating conditions for button 0 click
    if (command.equals("0")) {
        if(calcText.equals("0")){
        calcText = "0";
    }
    else{
        calcText += zero.getText();
    }
     }
     
     // creating conditions for button point click
    if (command.equals(".")) {
        if(!calcText.contains("."))
        {
            calcText += point.getText();
        }
    }
    
    // creating conditions for button abs click
    if (command.equals("+/-")) {
        if(abs.equals("+"))
        {
            calcText += "-";
        }
        else{
            calcText += "+";
        }
    }
    
    // creating conditions for button + click
    if (command.equals("+")) {
        calcText += "+";
    }
    
    // creating conditions for button minus click
    if (command.equals("-")) {
        //calcText += minus.getText();
        calcText += "-";
    }
    
    // creating conditions for button multiply click
    if (command.equals("*")) {
        //calcText += times.getText();
        calcText += "*";
    }
    
    // creating conditions for button divide click
    if (command.equals("/")) {
        //calcText += divide.getText();
        calcText += "/";
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
        this.dispose();
    }
    
    // creating conditions for button clear click
    if (command.equals(">>")) {
        int len = calcText.length();
        calcText = calcText.substring(0, len-1);
    }
    
    // creating conditions for button clear click
    if (command.equals("C")) {
        calcText = "";
    }
    
    // creating conditions for button = click
    if (command.equals("=")) {
        calcText = findValueInBraces(calcText);
    }
    
    calText.setText(calcText);
    
}

public static String findValueInBraces(String finalStr) {

    while (finalStr.contains("(") && finalStr.contains(")")) {
        int fIndex = finalStr.indexOf("(");
        int nIndex = finalStr.indexOf(")");
        String subString = finalStr.substring(fIndex + 1, nIndex);
        finalStr = finalStr.substring(0, fIndex)+ calculate(subString)+ finalStr.substring(nIndex + 1,finalStr.length());
    }
    return calculate(finalStr);

}
    
public static String calculate(String finalString) {

    while (finalString.contains("(") && finalString.contains(")")) {
        findValueInBraces(finalString);
    }
    while (!isNum(finalString)) {
        List<Integer> positions = getOperandPosition(finalString);
        int pos = positions.get(0);
        if (positions.size() >= 2 && positions.get(1) != null) {
            int nxtPos = positions.get(1);
            finalString = getValue(finalString.substring(0, nxtPos), pos)
                    + finalString.substring(nxtPos, finalString.length());
        } else {
            finalString = getValue(
                    finalString.substring(0, finalString.length()), pos);
        }
    }
    return finalString;

}

public static boolean isNum(String str) {
    if (str.contains("+") || str.contains("-") || str.contains("*")
            || str.contains("/")) {
        return false;
    }
    return true;
}

public static List<Integer> getOperandPosition(String str) {

    List<Integer> integers = new ArrayList<Integer>();

    if (str.contains("+")) {
        integers.add(str.indexOf("+"));
    }

    if (str.contains("-")) {
        integers.add(str.indexOf("-"));
    }

    if (str.contains("*")) {
        integers.add(str.indexOf("*"));
    }

    if (str.contains("/")) {
        integers.add(str.indexOf("/"));
    }

    Collections.sort(integers);
    return integers;
}

public static String getValue(String str, int pos) {
    double finalVal = 0;
    double a = Double.parseDouble(str.substring(0, pos));
    double b = Double.parseDouble(str.substring(pos + 1, str.length()));
    char c = str.charAt(pos);

    if (c == '*') {
        finalVal = a * b;
    } else if (c == '/') {
        finalVal = a / b;
    } else if (c == '+') {
        finalVal = a + b;
    } else if (c == '-') {
        finalVal = a - b;
    }
    return String.valueOf(finalVal);
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
