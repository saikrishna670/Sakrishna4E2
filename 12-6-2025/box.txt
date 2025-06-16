public class Main
{
	public static void main(String[] args) {
	    int n= 5;
	    int a=0,b=1;
	    for(int i=0;i<n;i++){
	       
	        int next=a+b;
	        a=b;
	        b=next;
	    }
		System.out.println(b);
	}
}
