package one.digitalinnovation.delivery.entity;

public enum AddressType {

	HOME("Home"), COMMERCIAL("Commercial"), DELIVERY("Delivery");

	private final String description;

	private AddressType(String descString) {
		this.description = descString;
	}

}
