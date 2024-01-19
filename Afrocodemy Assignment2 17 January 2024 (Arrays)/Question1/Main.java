public class Main{
	public static void main(String[] args){
		int[] integers = {10,56,3,78,2,2};
		int highest =0;
		int lowest = integers[0];
		for(int num : integers){
			if(num>highest){
				highest = num;
				}
			if(num<lowest){
				lowest = num;
				}
			}
			System.out.println("The largest Number is "+ highest);
			System.out.println("The smallest Number is "+ lowest);
		}
	}

