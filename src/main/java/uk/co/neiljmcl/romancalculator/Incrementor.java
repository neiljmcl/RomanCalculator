package uk.co.neiljmcl.romancalculator;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Incrementor {
    public String apply(String input) {
        String[] split = input.split("");
        return increment(Arrays.asList(input.split(""))).stream().collect(Collectors.joining(""));
    }
    private List<String> increment(List<String> input) {
        return input;
    }
}
