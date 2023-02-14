import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
		String movieName, rating, answer;
		int tickets;
		Scanner input = new Scanner (System.in);
		do {
			System.out.println("Enter the name of the movie");
			movieName = input.nextLine();
			movie.setTitle(movieName);
			
			System.out.println("Enter the rating of the movie");
			rating = input.nextLine();
			
			
			System.out.println("Enter the number of tickets sold for this movie");
			tickets = input.nextInt();
			movie.setSoldTickets(tickets);
			System.out.println(movie.toString());
			
			System.out.println("Do you want to another? (y or n)");
			answer = input.next();
			input.nextLine();
		} while (answer.equalsIgnoreCase("y"));
			
		System.out.println("Goodbye");
		

	}

}
