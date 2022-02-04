package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class card extends JFrame{
	card(){
	class detail extends JPanel{	
		Image img;
		int sum;
		Timer timer=new Timer();
		
		JTextField tfInput,tfOutput;
		JTextField kk=new JTextField(30);
		int numberIn;
		JButton point,back;
		detail(menu a){
		img=new ImageIcon("./image/배경.png").getImage();
		point=new JButton("결제완료");
		back=new JButton("결제수단변경");
		
		LineBorder b2 = new LineBorder(Color.LIGHT_GRAY,7);
		back.setBorder(b2);
		point.setBorder(b2);
		BevelBorder b4 = new BevelBorder(BevelBorder.RAISED);
		back.setBorder(b4);
		point.setBorder(b4);
		back.setFont(new Font("굴림체", Font.BOLD, 20));
		back.setContentAreaFilled(false);
		point.setFont(new Font("굴림체", Font.BOLD, 20));
		point.setContentAreaFilled(false);

		add(point);
		point.setBounds(100,500,300,70);
		back.setBounds(500,500,300,70);
		add(back);
		kk.setText("총 금액:"+a.total+"원");
		kk.setFont(new Font("맑은고딕", Font.BOLD, 40));
			//kk.setText(a.eat);
		setLayout(null);
			add(kk);
			kk.setBounds(100, 50, 700, 100);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					
					 dispose();
			        	new mainpay3();
				}
			});
		
			point.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					
			
			
					 int answer = JOptionPane.showConfirmDialog(null, "총"+a.total+"(원) 결제하시겠습니까?",
					            "Confirm Dialog", JOptionPane.YES_NO_CANCEL_OPTION);
				
					if(answer==JOptionPane.YES_OPTION) {
				      
				        	 JOptionPane.showMessageDialog(null, "걸제가 완료되었습니다", 
				        							   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
				        	 System.exit(0); 
					}
					
					else if(answer==JOptionPane.NO_OPTION) {
					      
						JOptionPane.showMessageDialog(null, "카드를 다시 넣어주세요", 
 							   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
							dispose();
								new card();
				}
						
					else {
					      
						 JOptionPane.showMessageDialog(null, "취소되었습니다 결제선택창으로 돌아갑니다", 
	        					   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
						 			dispose();
						 			new mainpay3();
							
				   }
					

				/*	TimerTask task=new TimerTask() {
						public void run() { 
							dispose();
							JOptionPane.showMessageDialog(null, "취소되었습니다 결제선택창으로 돌아갑니다", 
	        					   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
						 		dispose();
						 			new mainpay3();
								new card();
						}
							};
							
						
			  	timer.schedule(task, 3000);
			
				*/
				}
			});
		
    		}
		public void paintComponent(Graphics g) {
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
		
		}		
	}
	add(new detail(new menu()));
	new detail(new menu()).setOpaque(true);
	setTitle("sd");
	setSize(985,660);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new card();	

	}
}


/*switch (answer) {
case JOptionPane.YES_OPTION:
	 JOptionPane.showMessageDialog(null, "걸제가 완료되었습니다", 
							   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
	 System.exit(0); 
	 break;
case JOptionPane.NO_OPTION:
	 JOptionPane.showMessageDialog(null, "다시", 
							   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
	 dispose();
	 new card();
	 break;
case JOptionPane.CANCEL_OPTION:
	 JOptionPane.showMessageDialog(null, "취소되었습니다 결제선택창으로 돌아갑니다", 
					   "Message Dialog", JOptionPane.PLAIN_MESSAGE);
	 dispose();
	new mainpay3();
	 break;
*/