package aula1.janela;

import javax.swing.JFrame;

public class PrimeiraJanela
{
    private JFrame JF;

    public PrimeiraJanela()
    {
        JF = new JFrame();
        JF.setTitle("Primeira Janela");
        JF.setSize(500, 500);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setVisible(true);

        
    }

    public static void run()
    {
        PrimeiraJanela janela = new PrimeiraJanela();
    }

    public static void main(String[] args) {
        PrimeiraJanela.run();
    }
}