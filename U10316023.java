/**
 * ID: U10316023 
 * Ex: _taAssign2_normal
 * Information:
 *	  U10316023 class is written according to the requirements on web.
 */
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.*;
 import javax.swing.border.*;
 
public  class  U10316023 extends JFrame{
	private CIRCLE user_circle = new CIRCLE();
	private SQUARE user_square = new SQUARE();
	private TRIANGLE user_triangle = new TRIANGLE();
	
	
	public U10316023(){
		add(user_circle,BorderLayout.NORTH);
		add(user_square,BorderLayout.CENTER);
		add(user_triangle,BorderLayout.SOUTH);
	}
	
	public static void main (String[] args){
		JFrame frame = new U10316023();//create U10316023 object
		frame.setTitle("U10316023_GeoCalculate");//set title
		frame.pack();//set size
		frame.setLocationRelativeTo(null); // Center the frame
		//terminate when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//set visible
		frame.setResizable(false);//cannot change size
	}
}

class ANS extends JPanel{
	JPanel answer = new JPanel();
	JTextField text_area = new JTextField(8);
	JTextField text_perimeter = new JTextField(8);
	
	ANS(){
		answer.setLayout(new GridLayout(2,2));
		answer.add(new JLabel("Aera :"));
		answer.add(text_area);
		answer.add(new JLabel("Perimeter :"));
		answer.add(text_perimeter);

		add(answer);
	}
}

class CIRCLE extends JPanel{
	JPanel circle = new JPanel();
	JTextField text_radius = new JTextField(4);
	JButton calculate = new JButton("Calculate");
	JButton clear = new JButton("Clear");
	ANS c_a = new ANS();
	
	CIRCLE(){
		circle.setLayout(new GridLayout(1,4));
		circle.add(new JLabel("Radius :"));
		circle.add(text_radius);
		circle.add(calculate);
		circle.add(clear);
		circle.setBorder(new TitledBorder("Circle"));
		
		add(circle,BorderLayout.WEST);
		add(c_a,BorderLayout.EAST);
		
		calculate.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String answer_area = text_radius.getText()*text_radius.getText()* Math.PI;
				String answer_perimeter = 2*text_radius.getText()* Math.PI;
				c_a.text_area.setText(answer_area);
				c_a.text_perimeter.setText(answer_perimeter);
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				c_a.text_area.setText(null);
				c_a.text_perimeter.setText(null);
				text_radius.setText(null);
			}
		});
	}
}

class TRIANGLE extends JPanel{
	JPanel triangle = new JPanel();
	JTextField text_side = new JTextField(4);
	JButton calculate = new JButton("Calculate");
	JButton clear = new JButton("Clear");
	ANS t_a = new ANS();
	
	TRIANGLE(){
		triangle.setLayout(new GridLayout(1,4));
		triangle.add(new JLabel("Side :"));
		triangle.add(text_side);
		triangle.add(calculate);
		triangle.add(clear);
		triangle.setBorder(new TitledBorder("Regular triangle"));		
		
		add(triangle,BorderLayout.WEST);
		add(t_a,BorderLayout.EAST);
	}
}

class SQUARE extends JPanel{
	JPanel square = new JPanel();
	JTextField text_side = new JTextField(4);
	JButton calculate = new JButton("Calculate");
	JButton clear = new JButton("Clear");
	ANS s_a = new ANS();
	
	SQUARE(){
		square.setLayout(new GridLayout(1,4));
		square.add(new JLabel("Side :"));
		square.add(text_side);
		square.add(calculate);
		square.add(clear);	
		square.setBorder(new TitledBorder("Square"));
		
		add(square,BorderLayout.WEST);
		add(s_a,BorderLayout.EAST);
	}
}
