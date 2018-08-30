package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class tree {

	node add(node root , int data)
	{
		if(root==null)
		{
			return new node(data);
		}
		
		if(root.getData()>data)
          root.setLeft(add(root.getLeft(),data));
		else
			root.setRight(add(root.getRight(),data));

		return root;
	}
	
	void find(node root , int data)
	{
		if(root==null)
		return;
		
		if(root.getData()==data)
		{
			System.out.println("found");
		}
		
		find(root.getLeft(),data);
		find(root.getRight(),data);
	}
	
	void traverse(node root)
	{
		if(root==null)
			return;
		
		traverse(root.getLeft());
		System.out.println(root.getData());
		traverse(root.getRight());
		
	}
	
	void levelOrder(node root)
	{
		Queue<node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			root = q.poll();
			System.out.println(root.getData());
			if(root.getLeft()!=null)
			q.add(root.getLeft());
			if(root.getRight()!=null)
			q.add(root.getRight());
		}
		System.out.println();
		}
	
	void preorder(node root)
	{
		if(root ==null)
			return;
		System.out.println(root.getData());
		preorder(root.getLeft());
	
		preorder(root.getRight());
	}
	
	
	int printLeaf(node root ,int count)
	{
		
		if(root==null)
			return count;
		if(root.getLeft()==null&&root.getRight()==null)
		{
			count++;
			System.out.println(root.getData()+"and count is "+count);
			return count;
		}
		
		count = printLeaf(root.getRight(),count);
		count = printLeaf(root.getLeft(),count);
		 
		 return count;
	}
	
	void printPath(node root , int arr[] , int i)
	{
		
		if(root==null)
			return;
		arr[i++]= root.getData();
		if(root.getLeft()==null&&root.getRight()==null)
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(arr[j]);
			}
			System.out.println();
		}
		printPath(root.getLeft() , arr ,i);
		printPath(root.getRight(), arr ,i);
	}
	
	
	public static void main(String args[])
	{
		tree  t = new tree();
		node root = new node(40);
		
		t.add(root, 20);
		t.add(root, 60);
		t.add(root, 10);
		t.add(root, 70);
		t.add(root, 30);
		t.add(root, 50);
		t.add(root, 5);
		t.add(root, 55);
		int arr[] =new int[10];
		t.printPath(root, arr, 0);
		
		
		
		
		
	}
}