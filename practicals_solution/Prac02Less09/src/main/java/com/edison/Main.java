package com.edison;

import com.edison.packone.ClassOne;
import com.edison.packtwo.ClassTwo;

public class Main {
    public static void main(String[] args) {
        ClassTwo a = new ClassTwo();
        ClassOne b = new ClassOne();
        a.methodClassTwo();
        b.methodClassOne();
    }
}