public class Main{
	public static void main(String[] args){
		int[] integers = {1,2,3,4,5,6,7,8,9,10};
		int half = (integers.length-1)/2;

		int[] newArray1 = new int[5];
		int[] newArray2 = new int[5];

		int secondArrayIterator=0;

		for(int i =0; i<integers.length; i++){
			if(i<=4){
				newArray1[i] = integers[i];
				}
				  if(i>half){
				newArray2[secondArrayIterator++] = integers[i];
					}
			}

			System.out.println("Initial Array : ");
			for(int i : integers){
					System.out.print("  "+i);
				}
				System.out.println();
				System.out.println("After Splitting :");
				for(int i : newArray1){
					System.out.print("  "+i);
				}
				System.out.println();

				for(int i : newArray2){
					System.out.print("  "+i);
				}
				System.out.println();
		}
	}