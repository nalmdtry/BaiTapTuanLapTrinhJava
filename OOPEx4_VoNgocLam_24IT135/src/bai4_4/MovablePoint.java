package bai4_4;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    // Constructor không đối số
    public MovablePoint() {
        super();  // Gọi constructor của Point
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Constructor có tham số
    public MovablePoint(float xSpeed, float ySpeed) {
        super();  // Gọi constructor của Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor đầy đủ
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);  // Gọi constructor của Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter và Setter
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // Phương thức di chuyển
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
