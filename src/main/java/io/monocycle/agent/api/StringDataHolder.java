package io.monocycle.agent.api;

public class StringDataHolder implements DataHolder {

	private String value;

	public StringDataHolder() {
		// Default Constructor
	}

	public StringDataHolder(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tvalue: " + value + "\n}";
	}

}
