//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
    toyList = new ArrayList<Toy>();
	}

	public void loadToys( String[] toys )
	{
    boolean found = false;
    for (String s: toys)
    {
      for (int i = 0; i<toyList.size(); i++)
      {
        if (toyList.get(i).getName().equals(s))
        {
            toyList.get(i).setCount(toyList.get(i).getCount()+1);
            found = true;
        }
      }
      if (!found)
        toyList.add(new Toy(s));
      found = false;
    }
	}
  
  	public Toy getThatToy( String nm )
  	{
      for (Toy t : toyList)
      {
        if (t.getName().equals(nm))
          return t;
      }
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
      if (toyList.size()==0)
        return "";
      Toy max = toyList.get(0);
      for (int i = 1; i<toyList.size(); i++)
      {
        if (toyList.get(i).getCount()>max.getCount())
          max = toyList.get(i);
      }
  		return max.getName();
  	}  
  
  	public void sortToysByCount()
  	{
        for (int i = 0; i < toyList.size()-1; i++) 
        { 
            int min = i; 
            for (int j = i+1; j < toyList.size(); j++)
            {
                if (toyList.get(j).getCount() < toyList.get(min).getCount()) 
                    min = j; 
            }
            Toy temp = toyList.get(min); 
            toyList.set(min, toyList.get(i)); 
            toyList.set(i, temp); 
        } 
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}
