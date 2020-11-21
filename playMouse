import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class playMouse {
    private JPanel myPanel = new JPanel();
    private JLabel label_img = new JLabel();
    private JLabel label_back = new JLabel();
    private JLabel label_score = new JLabel();
    int i = 0;

    void go(){
        myPanel.setLayout(null);
        java.net.URL imgURL1 = playMouse.class.getResource("mouse.jpg");
        java.net.URL imgURL2 = playMouse.class.getResource("background.jpg");
        label_img.setIcon(new ImageIcon(imgURL1));
        label_back.setIcon(new ImageIcon(imgURL2));
        label_img.setBounds(100,100,63,67);
        label_back.setBounds(0,0,3840,2160);
        label_score.setBounds(300,5,500,100);
        label_score.setFont(new Font("Arial", Font.BOLD,40));
        label_score.setForeground(Color.yellow);
        myPanel.add(label_score);
        myPanel.add(label_img);
        myPanel.add(label_back);
        JFrame frame = new JFrame("playMouse");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500,200,1024,720);
        frame.setVisible(true);
    }

    public playMouse() {
        label_img.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label_img.setBounds((int)(Math.random()*10%10*50),(int)(Math.random()*10%10*50),63,67);
                i++;
                label_score.setText("Your Score: "+String.valueOf(i));
            }
        });
    }

    public static void main(String[] args) {
        new playMouse().go();
    }
}
