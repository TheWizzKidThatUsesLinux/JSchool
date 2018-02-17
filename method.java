import java.util.Scanner;
import java.util.Random;
class quiz13 {
	public static void student(){
		 String students[]={
		"tlandrym7m7m7",
		"wlandrym8m8m8",
		"hlandrym9m9m9"					
				};
		String Students[]={
		"tlandry",
		"wlandry",
		"hlandry"
			};

		System.out.println("+-----------------------------+");
		System.out.println("|Welcome to student login.    |");
		System.out.println("|Username:                    |");
		System.out.println("+-----------------------------+");
		Scanner reader = new Scanner(System.in);
		String user = reader.nextLine();
		clearScreen();
		System.out.println("+-----------------------------+");
		System.out.println("|Password:                    |");
		System.out.println("+-----------------------------+");
		Scanner reader2 = new Scanner(System.in);
		String pass = reader2.nextLine();
		clearScreen();
		int counter=0;
		while (counter < students.length) {
			if(students[counter].contains(user + pass)) {
				String you=Students[counter];
				System.out.println("+-------------------------------------------+");
				System.out.println("|     Hello, " + you);
				System.out.println("| (1) Quiz                                   ");
				System.out.println("| (2) Typing");
				System.out.println("| (3) Math");
				System.out.println("+-------------------------------------------+");
				Scanner reader3 = new Scanner(System.in);
				int choice = Integer.parseInt(reader3.nextLine());
				if (choice==1) {
					clearScreen();
					/*
					 *If you're looking at the code you may question the indenting
					 *its for it to display right.
					 *Thank you.
					 */
					System.out.println("+-------------------------------------------------+");
					System.out.println("| 			+--QUIZ--+                |");
					System.out.println("|		(1) Hardcore mode                 |");
					System.out.println("|               (2) Medium mode                   |");
					System.out.println("|		(3) Easy mode                     |");
					System.out.println("|		{4} Custom                        |");
					System.out.println("+-------------------------------------------------+");
					Scanner reader4 = new Scanner(System.in);
					int quizchoice = Integer.parseInt(reader4.nextLine());
					clearScreen();
					if (quizchoice==1) {
						System.out.println("@========================================@");
						System.out.println("|                                        |");
						System.out.println("+----------------------------------------+");
						System.out.println("| Hardcore-Hardcore-Hardcore-Hardcore-Har|");
						System.out.println("+----------------------------------------+");
						System.out.println("| If you arrived here, you are expecting |");
						System.out.println("| a challenge. So im gonna have a go at  |");
						System.out.println("| hardcoreness.                          |");
						System.out.println("| HERE WE GO!!                           |");
						System.out.println("| Press any key to continue.             |");
						System.out.println("@========================================@");
						Scanner reader5 = new Scanner(System.in);
						String pause = reader4.nextLine();
						clearScreen();
						System.out.println("@====================================@");
						System.out.println("| LETS TRY SOME FRACTIONS!!          |");
						System.out.println("| GOOD LUCK!                         |");
						System.out.println("| Press any key to continue.         |");
						System.out.println("@====================================@");
						Scanner reader9 = new Scanner(System.in);
						String pausee = reader9.nextLine();
						clearScreen();
						int running=1;
						int count=0;
					    while(running==1){
							count++;
							Random rn = new Random();
							float onenum = (float)rn.nextInt(1000) + 1;
							float twonum = (float)rn.nextInt(100) + 1;
							clearScreen();
							System.out.println("@====================================@");
							System.out.println("| Ok, so you wanted a challenge?     ");
							System.out.println("| Then try this                      ");
							System.out.println("| whats " + onenum + "/" + twonum + " is ___ in decimal form                           ");
							System.out.println("| If you get it right nothing will   ");
							System.out.println("| show up.");
							System.out.println("@====================================@");
							Scanner reader8 = new Scanner(System.in);
							float answerr = Float.parseFloat(reader8.nextLine());
							clearScreen();
							boolean ok = answerr==onenum/twonum;
							if (!ok){
								System.out.println("@============================@");
								System.out.println("| You got it incorrect.      |");
								System.out.println("| You will not succeed       |");
								System.out.println("@============================@");
								Scanner reader10 = new Scanner(System.in);
								String pauseee = reader10.nextLine();
								if (count==10) {
									running=0;
								}
								continue;
								}
							if (count==10) {
								running=0;
								}
							System.out.println("@============================@");
							System.out.println("|You got it right, maby you  |");
							System.out.println("|have a chance.              |");
							System.out.println("@============================@");
							}
						running=1;
						while(running==1){
							
							System.out.println("@============================@");
							System.out.println("");
							System.out.println("");
							System.out.println("");
							System.out.println("");
							}
						}
					}
			} 	
			counter++;
			System.out.println("Looping around again.");
	      };
	    System.out.println("ERROR, Try again.");
	    student();
		};
	public static void admin(){
		int admin=1;
		System.out.println("+-------------------------------------------+");
		System.out.println("|Welcome to admin login.                    |");
		System.out.println("|Please enter your administrator numpass.   |");
		System.out.println("|All login attempts are logged              |");
		System.out.println("+-------------------------------------------+");
		Scanner reader1 = new Scanner(System.in);
		int num1 = Integer.parseInt(reader1.nextLine()); 
		clearScreen();
		if (num1==54986297) {
			System.out.println("Welcome to administrator control");
			while (admin==1) {
				System.out.println("+-------------------------------+");
				System.out.println("|(1)View student data           |");
				System.out.println("|(2)Delete student              |");
				System.out.println("+-------------------------------+");
				Scanner reader = new Scanner(System.in);
				int num = Integer.parseInt(reader.nextLine()); 
				}
			}		
		else {
			System.out.println("Incorrect password.");
			admin();
				}
		      }
	public static void main(String[] args){
		System.out.println("+-------------------------------------------+");
		System.out.println("|Copyright (c) 2018 Tucker Kilpatrick Landry|");  
        System.out.println("|Verbatim copying and redistribution of     |");
        System.out.println("|this program is permitted provided this    |");
        System.out.println("|notice is preserved.                       |");
        System.out.println("|If you whish to see the source code then   |");
        System.out.println("|Email me at froakiemonDOS@gmail.com        |");
		System.out.println("|(1)Administrator login.                    |");
		System.out.println("|(2)Student login.                          |");
		System.out.println("+-------------------------------------------+");	
		Scanner reader = new Scanner(System.in);
		int num = Integer.parseInt(reader.nextLine()); 	
		clearScreen();
		if (num==2) {
			student();
			}
		if (num==1) {
			admin();
			}		
		}
	public static void clearScreen() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
	}  

}
