package composite;

import java.util.ArrayList;
import java.util.List;

//This class holds the functionality to handle the fruits being eaten.
//Contains methods for populating and clearing the list of fruits
public class FruitBasket {
	public List<Fruits> fruits = new ArrayList<Fruits>();
	
	public void eat(String meal) {
        for(Fruits f : fruits)
        {
            f.eat(meal);
        }
    }
	
	public void add(Fruits f){
		fruits.add(f);
	}
	
	public void remove(Fruits f){
		fruits.remove(f);
	}
	
	public void clear(){
		fruits.clear();
	}
}
