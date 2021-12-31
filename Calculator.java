import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator
{
    private JFrame frame;
    private String num1;
    private String num2;
    private String opp; 
    JLabel display;

    public Calculator()
    {
        num1 = "";
        num2 = "";
        opp = "";
    }

    public void ImageViewer()
    {
        makeFrame();
    }

    private void makeFrame() 
    {
        frame = new JFrame("Calculator");
        Container contentPane = frame.getContentPane();

        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        display = new JLabel("nul");
        contentPane.add(display, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        JButton one = new JButton("1");
        contentPane.add(one, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JButton two = new JButton("2");
        contentPane.add(two, gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        JButton three = new JButton("3");
        contentPane.add(three, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        JButton four = new JButton("4");
        contentPane.add(four, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JButton five = new JButton("5");
        contentPane.add(five, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        JButton six = new JButton("6");
        contentPane.add(six, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        JButton seven = new JButton("7");
        contentPane.add(seven, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        JButton eight = new JButton("8");
        contentPane.add(eight, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        JButton nine = new JButton("9");
        contentPane.add(nine, gbc);

        gbc.gridx = 3;
        gbc.gridy = 1;
        JButton plus = new JButton("+");
        contentPane.add(plus, gbc);

        gbc.gridx = 4;
        gbc.gridy = 1;
        JButton minus = new JButton("-");
        contentPane.add(minus, gbc);

        gbc.gridx = 3;
        gbc.gridy = 2;
        JButton multiplication = new JButton("X");
        contentPane.add(multiplication, gbc);

        gbc.gridx = 4;
        gbc.gridy = 2;
        JButton division = new JButton("/");
        contentPane.add(division, gbc);

        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        JButton equal = new JButton("=");        
        contentPane.add(equal, gbc);

        frame.pack();
        frame.setVisible(true);



        // Action Listeners
        one.addActionListener((ActionEvent ev) -> {one();});
        two.addActionListener((ActionEvent ev) -> {two();});
        three.addActionListener((ActionEvent ev) -> {three();});
        four.addActionListener((ActionEvent ev) -> {four();});
        five.addActionListener((ActionEvent ev) -> {five();});
        six.addActionListener((ActionEvent ev) -> {six();});
        seven.addActionListener((ActionEvent ev) -> {seven();});
        eight.addActionListener((ActionEvent ev) -> {eight();});
        nine.addActionListener((ActionEvent ev) -> {nine();});
        plus.addActionListener((ActionEvent ev) -> {plus();});
        equal.addActionListener((ActionEvent ev) -> {equal();});
    }
    public void one()
    {
        if (opp == "") 
        {
            num1 = num1 + "1";
        }
        else 
        {
            num2 = num2 + "1";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void two()
    {
        if (opp == "") 
        {
            num1 = num1 + "2";
        }
        else 
        {
            num2 = num2 + "2";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void three()
    {
        if (opp == "") 
        {
            num1 = num1 + "3";
        }
        else 
        {
            num2 = num2 + "3";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void four()
    {
        if (opp == "") 
        {
            num1 = num1 + "4";
        }
        else 
        {
            num2 = num2 + "4";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void five()
    {
        if (opp == "") 
        {
            num1 = num1 + "5";
        }
        else 
        {
            num2 = num2 + "5";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void six()
    {
        if (opp == "") 
        {
            num1 = num1 + "6";
        }
        else 
        {
            num2 = num2 + "6";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void seven()
    {
        if (opp == "") 
        {
            num1 = num1 + "7";
        }
        else 
        {
            num2 = num2 + "7";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void eight()
    {
        if (opp == "") 
        {
            num1 = num1 + "8";
        }
        else 
        {
            num2 = num2 + "8";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }
    public void nine()
    {
        if (opp == "") 
        {
            num1 = num1 + "9";
        }
        else 
        {
            num2 = num2 + "9";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }

    public void plus()
    {
        if(opp=="")
        {
            opp = opp + "+";
        }
        display.setText(num1 +" " + opp + " " + num2);
    }

    public void equal()
    {
        int result;
        String answer="";
        if(opp.equals("+"))
        {
            result  = Integer.parseInt(num1) + Integer.parseInt(num2);
            answer = result +"";
        }
        else if(opp.equals("-"))
        {
            result  = Integer.parseInt(num1) - Integer.parseInt(num2);
            answer = result +"";
        }
        else if(opp.equals("*"))
        {
            result  = Integer.parseInt(num1) * Integer.parseInt(num2);
            answer = result +"";
        }
        else if(opp.equals("/"))
        {
            result  = Integer.parseInt(num1) / Integer.parseInt(num2);
            answer = result +"";
        }
        display.setText(answer);
        num1 = "";
        num2 = "";
        opp = "";
    }

    public static void main(String[] args) 
    {
        Calculator device = new Calculator();
        device.ImageViewer();
    }
}