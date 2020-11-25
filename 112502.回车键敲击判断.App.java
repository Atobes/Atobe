import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel Jabel=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    public App() {
        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyChar()==KeyEvent.VK_ENTER){
                    if(textArea_A.getText().equals("迹部景吾")){
                        textArea_B.append("迹部景吾最帅");
                    }else{
                        textArea_B.append("太丑");
                    }
                }
            }
        });
    }
    void go(){
        textArea_A.setBounds(100,100,200,100);
        textArea_B.setBounds(100,300,100,100);
        textArea_A.setBackground(Color.RED);
        textArea_B.setBackground(Color.LIGHT_GRAY);
        myPanel.add(textArea_A);
        myPanel.add(textArea_B);
        textArea_A.setText("魔镜魔镜，谁最漂亮:");
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(Jabel);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }

}
