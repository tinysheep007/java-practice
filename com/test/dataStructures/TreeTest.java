package dataStructures;

public class TreeTest<T> {

    public static class TreeNode<T>{
        private T element;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T element){
            this.element = element;
        }
    }

    public static void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.element);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.element);
        preOrder(root.right);
    }

    public static void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.println(root.element);
    }

    public static void levelOrder(TreeNode<Integer> root){
        MyQueue<TreeNode<Integer>> q = new MyQueue<>();
        q.enqueue(root);
        while(!q.isEmpty()){
            TreeNode<Integer> temp = q.dequeue();
            System.out.println(temp.element);
            if(temp.left != null){
                q.enqueue(temp.left);
            }
            if(temp.right != null){
                q.enqueue(temp.right);
            }
        }
    }

    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<>(0);
        root.left = new TreeNode<Integer>(-5);
        root.left.left = new TreeNode<Integer>(-100);
        root.right = new TreeNode<Integer>(10);
        root.right.right = new TreeNode<Integer>(500);
        //System.out.println(root.left.element);
        //preOrder(root);
        postOrder(root);
        System.out.println("bozo");
        levelOrder(root);
    }
}
