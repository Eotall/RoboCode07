package grupp07;

import java.util.ArrayList;

import robocode.Robot;

public interface Specification {

	/* Returnerar en lista med alla Robotar på planen */
	ArrayList<Robot> findBots();

	/* Returnerar en Arraylist med alla motståndare */
	ArrayList<Robot> findOpponents(ArrayList<Robot> allBots);

	/* Returnerar en lista med alla lagmedlemmar */
	ArrayList<Robot> findTeammates(ArrayList<Robot> allBots);

	/*
	 * Kontrollerar om laget ska gå in i defensivt läge, exempelvis om energin blir
	 * för låg
	 */
	boolean shouldEnterDefensive();

	/* Returnerar ledaren i det andra laget */
	Robot findLeader(ArrayList<Robot> allEnemies);

	/* Säger åt laget att attackera en motståndare */
	void orderTeamToAttack(Robot opponent);

	/*
	 * Skickar ett sista kommando till alla lagmedlemmar om ledaren håller på att dö
	 */
	void finalWords();

	/* Säger åt laget att gå in i en defensiv position */
	void enterDefensiveposition();

	/* Säger åt teammates att röra sig till koordinater */
	void moveTeammates();

	/* Attackerar en motståndare */
	void attack(Robot opponent);

}
