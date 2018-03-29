package com.withoutstreams;

import com.withstreams.MostMethodsAreInThisClass;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public final class MethodsWithoutStreamsTest {
    @Test
    public void verifyUpperCaseConversion() {
        List<String> inputStrings = new ArrayList<String>();
        inputStrings.add("StreAmsJava");
        inputStrings.add("JavaKAta");
        inputStrings.add("testingSTRINGCONVERSION");

        MostMethodsAreInThisClass mostMethodsAreInThisClass = new MostMethodsAreInThisClass();
        List<String> outputStrings = mostMethodsAreInThisClass.willConvertToUpperCase(inputStrings);
        //List<String> expectedString = asList("STREAMSJAVA","JAVAKATA","TESTINGSTRINGCONVERSION");
        List<String> expectedStrings = new ArrayList<>();
        for (String inputString : inputStrings) {
            expectedStrings.add(inputString.toUpperCase());
        }

        //Assert.assertThat(outputStrings, Is.is(expectedStrings));
        Assert.assertEquals(outputStrings, expectedStrings);
    }

    @Test
    public void verifyGetPlacesMoreThanTenPlacesLong() {
        List<String> inputStrings = new ArrayList<String>();
        inputStrings.add("StreAmsJava");
        inputStrings.add("JavaKAta");
        inputStrings.add("testingSTRINGCONVERSION");

        MostMethodsAreInThisClass mostMethodsAreInThisClass = new MostMethodsAreInThisClass();
        List<String> outputStrings = mostMethodsAreInThisClass.getPlacesMoreThanTenCharLong(inputStrings);
        for(String outputString : outputStrings) {
            Assert.assertTrue(outputString.length()>10);
        }
    }
}
