public class Node{
  private Integer data;
  private Node next,prev;
  public Node(int data, Node next, Node prev){
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
  public Node(int data){
    this.data = data;
  }
  public Node next(){
    return next;
  }
  public Node prev(){
    return prev;
  }
  public void setNext(Node next){
    this.next = next;
  }
  public void setPrev(Node prev){
    this.prev = prev;
  }
  public Integer getData(){
    return data;
  }
  public void setData(Integer data){
    this.data = data;
  }
  public String toString(){
  	return data + "";
  }
	
}
