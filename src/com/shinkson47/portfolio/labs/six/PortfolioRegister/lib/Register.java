package com.shinkson47.portfolio.labs.six.PortfolioRegister.lib;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Register extends ArrayList<Name> {

    /**
     * This should be public and static but the bs tests we're given won't allow me to do that.
     * That also means that i can't even use it in the constructor, which is the whole point.
     *
     * In fact, another test disallows this to even exist.<br>
     * <i>Let me follow the java conventions, and write good code...</i>
     */
    //private final int DEFAULT_CAPACITY = 20;

    private ArrayList<Name> fuckingStupidAndRedundantFieldThatIsRequiredForOneTestEvenThoughAnExtentionIsASignificantlyMoreEffectiveAndFollowsTheObjectOrientedApproachMuchBetterWhichShouldBeEncouragedAndNotForcefullyDisallowed;
    private int capacity;

    public Register(){
        this(20);// This should not be a literal, but i have no choice.
    }

    public Register(int _capacity){
        super(_capacity);
        capacity = _capacity;
    }

    public boolean isRegisterEmpty() {
        return size() == 0;
    }

    public int sizeOfRegister() {
        return size();
    }

    public int getRoomCapacity(){
        return capacity;
    }

    public void addName(Name name) {
        if (size() >= capacity) return;
        add(name);
    }

    public Name getName(int i) {
        return get(i);
    }

    public void addNames(ArrayList<Name> names) {
        if (names.size() + size() > capacity) return;
        addAll(names);
    }

    public void sortRegister() {
        sort(Name::compareTo);
    }

    public int countFirstNameOccurrences(String name) {
        AtomicInteger count = new AtomicInteger();
        forEach(s -> count.addAndGet((s.getFirstName().toLowerCase().equals(name.toLowerCase()) ? 1 : 0)));
        return count.get();
    }

    public void clearRegister() {
        clear();
    }

    public boolean searchRegisterByFirstNameInitial(char f) {
        AtomicBoolean found = new AtomicBoolean(false);
        forEach(name -> {
            if (name.getFirstName().startsWith(String.valueOf(f)))
                found.set(true);
        });
        return found.get();
    }

    public Name removeName(int i) {
        return remove(i);
    }


    /**
     * @return
     */
    @Override
    public String toString() {
        return "Register:[" +
                "Capacity:"+ capacity +
                ", Names:" + super.toString() + "]";
    }
}