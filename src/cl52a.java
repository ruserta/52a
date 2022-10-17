public class cl52a {
  // private
  private int myLen;
  private int myWid;
  private int myArea;
  private int myPerim;

  // constructor
  
  
  public cl52a(int l, int w) {
    myLen = l;
    myWid = w;
    myArea = 0;
    myPerim = 0;

  }

  public void setStuff() {
    myArea = myWid * myLen;
    myPerim = 2 * myWid + 2 * myLen;
    // return; // a void method does NOT return anything -- the "empty return" is
    // implicit
  }

  // Accessors: returns private data
  public int getArea() {
    return myArea;
  }

  public int getPerim() {
    return myPerim;
  }

}
/*
 * Class:
 * private data
 * constructors
 * modifiers
 * accessors
 */