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
		if (idx >= length || idx < 0) throw new IndexOutOfBoundsException();

		//loop thru until index
		for (int x = 0; x < idx;x++){
			current = current.next();
		}
		return current;
	}
	public boolean add(Integer value) {
		//null start
    Node newnode = new Node(value, null, end);
		//when length == 0 or end is null
    if (end != null) {
      end.setNext(newnode);
    }
    else {
			start = newnode;
    }
		//adds 1 to length no matter what
    length++;
    end = newnode;
    return true;
  }

  public int size(){
		return length;
  }
	//in form of an array.
  public String toString(){
		String val= "[";
		Node current = start;
		for (int x = 0;x < size();x++){
			if (x != length - 1){
				val += current.getData() + ", ";
				current = current.next();

			}else{
				val += current.getData();
				//doesnt do current.next() cuz last element
			}
		}
		return val += "]";

  }
  public Integer get(int index){
		return getNthNode(index).getData();
  }

  public Integer set(int index,Integer value){

		if (length >= 0 && index < length){
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
		if (index == 0 && length == 0){
			add(value);
			length ++;
		}
		//size = index, just add to the end.
		else if(index == size()){
			add(value);
			length++;
		}
		//
		else if(index != 0){
			Node newnode = start;
			// index -1 or just index? just test it out
			for (int x = 0; x < index - 1; x++) {
        newnode = newnode.next();
      }
			Node nodenext = newnode.next();
      Node newNode = new Node(value, node.next(), newnode);
      newnode.setNext(newNode);
      newnode = node.next().next();
      newnode.setPrev(newNode);
      length++;

			//if index == 0;
		}else{
			// null cuz nothing before, first element
			Node newnode = new Node(value, null, getNthNode(index));
			getNthNode(index).setPrev(newnode);
			start = newnode;
			length++;
		}
	}
  public Integer remove(int index) {
		if (index < 0 && index >= length){
			throw new IndexOutOfBoundsException();
		}
		else if (index == size() - 1){
			Integer oldvar = getNthNode(length - 1).getData();
			getNthNode(length - 1).setNext(null);
			end = getNthNode(size() - 1);
			length--;
			return oldvar;
		}else{
			Integer oldvar = getNthNode(length - 1).getData();
			getNthNode(index + 1).setPrev(getNthNode(index - 1));
			getNthNode(index - 1).setNext(getNthNode(index + 1));
			length --;
			return oldvar;
		}

  }
  public boolean remove(Integer value){
		if (contains(value)){
			remove(indexOf(value));
			return true;
		}
		return false;
  }
}
