//�гη� ���ϰ� ���������� mainpay�� ����Ŵ�
//���������� �ؾ� �� â�� ������µ� ���������� �ϸ� ��ư�׵θ��� �����ϰ� �ȶ߱淡
//�гο��� �����ϰ� ���� visoró�� ������ �ȿ��ٰ� �г��� ���� �����ϰ� �� ���ư��� 
//�г��� �ȿ��ٰ� �־��� �׷��ϱ� �гη� �����ϰ��ϰ� �� ���ȭ�鵵 �ִ°� �������̶� �޶� ȣȯ�̾ȉ���µ�
//�װ� �̷��� ���� ������ ���� �гη� �ϴϱ� �ȴ�
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
    			img=new ImageIcon("./image/���.png").getImage();
    			setLayout(null);
    		
    			
    			
    			menuimg=new ImageIcon("./image/���ݰ���.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			button= new JButton(new ImageIcon( menuimg2));
    			menuimg=new ImageIcon("./image/���ݰ���2.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			ImageIcon rolloverIcon4 = new ImageIcon(menuimg2);
    			button.setRolloverIcon(rolloverIcon4); // rolloverIcon�� �̹��� ���
    			button.setFocusPainted(false); 
    			button.setContentAreaFilled(false);
    			add(button);
    			
    			
    			menuimg=new ImageIcon("./image/ī��.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			button2= new JButton(new ImageIcon( menuimg2));
    			menuimg=new ImageIcon("./image/ī�����2.png").getImage();
    			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
    			ImageIcon rolloverIcon3 = new ImageIcon(menuimg2);
    			button2.setRolloverIcon(rolloverIcon3); // rolloverIcon�� �̹��� ���
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
