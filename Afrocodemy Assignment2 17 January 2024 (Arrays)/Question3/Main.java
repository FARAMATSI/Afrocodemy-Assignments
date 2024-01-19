public class Main{
	public static void main(String[] args){
			int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
			int maxIndex = firstArray.length-1;
			int[] secondArray = new int[10];

			for(int i = maxIndex,secondArrayIterator=0; i>=0; i--){
				secondArray[secondArrayIterator++] = firstArray[i];
				}


			for(int i : firstArray){
				System.out.print(" "+i);
				}
				System.out.println("\n");
			for(int i : secondArray){
							System.out.print(" "+i);
				}
				System.out.println("\n");


		}
	}