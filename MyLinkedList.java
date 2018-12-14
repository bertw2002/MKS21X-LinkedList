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
	private Node getNthNode(int var){
		Node current = start;
		while (current != null){
			current = current.next();
		}
		return current;
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
		if (length >= 0 && length < index){
			return getNthNode(index).getData();
		}else{
			throw new IndexOutOfBoundsException();
		}
  }
  public Integer set(int index,Integer value){
		if (length >= 0 && length < index){
			Integer original = getNthNode(index).getData();
			getNthNode(index).setData(value);
			return original;
		}else{
			throw new IndexOutOfBoundsException();
		}
  }
  public boolean contains(Integer value){
		for (int x = 0; x < length; x++){
			if (getNthNode(x).getData() == value){
				return true;
			}
		}
		return false;
  }
  public int indexOf(Integer value){
		for (Integer x = 0; x < length; x++){
			if (getNthNode(x).getData() == value){
				return x;
			}
		}
		return -1;
  }
  public void add(int index,Integer value){
		if (index < -1 && index >= length){
			throw new IndexOutOfBoundsException();
		}

  }
  public Integer remove(int index) {

  }
  public Integer remove(Integer value){

  }
}
