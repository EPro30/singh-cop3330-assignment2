package ex38;

import ex34.EmployeeListRemoval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class FilteringValuesTest {
    public FilteringValues obj;

    public void setup()
    {
        obj = new FilteringValues();
    }

    @Test
    public void listCheck1()
    {
        setup();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> retList = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(98);
        list.add(222);
        list.add(2040);
        list.add(1997);
        list.add(52);
        retList = obj.filterEvenNumbers(list);
        for(int n:retList)
        {
            int ret = n%2;
            assertEquals(0, ret);
        }

    }

}