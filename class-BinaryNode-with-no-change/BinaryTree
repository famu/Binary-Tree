/**
 *@class: 'BinaryTree' uses the binaryNode class and provides the capability to use its instance as binary tree with
 *		   left and right subtrees.
 *			No change in BinaryTree class except plotTree() function. 
 */



public class BinaryTree {
	
	private BinaryNode root;
	
	public BinaryTree(){root = null;}
	
	public BinaryTree(Object x){
		root = new BinaryNode(x);
		}


public boolean isEmpty(){return root ==null;}

public void makeEmpty(){ root = null;}

public int nodeCount(){ return BinaryNode.nodeCounter(root);}

public int height(){return BinaryNode.height(root);}

public Object getRootObj() throws BinaryTreeException{
	if(root==null) throw new BinaryTreeException("Empty Tree");
	else 
		return root.element;
}


public void setRootObj(Object x) throws BinaryTreeException{
	if(root==null) throw new BinaryTreeException("Empty Tree");
	else 
		 root.element = x;
	}

public BinaryTree getLeft() throws BinaryTreeException{
	if(root==null) throw new BinaryTreeException("Empty Tree");
	else {
		BinaryTree t = new BinaryTree();
		t.root = root.left;
		return t;
		
		}
	}

public void setLeft(BinaryTree t) throws BinaryTreeException{
	if(root==null) throw new BinaryTreeException("Empty Tree");
	else {
		root.left = t.root;
		}
	}

public BinaryTree getRight() throws BinaryTreeException{
	if(root==null) throw new BinaryTreeException("Empty Tree");
	else {
		BinaryTree t = new BinaryTree();
		t.root = root.right;
		return t;
		}
	}
public void setRight(BinaryTree t) throws BinaryTreeException{
	if(root==null) throw new BinaryTreeException("Empty Tree");
	else {
		root.right = t.root;
		}
	}

public class BinaryTreeException extends RuntimeException {
	
	public BinaryTreeException(String err){
		super(err);{}
		}
	}
/**
 *@function:	'insert()' inserts new values/keys in binary tree at its correct position/place/location.
 *@param:	't' is of type BinaryTree which is initially empty but later on the values are added in it one by one.
 *@param:	'x' is of type Object
 */
public static BinaryTree insert(BinaryTree t,Object x){
	if(t.isEmpty())
		return new BinaryTree(x);
	else {
		if(((Integer)t.getRootObj()).intValue() < ((Integer)x).intValue())
			t.setRight(insert(t.getRight(),x));
		else
			t.setLeft(insert(t.getLeft(),x));
		return t;
	}
	}

/**
 * @function: plotTree() plots the value of a binary tree into a two dimensional array.
 * @param:	't' is of type BinaryTree whose values are to be plotted into the given array.
 * @param:	'offset' is the location or index where the current key/value is to be stored.
 * @param:	'ref' is used to calculate the distance of next value/key from current location.
 * 			Since there is a pattern that the child value is half the further so it can be 
 * 			added to get right child location and subtracted to get left child location.
 * @param:	'arr' is a reference to the array of supplied or given array of type char so that
 * 			 new array has not to be returned.
 */
public static void plotTree(BinaryTree t, int level, int offset, int ref, char[][] arr){
	
	if(t.root!=null){ //because it is possible root is null even it's node is not null. Otherwise root can be skipped of this node.
		
		/*In case of multi-digit keys/values*/
		for(int i=0; i< t.getRootObj().toString().length(); i++) //Since there not more than two digit values, for loop runs 2 times maximum.
			arr[level][offset + i] = t.getRootObj().toString().charAt(i); //plotting the characters at offset		
		if(t.getLeft().root!= null) { //Because it is possible that root is null even it's node is not null.
			arr[level + 1][offset - ref/2 ] = '/';  //Because slash is printed a level down to the current root while its location should be with respect to reference
			plotTree(t.getLeft(), level+2, offset - ref, ref/2 , arr);  //Recursive call to check left subtrees.
			} //end if
			
		if(t.getRight().root!=null){  //Because root can be null while the tree is not null, otherwise extra slashes would be printed
			arr[level + 1][offset + ref/2 ] = '\\'; // Because single '\' cannot be printed.
			plotTree(t.getRight(), level+2, offset + ref, ref/2 , arr); //Recursive call to traverse right subtrees.
		}//end if 
		
	  }// end outer if
	
	}// end plotTree
	
	 
}//end class

