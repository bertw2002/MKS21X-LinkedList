public class Node{
  private Integer data;
  private Node next,prev;
  public Node(int data, Node next, Node prev){
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
  public Node(int datatwo){
    data = datatwo;
		
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setNext(Node nexttwo){
    next = nexttwo;
  }
  public void setPrev(Node prevtwo){
    prev = prevtwo;
  }
  public Integer getData(){
    return data;
  }
  public void setData(Integer datatwo){
    data = datatwo;
  }
  public String toString(){
  	return data + "";
  }
	
}
