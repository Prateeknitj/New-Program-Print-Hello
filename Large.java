import java.io.*;
class LargeNumber{
	DataInputStream dis = new DataInputStream(System.in);
	public static void main(String args[]){
		System.out.println("Enter the no.'s");
		int num1=Integer.parseInt(dis.readLine());
		int num2=Integer.parseInt(dis.readLine());
		if(num1>num2){
			System.out.println("The larger no. is :" +num1);
		}
		else if(num2>num1){
			System.out.println("The larger no. is :"+num2);
		}
		else{
			System.out.println("Both the no.'s are equal");
		}
	}
}