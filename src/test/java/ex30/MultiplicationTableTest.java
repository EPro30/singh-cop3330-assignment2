package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {
    public MultiplicationTable obj;

    public void setup()
    {
        obj = new MultiplicationTable();
    }

    @Test
    public void productCheck() {
        setup();
        int i, j, prdct;
        for (i = 0; i < 13; i++) {
            for (j = 0; j < 13; j++) {
                prdct = i * j;
                assertEquals(prdct, obj.product(i, j));
            }
        }
    }

}