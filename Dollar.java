public class Dollar extends Money {

	public Dollar(int amount) {
		this.amount = amount;
	}

	Money times(int multiplier) {
		return new Dollar(amount * multiplier);

	public static void main(String[] args) {
		System.out.print("Util para testes");
	}

}