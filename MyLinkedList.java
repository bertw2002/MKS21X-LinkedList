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
	private Node getNthNode(int idx){
		Node current = start;
		//exception if out of bounds.
		if (idx > size()) throw new IndexOutOfBoundsException();
		//loop thru until index
		int x = 0;
		while (current != null && x < idx){
			current = current.next();
			x++;
		}
		return current;
	}
  public boolean add(Integer value){
		// start & end same cuz 0 length
  	if (length == 0){
  		Node newnode = new Node(value);
  		end.setNext(newnode);
  		start = newnode;
  		end = newnode;
			// add to end if not length 0
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
	//in form of an array.
  public String toString(){
		String val= "[";
		Node current = start;
		while (current != null){
			current = current.next();
			if (val.length() != 1){
				val += " ,";
				val += current.getData();
			}else{
				val += current.getData();
			}
		}
		return val += "]";

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
			//return original value, change to new.
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
		if (index < 0 && index >= length){
			throw new IndexOutOfBoundsException();
		}
		//size = index, just add to the end.
		else if(index == size()) add(value);
		//
		else if(index != 0){
			Node newnode = new Node(value, getNthNode(index - 1), getNthNode(index + 1));
			Node
		}
  }
  public Integer remove(int index) {

  }
  public boolean remove(Integer value){
		if (contains(value)){
			remove(indexOf(value));
			return true;
		}
		return false;
  }
}
