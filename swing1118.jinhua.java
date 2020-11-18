package demo;

import javax.swing.*;

public class App {
    private JPanel myPanel;
     void go(){
        JFrame frame = new JFrame("打工人");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700,350,500,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();

    }
}
