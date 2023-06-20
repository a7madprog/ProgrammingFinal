import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Final extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Final frame = new Final();
					frame.setVisible(true); // to show JFrame 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public Final() {
		setTitle("Shapes calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);// set JFrame bounds 
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel(); //new Jpanel object 
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));//set JPanel bounds
		panel.setBounds(10, 10, 414, 240);//set JPanel bounds
		contentPane.add(panel);
		panel.setLayout(null);
		Scanner in = new Scanner(System.in);

		JButton btn1 = new JButton("Circle"); //create JButton object 
		// add an actionlistiner to handle event
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double radius = 0;
				double hight = 0;
				try {
					radius = Double.parseDouble(txt1.getText());	
					hight = Double.parseDouble(txt2.getText());
					Circle circle = new Circle(radius); // composition
					JOptionPane.showMessageDialog(null, "Circle's area = " + circle.calcArea());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a number!");
					System.err.println("ERROR");
				}

			}
		});
		btn1.setBounds(21, 173, 89, 23);
		panel.add(btn1);

		JButton btn2 = new JButton("Cylinder");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double radius;
				double hight;

				try {
		            // Parse the values entered in the text fields as doubles
					radius = Double.parseDouble(txt1.getText());
					hight = Double.parseDouble(txt2.getText());
					Circle circle = new Circle(radius = in.nextDouble());
					Cylinder cylinder = new Cylinder(circle.getRadius(), hight = in.nextDouble()); 
					JOptionPane.showMessageDialog(null, "Cylinder's area = " + cylinder.calcArea()
							+ "     Cylinder's volum = " + cylinder.calcVolume());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a number");

					System.err.println("ERROR");
				}

			}
		});
		btn2.setBounds(170, 173, 89, 23);
		panel.add(btn2);

		JButton btn3 = new JButton("Sphere");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double radius;
				double hight;

				try {
					radius = Double.parseDouble(txt1.getText());
					Cylinder sphere = new Cylinder(radius = in.nextDouble(), hight = in.nextDouble());
					JOptionPane.showMessageDialog(null, "sphere's area = " + sphere.calcAreasphere()
							+ "    sphere's volum = " + sphere.calcVolsphere());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Please enter a number!");

					System.err.println("ERROR");
				}

			}
		});
		btn3.setBounds(315, 173, 89, 23);
		panel.add(btn3);
		//add jlable button1
		JLabel lblNewLabel = new JLabel("Enter Radius");
		lblNewLabel.setBounds(39, 55, 89, 14);
		panel.add(lblNewLabel);
		//add jlable button1
		JLabel lblNewLabel_1 = new JLabel("Enter hight");
		lblNewLabel_1.setBounds(39, 100, 89, 14);
		panel.add(lblNewLabel_1);

		txt1 = new JTextField();
		txt1.setBounds(173, 52, 86, 20);
		panel.add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(173, 97, 86, 20);
		panel.add(txt2);
		txt2.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Choose a shape");
		lblNewLabel_2.setBounds(170, 11, 100, 14);
		panel.add(lblNewLabel_2);

	}
}
