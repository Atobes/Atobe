import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class Pc{
    JPanel myPanel=new JPanel();
    JLabel label_tet=new JLabel();
    JLabel label_plane=new JLabel();
    int CELL=64;
    //构造方法
    public Pc() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+CELL,CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-CELL,label_plane.getY(),CELL,CELL);
                }
                if (e.getKeyCode()==e.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+CELL,label_plane.getY(),CELL,CELL);
                }
                
            }
        });
    }
    //显示窗体方法
    void go(){
        label_tet.setText("这是一个label标签。");
        label_tet.setBounds(0,0,200,200);
        myPanel.add(label_tet);
        URL imgURL = Pc.class.getResource("img/plane0.png");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(100,100,CELL,CELL);
        myPanel.add(label_plane);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
        JFrame frame = new JFrame("一个小程序");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1017,840);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Pc().go();
    }
}
