import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator
{
    private JFrame frame;
    public Calculator()
    {
        
    }

    public void ImageViewer()
    {
        makeFrame();
    }

    private void makeFrame() 
    {
        frame = new JFrame("Calculator");
        Container contentPane = frame.getContentPane();
        
        JLabel display = new JLabel("null");
        display.setVerticalAlignment(JLabel.TOP);

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");

        contentPane.add(display);
        contentPane.add(one);
        contentPane.add(two);
        contentPane.add(three);
        contentPane.add(four);
        contentPane.add(five);
        contentPane.add(six);
        contentPane.add(seven);
        contentPane.add(eight);
        contentPane.add(nine);

        contentPane.setLayout(new GridLayout(3, 3));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        Calculator device = new Calculator();
        device.ImageViewer();
    }
}