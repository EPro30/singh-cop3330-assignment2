package ex31;

import ex29.HandleBadInput;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {
    public KarvonenHeartRate obj;

    public void setup()
    {
        obj = new KarvonenHeartRate();
    }

    @Test
    public void hearRateCheck()
    {
        setup();
        int restingPulse = 65;
        int age = 22;
        double i;
        int hr;
        for(i = 0.55; i < 0.96;)
        {
            hr = (int)((((220.0-(double)(age)- ((double)restingPulse)) * i) + ((double)restingPulse)));
            int ret = obj.calcHeartRate(restingPulse, age, i);
            assertEquals(hr, ret);
            i = i+ 0.05;
        }
    }

}