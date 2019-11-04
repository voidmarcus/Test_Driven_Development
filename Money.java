public class Money {
	protected int amount;

	public boolean equals(Money object) {
		Money money = (Money) object;
		return amount == money.amount;
	}
}