/**
 * @Author: Carlos Galeano
 * @Date:   2024-07-02 15:47:21
 * @Last Modified by:   Carlos Galeano
 * @Last Modified time: 2024-07-02 15:48:10
 */
import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public abstract int makeGuess();
}
