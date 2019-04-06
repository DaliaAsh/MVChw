import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller {
	private View theView ;
	private Model theModel;
	private int count = 0 ; 
	private double num1 ;
	private double num2 ; 
	private ArrayList arr;
	private String add = "+";
	private String sub = "-";
	private String mul = "*";
	private String div = "/";
	private String eq = "=";
	private String sqt = "Sqt";
	private String mod = "%";
	private String Op ; 
	private boolean ready ; 
	private boolean finish = false;
	public Controller( View view,Model model) {
		theView = view;
		theModel = model;
		theView.addButtonListener(new ButtonHandlerListener());
		arr = new ArrayList<Integer>();
		}
	public class  ButtonHandlerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String buttonPress = e.getActionCommand();
			VerifiyPress(buttonPress);
		
		}
		
		public void VerifiyPress(String Press) {
			if(count == 0 && finish)
				theView.clear();
			int temp ; 	
		char[] PressChar = Press.toCharArray();
		boolean isNum = Character.isDigit(PressChar[0]);	
		if(isNum) {
		if(count == 0) {
			temp = Integer.parseInt(Press);
			arr.add(temp);
			 theView.set(temp);
		}	else if(count == 1) {
			temp = Integer.parseInt(Press);
			arr.add(temp);
			 theView.set(temp);
		}
			
			
		}	
		else{
			count++;
			if(count == 1) {
		    num1 = theModel.getNum(arr);
		    arr.removeAll(arr);
		    theView.clear();
			if(Press.equals(add)) {
				Op = add ; 
			}
			else if(Press.equals(sub)) {
				Op = sub ;
			}
			else if(Press.equals(mul)) {
				Op = mul ; 
			}
            else if(Press.equals(div)) {
				Op = div ; 
			}
			}
			 else if(Press.equals(eq)) { 
					num2 = theModel.getNum(arr);
					arr.removeAll(arr);
					  ready = true;
					  theView.clear();
				}
			
		}
			if(ready) {
				if(Op.equals(add)) {
				theModel.addTwoNumbers(num1, num2);
				}
				else if(Op.equals(sub)) {
				theModel.SubTwoNumbers(num1, num2);	
				}
				else if(Op.equals(mul)) {
					theModel.MulTwoNumbers(num1, num2);	
					}
				else if(Op.equals(div)) {
					theModel.DivTwoNumbers(num1, num2);	
					}
				double res = theModel.getCalcValue();
				theView.setRes(res);
				ready = false ;  
				finish = true ; 
				count = 0 ; 
			}
			
		}
		
	
	}

}
