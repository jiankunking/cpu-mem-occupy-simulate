package com.jiankunking.memory;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiankunking on 2018/3/29.
 */
//@Component
public class memReaper {
    @PostConstruct
    public void memReaper() {
        long start = System.currentTimeMillis() / 1000;
        List<Map> list = new ArrayList<>();
        while (true) {
            HashMap<String, String> map = new HashMap<>();
            map.put("aaa", "nnnn");
            list.add(map);
            if (list.size() > 3000000) {
                System.out.println("clear");
                list.clear();
            }
            if ((System.currentTimeMillis() / 1000) - start > 1000) {
                return;
            }
        }
    }
}
