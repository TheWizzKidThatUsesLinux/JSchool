import java.util.Scanner;
import java.util.Random;

class quiz19 {	
	public static void student(){
		 int[] typemin = {
			1,
			10,
			20
		 };
		 clearScreen();
		 String students[]={
		"dev",
		"tlandry",
		"wlandry",
		"hlandry",
		"jlandry"					
				};
		String Students[]={
		"Developer",
		"Tucker Landry",
		"Willow Landry",
		"Hazel Landry",
		"Jeff Landry"
			};
		String passwords[]={
		"dev",
		"tl",
		"wl",
		"hl",
		"jl"
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
			if(user.equals(students[counter]) && pass.equals(passwords[counter])) {
				while (true) {
					String you=Students[counter];
					System.out.println("+-------------------------------------------+");
					System.out.println("|     Hello, " + you+ ".");
					System.out.println("| (1) Quiz.                                   ");
					System.out.println("| (2) Typing.");
					System.out.println("| (3) Math (Not working yet).");
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
							add(1000000, 1000000);
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
							System.out.println("|(3)Exponets                  |");
							System.out.println("|(4)Addition                  |");
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
							if (input==4){
								add(100, 200);
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
							add(9,9);
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
							System.out.println("| Type '4' for addition.      |");
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
					if (choice==2) {
						clearScreen();
						System.out.println("@========================================@");
						System.out.println("| Welcome to Typing program... good luck!|");
						System.out.println("| (1) Hardcore mode.                     |");
						System.out.println("| (2) Meduim mode.                       |");
						System.out.println("| (3) Easy.                              |");
						System.out.println("| (4) Custom                             |");
						System.out.println("@========================================@"); 
						Scanner answerrrrrrr = new Scanner(System.in);
						String input1=answerrrrrrr.nextLine();	
						System.out.println(input1);
						if(input1.equals("2")){
							clearScreen();
							System.out.println("@===========================@");
							System.out.println("| Meduim Mode!              |");
							System.out.println("| Good Luck!                |");
							System.out.println("@===========================@");
							pause();
							typecore(100);
								}
						if (input1.equals("2")){
							clearScreen();
							System.out.println("@=======================================@");
							System.out.println("| Ok... so you wanna go harcdcore.      |");
							System.out.println("| I will have to also go hardcore to    |");
							System.out.println("| Program it!                           |");
							System.out.println("@=======================================@");
							pause();												
							System.out.println("@===========================@");
							System.out.println("| Welcome to the typecore   |");
							System.out.println("| Thing...                  |");
							System.out.println("| Get it? Hardcore and Type?|");
							System.out.println("| HAHAHAHAHAHAHAHAAHAHAHAHA!|");
							System.out.println("@===========================@");
							pause();
							typecore(1000);
							}
						if (input1.equals("3")){
							clearScreen();
							System.out.println("@=========================================@");
							System.out.println("| Ok... so you wanna go easy.             |");
							System.out.println("| Finally someone wants to give my        |");
							System.out.println("| computer a break... I can't compile     |");
							System.out.println("| all the time.. I could'nt run minecraft!|");
							System.out.println("@=========================================@");
							pause();
							typecore(20);
							}
						if (input1.equals("4")){
							System.out.println("@=========================================@");
							System.out.println("| OoooOOooohh... Customizing your work?   |");
							System.out.println("| Fancy!!!                                |");
							System.out.println("| Okay... what is the number of           |");
							System.out.println("| Charecters you want?                    |");
							System.out.println("@=========================================@");
							int maximum = Integer.parseInt(prompt());
							clearScreen();
							typecore(maximum);
							
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
			System.out.println("Welcome to administrator control(Not working ATM)");
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
	public static void add(int max1, int max2) {
		int score = 0;
		clearScreen();
		System.out.println("@===========================@");
		System.out.println("| Welcome to Adittion...... |");
		System.out.println("| Oh please, I don't have a |");
		System.out.println("| spellchecker.             |");
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
			System.out.println("| will " + onenum + " + " + twonum + "Work? |");
			System.out.println("@========================@");
			Scanner answer = new Scanner(System.in);
			float answerr = Float.parseFloat(answer.nextLine());
			clearScreen();
			if (answerr==onenum + twonum){
				System.out.println("@==========================@");
				System.out.println("| You got the answer right!|");
				System.out.println("| You are way smarter than |");
				System.out.println("| Me... i suck at math...  |");
				System.out.println("@==========================@");
				score++;
				}else {
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
	public static String prompt(){
		Scanner answerrrrrr = new Scanner(System.in);
		return answerrrrrr.nextLine();
		}
	public static String numToAbc(int num){
		String[] alphabet={
			"a",
			"b",
			"c",
			"d",
			"e",
			"f",
			"g",
			"h",
			"i",
			"j",
			"k",
			"l",
			"o",
			"m",
			"n",
			"p",
			"q",
			"r",
			"s",
			"t",
			"u",
			"v",
			"w",
			"x",
			"y",
			"z",
			"A",
			"B",
			"C",
			"D",
			"E",
			"F",
			"G",
			"H",
			"I",
			"J",
			"K",
			"L",
			"O",
			"M",
			"N",
			"P",
			"Q",
			"R",
			"S",
			"T",
			"U",
			"V",
			"W",
			"X",
			"Y",
			"Z",
			"1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"0",
			"!",
			"@",
			"#",
			"$",
			"%",
			"^",
			"&",
			"*",
			"(",
			")",
			"-",
			"_",
			".",
		};
		return alphabet[num];
		} 
	public static int random(int min, int max) {
			Random rn = new Random();
			int onenum = rn.nextInt(max) + 1;
			return onenum;
		}
	public static void typecore(int letters){
		clearScreen();
		//You may question the huge Array.
		//That allows the while loop at line 619 to operate.
		//Whithout it, it crashes.
		System.out.println("Type This!");
		String[] words = {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
		clearScreen();
		boolean w=true;
		int counter1=0;
		String total = "";
		while(w){
			words[counter1]=numToAbc(random(0, 73));
			counter1++;
			if (counter1==1000){
				break;
				}
			}
		counter1=0;
		while(w){
			System.out.print(words[counter1]);
			total = total+words[counter1];
			counter1++;
			if (counter1==letters){
				break;
				}
			}
		System.out.println("");
		System.out.println("@=======================@");
		System.out.println("| Start Typing!         |");
		System.out.println("@=======================@");
		String typed = prompt();
		if (typed.equals(total)){
			System.out.println("@======================@");
			System.out.println("| WHAHOW!!!            |");
			System.out.println("@======================@");
			}else{
			System.out.println("@======================@");
			System.out.println("| You failed.          ");
			System.out.println("| you Typed " + typed);
			System.out.println("| You needed to type " + total);
			System.out.println("@======================@");	
				}
		pause();
		}
}	
