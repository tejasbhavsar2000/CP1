import java.util.Scanner;

class CircularQueue{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of circular-queue");
		int size=s.nextInt();
		int[] cir_queue = new int[size];
		int front=-1, rear=-1;
		int i=0;
		
		do{
			System.out.println();
			System.out.println("Enter your choice");
			System.out.println("1: enqueue() \n2: dequeue() \n3: display()");
			System.out.println();
			i=s.nextInt();
			switch(i){
				case 1: if(front==(rear+1) || (rear==(size-1) && front==0)){
							System.out.println("Circular Queue is full");
						}
						else{
							System.out.println("Enter element");
							int element=s.nextInt();
							if(front==-1){
								front=0;		//If queue is empty
								rear=0;				
							}
							else{
								if(rear==size-1)
									rear=0;
								else
									++rear;
							}
							cir_queue[rear]=element;
						}
						break;	
				case 2: if(front==-1){
							System.out.println("Circular Queue is empty");
						}
						System.out.println("value of front is"+front);
						System.out.println("Element deleted is "+cir_queue[front]);
						if(front==rear){		//only one element
							front=-1;
							rear=-1;
						}
						else{
							if(front==size-1)
								front=0;
							else 
								front++;
							}		
						break;	
				case 3: if(front==-1){
							System.out.println("Circular Queue is empty");
						}
						else{
							int front_pos=front, rear_pos=rear;
							System.out.println("Circular Queue elements are:");
								if(front_pos<=rear_pos){
									while(front_pos<=rear_pos){
										System.out.print(cir_queue[front_pos++]+" ");
									}
								}
								else{
									while(front_pos<size){
										System.out.print(cir_queue[front_pos++]+" ");
									}
									front_pos=0;
									while(front_pos<=rear_pos){
										System.out.print(cir_queue[front_pos++]+" ");
									}
								}
							}
						break;			
			}			
			
		}while(i>0 && i<4);
	}
}