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
 * @author Mark Octavio Rivera Acosta A01630250
 * 
 * Started in April 6th, 2016
 * Last modified in April 25th, 2016
 */
@SuppressWarnings("serial")
public class Resultados1 extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private Circuito1 c1;
	private double acable1,
	acable2,
	acable3,
	acable4,
	acable5,
	acable6;

	public Resultados1(Circuito1 c1) {
		super("Ecuaciones");
		getContentPane().setBackground(new Color(240, 255, 255));
		this.setLocation(100, 100);
		this.setPreferredSize(new Dimension(420, 420));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.c1=c1;
		this.pack();
		JLabel lblFormula = new JLabel("Ecuacion 1");
		lblFormula.setForeground(new Color(0, 0, 128));
		lblFormula.setFont(new Font("Lucida Grande", Font.BOLD, 16));

		JLabel lFormula = new JLabel(c1.getFormula());

		JLabel lbli1 = new JLabel("i1");
		lbli1.setForeground(new Color(0, 0, 128));
		lbli1.setFont(new Font("Lucida Grande", Font.BOLD, 16));


		JLabel lblNewLabel_1 = new JLabel(""+c1.getCorriente());

		textField = new JTextField();
		textField.setBackground(Color.RED);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 140, 0));
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBackground(Color.YELLOW);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBackground(new Color(0, 128, 0));
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBackground(new Color(0, 255, 0));
		textField_4.setColumns(10);

		JLabel label = new JLabel("200+");

		JLabel label_1 = new JLabel("120-199");

		JLabel label_2 = new JLabel("119-80");

		JLabel label_3 = new JLabel("79-20");

		JLabel label_4 = new JLabel("19-0");

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
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
								.addComponent(textField_1)
								.addComponent(textField_2)
								.addComponent(textField_3)
								.addComponent(textField_4)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblFormula, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lbli1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lFormula)
								.addComponent(lblNewLabel_1))))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFormula)
						.addComponent(lFormula))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbli1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	public void setCables(double a,double b,double c,double d,double e,double f){
		this.acable1=a;
		this.acable2=b;
		this.acable3=c;
		this.acable4=d;
		this.acable5=e;
		this.acable6=f;
	}
}
