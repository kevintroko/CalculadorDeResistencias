import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

/**
 * Saved as PanelCircuitos.java
 * @author Kevin Oswaldo Cabrera Navarro A01227157
 * 
 * Started in April 6th, 2016
 * Last modified in April 25th, 2016
 */
@SuppressWarnings("serial")
public class Resultados4 extends JFrame{
	private JTextField txtCable;
	private JTextField txtCable_1;
	private JTextField txtCable_2;
	private JTextField txtCable_3;
	private JTextField txtCable_4;
	private Circuito4 c4;

	public Resultados4(Circuito4 c4) {
		super("Ecuaciones");
		this.setLocation(100, 100);
		this.setPreferredSize(new Dimension(420, 420));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.c4=c4;
		this.pack();
		JLabel lblFormula = new JLabel("Ecuacion 1");
		lblFormula.setFont(new Font("Lucida Grande", Font.BOLD, 16));

		JLabel lFormula = new JLabel(c4.getFormula1());

		JLabel lbli1 = new JLabel("i1");
		lbli1.setFont(new Font("Lucida Grande", Font.BOLD, 16));

		JLabel lbli2 = new JLabel("i2");
		lbli2.setFont(new Font("Lucida Grande", Font.BOLD, 16));

		JLabel lblNewLabel = new JLabel(c4.getFormula2());

		JLabel lblNewLabel_1 = new JLabel(""+c4.getCorriente1());

		JLabel lblNewLabel_2 = new JLabel(""+c4.getCorriente2());

		txtCable = new JTextField();
		txtCable.setText("Cable 1");
		txtCable.setBackground(Color.RED);
		txtCable.setColumns(10);

		txtCable_1 = new JTextField();
		txtCable_1.setText("Cable 2");
		txtCable_1.setBackground(new Color(255, 140, 0));
		txtCable_1.setColumns(10);

		txtCable_2 = new JTextField();
		txtCable_2.setText("Cable 3\n");
		txtCable_2.setBackground(Color.YELLOW);
		txtCable_2.setColumns(10);

		txtCable_3 = new JTextField();
		txtCable_3.setText("Cable 4");
		txtCable_3.setBackground(new Color(0, 128, 0));
		txtCable_3.setColumns(10);

		txtCable_4 = new JTextField();
		txtCable_4.setText("Cable 6\n");
		txtCable_4.setBackground(new Color(0, 255, 0));
		txtCable_4.setColumns(10);

		JLabel label = new JLabel("200+");

		JLabel label_1 = new JLabel("120-199");

		JLabel label_2 = new JLabel("119-80");

		JLabel label_3 = new JLabel("79-20");

		JLabel label_4 = new JLabel("19-0");

		JLabel lblFormula_1 = new JLabel("Ecuacion 2");
		lblFormula_1.setFont(new Font("Lucida Grande", Font.BOLD, 16));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(35)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(label_4)
												.addComponent(label_1)
												.addComponent(label)
												.addComponent(label_2)
												.addComponent(label_3))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtCable, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
												.addComponent(txtCable_1)
												.addComponent(txtCable_2)
												.addComponent(txtCable_3)
												.addComponent(txtCable_4))
										.addGap(76))
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblFormula, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lbli1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblFormula_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addComponent(lbli2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lFormula)
												.addComponent(lblNewLabel)
												.addComponent(lblNewLabel_1)
												.addComponent(lblNewLabel_2))
										.addContainerGap(222, Short.MAX_VALUE))))
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGap(57)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFormula)
								.addComponent(lFormula))
						.addGap(6)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFormula_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbli1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGap(71)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCable, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCable_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_1))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCable_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_2))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCable_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_3))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(txtCable_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_4)))
								.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(lbli2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_2))))
						.addContainerGap(11, Short.MAX_VALUE))
				);
		getContentPane().setLayout(groupLayout);
	}
}
