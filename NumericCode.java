import java.util.Scanner;
class NumericCode{
	public static void main(String args[]){
		int i, j, X, P, M, lr, l, guess, XXX = 234, temp = 0, temp2 = 0, flag = 0;
		String out = "";
		Scanner sc = new Scanner(System.in);
		while(true){
			temp = XXX;
			guess = sc.nextInt();
			for(i = 0; i < 3; i++){
				lr = temp%10;
				temp2 = guess;
				for(j = 0; j < 3; j++){
						l = temp2%10;
					if(l==lr && i==j)
						flag = 0;
					else if(l==lr)
						flag = 1;
					else flag = 2;
					temp2 = temp2/10;
				}
						if(flag == 0)
							out = "M" + out;
						else if(flag == 1)
							out = "P" + out;
						else out = "X" + out;
				temp = temp/10;
			}	
				System.out.println(out);
				if(out.equals("MMM"))
					break;
		}
}
}	