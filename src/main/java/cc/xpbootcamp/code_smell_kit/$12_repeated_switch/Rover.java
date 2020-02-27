package cc.xpbootcamp.code_smell_kit.$12_repeated_switch;

import java.util.Objects;

public class Rover {
    private Direction direction;
    private int x;
    private int y;

    public Rover(String direction, int x, int y) {
        this.direction = Direction.create(direction);
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
    // TODO: rotateLeft 和 rotateRight是不是可以优化
    private void rotateLeft() {
        if (faceNorth()) {
            direction = Direction.W;
        } else if (faceWest()) {
            direction = Direction.S;
        } else if (faceEast()) {
            direction = Direction.E;
        } else {
            direction = Direction.N;
        }
    }

    private void rotateRight() {
        if (faceNorth()) {
            direction = Direction.E;
        } else if (faceWest()) {
            direction = Direction.N;
        } else if (faceEast()) {
            direction = Direction.S;
        } else {
            direction = Direction.W;
        }
    }

    private boolean faceWest() {
        return direction.equals(Direction.W);
    }

    private boolean faceNorth() {
        return direction.equals(Direction.N);
    }

    private boolean faceEast() {
        return direction.equals(Direction.E);
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
