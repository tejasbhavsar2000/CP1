import java.util.Scanner;

class Queue{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter queue size:");
		int size = s.nextInt();
		int[] queue = new int[size];
		int front=0, rear=-1;
		int i=0;
		do{
			System.out.println();
			System.out.println("Enter your choice");
			System.out.println("1: enqueue() \n2: dequeue() \n3: display()");
			System.out.println();
			i=s.nextInt();
			switch(i){
				case 1: if(rear==(size-1)){
							System.out.println("Queue is full");
						}
						else{
							System.out.println("enter element to be inserted");
							int element=s.nextInt();
							queue[++rear]=element;
						}
						break;	
				case 2: if(rear==-1){
							System.out.println("Queue is empty");
						}
						else{
							System.out.println("Element deleted is "+queue[front++]);
						}		
						break;	
				case 3: if(rear==-1){
							System.out.println("Queue is empty");
						}
						else{
							System.out.println("Queue elements are:");
							for(int j=front;j<=rear;j++)	
								System.out.print(queue[j]+" ");
							}
						break;			
			}			
		}while(i>0 && i<4);
	} 
}