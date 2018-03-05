import java.util.Scanner;
import java.util.Random;
class quiz18 {
	public static void student(){
		 clearScreen();
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
				while (true) {
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
							
							//Hardcore mode
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
							exponet(100, 50);
							fractions(1000, 2000);
							minus(1000, 2000);
							System.out.println("@========================================@");
							System.out.println("| Skillfull person...                    |");
							System.out.println("@========================================@");
							break;
								}
						if (quizchoice==2) {
						
							clearScreen();
							System.out.println("@=============================@");
							System.out.println("| Well, you seem to wanna     |");
							System.out.println("| get somewhat of a challenge.|");
							System.out.println("| If your name happens to be  |");
							System.out.println("| Van dessup-dasher then you  |");
							System.out.println("| Belong in the hardcore mode.|");
							System.out.println("@=============================@");
							Scanner reader13 = new Scanner(System.in);
							int pause = Integer.parseInt(reader13.nextLine());
							clearScreen();
							System.out.println("@=============================@");
							System.out.println("| Its time!                   |");
							System.out.println("| Some......................  |");
							System.out.println("| ok,my brain hurts... what do|");
							System.out.println("| You Want?                   |");
							System.out.println("|(1)Fractions                 |");
							System.out.println("|(2)Subscration, oh please.   |");
							System.out.println("| I don't know how to spell.  |");
							System.out.println("@=============================@");
							Scanner reader14 = new Scanner(System.in);
							int input = Integer.parseInt(reader14.nextLine());
							if (input==1){
								fractions(10, 10);
								}
							if (input==2){
								minus(100, 200);
								}
							if (input==3){
								exponet(100, 200);
								}
							break;
							}
						if (quizchoice==3) {
							System.out.println("@==========================+@");
							System.out.println("| ok... you want it easy..  |");
							System.out.println("| I might actully try this. |");
							System.out.println("| Press any key to continue.|");
							System.out.println("@===========================@");
							Scanner reader15 = new Scanner(System.in);
							int pauseeee = Integer.parseInt(reader15.nextLine());
							clearScreen();
							minus(10, 5);
							fractions(10, 5);
							exponet(5,5);
							System.out.println("@===========================@");
							System.out.println("| Good Job!!! you did it..  |");
							System.out.println("| but... you still know more|");
							System.out.println("| Then me...                |");
							System.out.println("@===========================@");
							pause();
							}
						if (quizchoice==4) {
							System.out.println("@=============================@");
							System.out.println("| Ok, you want some fancyness.|");
							System.out.println("| Type '1' for subtraction.   |");
							System.out.println("| Type '2' for fractions.     |");
							System.out.println("| Type '3' for exponets.      |");
							System.out.println("@=============================@");
							Scanner reader16 = new Scanner(System.in);
							int inputt = Integer.parseInt(reader16.nextLine());
							int num = inputt;
							clearScreen();
							System.out.println("@====================================@");
							System.out.println("| Ok...so enter the 1st number max.  |");
							System.out.println("| I't can't be lower than 1.         |");
							System.out.println("| If you do... well it gets glitchy. |");
							System.out.println("@====================================@");
							Scanner reader17 = new Scanner(System.in);
							int max1 = Integer.parseInt(reader17.nextLine());
							clearScreen();
							System.out.println("@====================================@");
							System.out.println("| Ok...so enter the 2nd number max.  |");
							System.out.println("| I't can't be lower than 1.         |");
							System.out.println("| If you do... well it gets glitchy. |");
							System.out.println("@====================================@");
							Scanner reader18 = new Scanner(System.in);
							int max2 = Integer.parseInt(reader18.nextLine());
							clearScreen();
							if (num==1){
								minus(max1, max2);
							} else if(num==2){
								fractions(max1, max2);	
							}else if(num==3) {
								exponet(max1, max2);
								}else{
								System.out.println("Inavlid");
									}
							System.out.println("@=====================================@");
							System.out.println("| Good job!  you actully did it.      |");
							System.out.println("@=====================================@");
							pause();
							clearScreen();
							}
						}
				}
		counter++;
		System.out.println("Looping around again.");
        }
			counter++;
			System.out.println("ERROR, Try again.");
			}
		}
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
		System.out.println("+---------------------------------------------------+");
		System.out.println("|Copyright (c) 2018 Tucker Landry                   |");  
        	System.out.println("|Verbatim copying and redistribution of             |");
        	System.out.println("|this program is permitted provided this            |");
        	System.out.println("|notice is preserved.                               |");
        	System.out.println("|If you whish to see the source code then visit     |");
        	System.out.println("|https://github.com/TheWizzKidThatUsesLinux/jmail/  |");
		System.out.println("|(1)Administrator login.                            |");
		System.out.println("|(2)Student login.                                  |");
		System.out.println("+---------------------------------------------------+");	
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
	public static void fractions(int max1, int max2) {
		int score=0;
		clearScreen();
		System.out.println("@====================================@");
		System.out.println("| LETS TRY SOME FRACTIONS!!          |");
		System.out.println("| GOOD LUCK!                         |");
		System.out.println("| Press any key to continue.         |");
		System.out.println("@====================================@");
		pause();
		clearScreen();
		int running=1;
		int count=0;
	    while(running==1){
			count++;
			Random rn = new Random();
			float onenum = (float)rn.nextInt(max1) + 1;
			float twonum = (float)rn.nextInt(max2) + 1;
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
				score++;
			}
			System.out.println("@========================@");
			System.out.println("| You got through?       |");
			System.out.println("| Good job. I'm the dev, |");
			System.out.println("| and I haven't even had |");
			System.out.println("| the time on my hands to|");
			System.out.println("| do it. You got " + score + "/20");
			System.out.println("@========================@");
			clearScreen();
		}
	public static void minus(int max1, int max2){
		int score = 0;
		clearScreen();
		System.out.println("@==========================@");
		System.out.println("| Welcome to subcration... |");
		System.out.println("| Please don't sue me if i |");
		System.out.println("| spell that right.        |");
		System.out.println("| press any key to continue|");
		System.out.println("@==========================@");
		int count = 0;
		int running=1;
		pause();
		while(running==1){
			Random rn = new Random();
			float onenum = (float)rn.nextInt(max1) + 1;
			float twonum = (float)rn.nextInt(max2) + 1;
			System.out.println("@========================@");
			System.out.println("| Okay so i have to give |");
			System.out.println("| you a question... umm  |");
			System.out.println("| will " + onenum + " - " + twonum + "Work? |");
			System.out.println("@========================@");
			Scanner answer = new Scanner(System.in);
			float answerr = Float.parseFloat(answer.nextLine());
			clearScreen();
			if (answerr==onenum-twonum) {
				System.out.println("@==========================@");
				System.out.println("| You got the answer right!|");
				System.out.println("| You are way smarter than |");
				System.out.println("| Me... i suck at math...  |");
				System.out.println("@==========================@");
				score++;
				} else {
				System.out.println("@==========================@");
				System.out.println("| You didn't do it...      |");
				System.out.println("| But! you're way better   |");
				System.out.println("| then me...  :P           |");
				System.out.println("@==========================@");
				}
			clearScreen();
			count++;
			if (count==10){
				running=0;
				}
			}
		System.out.println("@=====================@");
		System.out.println("| You passed! with    |");
		System.out.println("| a score of " + score + "/10 |");
		System.out.println("@=====================@");
		clearScreen();
		}
	public static void exponet(int max1, int max2){
		int score = 0;
		clearScreen();
		System.out.println("@===========================@");
		System.out.println("| Welcome to exponets...    |");
		System.out.println("| Please don't sue me if i  |");
		System.out.println("| spell that right.         |");
		System.out.println("| also i have to be above 15|");
		System.out.println("| to get sued. legal        |");
		System.out.println("| Knowledge helps...        |");
		System.out.println("| press any key to continue |");
		System.out.println("@===========================@");
		pause();
		clearScreen();
		int running=1;
		int counter=0;
		while(running==1){
			Random rn = new Random();
			float onenum = (float)rn.nextInt(max1) + 1;
			float twonum = (float)rn.nextInt(max2) + 1;
			System.out.println("@========================@");
			System.out.println("| Okay so i have to give |");
			System.out.println("| you a question... umm  |");
			System.out.println("| will " + onenum + " ^ " + twonum + "Work? |");
			System.out.println("@========================@");
			Scanner answer = new Scanner(System.in);
			float answerr = Float.parseFloat(answer.nextLine());
			clearScreen();
			if (answerr==Math.pow(onenum, twonum)){
				System.out.println("@==========================@");
				System.out.println("| You got the answer right!|");
				System.out.println("| You are way smarter than |");
				System.out.println("| Me... i suck at math...  |");
				System.out.println("@==========================@");
				score++;
				} else {
				System.out.println("@==========================@");
				System.out.println("| You didn't do it...      |");
				System.out.println("| But! you're way better   |");
				System.out.println("| then me...  :P           |");
				System.out.println("@==========================@");
				}
			clearScreen();
			counter++;
			if (counter==10){
				break; 
				}
			}
		System.out.println("@=====================@");
		System.out.println("| You passed! with    |");
		System.out.println("| a score of " + score + "/10 |");
		System.out.println("@=====================@");
		clearScreen();
		}
	public static void pause(){
		 Scanner reader21 = new Scanner(System.in);
		 String pause1 = reader21.nextLine();
		}
}
