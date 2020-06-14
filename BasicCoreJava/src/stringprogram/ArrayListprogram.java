package stringprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListprogram {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1, 2,3,4));
		LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(7));
		
		LinkedList<Integer> list3=new LinkedList<>();
		
		list3.addAll(list);
		list3.addAll(list2);
		
		
	/*	
	Object []arr=	list.toArray();
	for(int i=)*/
		
		System.out.println(list3);
		
		     }
		   }
		
	


