import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import stack.mystack;

public class StackTest{

    //ellenőrizze, hogy az utoljára behelyezett elem az első, amit kikerül
    @Test
    void popTest(){
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(42);
        assertEquals(42, testStack.pop());
    }
    //egy frissen létrehozott verem üres
    @Test
    void emptyStackTest(){
        Stack testStack = new Stack();
        assertEquals(0, testStack.size());
    }
    //egy elemmel rendelkező verem nem üres
    @Test
    void oneElementStackTest(){
        Stack testStack = new Stack();
        testStack.push(42);
        assertEquals(false, testStack.empty());
    }
    //üres veremből nem lehet elemet kivenni (teszteljük, hogy dobódik-e kivétel)
    @Test
    void exceptionStackTest(){
        NoSuchElementException e = 
            assertThrows(NoSuchElementException.class,
                () -> {
                    Stack testStack = new Stack();
                    testStack.pop();
                });
            assertEquals("Stack is already empty!" , e.getMessage());
    }    
    //jól működik a size() metódus extremális értékeken (0,1)
    @Test
    void sizeTest(){
        Stack testStack = new Stack();
        assertEquals(0, testStack.size());
        testStack.push(42);
        assertEquals(1, testStack.size());
    }
    //ha az utolsó elem is kikerül, a verem üres
    @Test
    void lastElementPoppedIsEmptyStackTest(){
        Stack testStack = new Stack();
        testStack.push(42);
        testStack.pop();
        assertEquals(true, testStack.empty());
    }
}