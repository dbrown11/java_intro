package toDoList;

import java.util.ArrayList;

public class toDoList {
  
  public ArrayList<String> todos = new ArrayList<String>();


  public void addTodo(String thing) {
    todos.add(thing);
  }

  public ArrayList<String> get() {
    return todos;
  }

  public static void main(String[] args) {
    toDoList myList = new toDoList();
    myList.addTodo("I love Java");
    myList.addTodo(" love Ruby");
    myList.addTodo("I love Python");
    System.out.printf("My todos are:\n" + myList.get());
  }
}
