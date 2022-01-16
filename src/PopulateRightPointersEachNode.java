import java.util.LinkedList;
import java.util.Queue;

public class PopulateRightPointersEachNode {
    public static void main(String[] args) {

    }

//    public Node connect(Node root) {
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()){
//            int counter = children;
//            //add layer children
//            while (counter > 0){
//                Node currentNode = queue.remove();
//                queue.add(currentNode.left);
//                queue.add(currentNode.right);
//                counter --;
//            }
//            children *= 2;
//
//        }
//
//
//        return root;
//    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
