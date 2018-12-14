import java.util.List;
public class MyLinkedList{
	private Node start;
	private Node end;
	private int length;
	public MyLinkedList(){
		length = 0;
		end = null;
		start = null;
	}
  public boolean add(Integer value){
  	if (length == 0){
  		Node newnode = new Node(value);
  		end.setNext(newnode);
  		start = newnode;
  		end = newnode;
  	}else{
			Node newnode = new Node(value);
			end.setNext(newnode);
			end = newnode;
		}
		length ++;
		return true;
  }
  public int size(){
		return length;
  }
  public String toString(){

  }
  public Integer get(int index){

  }
  public Integer set(int index,Integer value){

  }
  public boolean contains(Integer value){

  }
  public int indexOf(Integer value){

  }
  public void add(int index,Integer value){
    
  }
  public Integer remove(int index) {

  }
  public Integer remove(Integer value){

  }
}
