package Trees;

public class BST {
    private static class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BST(){}

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value, root);
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value, node.left);
        }
        else if(value > node.value){
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums) {
        for(int i : nums){
            insert(i);
        }
    }

    public void populateSorted(int[] num) {
        populateSorted(num, 0, num.length);
    }

    private void populateSorted(int[] num, int start, int end) {
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;
        insert(num[mid]);

        populateSorted(num, start, mid);
        populateSorted(num, mid+1, end);
    }

    public void display(){
        display(this.root, "Root Node : ");
    }

    public void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.getValue());

        display(node.left, " Left child of " + node.getValue() + " : ");
        display(node.right, " Right child of " + node.getValue() + " : ");
    }

    public void prettyDisplay(){
        prettyDisplay(this.root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right, level+1);
        if(level!=0){
            for(int i =0; i< level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.value);
        }else{
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level+1);


    }

    public void traversal(){
        preOrder(root);
        System.out.println("END");
        inOrder(root);
        System.out.println("END");
        postOrder(root);
        System.out.println("END");
    }

    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.getValue()+" -> ");
        preOrder(node.left);
        preOrder(node.right);
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.getValue()+" -> ");
        inOrder(node.right);
    }

    private void postOrder(Node node){
        if(node==null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.getValue()+" -> ");
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5,3,7,1,17,4,8,6};
        tree.populate(nums);
        tree.display();
        tree.prettyDisplay();
        System.out.println(tree.balanced()+"\n");

        BST tree2 = new BST();
        tree2.populateSorted(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        tree2.prettyDisplay();
        System.out.println(tree2.balanced()+"\n");
        tree2.traversal();
    }

}
