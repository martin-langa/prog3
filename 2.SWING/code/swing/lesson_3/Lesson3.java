package code.swing.lesson_3;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lesson3
{
    private JFrame frame;
    JLabel label;

    public Lesson3()
    {
        ImageIcon icon = new ImageIcon("code\\swing\\lesson_3\\files\\image.png");
        frame = new JFrame();

        frame.setSize(720, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel();

        //CONTENT
        label.setText("Hello, my name is Martin!");
        label.setIcon(icon);

        //  POSITIONING
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIconTextGap(10);

        //MODIF.
        label.setForeground(new Color(99, 145, 81));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        //INSTANCE
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Lesson3 ls = new Lesson3();
    }
}
