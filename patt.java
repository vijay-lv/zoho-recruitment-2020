package demo;

public class patt {
public static void main(String[] args) {
	

	int temp=0;
	int n=5;
	
	for(int i=n;i>=1;i--) {
		
		for(int j=n;j>=i;j--) {
			
			System.out.print(j+" ");
			temp=j;
		}
		for (int k = n - i+1; k < n; k++)
        {
            System.out.print(temp + " ");
        }
        System.out.println();
	}
}
}

