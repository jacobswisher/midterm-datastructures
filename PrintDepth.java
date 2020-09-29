
public class PrintDepth {
	private static int printdepth; // The depth to print all the elements.


	public static void main(String [] args) {
		MyTree T = new MyTree(); // Gets a Tree object.
		TreeNode root = T.getRoot(); // Gets the root of the tree.

		printdepth = 111; // sets the tree to depth 111. 
		print(printdepth, root);
		// TODO: Please write a recursive function to print all nodes at level (or depth) 111, all sorted from right to left.
	}
	
	public static void print(int t, TreeNode n)
	{
		if (n != null)
		{
			if (t == 0) System.out.println(n.key);
			else 
			{
				print(t - 1, n.right);
				print(t - 1, n.left);
			}
				
	
		}
	} 
}
