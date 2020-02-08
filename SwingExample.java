import javax.swing.*;

public class SwingExample{
	SwingExample(){
		JFrame frame = new JFrame("Hello World app");
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel lable = new JLabel("hii this is piyush");
		frame.add(lable);
		frame.setVisible(true);
	}
	public static void main(String str[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SwingExample();
			}
		});
	
	}	

}