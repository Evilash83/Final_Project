
public class Driver {

	public static void main(String[] args) {
		Waitress waitress = new Waitress();
		Burger burger = new Burger();
		Milkshake milkshake = new Milkshake();
		
		makeBurger SOC = new makeBurger(burger);
		waitress.setCommand(SOC);
		waitress.orderUp();
		
		makeMilkshake SOC2 = new makeMilkshake(milkshake);
		waitress.setCommand(SOC2);
		waitress.orderUp();
		
		waitress.setCommand(SOC);
		waitress.orderUp();

	}

}
