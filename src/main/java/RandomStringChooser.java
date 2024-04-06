import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> arr;
  public RandomStringChooser(String [] a){
    arr = new ArrayList <String>();
    for(String i : a){
      arr.add(i);
    }
  } 
  public String getNext(){
    if(arr.size()==0){
      return "NONE";
    }
    else{
      return arr.remove((int)(Math.random() * arr.size()));
    }
  }
}
