import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_plane=new JLabel();
    int CEll = 64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-CEll,CEll,CEll);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+CEll,CEll,CEll);
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-CEll,label_plane.getY(),CEll,CEll);
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+CEll,label_plane.getY(),CEll,CEll);
                }
            }
        });

    }
    //显示窗体方法
    void go(){

        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(100,100,CEll,CEll);
        myPanel.add(label_plane);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("只猫🐱");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
