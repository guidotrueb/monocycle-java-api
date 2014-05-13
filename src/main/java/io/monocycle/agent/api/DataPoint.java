package io.monocycle.agent.api;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * POJO to represent a single DataPoint
 */
public class DataPoint {

	private String metric;

	private Map<String, DataHolder> valuesMap;

	public DataPoint() {
		valuesMap = new LinkedHashMap<String, DataHolder>();
	}

	public DataPoint(String metric) {
		this();
		this.metric = metric;
	}

	@JsonIgnore
	public Collection<String> getKeys() {
		return getValuesMap().keySet();
	}

	@JsonIgnore
	public Collection<DataHolder> getValues() {
		return getValuesMap().values();
	}

	public void addValue(String key, DataHolder value) {
		valuesMap.put(key, value);
	}

	public String getMetric() {
		return metric;
	}

	public void setMetric(String metric) {
		this.metric = metric.toLowerCase();
	}

	public Map<String, DataHolder> getValuesMap() {
		return valuesMap;
	}

	public void setValuesMap(Map<String, DataHolder> valuesMap) {
		this.valuesMap = valuesMap;
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tmetric: " + metric + "\n\tvaluesMap: " + valuesMap + "\n}";
	}

}
