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
        textArea_A.setText("什么动物最可爱？");
        textArea_A.setBounds(150,100,300,150);
        textArea_A.setBackground(Color.PINK);
        myPanel.add(textArea_A);
        textArea_B.setBounds(150,300,300,150);
        textArea_B.setBackground(Color.cyan);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if(textArea_A.getText().equals("猫")){
                        textArea_B.setText("Bingo，猫是最可爱的！！！");
                    }
                    else{
                        textArea_B.setText(textArea_A.getText()+"怎么可能最可爱！");
                    }

                }
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    textArea_A.setText("");
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
