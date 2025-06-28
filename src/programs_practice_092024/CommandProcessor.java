package programs_practice_092024;

import java.util.Scanner;

public class CommandProcessor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String command;

		while (true) {
			System.out.println("Enter command (start, skip, stop): ");
			command = scanner.nextLine();

			switch (command) {
			case "start":
				System.out.println("Processing started...");
				break; // Exit the switch and continue with the loop
			case "skip":
				System.out.println("Skipping this command...");
				continue; // Skip the rest of the loop and go to the next iteration
			case "stop":
				System.out.println("Stopping the process...");
				break; // Exit the switch, but continue the loop for more commands
			case "exit":
				System.out.println("Exiting the loop.");
				break; // Exit switch, but we need to break the loop
			default:
				System.out.println("Unknown command. Try again.");
				continue; // Prompt for a valid command again
			}

			if (command.equals("exit")) {
				break; // Exit the while loop entirely when 'exit' is entered
			}
		}
		scanner.close();
	}
}
