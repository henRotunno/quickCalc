package stocking;
import java.util.Scanner;
import java.text.DecimalFormat;
public class StockAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		DecimalFormat dt = new DecimalFormat("0.00");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter buying price per share: ");
		double cost = scanner.nextDouble();
				
		double closePrice;
		int days = 1;
		while(true) {
			System.out.println("Enter the closing price for "
							+ "day " + days + ':');
			// handle request
			closePrice = scanner.nextDouble();
			if(closePrice < 0.0) {
				break;
				}
					
			// profit = market close price - buy price
			double earnings = closePrice - cost;
			// if positive
			if (earnings > 0.0) {
				System.out.println("After day " + days + ", you earned "
						+ dt.format(earnings) + " per share");
					// earning negative
			} else if (earnings < 0.0) {
				System.out.println("After day " + days + ", you lost "
								+ dt.format(-earnings) + " per share");
				} else {
					System.out.println("After day " + days + ", you are even"); 
					}
			days += 1;
				} 
						
			scanner.close();
	}

}
