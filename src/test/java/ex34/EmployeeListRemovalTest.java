package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListRemovalTest {
    public EmployeeListRemoval obj;

    public void setup()
    {
        obj = new EmployeeListRemoval();
    }

    @Test
    public void listCheck1()
    {
        setup();
        List<String> list = new ArrayList<>();
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
        obj.removeElement(list, "Chris Jones");
        assertFalse(list.contains("Chris Jones"));
    }

    @Test
    public void listCheck2()
    {
        setup();
        List<String> list = new ArrayList<>();
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
        list.add("John Doe");
        obj.removeElement(list, "John Smith");
        assertFalse(list.contains("John Smith"));
    }

    @Test
    public void listCheck3()
    {
        setup();
        List<String> list = new ArrayList<>();
        list.add("John Smith");
        list.add("Jackie Jackson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");
        obj.removeElement(list, "Chris Jones");
        obj.removeElement(list, "Jackie Jackson");
        obj.removeElement(list, "John Smith");
        obj.removeElement(list, "Jeremy Goodwin");

        assertFalse(list.contains("John Smith"));
        assertFalse(list.contains("Jackie Jackson"));
        assertFalse(list.contains("Chris Jones"));
        assertFalse(list.contains("Jeremy Goodwin"));
        assertTrue(list.contains("Amanda Cullen"));
    }

}