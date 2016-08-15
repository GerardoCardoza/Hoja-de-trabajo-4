/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*abstractList
******************************/

public class Stack implements IStack{
	private Object datos;

	public void Stack(int tipo,int List){
		Factory temp=new Factory(tipo,List);
		this.datos=temp.getDatos();
	}


}