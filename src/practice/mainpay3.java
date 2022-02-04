//패널로 안하고 프레임으로 mainpay를 만든거다
//프페임으로 해야 새 창이 띄워지는데 프레임으로 하면 버튼테두리가 투명하게 안뜨길래
//패널에는 투명하게 됬었어서 visor처럼 프레임 안에다가 패널을 만들어서 투명하게 잘 돌아가던 
//패널을 안에다가 넣었다 그러니까 패널로 투명하게하고 막 배경화면도 넣는게 프레임이랑 달라서 호환이안됬었는데
//그걸 이렇게 겉은 프레임 안은 패널로 하니까 된다
package practice;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
public class mainpay3 extends JFrame {
	JTextField tf = new JTextField(30);
    public mainpay3() {
    	tf.setText("hisafsdsfsfsd");
    	class help extends JPanel{
    		Image img;
    		JButton button;
    		JButton button2;
    		 Image menuimg;
    		 Image menuimg2;
    		 help(SelectMenu2 name){
    			img=new ImageIcon("./image/배경.png").getImage();
    			setLayout(null);
    		
    			
    			
    			menuimg=new ImageIcon("./image/현금결제.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			button= new JButton(new ImageIcon( menuimg2));
    			menuimg=new ImageIcon("./image/현금결제2.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			ImageIcon rolloverIcon4 = new ImageIcon(menuimg2);
    			button.setRolloverIcon(rolloverIcon4); // rolloverIcon용 이미지 등록
    			button.setFocusPainted(false); 
    			button.setContentAreaFilled(false);
    			add(button);
    			
    			
    			menuimg=new ImageIcon("./image/카드.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			button2= new JButton(new ImageIcon( menuimg2));
    			menuimg=new ImageIcon("./image/카드결제2.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			ImageIcon rolloverIcon3 = new ImageIcon(menuimg2);
    			button2.setRolloverIcon(rolloverIcon3); // rolloverIcon용 이미지 등록
    			button2.setFocusPainted(false); 
    			button2.setContentAreaFilled(false);
    			add(button2);
    			
    			button.setSize(200, 120);
    			button.setLocation(72, 50);
    			button.addActionListener(new ActionListener() {
    				
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					//new cash();
    				}
    			});
    			add(button);
    			
    		
    			
    		
    			button2.setSize(200, 120);
    			button2.setLocation(527,50);
    			add(button2);
    			
    			button.addActionListener(new ActionListener() {
    				
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					new cash();
    					dispose();
    				}
    			});	
    			
    			button2.addActionListener(new ActionListener() {
    				
    				@Override
    				public void actionPerformed(ActionEvent e) {
    					new card();
    					dispose();
    				}
    			});	
    			
    			}
    		public void paintComponent(Graphics g) {
    			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    			
    			setOpaque(false);
    		
    		}
    	}
    	add(new help(new SelectMenu2()));
    	new help(new SelectMenu2()).setOpaque(true);
    	setTitle("sd");
    	setSize(800,350);
    	setVisible(true);
    //	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public static void main(String[] args) {
    	new mainpay3();
    }
}
