/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*DoubleLinkedList
******************************/

public class DoubleLinkedList extends AbstractList{
	private DoubleNode head;
	private DoubleNode tail;

	public void DoubleLinkedList(){
		head = null;
		count = 0;
		tail=null;
	}

	public void setHead(DoubleNode head){
		this.head=DoubleNode;
	}

	public DoubleNode getHead(){
		return head;
	}

	public void setTail(DoubleNode tail){
		this.tail=tail;
	}

	public DoubleNode getTail(){
		return tail;
	}
}