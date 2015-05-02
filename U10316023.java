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
 import java.text.DecimalFormat;
 
public  class  U10316023 extends JFrame{
	//create three parts which user may see
	private CIRCLE user_circle = new CIRCLE();
	private SQUARE user_square = new SQUARE();
	private TRIANGLE user_triangle = new TRIANGLE();
	
	//constructor
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
	//create answer JPanel
	JPanel answer = new JPanel();
	//create two text field to print answer
	JTextField text_area = new JTextField(8);
	JTextField text_perimeter = new JTextField(8);
	
	ANS(){
		//Typesetting
		answer.setLayout(new GridLayout(2,2));
		//add JLabel and JTextField
		answer.add(new JLabel("Aera :"));
		answer.add(text_area);
		answer.add(new JLabel("Perimeter :"));
		answer.add(text_perimeter);
		//add answer
		add(answer);
	}
}

class CIRCLE extends JPanel{
	//create circle JPanel
	JPanel circle = new JPanel();
	//create a text field to input digit
	JTextField text_radius = new JTextField(4);
	//create JButton called calculate and clear
	JButton calculate = new JButton("Calculate");
	JButton clear = new JButton("Clear");
	//create ANS
	ANS c_a = new ANS();
	
	CIRCLE(){
		//Typesetting
		circle.setLayout(new GridLayout(1,4));
		//add JLabel and JButton
		circle.add(new JLabel("Radius :"));
		circle.add(text_radius);
		circle.add(calculate);
		circle.add(clear);
		//set border title
		circle.setBorder(new TitledBorder("Circle"));
		
		//add circle and c_a
		add(circle,BorderLayout.WEST);
		add(c_a,BorderLayout.EAST);
		
		calculate.addActionListener(new ActionListener(){
			@Override//when press calculate, it would calculate answer.
			public void actionPerformed(ActionEvent e){
				//set format
				DecimalFormat df=new DecimalFormat("#.##");
				//get answer
				double radius = Double.parseDouble(text_radius.getText());
				double answer_area =  radius * radius * Math.PI;
				double answer_perimeter = 2 *  Math.PI * radius;
				//print answer
				c_a.text_area.setText(df.format(answer_area));
				c_a.text_perimeter.setText(df.format(answer_perimeter));
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				c_a.text_area.setText(null);
				c_a.text_perimeter.setText(null);
				text_radius.setText(null);
			}
		});
	}
}

class TRIANGLE extends JPanel{
	//create triangle JPanel
	JPanel triangle = new JPanel();
	//create a text field to input digit
	JTextField text_side = new JTextField(4);
	//create JButton called calculate and clear
	JButton calculate = new JButton("Calculate");
	JButton clear = new JButton("Clear");
	//create ANS
	ANS t_a = new ANS();
	
	TRIANGLE(){
		//Typesetting
		triangle.setLayout(new GridLayout(1,4));
		//add JLabel and JButton
		triangle.add(new JLabel("Side :"));
		triangle.add(text_side);
		triangle.add(calculate);
		triangle.add(clear);
		//set border title
		triangle.setBorder(new TitledBorder("Regular triangle"));		
		
		//add triangle and t_a
		add(triangle,BorderLayout.WEST);
		add(t_a,BorderLayout.EAST);
		
		calculate.addActionListener(new ActionListener(){
			@Override//when press calculate, it would calculate answer.
			public void actionPerformed(ActionEvent e){
				//set format
				DecimalFormat df=new DecimalFormat("#.##");
				//get answer
				double side = Double.parseDouble(text_side.getText());
				double answer_area =  side * side  * Math.sqrt(3) / 4;
				double answer_perimeter =  3 * side;
				//print answer
				t_a.text_area.setText(df.format(answer_area));
				t_a.text_perimeter.setText(df.format(answer_perimeter));
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				t_a.text_area.setText(null);
				t_a.text_perimeter.setText(null);
				text_side.setText(null);
			}
		});
	}
}
	
class SQUARE extends JPanel{
	//create square JPanel
	JPanel square = new JPanel();
	//create a text field to input digit
	JTextField text_side = new JTextField(4);
	//create JButton called calculate and clear
	JButton calculate = new JButton("Calculate");
	JButton clear = new JButton("Clear");
	//create ANS
	ANS s_a = new ANS();
	
	SQUARE(){
		//Typesetting
		square.setLayout(new GridLayout(1,4));
		//add JLabel and JButton
		square.add(new JLabel("Side :"));
		square.add(text_side);
		square.add(calculate);
		square.add(clear);	
		//set border title
		square.setBorder(new TitledBorder("Square"));
		
		//add square and s_a
		add(square,BorderLayout.WEST);
		add(s_a,BorderLayout.EAST);
		
		calculate.addActionListener(new ActionListener(){
			@Override//when press calculate, it would calculate answer.
			public void actionPerformed(ActionEvent e){
				//set format
				DecimalFormat df=new DecimalFormat("#.##");
				//get answer
				double side = Double.parseDouble(text_side.getText());
				double answer_area =  side * side ;
				double answer_perimeter = 4 * side;
				//print answer
				s_a.text_area.setText(df.format(answer_area));
				s_a.text_perimeter.setText(df.format(answer_perimeter));
			}
		});
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				s_a.text_area.setText(null);
				s_a.text_perimeter.setText(null);
				text_side.setText(null);
			}
		});
	}
}
