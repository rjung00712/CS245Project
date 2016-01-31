package games;

/**
 * Created by cary on 1/15/16.
 */
/***************************************************************
 * file: GameResults.java
 * author: Cary Anderson and Richard Jung
 * class: CS 245 – GUI Programming
 *
 * assignment: Quarter Project
 * date last modified: 01/29/2016
 *
 * purpose: Multi-purpose POJO to hold details about a game that was played
 *
 ****************************************************************/
public class GameResults {

    private boolean mDidFinish = false;
    private boolean mDidWin = false;
    private int mPoints = 0;
    private int mIncorrectGuesses = 0;

    public GameResults() {

    }
    //constructor
    public GameResults(boolean didWin, int points, int incorrectGuesses, boolean didFinish) {
        this.mDidWin = didWin;
        this.mPoints = points;
        this.mIncorrectGuesses = incorrectGuesses;
        this.mDidFinish = didFinish;
    }
    //sets the boolean status of if the game was won
    public void setDidWin(boolean didWin) {
        this.mDidWin = didWin;
    }
    //returns boolean value of if the game was won
    public boolean didWin() {
        return this.mDidWin;
    }
    //sets the points the player has in the game
    public void setPoints(int points) {
        this.mPoints = points;
    }
    //returns the amound of points the player has in the game
    public int getPoints() {
        return this.mPoints;
    }
    //sets the number of incorrect guesses
    public void setIncorrectGuesses(int guesses) {
        this.mIncorrectGuesses = guesses;
    }
    //returns the number of incorrect guesses
    public int getIncorrectGuesses() {
        return this.mIncorrectGuesses;
    }
    //checks if the game was finished
    public void setDidFinish(boolean didFinish) {
        this.mDidFinish = didFinish;
    }
    //returns boolean value of whether the game finished
    public boolean didFinish() {
        return this.mDidFinish;
    }
}
