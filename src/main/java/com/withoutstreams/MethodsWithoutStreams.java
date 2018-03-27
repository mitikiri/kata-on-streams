package com.withoutstreams;

import java.util.ArrayList;
import java.util.List;

public final class MethodsWithoutStreams{

  public List<String> flattenSomeCollections(List<List<String>> Animals) {
        List<String> flatcollection = new ArrayList<>();
        for(List<String> subCollection : Animals){
            for (String value : subCollection){
                flatcollection.add(value);

            }
        }
        return flatcollection;
    }
}
