package demo01;

public class run {

	public static void main(String[] args) {
MyLinKedList<String> myLinKedList = new MyLinKedList<>();
		
		//假如我们要把这三个对象放入myLinKedList
		String s1="a";
		String s2="b";
		String s3="c";
		
		Node<String> node =new Node<String>(null,s1,null);//第一次存入作为第一个节点，该节点没有上一个 所以第一个参数 null
		myLinKedList.first=node;//第一次存入作为第一个节点
		myLinKedList.last=node;//第一次存入也作为最后一个节点
		myLinKedList.size=1;//容量变为1
		
		
		Node<String> node2 =new Node<String>(node,s2,null);//第二次存入 ，第一个的node节点就作为第二次的上一个节点。
		node.next=node2;//第一个节点的下一个节点
		myLinKedList.last=node2;//最后一个节点
		myLinKedList.size=2;
		
		
		Node<String> node3 =new Node<String>(node2,s3,null);//一次类推。
		node2.next=node3;
		myLinKedList.last=node3;
		myLinKedList.size=3;
		System.err.println(myLinKedList);
		System.err.println("1");
	}
}
