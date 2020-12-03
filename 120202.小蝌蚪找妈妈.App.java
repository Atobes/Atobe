import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Pa {
    JPanel myPanel=new JPanel();
    JLabel label_son=new JLabel();
    JLabel label_mother=new JLabel();
    JLabel label_background=new JLabel();
    JFrame frame = new JFrame("一个小程序");
    int CELL=64;
    //构造方法
    public Pa() {

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_son.setBounds(label_son.getX(),label_son.getY()-CELL,CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_DOWN){
                    label_son.setBounds(label_son.getX(),label_son.getY()+CELL,CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_LEFT){
                    label_son.setBounds(label_son.getX()-CELL,label_son.getY(),CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_RIGHT){
                    label_son.setBounds(label_son.getX()+CELL,label_son.getY(),CELL,CELL);
                }
                if(label_son.getX()>310&label_son.getX()<354&&label_son.getY()>310&label_son.getY()<354){
                    JOptionPane.showMessageDialog(null,"小蝌蚪找到妈妈了!");
                    frame.dispose();
                }
            }
        });
    }
    //显示窗体方法
    void go(){


        java.net.URL imgURL = Pa.class.getResource("img/son.png");
        label_son.setIcon(new ImageIcon(imgURL));
        label_son.setBounds(448,576,CELL,CELL);
        myPanel.add(label_son);

        java.net.URL imgURL2 = Pa.class.getResource("img/mother.png");
        label_mother.setIcon(new ImageIcon(imgURL2));
        label_mother.setBounds(320,320,CELL,CELL);
        myPanel.add(label_mother);

        java.net.URL imgURL1 = Pa.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL1));
        label_background.setBounds(0,0,1024,768);
        myPanel.add(label_background);

        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,160,1024,768);
        //frame.pack();
        frame.setVisible(true);

        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new Pa().go();
    }
}
