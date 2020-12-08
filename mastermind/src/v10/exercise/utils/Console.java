package v10.exercise.utils;

import java.util.Scanner;

public class Console {

	private Scanner scanner;
	private static Console instance;
	
	public static Console getInstance() {
		if(instance == null){
			instance = new Console();
		}
		return instance;
	}
	
	public Console() {
		this.scanner = new Scanner(System.in);
	}
	
	public String readString(Message message) {
		System.out.print(message.getMessage());
		return this.scanner.nextLine();
	}

	public void write(Message message) {
		write(message.getMessage());
	}
	
	public void write(String message) {
		System.out.println(message);
	}
	
	public void write() {
		System.out.println();
	}
	
}
