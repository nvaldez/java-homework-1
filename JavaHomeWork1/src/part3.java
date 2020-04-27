public class part3 {

	public static void main(String[] args) {
		
		boolean loanApproved = true;
		boolean taxesCompleted = true;
		int creditScore = 740;
		int income = 50000;
		
		if(loanApproved) {
			if (taxesCompleted) {
				if(creditScore > 700) {
					if(income > 40000) {
						System.out.println("You qualify to buy house");
					}
				}
			}
		}
		
		
		
		

	}

}
