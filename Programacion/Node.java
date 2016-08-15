/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*Node <E>
******************************/

public class Node{
	protected Object value;
	protected Node next;

	public void setValue(Object n){
		this.value=n;
	}

	public Object getValue(){
		return value;
	}

	public void setNext(Node next){
		this.next=next;
	}

	public Node getNext(){
		return next;
	}

	public void Node(){}
}