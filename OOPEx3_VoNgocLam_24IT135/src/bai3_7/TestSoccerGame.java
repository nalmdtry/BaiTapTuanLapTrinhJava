package bai3_7;

public class TestSoccerGame {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50);
        Player player = new Player("Messi", 40, 50);

        System.out.println(player);
        System.out.println(ball);

        // Player kicks the ball
        player.kick(ball, 10, 45);
        System.out.println("After kick:");
        System.out.println(ball);

        // Move the ball for 5 steps
        for (int i = 0; i < 5; i++) {
            ball.move();
            System.out.println(ball);
        }

        // Stop the ball
        ball.stop();
        System.out.println("Ball stopped:");
        System.out.println(ball);
    }
}
