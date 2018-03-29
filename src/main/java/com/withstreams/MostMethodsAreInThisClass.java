package com.withstreams;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class MostMethodsAreInThisClass {
    public List<String> willConvertToUpperCase(List<String> inputStrings) {
        return inputStrings.stream().map(String::toUpperCase).collect(toList());

        //        List<String> outputStrings = new ArrayList<>();
        //        for (String inputString : inputStrings) {
        //            outputStrings.add(inputString.toUpperCase());
        //        }
        //        return outputStrings;
    }

    public List<String> getPlacesMoreThanTenCharLong(List<String> inputStrings) {
        return inputStrings.stream().filter(String -> String.length() > 10).collect(toList());
    }

}
