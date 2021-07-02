package numbers;
import java.util.*;
public class ISPALINDROME {
static List<Integer> al=new ArrayList<Integer>();
static boolean palindrome(int n) {
	int temp=n,sum=0;
	while(n>0) {
		int r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
	if(sum==temp)
		return true;
	return false;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int sum=0;
	for(int i=n;i<=m;i++) {
		if(palindrome(i)) {
			al.add(i);
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
}
