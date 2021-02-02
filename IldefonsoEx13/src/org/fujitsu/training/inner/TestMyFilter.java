package org.fujitsu.training.inner;

public class TestMyFilter {

	public static void main(String[] args) {
		String[] words = {"mom", "cat", "radar", "class", "hope", "1dwd"};
		
		MyFilter myfilter = new MyFilter();
		
		//filter strings with less than 3 char
		IFilter filter1 = new IFilter() {
			
			@Override
			public boolean acceptString(String x) {
				boolean accept = false;
				if(x.length() <= 3) {
					accept = true;
				}
				return accept;	
			}	
		};
		
		//filters strings that ends with s
		IFilter filter2 = new IFilter() {
			
			@Override
			public boolean acceptString(String x) {
				boolean accept = false;
				if(x.charAt(x.length()-1) == 's') {
					accept = true;
				}
				return accept;	
			}	
		};
		
		//filters palindrome
		IFilter filter3 = new IFilter() {
			
			@Override
			public boolean acceptString(String x) {
				boolean accept = false;
				StringBuilder reverse = new StringBuilder();
			
				for(int i = (x.length() - 1) ; i >= 0 ; i--) {
					 reverse.append(x.charAt(i));
				}
				
				 if(x.equals(String.valueOf(reverse))) {
				    	accept = true;
				 }
				return accept;	
			}		
		};	
		
		//filters string with number at the beginning
		IFilter filter4 = new IFilter() {
			
			@Override
			public boolean acceptString(String x) {
				boolean accept = false;
			    if(x.substring(0, 1).matches("[0-9]")) {
			    	accept = true;
			    }
				return accept;	
			}		
		};	
		
		//filters string with number at the beginning
		IFilter filter5 = new IFilter() {
					
			@Override
			public boolean acceptString(String x) {
				boolean accept = false;
				if(x.length() % 2 != 0) {
					accept = true;
				}
					return accept;	
			}
			
			
		};		
		
		String a[] = myfilter.filter(words,filter1);
		for(String lookup : a) {
			System.out.print(lookup +" ");
		}
		

	}

}
