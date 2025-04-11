package bai3_7;

public class Ball {
    private float x, y; // Ball position
    private float xDelta, yDelta; // Ball movement per step

    // Constructor
    public Ball(float x, float y) {
        this.x = x;
        this.y = y;
        this.xDelta = 0;
        this.yDelta = 0;
    }

    // Getters
    public float getX() { return x; }
    public float getY() { return y; }
    public float getXDelta() { return xDelta; }
    public float getYDelta() { return yDelta; }

    // Setters
    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setSpeed(float xDelta, float yDelta) {
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Move the ball by one step
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Stop the ball
    public void stop() {
        xDelta = 0;
        yDelta = 0;
    }

    // toString
    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ") moving (" + xDelta + ", " + yDelta + ")";
    }
}

