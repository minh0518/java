package practice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

//import POSPage2.SelectMenu2;

class ImagePanel extends JPanel{
  Image image;
  JButton b1 = new JButton("화면을 클릭하세요");
  JButton b2 = new JButton("");
 public ImagePanel(SelectMenu2 name){
  image = new ImageIcon("./image/reallotte.png").getImage();
  add(b1);
  add(b2);
  this.setLayout(null);
  b1.setBackground(Color.white);
  
  b1.setForeground(Color.red);

  b1.setOpaque(false);//투명하게
  b1.setContentAreaFilled(false);
  b1.setBorderPainted(false);
  b1.setBounds(0,0,1090,20);
  b2.setOpaque(false);//투명하게
  b2.setContentAreaFilled(false);
  b2.setBorderPainted(false);
  b2.setBounds(0,20,10000,10000);
  b2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			name.change("image2");
		}
	});		
}
 public void paintComponent(Graphics g){
	   g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	   setOpaque(false);
	   }  
}
