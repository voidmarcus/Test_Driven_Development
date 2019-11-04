public class Dollar extends Money {

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
    }
	public static void main(String[] args) {
		System.out.print("Util para testes");
	}

}