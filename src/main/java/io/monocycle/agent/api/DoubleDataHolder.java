package io.monocycle.agent.api;

public class DoubleDataHolder implements DataHolder {

	private Double value;

	public DoubleDataHolder() {
		// Default Constructor
	}

	public DoubleDataHolder(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tvalue: " + value + "\n}";
	}

}
