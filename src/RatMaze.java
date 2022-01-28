import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RatMaze {

    public static void main(String args[]) {
        int[][] matrix = {
                {1, 1, 0, 0,},
                {0, 1, 0, 0,},
                {0, 1, 0, 0,},
                {1, 1, 1, 1}
        };

        int path = pathExists(matrix,new GraphNode(0,0,0),new GraphNode(3,3,0));

        System.out.println(path);
    }

    private static int pathExists(int[][] matrix, GraphNode source, GraphNode end) {

        Queue<GraphNode> queue = new LinkedList<GraphNode>();

        queue.add(source);

        while (!queue.isEmpty()) {
            GraphNode poped = queue.poll();

            System.out.println(poped.distanceFromSource);
            if (poped.x == end.x && poped.y == end.y){
                return poped.distanceFromSource;
            } else {
                matrix[poped.x][poped.y] = 0;

                List<GraphNode> neighbourList = addNeighbours(poped, matrix);
                queue.addAll(neighbourList);
            }
        }
        return -1;
    }

    private static List<GraphNode> addNeighbours(GraphNode poped, int[][] matrix) {

        List<GraphNode> list = new LinkedList<>();

        if ((poped.x - 1 > 0 && poped.x - 1 < matrix.length) && matrix[poped.x - 1][poped.y] != 0) {
            list.add(new GraphNode(poped.x - 1, poped.y, poped.distanceFromSource + 1));
        }
        if ((poped.x + 1 > 0 && poped.x + 1 < matrix.length) && matrix[poped.x + 1][poped.y] != 0) {
            list.add(new GraphNode(poped.x + 1, poped.y, poped.distanceFromSource + 1));
        }
        if ((poped.y - 1 > 0 && poped.y - 1 < matrix.length) && matrix[poped.x][poped.y - 1] != 0) {
            list.add(new GraphNode(poped.x, poped.y - 1, poped.distanceFromSource + 1));
        }
        if ((poped.y + 1 > 0 && poped.y + 1 < matrix.length) && matrix[poped.x][poped.y + 1] != 0) {
            list.add(new GraphNode(poped.x, poped.y + 1, poped.distanceFromSource + 1));
        }
        return list;
    }
}

class GraphNode {
    int x;
    int y;
    int distanceFromSource;

    GraphNode(int x, int y, int dis) {
        this.x = x;
        this.y = y;
        this.distanceFromSource = dis;
    }
}
