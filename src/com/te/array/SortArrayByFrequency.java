package com.te.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayByFrequency {
	public static void sortArray(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i: a) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		//System.out.println(map);
		for (Entry<Integer, Integer> entry : map.entrySet()) 
        {
            int frequency = entry.getValue();
              
            while (frequency >= 1)
            {
                System.out.print(entry.getKey()+" ");
                  
                frequency--;
            }
        }
          
	}
	public static void main(String[] args) {
		int[] a = {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
		sortArray(a);
	}

}
