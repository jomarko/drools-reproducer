package com.sample;

import java.util.List;
import java.util.Map;

public class Message {

	private Map<String, List<String>> items;
	
	public Map<String, List<String>> getItems() {
		return items;
	}
	
	public void setItems(Map<String, List<String>> items) {
		this.items = items;
	}
}
