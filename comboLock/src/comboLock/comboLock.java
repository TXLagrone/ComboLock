package comboLock;

import java.util.Random;
import java.util.Scanner;

public class comboLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getNum = new Scanner(System.in);
		int forQuit = 0;
		int dials = 0;
		int combo = 0;
		int count = 0;
		
		while(true) {
			System.out.println("Create random locker combinations (0 to exit)");
			forQuit = getNum.nextInt();
			if(forQuit == 0) {
				System.out.println("Exited.");
				break;
			}
			
			dials = get_number_of_dials();
			combo = how_many_to_list();
		
			System.out.println("-------------------");
			
			//testing to make sure it grabs the dials & combination amount
			//System.out.println("You want " + dials + " dials and " + combo + " combinations?");
			for(int i = 1; i < combo + 1; i++) {
				
				System.out.println("Number " + i + ": " + next_combo_number(dials));
				count++;
			}
			
			System.out.println("-------------------");
			System.out.println(count + " random combinations were generated");
		}
		
		
	}
	
	static int get_number_of_dials() {
		Scanner getDialNum = new Scanner(System.in);
		
		int dial = 0;
		boolean dialTrue = false;
		while(dialTrue == false) {
			System.out.println("Each lock has how many dials?");
			dial = getDialNum.nextInt();
			if(dial < 3) {
				System.out.println("The lock must have 3 dials at least.");
			}
			else if (dial > 10) {
				System.out.println("The lock cannot have more than 10 dials.");
			}
			else {
				dialTrue = true;
			}
		}
		return dial;
	}
	
	static int how_many_to_list() {
		Scanner getComboNum = new Scanner(System.in);
		
		int combo = 0;
		
		System.out.println("How many combinations should be created?");
		combo = getComboNum.nextInt();
		
		return combo;
	}
	
	static int get_number(int min, int max) {
		Random rnd = new Random();
		int comboNum = 0;
		
		comboNum = rnd.nextInt(min, max+1);
		
		return comboNum;
	}
	
	static String next_combo_number(int dials) {
		String combination = "";
		for(int i = 0; i < dials; i++) {
			combination += get_number(0, 9) + " ";
		}		
		return combination;
	}
}

