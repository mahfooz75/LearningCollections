package com.example.collections;

import java.util.ArrayList;

public class CustomArrayList<T> extends ArrayList<T> {

  private static final long serialVersionUID = 1L;

  @Override
  public boolean add(T t) {
    if (this.contains(t)) {
      return true;
    } else {
      return super.add(t);
    }
  }
}
