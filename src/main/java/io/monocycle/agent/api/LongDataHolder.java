package io.monocycle.agent.api;

public class LongDataHolder implements DataHolder {

	private Long value;
	
	public LongDataHolder() {
		// Default constructor
	}

	public LongDataHolder(Long value) {
		this.value = value;
	}

	public Long getValue() {
		return value;
	}

}
