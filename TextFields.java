import javax.Swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFields{
	JLable lable;
	JTextField textField;

	public TextFields(){
		lable = new JLable("");
		textField = new JTextField(20);
		JFrame frame = new JFrame("using textfields");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textField.AddActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				lable.setText(textField.getText());
			}
		});
		frame.add(lable);
		frame.add(textField);
		frame.setVisible(true);	
	}
	public static void main(String str[]){
		SwingUtilities.invokeLater(new Runnable()){
			public void run(){
				new TextFields();
			}
		});
	}
}




