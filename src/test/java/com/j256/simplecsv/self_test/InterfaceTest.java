package com.j256.simplecsv.self_test;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {
    private final IDemo<String> demo = iDemo;

    private static final IDemo<String> iDemo = new IDemo<String>(){
        @Override
        public boolean isFiltered(List<String> list) {
            return list.size() > 0;
        }
    };

    public List<String> filtered(List<String> objects) {
        List<String> res = new ArrayList<String>();
        for (String s:objects) {
            if(demo.isFiltered(objects)){
                continue;
            }else {
                res.add(s);
            }
        }
        return res;
    }







}
