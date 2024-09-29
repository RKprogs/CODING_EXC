package com.Assignment3;

import java.util.Scanner;

class Game {
    public String name;
    public int maxNumPlayers;

    public Game(String name, int maxNumPlayers) {
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }

    @Override
    public String toString() {
        return "Maximum number of players for " + name + " is " + maxNumPlayers;
    }
}

class GameWithTimeLimit extends Game {
    public int timeLimit;

    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit) {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTime Limit for "+name+" is " + timeLimit + " minutes";
    }
}

public class GameProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a game: ");
        String gameName = scanner.nextLine();
        System.out.print("Enter the maximum number of players: ");
        int maxPlayers = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a game that has time limit");
        String gameName2 = scanner.nextLine();
        System.out.print("Enter the maximum number of players: ");
        int maxPlayers2 = scanner.nextInt();
        System.out.print("Enter the time limit for the game (in minutes): ");
        int timeLimit = scanner.nextInt();
        System.out.println();

        Game game1 = new Game(gameName,maxPlayers);
        System.out.println(game1.toString());

        GameWithTimeLimit game2 = new GameWithTimeLimit(gameName2, maxPlayers2, timeLimit);
        System.out.println(game2.toString());
    }
}
