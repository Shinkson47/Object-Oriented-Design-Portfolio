package com.shinkson47.portfolio.labs;

import com.sun.istack.internal.NotNull;
import com.shinkson47.dmulib.*;

/**
 * <h1>A counter with a max value.</h1>
 * When incrementing, value can never equal or surpass {@code this.max}, nor can it fall below zero.
 * @author <a href="https://www.shinkson47.in">Jordan T. Gray on 20/10/2020</a>
 * @version 1.1
 */
public final class ModuloCounter extends Counter {

    //#region properties
    public static final int DEFAULT_MAX = 100;
    private int max;
    private Counter cycles = new Counter();
    //#endregion


    //#region get/set
    public void setMax(int max) {
        this.max = max;
    }
    //#endregion

    //#region constructor
    public ModuloCounter(){
        this(0);
    }

    public ModuloCounter(int count){
        this(0,DEFAULT_MAX);
    }

    public ModuloCounter(int count, int max){
        super(count);
        setMax(max);
    }
    //#endregion


    /**
     * If out of bounds, this has no effect
     * @param count the int value at which the count should be set
     */
    @Override
    public void setCount(int count) {
        if (!inRange(count)) return;
        super.setCount(count);
    }

    @Override
    public synchronized void increment() {
        this.incrementBy(1);
    }

    /**
     * Increments the counter by the specified quantity.
     *
     * If value is less than zero, or greater than <b>max</b>, the value is cleared.
     * @param amount the int value at which the counter should be increased
     */
    @Override
    public synchronized void incrementBy(int amount) {
        if (!assertCounterInRange()) return;
        super.incrementBy(amount);
    }

    /**
     * If the counter is in range, has no effect.
     * Else, if counter is out of range, resets counter.
     * @return true if was in range
     */
    private boolean assertCounterInRange(){
        boolean eval = inRange(getCount());
        if (!eval) reset();
        return eval;
    }

    @Override
    public void reset(){
        cycles.increment();
        super.reset();
    }

    /**
     * Determines if a value is within 0-<b>max</b>
     * @param i value to evaluate
     * @return true if in range, else false
     */
    private boolean inRange(int i){
        return i >= 0 && i < max - 1;
    }

    public int calcIncrements(){
        return (max*cycles.getCount()) + getCount();
    }

    public static void main(String[] args) {
        ModuloCounter counter = new ModuloCounter(0,5);

        do {
            System.out.println(counter.toString());
            counter.increment();
        } while (true);
    }


    /**
     * Returns a textual representation of the counter.
     * @return a textual representation of the counter.
     */
    @Override
    public String toString() {
        return "ModuleCounter:[count=" + getCount()
                + ", max=" + max
                + ", resets=" + cycles.getCount()
                + ", increments=" + calcIncrements()
                +"]";
    }

    @Override
    public boolean equals(@NotNull Object o) {
        if (o == null || getClass() != o.getClass()) return false; // If null, don't continue.
        if (this == o) return true;                                // Same instance.
        ModuloCounter counter = (ModuloCounter) o;                 // Throws ClassCastException if not a ModuleCounter
        return super.getCount() == counter.getCount() && max == counter.max && counter.cycles.getCount() == cycles.getCount();
    }
}
