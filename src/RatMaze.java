import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RatMaze {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 0, 0,},
                {0, 1, 0, 0,},
                {0, 1, 0, 0,},
                {1, 1, 1, 1}
        };

        int path = pathExists(matrix, new GraphNode(0, 0, 0, null), new GraphNode(3, 3, 0, null));

        System.out.println(path);
    }

    private static int pathExists(int[][] matrix, GraphNode source, GraphNode end) {

        Queue<GraphNode> queue = new LinkedList<GraphNode>();

        queue.add(source);

        while (!queue.isEmpty()) {
            GraphNode popped = queue.poll();

            System.out.print(popped.distanceFromSource);

            if (popped.x == end.x && popped.y == end.y) {
                return popped.distanceFromSource;
            }
            matrix[popped.x][popped.y] = 0;
            List<GraphNode> neighbourList = addNeighbours(popped, matrix);
            queue.addAll(neighbourList);

        }
        return -1;
    }

    private static List<GraphNode> addNeighbours(GraphNode popped, int[][] matrix) {

        List<GraphNode> list = new LinkedList<>();

        if ((popped.x - 1 > 0 && popped.x - 1 < matrix.length) && matrix[popped.x - 1][popped.y] != 0) {
            list.add(new GraphNode(popped.x - 1, popped.y, popped.distanceFromSource + 1, popped));
        }
        if ((popped.x + 1 > 0 && popped.x + 1 < matrix.length) && matrix[popped.x + 1][popped.y] != 0) {
            list.add(new GraphNode(popped.x + 1, popped.y, popped.distanceFromSource + 1, popped));
        }
        if ((popped.y - 1 > 0 && popped.y - 1 < matrix.length) && matrix[popped.x][popped.y - 1] != 0) {
            list.add(new GraphNode(popped.x, popped.y - 1, popped.distanceFromSource + 1, popped));
        }
        if ((popped.y + 1 > 0 && popped.y + 1 < matrix.length) && matrix[popped.x][popped.y + 1] != 0) {
            list.add(new GraphNode(popped.x, popped.y + 1, popped.distanceFromSource + 1, popped));
        }
        return list;
    }
}

class GraphNode {
    int x;
    int y;
    GraphNode parent;
    int distanceFromSource;

    GraphNode(int x, int y, int dis, GraphNode parent) {
        this.x = x;
        this.y = y;
        this.parent = parent;
        this.distanceFromSource = dis;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "x=" + x +
                ", y=" + y +
                ", parent=" + parent +
                ", distanceFromSource=" + distanceFromSource +
                '}';
    }
}
