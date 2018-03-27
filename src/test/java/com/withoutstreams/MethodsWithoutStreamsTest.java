package com.withoutstreams;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public final class MethodsWithoutStreamsTest {
    @Test
    public void ShouldTakeTwoListsAndFlattenItOut() {
        MethodsWithoutStreams methodsWithoutStreams = new MethodsWithoutStreams();
        List<List<String>> actual = asList(asList("Cat", "Dog"), asList("Hen", "Goat", "Cow"));
        List<String> expected = asList("Cat", "Dog", "Hen", "Goat", "Cow");
        assertThat(methodsWithoutStreams.flattenSomeCollections(actual), is(expected));
    }
}
