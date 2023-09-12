import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    private TreeNode root;
    private int size;

    public Tree(){
        this.root = null;
        this.size = 0;
    }

    public TreeNode insert(int data){
        if (root==null){
            root= new TreeNode(data);

        }else {
            TreeNode bantuNode = new TreeNode(data);
            TreeNode ini=root;
            while (true){
                if (ini.getiData()< bantuNode.getiData()){
                    if (ini.getRightNode()!=null){
                        ini=ini.getRightNode();
                    }else {
                        ini.setRightNode(bantuNode);
                        return bantuNode;
                    }
                }
                else {
                    if (ini.getLeftNode()!= null){
                        ini=ini.getLeftNode();
                    }else {
                        ini.setLeftNode(bantuNode);
                        return bantuNode;
                    }
                }
            }
        }
        return root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TreeNode search(int i){
        TreeNode temp = this.getRoot();
        while (temp != null){
            if (temp.getiData()<i){
                temp = temp.getRightNode();
            }else if(temp.getiData()>i){
                temp = temp.getLeftNode();
            }else{
                return temp;
            }
        }
        return null;
    }
    public void bfs(){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(this.root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.println(temp.getiData()+" ");
            if (temp.getLeftNode()!= null){
                q.add(temp.getLeftNode());
            }
            if (temp.getRightNode()!= null){
                q.add(temp.getRightNode());
            }
        }
    }

}


