package simpleTree;

public class App {
    public static void main(String[] args) {
        TreeNode elementRoot = new TreeNode(1);
        TreeNode elementB = new TreeNode(2);
        TreeNode elementC = new TreeNode(3);
        TreeNode elementD = new TreeNode(4);
        TreeNode elementE = new TreeNode(5);
        TreeNode elementF = new TreeNode(6);

        elementRoot.setLeft(elementB);
        elementRoot.setRight(elementC);

        elementB.setLeft(elementD);

        elementC.setLeft(elementE);
        elementC.setRight(elementF);

        System.out.println("ElementC = " + elementC.getValue()
                + " LeftNode= " + elementC.getLeft().getValue()
                + " RightNode = " + elementC.getRight().getValue());

        System.out.println("View tree - " + elementRoot.breadthFirst(elementRoot));
    }

}
