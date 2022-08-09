package week4day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {
	public static void main (String[] args) {
		String text ="we learn java basics as part of java sessions in java week1";
		String[] textarray=text.split(" ");
		Set<String> myset=new HashSet<String>();
		for(String x:textarray) {
			myset.add(x);
		}
		Iterator itr=myset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+" ");
		}
		
		
		
		
	}

}
