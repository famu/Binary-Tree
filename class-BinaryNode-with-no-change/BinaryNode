/**
 * @class:	'BinaryNode' with no change
 * 
 * */

public class BinaryNode {
	Object element;
	BinaryNode left, right;
	
	BinaryNode(){ this(null);}
	
	BinaryNode(Object e){ this(e,null,null);}
	
	BinaryNode(Object e, BinaryNode ln, BinaryNode rn){
		element = e;
		left = ln;
		right = rn;
	}
	static int nodeCounter(BinaryNode n){
		if(n == null) return 0;
		else return 1 + nodeCounter(n.left) + nodeCounter(n.right);
	}
	
	static int height(BinaryNode n){
		if(n==null) return -1;
		else return 1 + Math.max(height(n.left), height(n.right));
	}
	
}
