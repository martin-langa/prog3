package code.swing.lesson_1;

import java.awt.Color;

import javax.swing.JFrame;

public class Lesson1 
{
    private JFrame frame;
    
    public Lesson1()
    {
        frame = new JFrame();
        frame.setSize(720, 520);
        frame.setTitle("Frame 1");
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(144, 78, 87));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Lesson1 ls = new Lesson1();
    }
}