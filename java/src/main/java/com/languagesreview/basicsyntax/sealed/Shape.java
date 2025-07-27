package com.languagesreview.basicsyntax.sealed;

/**
 * Sealed abstract class for shape hierarchy
 */
public sealed abstract class Shape permits Circle, Rectangle, Triangle {
    abstract double area();
} 