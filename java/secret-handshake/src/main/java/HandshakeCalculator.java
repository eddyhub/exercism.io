import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> signalList = new ArrayList<>();

    List<Signal> calculateHandshake(int number) {
        if((number & 1) > 0) signalList.add(Signal.WINK);
        if((number & 2) > 0) signalList.add(Signal.DOUBLE_BLINK);
        if((number & 4) > 0) signalList.add(Signal.CLOSE_YOUR_EYES);
        if((number & 8) > 0) signalList.add(Signal.JUMP);
        if((number & 16) > 0) Collections.reverse(signalList);
        return signalList;
    }

}
