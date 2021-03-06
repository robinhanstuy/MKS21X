abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String author, String title, String ISBN, String  callNumber){
	super(author,title,ISBN);
	this.callNumber = callNumber;
    }
    public String getCallNumber(){
	return callNumber;
    }
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    public int compareTo(LibraryBook other){
	return this.callNumber.compareTo(other.callNumber);
    }
    public String toString(){
	return (super.toString() + ", " + callNumber);
    }
}
