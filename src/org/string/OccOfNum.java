package org.string;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccOfNum {
	public static void main(String[] args) {
		List li = Arrays.asList(10,20,30,30,20,50,10,20);
		Map<Object,Integer> mp=new LinkedHashMap<>();
		for (int i = 0; i < li.size(); i++) {
			
			 Object hi =li.get(i);
			
			if (mp.containsKey(hi)) {
				
				Integer count = mp.get(hi);
				mp.put(hi, count+1);
				
			} else {
				mp.put(hi, 1);

			}
		}
	System.out.println(mp);
	Collection<Integer> values = mp.values();
	Integer max = Collections.max(values);
	Set<Entry<Object,Integer>> entrySet = mp.entrySet();
	for (Entry<Object, Integer> entry : entrySet) {
		
	
	if (entry.getValue()==max) {
		System.out.println("Maximum value Occured :"+entry.getKey());
	}	
	}
	
	}
	}


