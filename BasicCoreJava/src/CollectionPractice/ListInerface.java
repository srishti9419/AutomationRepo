package CollectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

import org.testng.annotations.Test;

public class ListInerface {

	
	
	
	ArrayList<String> list=new ArrayList<String>();
	@Test
	public void test1()
	{
	
	list.add("naanu");
	list.add("ajay");
	list.add("bhavna");
	list.add("ajay");
	list.add("jyoti");
	
	System.out.println(list);
	
	for(String a: list)
	{
		System.out.println(a);
	}
	
//Use Iterator
	
Iterator<String> itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}
	
	
	@Test(description="LinkedList")
	public void test2()
	{
		
		LinkedList<String> list= new LinkedList<String>();
		list.add("shubhi");
		list.add("seetu");
		list.add("jyoti");
		list.add("antu");
		
		// Itetrate through list iterator
		
		System.out.println();
		
		ListIterator<String> itr=list.listIterator(list.size());
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
	
	
	
	
}

