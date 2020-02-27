package cc.xpbootcamp.code_smell_kit.$11_primitive_obsession;

import java.util.Objects;

public class Rover {

    // TODO: direction 可以改成枚举类，xy也可以放入一个类去操作
    public String direction;
    private int x;
    private int y;

    public Rover(String direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public void receive(String commandSequence) {
        for (int i = 0; i < commandSequence.length(); ++i) {
            String command = commandSequence.substring(i, i+1);
            switch (command) {
                case "l":
                    rotateLeft();
                    break;
                case "r":
                    rotateRight();
                    break;
                case "f":
                    moveForwards();
                    break;
                default:
                    moveBackwards();
                    break;
            }
        }
    }

    private void moveBackwards() {
        int displacement = -1;
        move(-1);
    }

    private void moveForwards() {
        int displacement = 1;
        move(1);
    }

    private void move(int displacement) {
        if (faceNorth()) {
            y += displacement;
        } else if (faceWest()) {
            x -= displacement;
        } else if (faceEast()) {
            x += displacement;
        } else {
            y -= displacement;
        }
    }

    private void rotateLeft() {
        if (faceNorth()) {
            direction = "W";
        } else if (faceWest()) {
            direction = "S";
        } else if (faceEast()) {
            direction = "E";
        } else {
            direction = "N";
        }
    }

    private void rotateRight() {
        if (faceNorth()) {
            direction = "E";
        } else if (faceWest()) {
            direction = "N";
        } else if (faceEast()) {
            direction = "S";
        } else {
            direction = "W";
        }
    }

    private boolean faceWest() {
        return "W".equals(direction);
    }

    private boolean faceNorth() {
        return "N".equals(direction);
    }

    private boolean faceEast() {
        return "E".equals(direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rover rover = (Rover) o;
        return x == rover.x &&
          y == rover.y &&
          Objects.equals(direction, rover.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, x, y);
    }
}
