

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
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        ArrayList<Node> nextLevel = new ArrayList<>();
        ArrayList<Node> currentLevel; // = new ArrayList<>();
        nextLevel.add(root);
        boolean backward = true;
        
        while(nextLevel.size() > 0) {
            currentLevel = nextLevel;
            nextLevel = new ArrayList<>();
            
            for(int i = 0; i < currentLevel.size(); ++i) {
                Node node = currentLevel.get(i);
                result.add(node.data);
                if(backward) {
                    if(node.right != null) nextLevel.add(node.right);
                    if(node.left != null) nextLevel.add(node.left);
                } else {
                    if(node.left != null) nextLevel.add(node.left);
                    if(node.right != null) nextLevel.add(node.right);
                }
            }
            
            Collections.reverse(nextLevel);
            backward = !backward;
        }
        
        return result;
}