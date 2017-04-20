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
import java.awt.event.ActionEvent;

public class Circuito2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldR1;
	private JTextField textFieldR2;
	private JTextField textFieldVoltaje;
	private JTextField textFieldVoltaje2;
	private double corriente;
	private String formula;
	private Circuito2 cr2 = this;

	/**
	 * Create the frame.
	 */
	public Circuito2() {
		super("Circuito 2");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 667, 500);
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
		
		JLabel lblFuenteDeVoltaje = new JLabel("Fuente de Voltaje 1");
		lblFuenteDeVoltaje.setForeground(new Color(0, 0, 128));
		
		JLabel lblFuenteDeVoltaje2 = new JLabel("Fuente de Voltaje 2");
		lblFuenteDeVoltaje2.setForeground(new Color(0, 0, 128));
		
		textFieldVoltaje = new JTextField();
		textFieldVoltaje.setColumns(10);
		
		textFieldVoltaje2 = new JTextField();
		textFieldVoltaje2.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				formulaSimple();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Resultados2 frame = new Resultados2(cr2);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("Circuito22.png"));
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
							.addComponent(lblFuenteDeVoltaje)
							.addGap(18)
							.addComponent(textFieldVoltaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblResistencia2)
									.addGap(18)
									.addComponent(textFieldR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblFuenteDeVoltaje2)
									.addGap(18)
									.addComponent(textFieldVoltaje2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnOk, Alignment.TRAILING)))
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 614, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
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
						.addComponent(textFieldVoltaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResistencia2)
						.addComponent(textFieldR2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFuenteDeVoltaje2)
						.addComponent(textFieldVoltaje2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(btnOk)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);	
	}
	public void formulaSimple(){
		double r1=Double.parseDouble(textFieldR1.getText());
		double r2=Double.parseDouble(textFieldR2.getText());
		double v1=Double.parseDouble(textFieldVoltaje.getText());
		double v2=Double.parseDouble(textFieldVoltaje2.getText());
		double vtotal=v1+v2;
		double rtotal=r1+r2;
		this.corriente=vtotal/rtotal;
		this.formula=("i="+vtotal+"V/"+rtotal+"Ω");
		System.out.println("i: "+this.corriente);
	}
	
	public double getCorriente(){
		return this.corriente;
	}
	
	public String getFormula(){
		return this.formula;
	}
}
