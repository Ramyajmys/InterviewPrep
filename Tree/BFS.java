// BFS is also a Level ordered traversal
// 2 method using queue and other is using height
/*class Node<T extends Comparable<T>>{
	Node<T> left, right;
	T key;
	public Node(T value){
		key = value;
		left = right = null;
	}
}*/

// FIND MAX WIDTH OF TREE - max element at particular level - using Level order traversal
import java.util.LinkedList;
import java.util.Queue;
public class BFS<T extends Comparable<T>> {
	Node<T> root;
	BFS(T value){
		root = new Node<T>(value);
	}
	BFS(){
		root = null;
	}
	void printLevelOrder()
	{
		int h = calHeight(root);
		int i;
		for(i = 1;i<=h;i++){
			printGivenLevel(root,i);
		}
	}
	int calHeight(Node<T> root){
		if(root == null){
			return 0;
		}
		int lh = calHeight(root.left);
		int rh = calHeight(root.right);
		if(lh > rh)
			return lh+1;
		else
			return rh+1;
	}
	void printGivenLevel(Node<T> node, int h){
		if(node == null){
			return;
		}
		if(h == 1)
			System.out.println(node.key + " ");
		else if(h > 1)
		{
			printGivenLevel(node.left, h-1);
			printGivenLevel(node.right, h-1);	
		}
	}
	
	void LevelOrderTraversal(){
		Queue<Node<T>> q = new LinkedList<Node<T>>();
		q.add(root);
		while(!q.isEmpty()){
			Node<T> tempNode = q.poll();
			System.out.println(tempNode.key + " ");
			if(tempNode.left != null)
				q.add(tempNode.left);
			if(tempNode.right != null)
				q.add(tempNode.right);
			
			
		}
	}
	int MaxWidth(){
		Queue<Node<T>> q = new LinkedList<Node<T>>();
		if(root == null){
			return 0;
		}
		q.add(root);
		int count, maxwidth = 0;
		while(!q.isEmpty()){
			count = q.size();
			maxwidth = Math.max(count, maxwidth);
			while(count-- > 0){
				Node<T> tempNode = q.poll();
				//System.out.println(tempNode.key + " ");
				if(tempNode.left != null)
					q.add(tempNode.left);
				if(tempNode.right != null)
					q.add(tempNode.right);
			}
		}
		return maxwidth;
	}
	
	public static void main(String[] args) {
		BFS<Integer> bt = new BFS<Integer>();
		bt.root = new Node<Integer>(1);
		bt.root.left = new Node<Integer>(3);
		bt.root.right = new Node<Integer>(2);
		bt.root.left.left = new Node<Integer>(6);
		bt.root.left.right = new Node<Integer>(7);
		bt.root.right.right = new Node<Integer>(8);
		bt.LevelOrderTraversal();
		System.out.println("WIDTH: " +bt.MaxWidth());
	}

}


//2 method using queue 

