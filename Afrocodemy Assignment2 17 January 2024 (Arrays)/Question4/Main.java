public class Main{
	public static void main(String[] args){
			int[] integers = {1,2,3,4,5,6,7,8,9,10};
			int sum = 0;
			int product = 1;

			for(int i =0; i< integers.length; i++){
				sum += integers[i];
				product *= integers[i];
				}
				System.out.println("The sum of all the elements is "+sum);
				System.out.println("The product of all the elements is "+product);
		}
	}