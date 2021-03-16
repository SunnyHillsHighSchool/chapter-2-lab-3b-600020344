//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design and create
//your Toy class

//Use the lab handout
//and sample runner
//code provided
//to help you
public class Toy
{
  private String name;
  private int count;

  public Toy()
  {
    name = "";
    count = 1;
  }
  public Toy(String n)
  {
    name = n;
    count = 1;
  }
  public Toy(int c)
  {
    name = "";
    count = c;
  }
  public Toy(String n, int c)
  {
    name = n;
    count = c;
  }
  public void setName(String n)
  {
    name = n;
  }
  public void setCount(int c)
  {
    count = c;
  }
  public String getName()
  {
    return name;
  }
  public int getCount()
  {
    return count;
  }
  public String toString()
  {
    return name + " " + count;
  }
}
