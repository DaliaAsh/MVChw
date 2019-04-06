import java.util.ArrayList;
import java.util.*;
public class Model {
	private double Value ;
	private String Op  = ""; 
	private String add = "+";
	private String sub = "-";
	private String mul = "*";
	private String div = "/";
	private String sqt = "Sqt";
	private String mod = "%";
	private String eq = "=";
	public int getNum(ArrayList arr) {
		int size = arr.size();
		int num = 0 ; 
		if(!(arr.isEmpty())) {
		for(int i = 0 ; i<size ; i++ ) {
			num+= Math.pow(10, size -i-1) * (int)arr.get(i);
		
		}
		}
		return num ; 	
		}
	

	
	public void addTwoNumbers(double firstNum , double secondNum) {
		
	Value=  firstNum + secondNum ; 
		
	}
	public void SubTwoNumbers(double firstNum , double secondNum) {
		
		Value=  firstNum - secondNum ; 
			
		}
	public void MulTwoNumbers(double firstNum , double secondNum) {
		
		Value=  firstNum * secondNum ; 
			
		}
	public void DivTwoNumbers(double firstNum ,double secondNum) {
		
		Value=  firstNum / secondNum ; 
			
		}
	public void ModTwoNumbers(double firstNum ,double secondNum) {
		
		Value=  firstNum % secondNum ; 
			
		}
	public void SqtNumber(double firstNum) {
		
		Value= Math.sqrt(firstNum) ; 
			
		}
    public double getCalcValue() {
    	
    	return Value ;     
    	}

}
