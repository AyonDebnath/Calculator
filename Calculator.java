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
        
        JLabel label = new JLabel("I am a label.");
        contentPane.add(label);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        Calculator device = new Calculator();
        device.ImageViewer();
    }
}