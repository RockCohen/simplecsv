package com.j256.simplecsv.self_test;

import java.util.List;

public interface IDemo<T> {
    boolean isFiltered(List<T> list);
}
