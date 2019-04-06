import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class View extends JFrame{
	private JButton[] buttons ;
	private static final String[] Labels = {"7" ,"8" ,"9" ,"/" ,"4" ,"5" ,"6" ,"*" ,"1","2","3","+","0",".","=","-","Sqt","%"};
	private JTextArea result;
	private JPanel panel ; 
	private int num ; 
	public View() {
    super("Calc");
	panel = new JPanel();	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(220,240);
	GridLayout myLayout = new GridLayout(5,5);
	buttons = new JButton[18];
	for(int c = 0 ; c <18 ; c++) {
		buttons[c] = new JButton(Labels[c]);
		panel.add(buttons[c]);
	}
	result = new JTextArea();
	result.setAlignmentX(RIGHT_ALIGNMENT);
	Font font = new Font("Sansserif",Font.BOLD,20);
	result.setFont(font);
	add(result,BorderLayout.NORTH);
	add(panel,BorderLayout.CENTER);
	
	
	}
	public void addButtonListener(ActionListener listenForButton) {
		for(int c = 0 ; c <18 ; c++) {
			buttons[c] .addActionListener(listenForButton);
			
		}
		
	}

	public void set(int num ) {
		result.append(Integer.toString(num));
	}
	public void setRes(double num ) {
		result.append(Double.toString(num));
	}
    public void clear() {
    	
    	result.setText(null);
    }
	
	
}