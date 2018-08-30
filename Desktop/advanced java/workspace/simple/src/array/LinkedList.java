package array;

import linked.node;

public class LinkedList {
	
	static node first;
	node last;
	
	void add(int data)
	{
		if(first==null)
		{
			first = new node(data);
			last =first;
			return;
		}
		
		last.setNext(new node(data));
		last = last.getNext();
	}
	
	void traverse()
	{
		node temp = first;
		System.out.println();
		do{
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}while(temp!=null);
	}
	
	void traverse(node fir)
	{
		node temp = fir;
		System.out.println();
		do{
			System.out.print(temp.getData()+" ");
			temp = temp.getNext();
		}while(temp!=null);
	}
	
	void delete(int data)
	{
		
		if(first.getData()==data)
		{
			
			System.out.println(first.getData());
			first = first.getNext();
			return;
		}
		node temp = first;
		node prev = null;
		while(temp!=null&&temp.getData()!=data)
		{
			prev = temp;
			temp = temp.getNext();
		}
		if(temp.getNext()==null)
		{
			prev.setNext(null);
		}
		prev.setNext(temp.getNext());
		temp.setNext(null);
		System.out.println(temp.getData());
	}
	
	public static void main(String args[])
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.traverse();
		System.out.println();
		l.rotate(4);
		l.traverse();
		
	
	}
	
	void rotate(int pos)
	{
		node temp = first;
		int size =1;
		node prev =null;
		while(size!=pos+1)
		{
			size++;
			prev = temp;
			temp = temp.getNext();
		}
		node next = temp;
		prev.setNext(null);
		while(temp.getNext()!=null)
		{
			next = temp.getNext();
			temp.setNext(first);
			first = temp;
			temp = next;
		}
		temp.setNext(first);
		first = temp;
	}
	

}
