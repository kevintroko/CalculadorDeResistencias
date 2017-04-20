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
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Circuito3 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldR1;
	private JTextField textFieldR2;
	private JTextField textFieldR3;
	private JTextField textFieldVoltaje4;
	private JTextField textFieldVoltaje2;
	private JTextField textFieldVoltaje3;
	private JTextField textField;
	private double corriente1,corriente2;
	private String formula1, formula2;
	private GaussJordan gj;
	private Circuito3 cr3=this;


	
	/**
	 * Create the frame.
	 */
	public Circuito3(GaussJordan gj) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.gj=gj;
		
		
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
		
		JLabel lblFuenteDeVoltaje = new JLabel("Fuente de Voltaje 4");
		lblFuenteDeVoltaje.setForeground(new Color(0, 0, 128));
		
		JLabel lblFuenteDeVoltaje2 = new JLabel("Fuente de Voltaje 2");
		lblFuenteDeVoltaje2.setForeground(new Color(0, 0, 128));
		
		JLabel lblFuenteDeVoltaje3 = new JLabel("Fuente de Voltaje 3");
		lblFuenteDeVoltaje3.setForeground(new Color(0, 0, 128));
		
		textFieldVoltaje4 = new JTextField();
		textFieldVoltaje4.setColumns(10);
		
		textFieldVoltaje2 = new JTextField();
		textFieldVoltaje2.setColumns(10);
		
		textFieldVoltaje3 = new JTextField();
		textFieldVoltaje3.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					formulaComplicada();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Resultados3 frame = new Resultados3(cr3);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		JLabel lblResistencia_1 = new JLabel("Resistencia 4");
		lblResistencia_1.setForeground(new Color(0, 0, 128));
		
		textField = new JTextField();
		textField.setColumns(10);
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
							.addComponent(lblFuenteDeVoltaje)
							.addGap(18)
							.addComponent(textFieldVoltaje4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblResistencia3)
									.addGap(18)
									.addComponent(textFieldR3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblFuenteDeVoltaje3)
									.addGap(18)
									.addComponent(textFieldVoltaje3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblResistencia2)
									.addGap(18)
									.addComponent(textFieldR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblFuenteDeVoltaje2)
									.addGap(18)
									.addComponent(textFieldVoltaje2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(lblResistencia_1)
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnOk))))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 593, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(25, Short.MAX_VALUE))
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
						.addComponent(lblFuenteDeVoltaje)
						.addComponent(textFieldVoltaje4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistencia2)
						.addComponent(textFieldR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFuenteDeVoltaje2)
						.addComponent(textFieldVoltaje2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistencia3)
						.addComponent(textFieldR3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFuenteDeVoltaje3)
						.addComponent(textFieldVoltaje3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnOk)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblResistencia_1)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("Circuito33.png"));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		panel.add(lblNewLabel);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void formulaComplicada() throws IOException{
		double r1=Double.parseDouble(textFieldR1.getText());
		double r2=Double.parseDouble(textFieldR2.getText());
		double r3=Double.parseDouble(textFieldR3.getText());
		double r4=Double.parseDouble(textField.getText());
		double v4=Double.parseDouble(textFieldVoltaje4.getText());
		double v2=Double.parseDouble(textFieldVoltaje2.getText());
		double v3=Double.parseDouble(textFieldVoltaje3.getText());
		
		double vtotal1=v4;
		double vtotal2=v2+v3;	
		double rtotal1=r2+r3;
		double rtotal2=r1;
		
		System.out.println("vtotal1"+vtotal1);
		
		rtotal1=rtotal1*(-1);
		rtotal2=rtotal2*(-1);
		vtotal1=vtotal1*(-1);
		vtotal2=vtotal2*(-1);
		
		PrintWriter pw = new PrintWriter(new FileWriter("in1."));
		pw.print(2);
		pw.print(" ");
		pw.println(3);
		pw.println(rtotal1+" "+r4+" "+vtotal1);
		pw.println(r4+" "+rtotal2+" "+vtotal2);
		pw.close();	
		/*
		 * this.pr.setPaint(true);
		this.pr.repaint();
		 */
		gj.matrices(new FileReader("in1."), new FileWriter("outfile1"));
		this.formula1=rtotal1+"(i1)+"+r4+"(i2)="+vtotal1;
		this.formula2=r4+"(i1)"+rtotal2+"(i2)= "+vtotal2;
		System.out.println(formula1);
		System.out.println(formula2);
	}
	
	public double getCorriente1(){
		return gj.geti1();
	}
	
	public double getCorriente2(){
		return gj.geti2();
	}
	
	public String getFormula1(){
		return this.formula1;
	}
	
	public String getFormula2(){
		return this.formula1;
	}
}
