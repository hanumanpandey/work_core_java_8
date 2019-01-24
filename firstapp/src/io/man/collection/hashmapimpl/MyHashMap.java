package io.man.collection.hashmapimpl;
/* ========================Custom implementation of HashMap==================*/
public class MyHashMap {

	public static void main(String[] args) {
		
		}

}
/* Custom key class to override hashcode() and equals() method*/

class Key{
	String key;
    Key(String key){
    	
    }
    @Override
    public int hashCode(){
    	return (int)key.charAt(0);
    }
    @Override
    public boolean equals(Object obj){
    	return key.equals((String)obj);
    }
    
}
class Node<K,V>{
	int hash;
	K key;
	V value;
	Node next;
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int hash, K key, V value, Node next) {
		super();
		this.hash = hash;
		this.key = key;
		this.value = value;
		this.next = next;
	}
	@Override
	public String toString() {
		return " [hash=" + hash + ", key=" + key + ", value=" + value + ", next=" + next + "]";
	}
	
	
	
}
