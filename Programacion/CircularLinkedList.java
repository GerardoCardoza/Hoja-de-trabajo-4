/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*CircularLinkedList
******************************/

public class CircularLinkedList extends AbstractList{
	private Node tail;

	public void CircularLinkedList(){
		tail = null;
		count = 0;
	}

	public void setTail(Node tail){
		this.tail=tail;
	}

	public Node getTail(){
		return tail;
	}
}