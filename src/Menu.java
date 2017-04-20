import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton circuito1 = new JButton("Circuito 1");
		circuito1.setForeground(new Color(0, 0, 128));
		circuito1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Circuito1 frame = new Circuito1();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		circuito1.setFont(new Font("Helvetica", Font.BOLD, 13));
		
		JButton circuito2 = new JButton("Circuito 2");
		circuito2.setForeground(new Color(0, 0, 128));
		circuito2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Circuito2 frame = new Circuito2();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		circuito2.setFont(new Font("Helvetica", Font.BOLD, 13));
		
		JButton circuito3 = new JButton("Circuito 3");
		circuito3.setForeground(new Color(0, 0, 128));
		circuito3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							GaussJordan gj = new GaussJordan();
							try {
								gj.matrices(new FileReader("in1."), new FileWriter("outfile"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							Circuito3 frame = new Circuito3(gj);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		circuito3.setFont(new Font("Helvetica", Font.BOLD, 13));
		
		JButton circuito4 = new JButton("Circuito 4");
		circuito4.setForeground(new Color(0, 0, 128));
		circuito4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Circuito4 frame = new Circuito4();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		circuito4.setFont(new Font("Helvetica", Font.BOLD, 13));
		
		
		JLabel lblNewLabel = new JLabel("ELECTRICIDAD Y MAGNETISMO");
		lblNewLabel.setFont(new Font("Helvetica", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		
		JLabel lblSeleccionaAlgunoDe = new JLabel("Selecciona alguno de los cuatro circuitos");
		lblSeleccionaAlgunoDe.setFont(new Font("Helvetica", Font.ITALIC, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(circuito1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
								.addComponent(circuito2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
							.addGap(79)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(circuito4, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
								.addComponent(circuito3, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
					.addGap(85))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addComponent(lblSeleccionaAlgunoDe, GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(28)
					.addComponent(lblSeleccionaAlgunoDe)
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(circuito1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(circuito3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(circuito2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(circuito4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(59))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
