package Source;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		Model model = new Model();
		Controller contrll = new Controller(view,model);
		view.setVisible(true);
	}

}
