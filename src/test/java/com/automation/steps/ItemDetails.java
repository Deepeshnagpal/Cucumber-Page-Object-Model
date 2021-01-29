package com.automation.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemDetails {
	
	public static final String label = "label";   
    public static final String values = "textValues";
    
	private List<Map<String, String>> details = new ArrayList<>();
    
	
    public List<Map<String, String>> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> entry) {
		details.add(entry);
	}

	@Override
	public String toString() {
		return "ItemDetails [details=" + details + "]";
	}

    
    

}
