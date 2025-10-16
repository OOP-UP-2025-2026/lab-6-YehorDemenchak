import ua.onpu.smartphone.Smartphone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Smartphone s = new Smartphone(new double[]{55.4761,23.67643});
        System.out.println(Arrays.toString(s.getCoordinates()));
        s.makeCall();
        s.receiveCall();
    }
}
