import java.util.Scanner;

class Stack{
	public static void main(String []args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter stack size:");
		int size = s.nextInt();
		int[] stack = new int[size]; 
		int top=-1;
		int i=0, element=0;
		do{
			System.out.println();
			System.out.println("Enter your choice");
			System.out.println("1: push() \n2: pop() \n3: display()");
			System.out.println();
			i=s.nextInt();
			switch(i){
				case 1 : 	if(top==(size-1)){
								System.out.println("Stack overflow");
							}
							else{
								System.out.println("Enter element:");
								a=s.nextInt();
								stack[++top]=element;
							}
							break;
							
				case 2 :	if(top==-1){
								System.out.println("Stack underflow");
							}
							else{
								System.out.println("Element deleted is "+stack[top]);
								--top;
							}
							break;
							
				case 3 : 	if(top==-1){
								System.out.println("Stack underflow");
							}
							else{
								System.out.println("Stack elements are:");
								for(int j=0;j<=top;j++)
									System.out.print(stack[j]+" ");
								System.out.println();
							}
							break;
			}
			
		}while(i>0 && i<4);
	}
}