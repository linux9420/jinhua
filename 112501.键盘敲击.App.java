import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setBounds(150,100,300,150);
        textArea_A.setBackground(Color.pink);
        myPanel.add(textArea_A);
        textArea_B.setBounds(150,300,300,150);
        textArea_B.setBackground(Color.cyan);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    textArea_B.append("嘤嘤嘤嘤嘤嘤！\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_B.setText("");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("嘤嘤嘤");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700,200,600,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
