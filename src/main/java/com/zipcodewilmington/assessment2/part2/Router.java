package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {
    HashMap<String,String> router;
    public void add(String path, String controller) {
        router = new HashMap<>();
        router.put(path,controller);
    }

    public Integer size() {
        return router.size();
    }

    public String getController(String path) {
        return router.get(path);
    }

    public void update(String path, String studentController) {

        router.put(path,studentController);
    }

    public void remove(String path) {
        router.remove(path);
    }
}
