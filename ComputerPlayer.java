import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    @Override
    public int makeGuess() {
        int guess = random.nextInt(100) + 1;
        System.out.println(name + " guesses: " + guess);
        guesses.add(guess);
        return guess;
    }
}
