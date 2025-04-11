package bai3_7;

public class Player {
    private String name;
    private float x, y; // Player position

    // Constructor
    public Player(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    // Getters
    public String getName() { return name; }
    public float getX() { return x; }
    public float getY() { return y; }

    // Set player position
    public void move(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Player kicks the ball
    public void kick(Ball ball, float speed, float direction) {
        double radian = Math.toRadians(direction);
        float xDelta = (float) (speed * Math.cos(radian));
        float yDelta = (float) (speed * Math.sin(radian));
        ball.setSpeed(xDelta, yDelta);
    }

    // toString
    @Override
    public String toString() {
        return "Player " + name + " at (" + x + ", " + y + ")";
    }
}
