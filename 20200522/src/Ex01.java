import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01 extends JFrame{
	
	private JButton btn1 = new JButton("버튼");
	
	Ex01(){
		super("제목");
		initcomponent();
	}
	
	public void initcomponent() {
		this.setLayout(null);
		
		this.setSize(300,500);
		this.setVisible(true);
		
		this.add(btn1);
		this.btn1.setBounds(50, 50, 100, 50);
		this.btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("누르지마");
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 창 닫으면 terminal도 종료됨
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
