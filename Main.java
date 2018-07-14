import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	int persons,budget,hotels,weeks;
	int [][] priceWeeks = new int [18][13];
	Scanner sc = new Scanner(System.in);
	persons = sc.nextInt();
	while(persons!=0) {
		budget = sc.nextInt();
		hotels = sc.nextInt();
		weeks = sc.nextInt();
		int[] target=new int[2];
		target[0] = budget;
		for(int i=0; i<hotels; i++) {
			priceWeeks[i][0]=sc.nextInt();
			int finalPrice = priceWeeks[i][0]*persons;
			for(int j=0; j<weeks; j++) {
				priceWeeks[i][j]=sc.nextInt();
				if (finalPrice<=target[0]&&priceWeeks[i][j]>=persons) {
					target[1] = finalPrice;
				}
			}
		}
		if(target[1]!=0&&target[1]<=budget) {
			System.out.println(target[1]);
		}else {
			System.out.println("stay home.");
		}
		persons=sc.nextInt();
	}

}
}
