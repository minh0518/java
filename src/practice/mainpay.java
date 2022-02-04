package practice;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
 class mainpay extends JPanel{
	Image img;
	JButton button;
	JButton button2;
	 Image menuimg;
	 Image menuimg2;
	 mainpay(){
		img=new ImageIcon("./image/배경.png").getImage();
		setLayout(null);
	
		
		
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
		add(button);
		
		
		button.setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
		button.setFocusPainted(false); 
		button.setContentAreaFilled(false);
		
		
		button2.setRolloverIcon(rolloverIcon2); // rolloverIcon용 이미지 등록
		button2.setFocusPainted(false); 
		button2.setContentAreaFilled(false);
		
		
	
		button2.setSize(200, 150);
		button2.setLocation(327,50);
		add(button2);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		
		
				//프레임은 뜨는데 패널은 안뜬다
			}
		});	
		
	
		}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		
		setOpaque(false);
	
	}

	public static void main(String args[]) {
	JFrame frame=new JFrame("새창");

	frame.setVisible(true);
	frame.add(new mainpay());
	frame.setSize(600,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
 }

