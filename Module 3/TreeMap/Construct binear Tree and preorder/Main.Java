import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
	
	TreeNode(){
		
	}
	TreeNode(int val){
		this.val=val;
	}
}
public static TreeNode Construct(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter TreeNode ");
	int val=sc.nextInt();
	TreeNode root=new TreeNode(val);
	if (val==-1) return null;

System.out.println("Enter left Node ");
root.left=Construct();
System.out.println("Enter right Node ");
root.right=Construct();
return root;
}	
public static ArrayList<Integer> preorder(TreeNode root,ArrayList<Integer> ans){
    if (root==null) return null;
    ans.add(root.val);
    preorder(root.left,ans);
    preorder(root.right,ans);
    return ans;
}
	public static void main (String[] args) throws java.lang.Exception
	{
		TreeNode root=Construct();
		ArrayList<Integer> ans=new ArrayList<>(); 
		System.out.print(preorder(root,ans));
		
	}
}