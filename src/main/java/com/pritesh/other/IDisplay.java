package com.pritesh.other;

public interface IDisplay {
    final int no = 100;

    public void display();

    /*
        Reference: https://dzone.com/articles/interface-default-methods-java
        New Feature in JAVA
        Java 8 introduces the “Default Method” or (Defender methods) feature,
        which allows the developer to add new methods to the interfaces without
        breaking their existing implementation. It provides the flexibility to
        allow interface to define implementation which will use as the default
        in a situation where a concrete class fails to provide an implementation
        for that method.
     */
    default public void print() {

    }

}
