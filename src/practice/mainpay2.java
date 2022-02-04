//패널로 안하고 프레임으로 mainpay를 만든거다

package practice;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class mainpay2 extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon;
    JButton button;
	JButton button2;
	Image menuimg;
	Image menuimg2;
    public mainpay2() {
        icon = new ImageIcon("./image/lotte.png");
        setLayout(null);
        
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(),0, 0, getWidth(), getHeight(), this);
                setOpaque(false); 
                super.paintComponent(g);
            }
        };
        
        
        
        menuimg=new ImageIcon("./image/팝콘.png").getImage();
		menuimg2= menuimg.getScaledInstance( 200, 150,  java.awt.Image.SCALE_SMOOTH ) ;
		
		button= new JButton(new ImageIcon( menuimg2));
		button.setOpaque(false);
		
		
		menuimg=new ImageIcon("./image/lotte2.png").getImage();
		menuimg2= menuimg.getScaledInstance( 200, 150,  java.awt.Image.SCALE_SMOOTH ) ; 
		
		ImageIcon rolloverIcon = new ImageIcon(menuimg2);
		ImageIcon rolloverIcon2 = new ImageIcon(menuimg2);
		button2= new JButton(new ImageIcon( menuimg2));
		button2.setOpaque(false);
		
		button.setSize(200, 150);
		button.setLocation(27, 50);
		button.setOpaque(false);
		background.add(button);
	
		
	
		button2.setSize(200, 150);
		button2.setLocation(327,50);
		button2.setOpaque(false);
		background.add(button2);
		
		
		button.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		button.setFocusPainted(false); 
		button.setContentAreaFilled(false);
		
		
		button2.setRolloverIcon(rolloverIcon2); // rolloverIcon용 이미지 등록
		button2.setFocusPainted(false); 
		button2.setContentAreaFilled(false);
		
     
        scrollPane = new JScrollPane(background);
        setContentPane(scrollPane);
        
    }
 
    public static void main(String[] args) {
    	mainpay2 frame = new mainpay2();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
    }
}
