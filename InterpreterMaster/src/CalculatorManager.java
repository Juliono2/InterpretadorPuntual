
//import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
//import javafx.scene.layout.Border;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julian Sanchez
 */
public class CalculatorManager extends JFrame {
    
    //CONSTANTS
    //Numbers
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";
    public static final String ZERO = "0";
    
    //Arithmetic operations
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";
    public static final String MULTIPLY = "*";
    public static final String MODULAR = "MOD";
    public static final String INTEGER_DIVISION = "/";
    public static final String POWER = "^";
    public static final String OPEN_PARENTHENSES="(";
    public static final String CLOSE_PARENTHENSES=")";
    
    //Calculator operations
    public static final String DELETED ="DEL";
    public static final String DELETED_ALL= "AC";
    public static final String EQUALS = "=";    
    public static final String EXIT = "EXIT";
    
    private JLabel lblExpression;
    private JLabel lblRestriction;
    
    //Display the window with its components
    public CalculatorManager (){
        super ("Interpreter Patter - Punctual Exercise");
        
        lblExpression = new JLabel();
        lblExpression.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblExpression.setHorizontalAlignment(4);
        
        lblRestriction = new JLabel("Limite de almacenamiento = Int");
        
        JButton oneButton = new JButton(CalculatorManager.ONE);
        JButton twoButton = new JButton(CalculatorManager.TWO);
        JButton threeButton = new JButton(CalculatorManager.THREE);
        JButton fourButton = new JButton(CalculatorManager.FOUR);
        JButton fiveButton = new JButton(CalculatorManager.FIVE);
        JButton sixButton = new JButton(CalculatorManager.SIX);
        JButton sevenButton = new JButton(CalculatorManager.SEVEN);
        JButton eightButton = new JButton(CalculatorManager.EIGHT);
        JButton nineButton = new JButton(CalculatorManager.NINE);
        JButton zeroButton = new JButton(CalculatorManager.ZERO);
        
        JButton addButton = new JButton(CalculatorManager.ADD);
        JButton subtractButton = new JButton(CalculatorManager.SUBTRACT);
        JButton multiplyButton = new JButton(CalculatorManager.MULTIPLY);
        JButton modularButton = new JButton(CalculatorManager.MODULAR);
        JButton integerDivisionButton = new JButton(CalculatorManager.INTEGER_DIVISION);
        JButton powerButton = new JButton(CalculatorManager.POWER);
        JButton openPButton = new JButton(CalculatorManager.OPEN_PARENTHENSES);
        JButton closePButton = new JButton(CalculatorManager.CLOSE_PARENTHENSES);
        
        JButton deletedButton = new JButton(CalculatorManager.DELETED);
        JButton deletedAllButton = new JButton(CalculatorManager.DELETED_ALL);
        JButton equalsButton = new JButton(CalculatorManager.EQUALS);
        JButton exitButton = new JButton(CalculatorManager.EXIT); 
        
        oneButton.setMnemonic(KeyEvent.VK_1);
        twoButton.setMnemonic(KeyEvent.VK_2);
        threeButton.setMnemonic(KeyEvent.VK_3);
        fourButton.setMnemonic(KeyEvent.VK_4);
        fiveButton.setMnemonic(KeyEvent.VK_5);
        sixButton.setMnemonic(KeyEvent.VK_6);
        sevenButton.setMnemonic(KeyEvent.VK_7);
        eightButton.setMnemonic(KeyEvent.VK_8);
        nineButton.setMnemonic(KeyEvent.VK_9);
        zeroButton.setMnemonic(KeyEvent. VK_0);
        
        addButton.setMnemonic(KeyEvent.VK_ADD);
        subtractButton.setMnemonic(KeyEvent.VK_SUBTRACT);
        multiplyButton.setMnemonic(KeyEvent.VK_MULTIPLY);
        modularButton.setMnemonic(KeyEvent.VK_M);
        integerDivisionButton.setMnemonic(KeyEvent.VK_DIVIDE);
        powerButton.setMnemonic(KeyEvent.VK_P);
        openPButton.setMnemonic(KeyEvent.VK_O);
        closePButton.setMnemonic(KeyEvent.VK_C);
        
        deletedButton.setMnemonic(KeyEvent.VK_DELETE);
        deletedAllButton.setMnemonic(KeyEvent.VK_CLEAR);
        equalsButton.setMnemonic(KeyEvent.VK_EQUALS);
        exitButton.setMnemonic(KeyEvent.VK_E);
        
        ButtonHandler objButtonHandler = new ButtonHandler(this);
        
        oneButton.addActionListener(objButtonHandler);
        twoButton.addActionListener(objButtonHandler);
        threeButton.addActionListener(objButtonHandler);
        fourButton.addActionListener(objButtonHandler);
        fiveButton.addActionListener(objButtonHandler);
        sixButton.addActionListener(objButtonHandler);
        sevenButton.addActionListener(objButtonHandler);
        eightButton.addActionListener(objButtonHandler);
        nineButton.addActionListener(objButtonHandler);
        zeroButton.addActionListener(objButtonHandler);
        
        addButton.addActionListener(objButtonHandler);
        subtractButton.addActionListener(objButtonHandler);
        multiplyButton.addActionListener(objButtonHandler);
        modularButton.addActionListener(objButtonHandler);
        integerDivisionButton.addActionListener(objButtonHandler);
        powerButton.addActionListener(objButtonHandler);
        openPButton.addActionListener(objButtonHandler);
        closePButton.addActionListener(objButtonHandler);
        
        deletedButton.addActionListener(objButtonHandler);
        deletedAllButton.addActionListener(objButtonHandler);
        equalsButton.addActionListener(objButtonHandler);
        
        exitButton.addActionListener(new ButtonHandler());
        
        //Put the calculator buttons and labels on the same panel.
        JPanel calculatorPanel = new JPanel(); 
        
        //****************************************************
        GridBagLayout gridbag = new GridBagLayout();
        calculatorPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        
        calculatorPanel.add(oneButton);
        calculatorPanel.add(twoButton);
        calculatorPanel.add(threeButton);
        calculatorPanel.add(fourButton);
        calculatorPanel.add(fiveButton);
        calculatorPanel.add(sixButton);
        calculatorPanel.add(sevenButton);
        calculatorPanel.add(eightButton);
        calculatorPanel.add(nineButton);
        calculatorPanel.add(zeroButton);
        calculatorPanel.add(addButton);
        calculatorPanel.add(subtractButton);
        calculatorPanel.add(multiplyButton);
        calculatorPanel.add(modularButton);
        calculatorPanel.add(integerDivisionButton);
        calculatorPanel.add(powerButton);
        calculatorPanel.add(openPButton);
        calculatorPanel.add(closePButton);
        calculatorPanel.add(deletedButton);
        calculatorPanel.add(deletedAllButton);
        calculatorPanel.add(equalsButton);
        calculatorPanel.add(exitButton);
        calculatorPanel.add(lblExpression);
        calculatorPanel.add(lblRestriction);
        
        gbc.insets.top = 5;
        gbc.insets.bottom = 6;
        gbc.insets.left = 5;
        gbc.insets.right = 5;
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth=5;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gridbag.setConstraints(lblExpression, gbc);
        
        //numbers
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth=1;
        gridbag.setConstraints(oneButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gridbag.setConstraints(twoButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gridbag.setConstraints(threeButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gridbag.setConstraints(fourButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gridbag.setConstraints(fiveButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gridbag.setConstraints(sixButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(sevenButton, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gridbag.setConstraints(eightButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gridbag.setConstraints(nineButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gridbag.setConstraints(zeroButton, gbc);
        
        //aritmetic operations
        gbc.gridx = 3;
        gbc.gridy = 1;
        gridbag.setConstraints(addButton, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gridbag.setConstraints(subtractButton, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gridbag.setConstraints(multiplyButton, gbc);
        gbc.gridx = 4;
        gbc.gridy = 1;
        gridbag.setConstraints(modularButton, gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        gridbag.setConstraints(integerDivisionButton, gbc);
        gbc.gridx = 4;
        gbc.gridy = 3;
        gridbag.setConstraints(powerButton, gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        gridbag.setConstraints(openPButton, gbc);
        gbc.gridx = 4;
        gbc.gridy = 4;
        gridbag.setConstraints(closePButton, gbc);
        
        //calculator operations
        gbc.gridx = 1;
        gbc.gridy = 4;
        gridbag.setConstraints(deletedButton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gridbag.setConstraints(deletedAllButton, gbc);
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gridbag.setConstraints(equalsButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth= 3;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gridbag.setConstraints(lblRestriction, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth= 2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gridbag.setConstraints(exitButton, gbc);
        
        Container contentPane = getContentPane();
        contentPane.add(calculatorPanel, BorderLayout.CENTER);
        
        try {
           // UIManager.setLookAndFeel(new WindowsLookAndFeel());
            SwingUtilities.updateComponentTreeUI(CalculatorManager.this);
        } catch (Exception ex) {
            System.out.println(ex);
        } 
    }

    public String getLblExpression() {
        return lblExpression.getText();
    }

    public void setLblExpression(String expression) {
        lblExpression.setText(getLblExpression()+expression);
    }
    
    public void setResult(int result) {
    	clearLblExpression();
    	String res = Integer.toString(result); 
    	setLblExpression(res);
    }
    
    public void clearLblExpression(){
        lblExpression.setText("");
    }
    
    public  void deletedATerm(){
        String msg = getLblExpression();
        lblExpression.setText(msg.substring(0, msg.length() - 1));        
    }
           
    
      public static void main(String[] args) {
    JFrame frame = new CalculatorManager();

    frame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }
        }
                           );

    frame.setSize(350, 320);
    frame.setVisible(true);
    }
}      

class ButtonHandler implements ActionListener {
    CalculatorManager objCalculatorManager;
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals(CalculatorManager.EXIT)){
            System.exit(1);
        }
        
        if (e.getActionCommand().equals(CalculatorManager.ONE)) {
            objCalculatorManager.setLblExpression("1");    
        }
        if (e.getActionCommand().equals(CalculatorManager.TWO)) {
            objCalculatorManager.setLblExpression("2");
        }
        if (e.getActionCommand().equals(CalculatorManager.THREE)) {
            objCalculatorManager.setLblExpression("3");
        }
        if (e.getActionCommand().equals(CalculatorManager.FOUR)) {
            objCalculatorManager.setLblExpression("4");
        } 
        if (e.getActionCommand().equals(CalculatorManager.FIVE)) {
            objCalculatorManager.setLblExpression("5");
        } 
        if (e.getActionCommand().equals(CalculatorManager.SIX)) {
            objCalculatorManager.setLblExpression("6");
        } 
        if (e.getActionCommand().equals(CalculatorManager.SEVEN)) {
            objCalculatorManager.setLblExpression("7");
        } 
        if (e.getActionCommand().equals(CalculatorManager.EIGHT)) {
            objCalculatorManager.setLblExpression("8");
        } 
        if (e.getActionCommand().equals(CalculatorManager.NINE)) {
            objCalculatorManager.setLblExpression("9");
        } 
        if (e.getActionCommand().equals(CalculatorManager.ZERO)) {
            objCalculatorManager.setLblExpression("0");
        } 
        if (e.getActionCommand().equals(CalculatorManager.ADD)) {
            objCalculatorManager.setLblExpression("+");
        }
        if (e.getActionCommand().equals(CalculatorManager.SUBTRACT)) {
            objCalculatorManager.setLblExpression("-");
        }
        if (e.getActionCommand().equals(CalculatorManager.MULTIPLY)) {
            objCalculatorManager.setLblExpression("*");
        }
        if (e.getActionCommand().equals(CalculatorManager.INTEGER_DIVISION)) {
            objCalculatorManager.setLblExpression("/");
        }
        if (e.getActionCommand().equals(CalculatorManager.MODULAR)) {
            objCalculatorManager.setLblExpression("%");
        }
        if (e.getActionCommand().equals(CalculatorManager.POWER)) {
            objCalculatorManager.setLblExpression("^");
        }
        if (e.getActionCommand().equals(CalculatorManager.OPEN_PARENTHENSES)) {
            objCalculatorManager.setLblExpression("(");
        }
        if (e.getActionCommand().equals(CalculatorManager.CLOSE_PARENTHENSES)) {
            objCalculatorManager.setLblExpression(")");
        }
        if (e.getActionCommand().equals(CalculatorManager.DELETED_ALL)) {
            objCalculatorManager.clearLblExpression();
        }
        if (e.getActionCommand().equals(CalculatorManager.DELETED)) {
            objCalculatorManager.deletedATerm();
        }
        if (e.getActionCommand().equals(CalculatorManager.EQUALS)){
            
            objCalculatorManager.setLblExpression("=");
            
            Calculator calc = new Calculator();
            
            Context ctx = new Context(objCalculatorManager.getLblExpression()); 
            
            calc.setContext(ctx);
            
            calc.setExpression(ctx.getNewExpression());
            
            objCalculatorManager.setResult(calc.evaluate());
            
        }
    }

    public ButtonHandler() {
    }
    public ButtonHandler(CalculatorManager inobjCalculatorManager) {
        objCalculatorManager = inobjCalculatorManager;
    }    
}
