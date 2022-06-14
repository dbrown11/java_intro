package toDoList;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class toDoListTest {
    @Test public void emptyToDos() {
        toDoList mytodos = new toDoList();
        ArrayList<String> result = new ArrayList<String>();
        assertEquals(result, mytodos.get());
    }
    @Test public void fullToDos() {
        ArrayList<String> result = new ArrayList<String>();
        result.add("Test");
        toDoList mytodos = new toDoList();
        mytodos.addTodo("Test");
        assertEquals(result, mytodos.get());

    }


}
