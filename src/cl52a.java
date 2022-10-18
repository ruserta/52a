public class cl52a {

  private int myLen;
  private int myWid;
  private int myArea;
  private int myPerim;

  public cl52a(int l, int w) {
    myLen = l;
    myWid = w;
    myArea = 0;
    myPerim = 0;

  }

  public void setStuff() {
    myArea = myWid * myLen;
    myPerim = 2 * myWid + 2 * myLen;

  }

  public int getArea() {
    return myArea;
  }

  public int getPerim() {
    return myPerim;
  }

  public String toString() {
    return String.format("Area: %s\nPerimeter: %s", myArea, myPerim);

  }

  public void print() {
    System.out.println(this.toString());

  }
}
/*
 * Class:
 * private data
 * constructors
 * modifiers
 * accessors
 */