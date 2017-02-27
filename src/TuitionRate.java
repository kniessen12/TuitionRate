import java.util.Scanner;

public class TuitionRate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tuition:");
		int tuition = input.nextInt();
		
		System.out.println("Percentage increase:");
		float percentage = input.nextFloat();
		
		for (int i = 0; i< 4; i++){
			
			float fouryear = (float) (tuition* Math.pow(percentage,4));
			double total = fouryear + (fouryear*percentage) + (fouryear*percentage*percentage)+(fouryear*percentage*percentage*percentage);
			double totaltuition = Math.floor(total*100)/100;
			System.out.println(totaltuition);
		}
		
	}

}
