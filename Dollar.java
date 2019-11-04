public class Dollar extends Money {

	private String currency;

	Dollar(int amount, String currency) {
		super(amount, currency);
	}

	Money times(int multiplier) {
		return Money.dollar(amount * multiplier);
	}

	String currency() {
		return currency;
	}
	public static void main(String[] args) {
		System.out.print("Util para testes");
	}

}