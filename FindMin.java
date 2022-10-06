package forLoop;

public class FindMin {
	public static void main(String[]args) {
		int[] a= {10,20,30,50,70};
		int min= a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(min>a[i]){
				min=a[i];
			}
		}
			System.out.println(min);
				
			
		}
	}


