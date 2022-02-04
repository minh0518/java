package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;




class menu extends JPanel{
	 Image image;
	 Image menuimg;
	 Image menuimg2;
	  	public void paintComponent(Graphics g){
	   		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	   		setOpaque(false);
	   	}  
	JButton[] MBtn = new JButton[15];
	String[] menu = {
			"스위트콤보(팝콘(L)1+음료(M)2).","반반콤보(팝톤(L)1+음료(M)2).","더블콤보(팝콘(L)2+음료(M)2)","즉석구이한마리콤보(팝콘(L)1+음료(M)2+오징어)",
			"나쵸콤보(팝콘(L)1+음료(M)2+나쵸)","즉석핫도그콤보(팝콘(L)1+음료(M)2+핫도그1)","자몽에이드","레몬에이드",
			"콜라(M)","사이다(M)","팝콘(M)",
			"카라멜팝콘","사이즈업(음료)","사이즈 업(팝콘)","유자차"};
	int[] price = {
			8500,9500,13000,15000,
			12000,12500,5000,5000,
			2200,2200,4500,
			5000,500,500,3000};
	public JTextField tf = new JTextField(30);
	JButton[] SBtn = new JButton[4];
	String[] Str = {"쿠폰","선택취소","전체취소","결제"};
	String [] ColName = {"메뉴","가격"};
	String [][] Data ;
	int count =1;
	static int total;
	public  int sum =0;
	static String eat;
	DefaultTableModel model = new DefaultTableModel(Data,ColName);
	JTable table = new JTable(model);
	class Screen extends JPanel{
		Screen(){
			setBackground(Color.WHITE);
			DefaultTableModel m = (DefaultTableModel)table.getModel();
			//버튼의 getsource같은 느낌. 정보를 다 가져온다
			table.setRowHeight(50);//메뉴가 추가되면 나타나는 창
			table.getTableHeader().setFont(new Font("맑은고딕", Font.BOLD, 30));
			//맨 위에 메뉴  가격
			setOpaque(false);
			add(new JScrollPane(table));
		}
	}
	
	
	class MenuBtn extends JPanel{
		MenuBtn(){
			setLayout(new GridLayout(6,3,3,3));
			setBackground(Color.WHITE);
			setOpaque(false);
			
			
			menuimg=new ImageIcon("./image/sweetcombo.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[0]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/sweetcombo2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon = new ImageIcon(menuimg2);
			MBtn[0].setRolloverIcon(rolloverIcon); // rolloverIcon용 이미지 등록
			MBtn[0].setFocusPainted(false); 
			MBtn[0].setContentAreaFilled(false);
			add(MBtn[0]);
			
			menuimg=new ImageIcon("./image/halfcombo.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[1]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/halfcombo2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon2 = new ImageIcon(menuimg2);
			MBtn[1].setRolloverIcon(rolloverIcon2); // rolloverIcon용 이미지 등록
			MBtn[1].setFocusPainted(false); 
			MBtn[1].setContentAreaFilled(false);
			add(MBtn[1]);

			menuimg=new ImageIcon("./image/doublecombo.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[2]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/doublecombo2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon3 = new ImageIcon(menuimg2);
			MBtn[2].setRolloverIcon(rolloverIcon3); // rolloverIcon용 이미지 등록
			MBtn[2].setFocusPainted(false); 
			MBtn[2].setContentAreaFilled(false);
			add(MBtn[2]);

			menuimg=new ImageIcon("./image/즉석구이.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[3]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/즉석구이2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon4 = new ImageIcon(menuimg2);
			MBtn[3].setRolloverIcon(rolloverIcon4); // rolloverIcon용 이미지 등록
			MBtn[3].setFocusPainted(false); 
			MBtn[3].setContentAreaFilled(false);
			add(MBtn[3]);

			menuimg=new ImageIcon("./image/나쵸콤보.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[4]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/나쵸콤보2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon5 = new ImageIcon(menuimg2);
			MBtn[4].setRolloverIcon(rolloverIcon5); // rolloverIcon용 이미지 등록
			MBtn[4].setFocusPainted(false); 
			MBtn[4].setContentAreaFilled(false);
			add(MBtn[4]);
			
			menuimg=new ImageIcon("./image/즉석핫도그.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[5]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/즉석핫도그2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon6 = new ImageIcon(menuimg2);
			MBtn[5].setRolloverIcon(rolloverIcon6); // rolloverIcon용 이미지 등록
			MBtn[5].setFocusPainted(false); 
			MBtn[5].setContentAreaFilled(false);
			add(MBtn[5]);
			
			menuimg=new ImageIcon("./image/자몽에이드.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[6]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/자몽에이드2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon7 = new ImageIcon(menuimg2);
			MBtn[6].setRolloverIcon(rolloverIcon7); // rolloverIcon용 이미지 등록
			MBtn[6].setFocusPainted(false); 
			MBtn[6].setContentAreaFilled(false);
			add(MBtn[6]);
			
			menuimg=new ImageIcon("./image/레몬에이드.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[7]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/레몬에이드2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon8 = new ImageIcon(menuimg2);
			MBtn[7].setRolloverIcon(rolloverIcon8); // rolloverIcon용 이미지 등록
			MBtn[7].setFocusPainted(false); 
			MBtn[7].setContentAreaFilled(false);
			add(MBtn[7]);
			
			menuimg=new ImageIcon("./image/콜라.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[8]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/콜라2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon9 = new ImageIcon(menuimg2);
			MBtn[8].setRolloverIcon(rolloverIcon9); // rolloverIcon용 이미지 등록
			MBtn[8].setFocusPainted(false); 
			MBtn[8].setContentAreaFilled(false);
			add(MBtn[8]);
			
			menuimg=new ImageIcon("./image/사이다.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[9]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/사이다2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon10 = new ImageIcon(menuimg2);
			MBtn[9].setRolloverIcon(rolloverIcon10); // rolloverIcon용 이미지 등록
			MBtn[9].setFocusPainted(false); 
			MBtn[9].setContentAreaFilled(false);
			add(MBtn[9]);
			
			menuimg=new ImageIcon("./image/팝콘.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[10]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/팝콘2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon11 = new ImageIcon(menuimg2);
			MBtn[10].setRolloverIcon(rolloverIcon11); // rolloverIcon용 이미지 등록
			MBtn[10].setFocusPainted(false); 
			MBtn[10].setContentAreaFilled(false);
			add(MBtn[10]);

			menuimg=new ImageIcon("./image/맛변경카라멜.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[11]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/맛변경카라멜2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon12 = new ImageIcon(menuimg2);
			MBtn[11].setRolloverIcon(rolloverIcon12); // rolloverIcon용 이미지 등록
			MBtn[11].setFocusPainted(false); 
			MBtn[11].setContentAreaFilled(false);
			add(MBtn[11]);
			
			menuimg=new ImageIcon("./image/사이즈업음료.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[12]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/라지사이즈.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon13 = new ImageIcon(menuimg2);
			MBtn[12].setRolloverIcon(rolloverIcon13); // rolloverIcon용 이미지 등록
			MBtn[12].setFocusPainted(false); 
			MBtn[12].setContentAreaFilled(false);
			add(MBtn[12]);
			
			menuimg=new ImageIcon("./image/사이즈업팝콘.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[13]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/라지사이즈.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon14 = new ImageIcon(menuimg2);
			MBtn[13].setRolloverIcon(rolloverIcon14); // rolloverIcon용 이미지 등록
			MBtn[13].setFocusPainted(false); 
			MBtn[13].setContentAreaFilled(false);
			add(MBtn[13]);
			
			menuimg=new ImageIcon("./image/유자차.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			MBtn[14]= new JButton(new ImageIcon( menuimg2));
			menuimg=new ImageIcon("./image/유자차2.png").getImage();
			menuimg2= menuimg.getScaledInstance( 200, 120,  java.awt.Image.SCALE_SMOOTH ) ; 
			ImageIcon rolloverIcon15 = new ImageIcon(menuimg2);
			MBtn[14].setRolloverIcon(rolloverIcon15); // rolloverIcon용 이미지 등록
			MBtn[14].setFocusPainted(false); 
			MBtn[14].setContentAreaFilled(false);
			add(MBtn[14]);
			
		
		
		}
	}
	
	
	class StrBtn extends JPanel{
		StrBtn(){
		//	setBackground(Color.WHITE);
			setLayout(new GridLayout(1,4,3,3));
			setOpaque(false);

			for(int i=0;i<Str.length;i++) {//쿠폰,선택취소,전체취소,결제
				SBtn[i]= new JButton(Str[i]);
				add(SBtn[i]);
				LineBorder b2 = new LineBorder(Color.LIGHT_GRAY,7);
				SBtn[i].setBorder(b2);
				BevelBorder b4 = new BevelBorder(BevelBorder.RAISED);
				SBtn[i].setBorder(b4);
				SBtn[i].setFont(new Font("굴림체", Font.BOLD, 30));
				SBtn[i].setContentAreaFilled(false);
				SBtn[i].setForeground(Color.white);
				//SBtn[i].setBorderPainted(false);
			}
		}
	}
	public menu() {//생성자
		
		
		setLayout(null);
		image = new ImageIcon("./image/lotte2.png").getImage();
		
		setBackground(Color.WHITE);
		MenuBtn mbtn = new MenuBtn();
		StrBtn sbtn = new StrBtn();
		Screen sc = new Screen();
		
		//금액란
		tf.setSize(450, 70);
		tf.setLocation(50, 604);
		add(tf);
		
		sc.setSize(500, 500);
		sc.setLocation(25, 20);
		add(sc);
		
		mbtn.setSize(530, 650);
		mbtn.setLocation(530, 23);
		add(mbtn);
		
		sbtn.setSize(800, 70);
		sbtn.setLocation(170, 850);
		add(sbtn);
		
		
		for(int i=0;i<MBtn.length;i++) {
			final int index =i;
			
			MBtn[i].addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JButton MBtn = (JButton)e.getSource();
					//코드 논리상 이것들 안써도 되지만 그냥 개념상 쓴것 같다 
					DefaultTableModel m = (DefaultTableModel)table.getModel();
					m.addRow(new Object[]{menu[index],price[index]});
							//원래 특정 값을 가진 변수를 넣어주지만 여기서는 여러개의 자료형을 가진
							//변수를 넣어주기때문에 object로 했고 배열이기때문에 new를 사용
					
				
				
						sum += (int)table.getValueAt(table.getRowCount()-1, 1);
						
					//가격 부분만 가져와서 더한다
					tf.setText(String.valueOf(" 총 금액 : "+sum));
					tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
					total=sum;
					eat+=table.getValueAt(table.getRowCount()-1, 0);
					eat+="\n";
				}
			});
		}
		//쿠폰
		SBtn[0].addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				//코드 논리상 이것들 안써도 되지만 그냥 개념상 쓴것 같다 
				sum -= (int)table.getValueAt(table.getSelectedRow(), 1);
				table.setValueAt(0, table.getSelectedRow(), 1);
				//[getSelectedRow,1]에 위치한 값을 0으로 바꾼다
				//getSelectedRow는 현재 선택된 태이블의 행을 리턴(선택 안돼있으면 -1리턴)
				
				tf.setText(String.valueOf(" 총 금액 : "+sum));
				tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
				eat+=table.getValueAt(table.getRowCount()-1, 0);
				total=sum;
				eat+="\n";
			}
		});
		
			//선택취소
		SBtn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			 sum=0;
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				
				m.removeRow(table.getSelectedRow());
				
				int rowCont = table.getRowCount();
				for(int i=0;i<rowCont;i++) {
					sum += (int)table.getValueAt(i, 1);
				}//가격칸에 있는 모든것들을 불러온다
				tf.setText(String.valueOf(" 총 금액 : "+sum));
				tf.setFont(new Font("맑은고딕", Font.BOLD, 40));
				total=sum;
				eat+=table.getValueAt(table.getRowCount()-1, 0);
				eat+="\n";
			}
		});
		
		
		//전체취소
		SBtn[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton MBtn = (JButton)e.getSource();
				DefaultTableModel m = (DefaultTableModel)table.getModel();
				sum=0;
				m.setRowCount(0);
				tf.setText(String.valueOf(""));
				total=sum;
				eat+=table.getValueAt(table.getRowCount()-1, 0);
				eat+="\n";
			}
		});
		
		//결제버튼
		SBtn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			new mainpay3();
			}
		});
		
	}
}
public class SelectMenu2 extends JFrame{
	public ImagePanel image=null;
	public menu image2=null;
	public cash cash=null;
	public void change(String name) {
		if(name.equals("image")){
			getContentPane().removeAll();
			getContentPane().add(image);
			revalidate();
			repaint();
		}
		else if(name.equals("image2")){
			getContentPane().removeAll();
			getContentPane().add(image2);
			revalidate();
			repaint();
		}
		else {
			getContentPane().removeAll();
			getContentPane().add(cash);
			revalidate();
			repaint();
		}
	}
public static void main(String[] args) {
	SelectMenu2 frame=new SelectMenu2();

	frame.setTitle("첫번쨰 페이지");
	frame.image=new ImagePanel(frame);
	frame.image2=new menu();//사용하기 위해 객체화 아래 add하기전에 이거 안해주면 에러뜸
	//	frame.add(frame.image2);//처음 화면 띄울때 이게 띄워진다 그냥 이게 프레임에 add하는거
	frame.add(frame.image);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1100,1000);
	frame.setVisible(true);
	frame.setResizable(true);
	
	} 
}
