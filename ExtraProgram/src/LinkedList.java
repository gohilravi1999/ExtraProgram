import java.util.Scanner;

class LinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
		data=d;
		next=null;
		}
	}
	
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node = new Node(data);
		new_node.next=null;
	
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last;
			last=list.head;
			while(last.next!=null)
			{
			last=last.next;
			}
			last.next=new_node;
		}
		return list;
	}
	
	public static void display(LinkedList list)
	{
	Node current;
	current=list.head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public static void search(LinkedList list,int data1)
	{
		Node start;
		start=list.head;
		int count=0;
		while(start!=null)
		{
			if(start.data==data1)
			{
				count=count+1;
			}
			start=start.next;	
		}
		if(count>0)
		{
			System.out.println();
			System.out.println(data1+" is Present");
			System.out.println("occurence of "+data1+" is "+count);
		}
		else
		{
			System.out.println();
			System.out.println(data1+" is not Present");
		}
		
	}
	
	public static void main (String []args)
	{
	LinkedList list =new LinkedList();

	while(1==1)
	{
		System.out.println();
		
		System.out.println("Enter 0 for Quit");
		System.out.println("Enter 1 for Insert");
		System.out.println("Enter 2 for Display");
		System.out.println("Enter 3 for Search");
		System.out.println("Enter Your choice:");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch(choice)
		{
		case 0:System.out.println("Quit..");
			System.exit(0);
			
		case 1:System.out.println("Enter Number");
		int number=scanner.nextInt();
		list = insert(list,number);
			break;
		case 2:display(list);
			break;
		case 3:
			System.out.println("Enter Number");
			int number1=scanner.nextInt();
			search(list,number1);
			break;
		}
	}
	
}

}
	
	