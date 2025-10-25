package rj;

public class pass {

	public pass(int a[]) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			a[i]=i*5;
		}
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}

	}
	public static void main(String[] args) {
		int n[] = new int[5];   // create an array of size 5
        new pass(n); 
		
	}

}
