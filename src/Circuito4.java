import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class Circuito4 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldR1;
	private JTextField textFieldR2;
	private JTextField textFieldR3;
	private JTextField textFieldR4;
	private JTextField textFieldR5;
	private JTextField textFieldR6;
	private double corriente1,corriente2;
	private String formula1, formula2;
	private Circuito4 cr4=this;

	/**
	 * Create the frame.
	 */
	public Circuito4() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel lblResistencia = new JLabel("Resistencia 1");
		lblResistencia.setForeground(new Color(0, 0, 128));
		
		JLabel lblResistencia2 = new JLabel("Resistencia 2");
		lblResistencia2.setForeground(new Color(0, 0, 128));
		
		textFieldR1 = new JTextField();
		textFieldR1.setColumns(10);
		
		textFieldR2 = new JTextField();
		textFieldR2.setColumns(10);
		
		JLabel lblResistencia3 = new JLabel("Resistencia 3");
		lblResistencia3.setForeground(new Color(0, 0, 128));
		
		textFieldR3 = new JTextField();
		textFieldR3.setColumns(10);
		
		JLabel lblResistencia4 = new JLabel("Resistencia 4");
		lblResistencia4.setForeground(new Color(0, 0, 128));
		
		JLabel lblResistencia5 = new JLabel("Resistencia 5");
		lblResistencia5.setForeground(new Color(0, 0, 128));
		
		JLabel lblResistencia6 = new JLabel("Resistencia 6");
		lblResistencia6.setForeground(new Color(0, 0, 128));
		
		textFieldR4 = new JTextField();
		textFieldR4.setColumns(10);
		
		textFieldR5 = new JTextField();
		textFieldR5.setColumns(10);
		
		textFieldR6 = new JTextField();
		textFieldR6.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaCero();	
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Resultados4 frame = new Resultados4(cr4);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("Circuito44.png"));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		panel.add(lblNewLabel);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblResistencia)
							.addGap(18)
							.addComponent(textFieldR1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblResistencia4)
							.addGap(18)
							.addComponent(textFieldR4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblResistencia3)
									.addGap(18)
									.addComponent(textFieldR3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblResistencia6)
									.addGap(18)
									.addComponent(textFieldR6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblResistencia2)
									.addGap(18)
									.addComponent(textFieldR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblResistencia5)
									.addGap(18)
									.addComponent(textFieldR5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnOk, Alignment.TRAILING))))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistencia)
						.addComponent(textFieldR1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblResistencia4)
						.addComponent(textFieldR4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistencia2)
						.addComponent(textFieldR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblResistencia5)
						.addComponent(textFieldR5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistencia3)
						.addComponent(textFieldR3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblResistencia6)
						.addComponent(textFieldR6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void formulaCero(){
		double r1=Double.parseDouble(textFieldR1.getText());
		double r2=Double.parseDouble(textFieldR2.getText());
		double r3=Double.parseDouble(textFieldR3.getText());
		double r4=Double.parseDouble(textFieldR4.getText());
		double r5=Double.parseDouble(textFieldR5.getText());
		double r6=Double.parseDouble(textFieldR6.getText());
			
		double rtotal1=r1+r5+r6;
		double rtotal2=r2+r3;
		
		this.corriente1=0;
		this.corriente2=0;
		this.formula1="";
		this.formula2="";
		

		this.formula1=rtotal1+"(i1)+"+r4+"(i2)="+0;
		this.formula2=r4+"(i1)"+rtotal2+"(i2)= "+0;
		System.out.println(formula1);
		System.out.println(formula2);
	}
	
	public double getCorriente1(){
		return 0;
	}
	
	public double getCorriente2(){
		return 0;
	}
	
	public String getFormula1(){
		return this.formula1;
	}
	
	public String getFormula2(){
		return this.formula2;
	}
}
