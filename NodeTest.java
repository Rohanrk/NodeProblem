import java.util.List;
import java.util.ArrayList;

/* Problem Statement: Nodes correspond to members of a tree. * Each node can have up to 2 children which are represented * by left and right. Write an algorithm * to determine the
* least common ancestor given the root Node and a list of
* nodes
*/

public class NodeTest {

  /* Cases:
  * 1.) if currentNode in givenNode list, return currNode
  * 2.) else if left and right return nodes, return currentNode
  * 3.) else if left returns node, return left node
  * 4.) else if right returns node. return right node
  * 5.) else return null
  */

  public static Node recursiveThing(Node root, List<Node> givens) {

    if (root == null) {
      return null;
    }
    if (givens.contains(root)) {
      return root;
    }
    Node leftPassedUpNode = recursiveThing(root.getLeft(), givens);
    Node rightPassedUpNode = recursiveThing(root.getRight(), givens);
    if (leftPassedUpNode != null && rightPassedUpNode != null) {
      return root;
    }
    else if (leftPassedUpNode != null) {
      return leftPassedUpNode;
    }
    else if (rightPassedUpNode != null) {
      return rightPassedUpNode;
    }
    else {
      return null;
    }

  }
  //Testing recursiveThing
  public static void main(String[] args) {

    Node E = new Node(null, null, "E");
    Node D = new Node(null, null, "D");
    Node C = new Node(null, null, "C");
    Node B = new Node(D, E, "B");
    Node A = new Node(B, C, "A");
    ArrayList<Node> nodes = new ArrayList<Node>();
    nodes.add(E);
    nodes.add(C);
    System.out.println(recursiveThing(A, nodes));
  }
}
