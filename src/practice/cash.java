package practice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;





public class cash extends JFrame{
	static int pay;
	cash(){
	class inside extends JPanel{
		Image img;
		int left;
		JButton[] MBtn = new JButton[6];
		JTextField tfInput,tfOutput;
		JTextField kk=new JTextField(30);
		int numberIn;
		
		JButton point,back;
		
		
		inside(menu a){
		img=new ImageIcon("./image/¹è°æ.png").getImage();
		point=new JButton("°áÁ¦¿Ï·á");
		back=new JButton("°áÁ¦¼ö´Üº¯°æ");
		
		LineBorder b2 = new LineBorder(Color.LIGHT_GRAY,7);
		back.setBorder(b2);
		point.setBorder(b2);
		BevelBorder b4 = new BevelBorder(BevelBorder.RAISED);
		back.setBorder(b4);
		point.setBorder(b4);
		back.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 20));
		back.setContentAreaFilled(false);
		point.setFont(new Font("±¼¸²Ã¼", Font.BOLD, 20));
		point.setContentAreaFilled(false);
		add(point);
		point.setBounds(100,500,300,70);
		back.setBounds(500,500,300,70);
		add(back);
		kk.setText("ÃÑ ±Ý¾×:"+a.total+"¿ø");
		kk.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 40));
			//kk.setText(a.eat);
			
		add(kk);
		kk.setBounds(100, 50, 700, 100);
		setLayout(null);
		
		MBtn[0]=new JButton("1000¿ø");
		MBtn[1]=new JButton("5000¿ø");
		MBtn[2]=new JButton("10000¿ø");
		MBtn[3]=new JButton("50000¿ø");
		for(int i=0;i<4;i++) {
			add(MBtn[i]);		
		
			MBtn[i].setBorder(b2);
			
			MBtn[i].setBorder(b4);
			MBtn[i].setFont(new Font("±¼¸²Ã¼", Font.BOLD, 30));
			MBtn[i].setContentAreaFilled(false);
			MBtn[i].setForeground(Color.white);
		}
		
		MBtn[0].setBounds(140,200,150,100);
		MBtn[1].setBounds(290,200,150,100);
		MBtn[2].setBounds(440,200,150,100);
		MBtn[3].setBounds(590,200,150,100);
		tfInput=new JTextField(10);
		add(tfInput);
		tfInput.setBounds(100, 350, 300, 100);
		MBtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				int num=1000;
				pay+=num;
				tfInput.setText(pay+"¿ø");
				tfInput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				left=a.total-pay;
				if(a.total>pay) {
					tfOutput.setText("°Å½º¸§µ· : ");
					tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				
				else {
				tfOutput.setText("°Å½º¸§µ· : "+Math.abs(left));
				tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				}
		});
		tfOutput=new JTextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		tfOutput.setBounds(430, 350, 300, 100);	
		
		MBtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int num=5000;
				pay+=num;
				tfInput.setText(pay+"¿ø");
				tfInput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				left=a.total-pay;
				if(a.total>pay) {
					tfOutput.setText("°Å½º¸§µ· : ");
					tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				
				else {
				tfOutput.setText("°Å½º¸§µ· : "+Math.abs(left));
				tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				}
		});
		MBtn[2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int num=10000;
				pay+=num;
				tfInput.setText(pay+"¿ø");
				tfInput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				left=a.total-pay;
				if(a.total>pay) {
					tfOutput.setText("°Å½º¸§µ· : ");
					tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				
				else {
				tfOutput.setText("°Å½º¸§µ· : "+Math.abs(left));
				tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				}
		});
		MBtn[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				int num=50000;
				pay+=num;
				tfInput.setText(pay+"¿ø");
				tfInput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				left=a.total-pay;
				if(a.total>pay) {
					tfOutput.setText("°Å½º¸§µ· : ");
					tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				
				else {
				tfOutput.setText("°Å½º¸§µ· : "+Math.abs(left));
				tfOutput.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
				}
				}
		});
		
	
			
		point.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					
					//int num=Integer.parseInt(tfInput.getText());
					if(a.total>pay) {
						  JOptionPane.showMessageDialog(null, "°áÁ¦±Ý¾×ÀÌ ³²¾ÆÀÖ½À´Ï´Ù!", 
						            "Message Dialog", JOptionPane.WARNING_MESSAGE);
						
					}
					else {
						JOptionPane.showMessageDialog(null, "°áÁ¦°¡ ¿Ï·áµÇ¾ú½À´Ï´Ù °Å½º¸§µ·Àº" +Math.abs(left)+"¿øÀÔ´Ï´Ù", 
						            "Message Dialog", JOptionPane.WARNING_MESSAGE);
						 
					 	 System.exit(0);
					}
				}
			});
		
		
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				 dispose();
		        	new mainpay3();
			}
		});
    		}
		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
		
		}		
	}
	add(new inside(new menu()));
	new inside(new menu()).setOpaque(true);
	setTitle("sd");
	setSize(985,660);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new cash();
	}
}
