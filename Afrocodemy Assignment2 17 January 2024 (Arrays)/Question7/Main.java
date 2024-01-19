public class Main{
	public static void main(String[] args){
		int[] integers1 = {1,5,6,-9,8,2,4};
		int[] integers2 = {3,6,2,4};

		for(int i =0; i<integers1.length; i++){
			for(int x =0; x<integers2.length; x++){
				if(integers1[i]==integers2[x]){
					System.out.print(integers2[x]);
					}
				}
			}
			System.out.println();
		}
	}