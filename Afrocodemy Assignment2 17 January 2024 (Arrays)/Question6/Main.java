public class Main{
public static void main(String[] args){
	int[] integers = {3,4,5,2,6,8,0};
	int sum=0;
	int specifiedNum = 8;
	for(int i =0; i < integers.length; i++ ){
		for(int x = i+1; x<integers.length; x++){
			if(integers[x]+integers[i]==specifiedNum){
				System.out.print("{"+integers[x]+","+integers[i]+"}");
				}
			}
		}
}
}

