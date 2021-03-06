public class Node {

  private Node left;
  private Node right;
  private String name;

  public Node(Node left, Node right, String name) {
    this.left = left;
    this.right = right;
    this.name = name;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

}
