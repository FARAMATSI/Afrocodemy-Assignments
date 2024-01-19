public class Main{
	public static void main(String[] args){
		int[] integers = {1,2,3,3,2,1};
		int maxIndex = integers.length-1;
		boolean pairsEqual = false;
		for(int i =0; i<integers.length; i++){
			if(integers[i] == integers[maxIndex-i]){
			pairsEqual = true;
		}
			else{
				pairsEqual = false;
				}
		}
		if(pairsEqual == true){
					System.out.println("The array reads the same in all directions");
					}
					else{
					System.out.println("The array does not read the same in all directions");
						}

			}
		}