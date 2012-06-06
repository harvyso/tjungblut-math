package de.jungblut.math.named;

import java.util.Iterator;

import de.jungblut.math.DoubleVector;
import de.jungblut.math.function.DoubleDoubleVectorFunction;
import de.jungblut.math.function.DoubleVectorFunction;

/**
 * A named vector that contains a string name and an embedded double vector.
 */
public final class NamedDoubleVector implements DoubleVector {

  private final String name;
  private final DoubleVector vector;

  public NamedDoubleVector(String name, DoubleVector v) {
    super();
    this.name = name;
    this.vector = v;
  }

  /**
   * @return the associated name of the vector.
   */
  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isNamed() {
    return true;
  }

  /**
   * @return get the raw embedded vector.
   */
  public DoubleVector getVector() {
    return vector;
  }

  @Override
  public double get(int index) {
    return vector.get(index);
  }

  @Override
  public int getLength() {
    return vector.getLength();
  }

  @Override
  public int getDimension() {
    return vector.getDimension();
  }

  @Override
  public void set(int index, double value) {
    vector.set(index, value);
  }

  @Override
  public DoubleVector apply(DoubleVectorFunction func) {
    return vector.apply(func);
  }

  @Override
  public DoubleVector apply(DoubleVector other, DoubleDoubleVectorFunction func) {
    return vector.apply(other, func);
  }

  @Override
  public DoubleVector add(DoubleVector v) {
    return vector.add(v);
  }

  @Override
  public DoubleVector add(double scalar) {
    return vector.add(scalar);
  }

  @Override
  public DoubleVector subtract(DoubleVector v) {
    return vector.subtract(v);
  }

  @Override
  public DoubleVector subtract(double scalar) {
    return vector.subtract(scalar);
  }

  @Override
  public DoubleVector multiply(double scalar) {
    return vector.multiply(scalar);
  }

  @Override
  public DoubleVector multiply(DoubleVector vector) {
    return vector.multiply(vector);
  }

  @Override
  public DoubleVector divide(double scalar) {
    return vector.divide(scalar);
  }

  @Override
  public DoubleVector divideFrom(double scalar) {
    return vector.divideFrom(scalar);
  }

  @Override
  public DoubleVector pow(int x) {
    return vector.pow(x);
  }

  @Override
  public DoubleVector abs() {
    return vector.abs();
  }

  @Override
  public DoubleVector sqrt() {
    return vector.sqrt();
  }

  @Override
  public double sum() {
    return vector.sum();
  }

  @Override
  public double dot(DoubleVector s) {
    return vector.dot(s);
  }

  @Override
  public DoubleVector slice(int length) {
    return vector.slice(length);
  }

  @Override
  public DoubleVector slice(int offset, int length) {
    return vector.slice(offset, length);
  }

  @Override
  public double max() {
    return vector.max();
  }

  @Override
  public double min() {
    return vector.min();
  }

  @Override
  public double[] toArray() {
    return vector.toArray();
  }

  @Override
  public DoubleVector deepCopy() {
    return vector.deepCopy();
  }

  @Override
  public Iterator<DoubleVectorElement> iterateNonZero() {
    return vector.iterateNonZero();
  }

  @Override
  public Iterator<DoubleVectorElement> iterate() {
    return vector.iterate();
  }

  @Override
  public boolean isSparse() {
    return vector.isSparse();
  }

}