

//User function Template for Java


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int flag  = 0 ; 
        
        while (! q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i =0 ; i< size ; i++){
                if(q.peek().left != null)
                q.add(q.peek().left);
                if(q.peek().right != null)
                q.add(q.peek().right);
                temp.add(q.remove().data);    
            }
            if(flag ==0 ){
                Collections.reverse(temp);
            flag =1 ;
            }
            else{
                flag = 0 ;
            }
            
            for(int i =0 ; i< temp.size(); i++){
                ans.add(temp.get(i));
            }
        }
        return ans ;
    }
}