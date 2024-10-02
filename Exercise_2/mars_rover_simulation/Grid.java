
import java.util.Set;

class Grid {
    private int width, height;
    private Set<Point> obstacles;

    public Grid(int width, int height, Set<Point> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public boolean isValidMove(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height && !obstacles.contains(new Point(x, y));
    }
}
