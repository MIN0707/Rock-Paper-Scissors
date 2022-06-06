import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		System.out.println("Choice rock, paper or scissors");
		System.out.println("Choice :");
		choice();
	}
	
	public static void choice() {
		String value;
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		value = sc.next();
		Integer bot = random.nextInt(2);
		// 0-ROCK, 1-PAPER, 2-SCISSORS
		if (Objects.equals(value, "rock")) {
			result("rock", bot);
		} else if (Objects.equals(value, "paper")) {
			result("paper", bot);
		} else if (Objects.equals(value, "scissors")) {
			result("scissors", bot);
		} else {
			System.out.println("Choose from the options");
			start();
		}
	}
	
	public static void result(String player_result, Integer bot_result) {
		if (Objects.equals(player_result, "rock")) {
			if (bot_result == 0) {
				System.out.println("Bot - Rock");
				System.out.println("Draw");
			} else if (bot_result == 1) {
				System.out.println("Bot - Paper");
				System.out.println("Lose");
			} else if (bot_result == 2) {
				System.out.println("Bot - Scissors");
				System.out.println("Win");
			}
		} else if (Objects.equals(player_result, "paper")) {
			if (bot_result == 0) {
				System.out.println("Bot - Rock");
				System.out.println("Win");
			} else if (bot_result == 1) {
				System.out.println("Bot - Paper");
				System.out.println("Draw");
			} else if (bot_result == 2) {
				System.out.println("Bot - Scissors");
				System.out.println("Lose");
			}
		} else if (Objects.equals(player_result, "scissors")) {
			if (bot_result == 0) {
				System.out.println("Bot - Rock");
				System.out.println("Lose");
			} else if (bot_result == 1) {
				System.out.println("Bot - Paper");
				System.out.println("Win");
			} else if (bot_result == 2) {
				System.out.println("Bot - Scissors");
				System.out.println("Draw");
			}
		}
	}
}
