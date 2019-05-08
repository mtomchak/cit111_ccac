/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week13;

/**
 *
 * @author michael.tomchak
 */
public class ScoreboardExtended {

    String homeTeamName;
    String awayTeamName;
    int scoreHome;
    int scoreAway;
    

    public String getWinner() {
        if (scoreHome > scoreAway) {
            return homeTeamName;
        } else if (scoreHome < scoreAway) {
            return awayTeamName;
        } else {
            return homeTeamName + " " + awayTeamName;
        } // close if
    } // close getWinner
} // close class
