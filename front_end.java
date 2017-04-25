import java.awt.event.*;
import javax.swing.*;

public class front_end implements ActionListener {

	public front_end(){
		prepare_gui();
	}
	private JFrame main_frame = new javax.swing.JFrame("Cloud Scheduling");
	private JPanel panel = new javax.swing.JPanel();
	private JButton choose_button = new javax.swing.JButton();
	private ImageIcon bg_image = new  ImageIcon("C:/Users/USER/Desktop/Front_End/.image.jpeg");
	private JLabel label = new javax.swing.JLabel(bg_image);
	
	private void prepare_gui(){

		main_frame.setSize(650,450);
		main_frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		main_frame.setVisible(true);
		panel.setLayout(null);
		choose_button.setText("Choose File");
		panel.add(label);
		panel.add(choose_button);
		choose_button.setBounds(400,300,100,20);
		main_frame.add(panel);
		choose_button.addActionListener((ActionListener) this);
		
	}
	
	public void actionPerformed(ActionEvent evt){
		choose_button_action(evt);
	}

	
	private void choose_button_action(ActionEvent evt) {
		JFileChooser chooser = new JFileChooser();
		int retuenval = chooser.showOpenDialog(null);
			}

	public static void main(String[] args) {
		
		front_end f = new front_end();
	}

}
