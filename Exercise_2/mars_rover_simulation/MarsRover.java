
class MarsRover {
    private int x, y;
    private Direction direction;
    private Grid grid;

    public MarsRover(int x, int y, Direction direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public void move() {
        int newX = x, newY = y;
        switch (direction) {
            case N: newY += 1; break;
            case S: newY -= 1; break;
            case E: newX += 1; break;
            case W: newX -= 1; break;
        }
        if (grid.isValidMove(newX, newY)) {
            this.x = newX;
            this.y = newY;
        } else {
            System.out.println("Obstacle detected at (" + newX + ", " + newY + ")");
        }
    }

    public void turnLeft() {
        this.direction = direction.left();
    }

    public void turnRight() {
        this.direction = direction.right();
    }

    public String getStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction + ".";
    }
}
