// (Game: scissor, rock, paper)
//  Write a program that plays the popular 
//  scissor-rock- paper game. 
//  (A scissor can cut a paper, a rock can knock a scissor, 
//  and a paper can wrap a rock.) 
//  The program randomly generates a number 
//  0, 1, or 2 representing scissor, rock, and paper. 
//  The program prompts the user to enter a number 
//  0, 1, or 2 and displays a message indicating 
//  whether the user or the computer wins, loses, or draws. 
 
public class GamePickACard {
 
	public static final String ROCK = "R";
	public static final String PAPER = "P";
	public static final String SCISSORS = "S";
 
	public static void getResult(String usersMove, String computersMove) {
	
        System.out.println("Computer's move is: " + computersMove);
 
        if (usersMove.equals(computersMove))
	        System.out.println("It's a tie!");
        else if (usersMove.equals(ROCK)) 
        {
	        if (computersMove.equals(SCISSORS))
		        System.out.println("You win!! Rock crushes scissors.");
	        else if (computersMove.equals(PAPER))
		        System.out.println("You lose!! Paper eats rock.");
        } 
        else if (usersMove.equals(PAPER)) 
        {
            if (computersMove.equals(ROCK))
		        System.out.println("You win!! Paper eats rock.");
	        else if (computersMove.equals(SCISSORS))
		        System.out.println("You lose!! Scissor cuts paper.");
        } 
        else if (usersMove.equals(SCISSORS)) 
        {
	        if (computersMove.equals(PAPER))
		        System.out.println("You win!! Scissor cuts paper.");
	        else if (computersMove.equals(ROCK))
		        System.out.println("You lose!! Rock breaks scissors.");
        } 
        else
    	    System.out.println("Invalid user input.");
    }
	/**
	 * Get Computer's move
	 * */
public static String getComputersMove(){
		int computersNum;
		String computersMove="";
		Random random = new Random();
		computersNum = random.nextInt(3) + 1;
		if (computersNum == 1)
			computersMove = ROCK;
		else if (computersNum == 2)
			computersMove = PAPER;
		else if (computersNum == 3)
			computersMove = SCISSORS;
		
		return computersMove;
	}
	/**
	 * Get User's move
	 * */
	
	public static String getUsersMove(){
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter your play: ");
		String input = scanner.next().toUpperCase();
        return input;
    }
	
    /**
     * Main method
     * */	
	public static void main(String[] args) {
		System.out.println( "Rock, Paper, Scissors!\n"
				+ "Please enter a move.\n" 
				+"Rock = R, Paper= P, and Scissors = S.\n");
	
		String userInput = getUsersMove(); 
		if (userInput.equals(PAPER) || userInput.equals(ROCK) || userInput.equals(SCISSORS)) 
			getResult(userInput, getComputersMove());
		else 
			System.out.println("Invalid Input " + userInput);
	}
}