/*****************************
*@author: Robbin Woods Rodriguez
*@version: 1.0
*Factory
******************************/

public class Factory{
	private Object datos;

	public void Factory(int tipo,int List){
		if(tipo==1)
			datos=new Vector();
		else if(tipo==2)
			datos=new ArrayList();
		else
			if(List==1)
				datos=new SingleLikedList();
			else if(List==2)
				datos=new DoubleLinkedList();
			else
				datos=new CircularLinkedList();
	}

	public Object getDatos(){
		return datos;
	}
}