import java.util.Random;

public class GuessTheNumberGame {
    private Random random;
    private int targetNumber;

    public GuessTheNumberGame() {
        this.random = new Random();
        this.targetNumber = random.nextInt(100) + 1;
    }

    public boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess > targetNumber) {
            System.out.println("Too high!");
            return false;
        } else if (guess < targetNumber) {
            System.out.println("Too low!");
            return false;
        } else {
            System.out.println(player.getName() + " guessed the number!");
            return true;
        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        Player humanPlayer = new HumanPlayer("Human");
        Player computerPlayer = new ComputerPlayer("Computer");

        boolean isUserTurn = true;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            if (isUserTurn) {
                guessedCorrectly = game.checkGuess(humanPlayer);
            } else {
                guessedCorrectly = game.checkGuess(computerPlayer);
            }
            isUserTurn = !isUserTurn;
        }
    }
}
