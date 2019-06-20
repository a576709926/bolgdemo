package tree;

import java.util.LinkedList;
import java.util.List;


public class towTree<E> {
	
	private int[] array = {1,2,3,4,5,6,7,8,9};
	private static List<Node> nodes = null;
	
	private static class Node{
		 Node leftChild ; //左节点
		 Node rightChild; //右节点
		 int date;
		 
		 public Node(int newData) {
			  leftChild = null; //左节点
			  rightChild = null; //右节点
			  date = newData;
		}
	}
	
	
	public void createBinTree() {
		nodes = new LinkedList<Node>();
		
		for (int i = 0; i < array.length; i++) {
			nodes.add(new Node(array[i]));
		}
		
		for (int j = 0; j < array.length/2; j++) {
		//	nodes.get(j).date = array[j];
			nodes.get(j).leftChild = nodes.get(j + 1);
			//左孩子
			nodes.get(j).rightChild = nodes.get(j +2 );
		}
	}

}
