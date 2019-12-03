package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.IntegerArrayGenerator;
import scope.IntegerScope;
import timer.Timer;

/**
 * Time integer in Quick Sort
 *
 * author Salvatore Tarantino, u1860830
 * u1860830@hud.ac.uk
 */

public class IntegerQuickSortTimer extends QuickSortTimer<Integer> {

    @Override
    public Timer getTimer(int size) {
        ArrayGenerator<Integer> generator = new IntegerArrayGenerator(new IntegerScope());
        setArray(generator.getArray(size));
        return this;
    }

    public static void main(String[] args) {
        QuickSortTimer timer = new IntegerQuickSortTimer();
        timer.timingSequence();
    }
}
