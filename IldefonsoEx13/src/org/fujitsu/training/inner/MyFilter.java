package org.fujitsu.training.inner;

import java.util.ArrayList;
import java.util.List;

class MyFilter implements IFilter{
	
	public static String[] filter(String[] a, IFilter f) {
		List filtered = new ArrayList();
		for(String lookup: a) {
			if(f.acceptString(lookup)) {
				filtered.add(lookup);
			}	
		}
		String[] array = new String[filtered.size()];
		filtered.toArray(array);
		return array;		
	}
	
	@Override
	public boolean acceptString(String x) {
		return false;
	}

}
