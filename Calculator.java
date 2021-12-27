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

        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        JLabel display = new JLabel("nul");
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
    }

    public static void main(String[] args) 
    {
        Calculator device = new Calculator();
        device.ImageViewer();
    }
}