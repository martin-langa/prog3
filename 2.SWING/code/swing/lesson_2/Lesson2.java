package code.swing.lesson_2;

import javax.swing.JFrame;

public class Lesson2 {
    
    static class Frame extends JFrame
    {   
        Frame()
        {
            this.setTitle("Custom Frame");
            this.setSize(720, 500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        public static void main(String[] args) 
        {       
            new Frame();
        }
    } 

    
}
