package trucker.entity;

import javax.persistence.Embeddable;

@Embeddable
public class tirePressure {
    private String frontLeft;
    private String frontRight;
    private String rearLeft;
    private String rearRight;

    public String getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(String frontLeft) {
        this.frontLeft = frontLeft;
    }

    public String getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(String frontRight) {
        this.frontRight = frontRight;
    }

    public String getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(String rearLeft) {
        this.rearLeft = rearLeft;
    }

    public String getRearRight() {
        return rearRight;
    }

    public void setRearRight(String rearRight) {
        this.rearRight = rearRight;
    }
}
