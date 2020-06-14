package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Arrayist {
	
	public static void main(String[] args) {
		
		
		//preserve the insertion order
		
		//duplicates allowed
		//provides random access
		//non synchronized 
		
		
	
 ArrayList<String> list=new ArrayList<>();
 
 list.add("srishti");
 list.add("shubhi");
 list.add("shubhi");
 
 list.remove(1);
 
 for(String ar:list)
 {
	 System.out.println(ar);
 }
 
System.out.println( list.get(1));
 
 LinkedList<String> link = new LinkedList<String>(); 
 
// it uses doubly link list , manuplation fast
 
 link.add("neha");
 link.add("anu");
 link.add("anu");
 
 link.remove(2);
 Iterator<String> itr=link.iterator();
 
 while(itr.hasNext())
 {
	 System.out.println(itr.next());
 }
 

 
 
 
 Vector<String> rose=new Vector<>();
 
 //stores dynamic array ,synchromised 
 rose.add("1");
 rose.add("2");
 rose.add("3");
 rose.add("3");
 
 for(String a: rose)
 {
	 System.out.println(a);
 }
 
 
 
 Stack<String> rr=new Stack();
 
 rr.add("d");
 rr.add("s");
 rr.push("sarika");
 rr.pop();
 for(String c: rr)
 {
	 System.out.println(c);
 }
 
 
 
 
 
 
 
 }
 
 
 
 
	}

 

Queue : first in first out structure

priorities queue : doesn't allow null value

deques : double ended queue allows to perform operations from both the ends
ArrayDequeue


Set : represents unordered set of elements , which doesn't allow us to store duplicate elements 

 

