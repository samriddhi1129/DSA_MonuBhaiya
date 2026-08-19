package lecture2;

import org.w3c.dom.Node;

public class q5_traversal {
    public void Preorder(Node nn){
        if(nn == null){
            return;
        }
        System.out.println(nn.val+" ");
        Preorder(nn.left);
        Preorder(nn.right);
    }

    public void Postorder(Node nn){
        if(nn == null){
            return;
        }
     
        Postorder(nn.left);
        Postorder(nn.right);
        System.out.println(nn.val+" ");
    }
     
     public void Inorder(Node nn){
        if(nn == null){
            return;
        }
     
        Inorder(nn.left);
        System.out.println(nn.val+" ");
        Inorder(nn.right);
        
    }

    public void LevelOrder(){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node r = q.poll();
            System.out.print(r.val+" ");
            if(r.left != null){
                q.add(r.left);
            }
            if(r.right != null){
                q.add(r.right);
            }
        }
        System.out.println();  
    }



    
}
