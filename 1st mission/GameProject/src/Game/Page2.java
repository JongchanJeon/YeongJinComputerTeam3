package Game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Page2 extends JPanel{
	 private ImageIcon nextButtonEnteredImage= new ImageIcon(Main.class.getResource("../images/nextButtonEntered.png"));
	 private ImageIcon nextButtonImage= new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	 private ImageIcon textBoxImage = new ImageIcon(Main.class.getResource("../images/textBox.png"));

	 JButton nextBtn = new JButton(nextButtonImage);
	 JLabel textBox = new JLabel();
	 
	 
	 Page2(){
		 page2Btn();
		 page2Text();
	 }
	 
	//���� ��ư
	 public void page2Btn() {
		 Page3 page3 = new Page3();
		 
		 nextBtn.setVisible(true);
		 nextBtn.setBounds(1000,500,200,100);
	     nextBtn.setBorderPainted(false); 
	     nextBtn.setContentAreaFilled(false); 
	     nextBtn.setFocusPainted(false); 
	      
	     nextBtn.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseEntered(MouseEvent e) {
	        	 nextBtn.setIcon(nextButtonEnteredImage);
	        	 nextBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
	         }
	         @Override
	         public void mouseExited(MouseEvent e) {
	        	nextBtn.setIcon(nextButtonImage);
	            nextBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	         }
	         @Override
	         public void mousePressed(MouseEvent e) {
	        	nextBtn.setVisible(false);
	        	textBox.setVisible(false);
	           /* ���� ȭ�� ��ȯ �߰� ���� */
	         }
	      });
	 }
	 
	 // �ؽ�Ʈ�ڽ�
	 public void page2Text() {
		// ��Ʈ �Ӽ� �߰� ����
		 Font myFont1 = new Font("Serif", Font.BOLD, 18);
		 
		 // htmló�� ����ؼ� �ٹٲ�, �߾����� ����
		 String test = "<html><body style='text-align:center;'>���� �߳����� �� �׽�Ʈ ��"
		 		+ "<br> html ���� ��� �ٹٲ� �Ǵ±�!"
		 		+ "<br> JAVA Team3 game project </body></html>";
		 
		 textBox.setVisible(true);
		 textBox.setBounds(300,100,700,500);
		 textBox.setIcon(textBoxImage); // �ؽ�Ʈ �ڽ��� �̹���
		 textBox.setText(test); // �ؽ�Ʈ �ڽ��� �� ����
		 textBox.setFont(myFont1); // �ؽ�Ʈ ��Ʈ ����
		 
		 // �ؽ�Ʈ ��ġ ����
		 textBox.setHorizontalTextPosition(JLabel.CENTER);
		 textBox.setVerticalTextPosition(JLabel.CENTER);
	 }
	 
}