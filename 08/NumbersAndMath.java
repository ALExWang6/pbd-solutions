public class NumbersAndMath{

	public static void main( String[] args ){

		//Message to explain what the program will first do		
		System.out.println( "I will now count my chickens:" );

		//numbers of hens and roosters
		System.out.println( "Hens " + ( 25.0 + 30 / 6 ) );
		System.out.println( "Roosters " + ( 100 - 25.0 * 3 % 4 ) );
		
		//message for user
		System.out.println( "Now I will count the eggs:" );

		//egg counting
		System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6 );

		//comparison between two functions
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		//outputs boolean expression
		System.out.println( 3 + 2 < 5 - 7 );

		//outputs result of the two functions
		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );

		System.out.println( "Oh, that's why it's false." );

		//introducing to more operators
		System.out.println( "How about some more." );

		//compare operators
		System.out.println( "Is it greater? " + ( 5 > -2 ) );
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}
