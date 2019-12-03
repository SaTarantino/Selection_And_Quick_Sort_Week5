package arraySorter;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.IntegerArrayGenerator;
import scope.IntegerScope;
import timer.Timer;

/**
 * Time integer in Selection Sort
 *
 * author Salvatore Tarantino, u1860830
 * u1860830@hud.ac.uk
 */

public class IntegerSelectionSortTimer extends SelectionSortTimer<Integer>{

    @Override
    public Timer getTimer(int size) {
        ArrayGenerator<Integer> generator = new IntegerArrayGenerator(new IntegerScope());
        setArray(generator.getArray(size));
        return this;
    }

    public static void main(String[] args) {
        SelectionSortTimer timer = new IntegerSelectionSortTimer();
        timer.timingSequence();
    }
}
