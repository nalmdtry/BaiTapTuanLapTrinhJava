package bai3_7;

import java.util.Random;

public class SoccerGame {
    private Ball ball;
    private Player[] teamA;
    private Player[] teamB;
    private int fieldWidth, fieldHeight;

    // Constructor
    public SoccerGame(int fieldWidth, int fieldHeight) {
        this.fieldWidth = fieldWidth;
        this.fieldHeight = fieldHeight;

        // Initialize ball
        ball = new Ball(fieldWidth / 2, fieldHeight / 2);

        // Initialize teams
        teamA = new Player[]{
            new Player("A1", 20, 30),
            new Player("A2", 30, 40),
            new Player("A3", 25, 50)
        };

        teamB = new Player[]{
            new Player("B1", 60, 30),
            new Player("B2", 70, 40),
            new Player("B3", 65, 50)
        };
    }

    // Simulate one round
    public void playRound() {
        Random rand = new Random();
        
        // Choose a random player to kick
        Player kicker = rand.nextBoolean() ? teamA[rand.nextInt(teamA.length)] : teamB[rand.nextInt(teamB.length)];
        System.out.println(kicker.getName() + " kicks the ball!");

        // Player kicks in a random direction with random speed
        float speed = 5 + rand.nextInt(6); // Speed 5 to 10
        float direction = rand.nextInt(360); // Any direction
        kicker.kick(ball, speed, direction);

        // Move the ball for a few steps
        for (int i = 0; i < 3; i++) {
            ball.move();
            System.out.println(ball);
        }

        // Stop the ball randomly
        if (rand.nextBoolean()) {
            ball.stop();
            System.out.println("Ball stopped.");
        }
    }

    // Start the game
    public void startGame(int rounds) {
        System.out.println("⚽ Starting the soccer game!");
        for (int i = 0; i < rounds; i++) {
            System.out.println("\n🔹 Round " + (i + 1));
            playRound();
        }
        System.out.println("🏁 Game over!");
    }

    // Main method to run the game
    public static void main(String[] args) {
        SoccerGame game = new SoccerGame(100, 60);
        game.startGame(5);
    }
}

