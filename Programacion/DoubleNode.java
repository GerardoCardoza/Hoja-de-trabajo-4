/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*Double Node
******************************/
import java.util.*;

public class DoubleNode extends Node{
	private Node previous;

	public void setPrevious(Node: prev){
		this.previous=prev;
	}

	public Node getPrevious(){
		return previous;
	}

	public void DoubleNode(){
		previous = null;
		count = 0;
	}
}