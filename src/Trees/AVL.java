package Trees;

public class AVL {
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

    public Node root;

    public AVL(){}

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

        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.right)>1){
            // Left heavy
            if(height(node.left.left) - height(node.left.right)>0){
                // left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right)<0){
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right)<-1){
            // Right heavy
            if(height(node.right.left) - height(node.right.right)<0){
                // right right case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right)>0){
                // right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = t;
        p.left = p;

        p.height = Math.max(height(p.left),height(p.right))+1;

        return c;
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left),height(p.right))+1;
        c.height = Math.max(height(c.left),height(c.right))+1;

        return p;
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

//    public void traversal(){
//        preOrder(root);
//        System.out.println("END");
//        inOrder(root);
//        System.out.println("END");
//        postOrder(root);
//        System.out.println("END");
//    }
//
//    private void preOrder(Node node){
//        if(node==null){
//            return;
//        }
//        System.out.print(node.getValue()+" -> ");
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//
//    private void inOrder(Node node){
//        if(node==null){
//            return;
//        }
//        inOrder(node.left);
//        System.out.print(node.getValue()+" -> ");
//        inOrder(node.right);
//    }
//
//    private void postOrder(Node node){
//        if(node==null) {
//            return;
//        }
//        postOrder(node.left);
//        postOrder(node.right);
//        System.out.print(node.getValue()+" -> ");
//    }

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
        AVL tree = new AVL();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        tree.populate(nums);

        tree.prettyDisplay();
    }

}
