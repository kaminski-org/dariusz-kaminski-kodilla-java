package com.kodilla.testing.shape;

public interface Shape {
    double getField();

    default String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
