package array;

public class stack {

	int arr[] = new int[4];
	int top = -1;

	void push(int data) {
		if (top == arr.length - 1) {
			System.out.println("full");
		} else
			arr[++top] = data;
	}

	void pop() {
		if (top == -1) {
			System.out.println("empty");
		} else
			System.out.println(arr[top--]);
	}

	void display() {
		if (top == -1) {
			System.out.println("empty");
		}
		else
			for(int i=0;i<=top;i++)
			{
				System.out.println(arr[i]);
			}
	}
	
	void increase(int size)
	{
		int a[] = new int[arr.length+size];
		
		for(int i=0;i<=top;i++)
		{
			a[i]= arr[i];
		}
		arr = a;
	}
	
	void peek()
	{
		System.out.println(arr[top]);
	}

	
	public static void main(String args[])
	{
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.display();
		s.pop();
		s.pop();s.pop();
		
	}
}
