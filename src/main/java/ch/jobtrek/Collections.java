package ch.jobtrek;

import org.assertj.core.data.MapEntry;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Collections {

    /**
     * @param array An array that contains strings of different lengths
     * @param size  The string size used to chunk the array
     * @return An array containing two arrays, one with the stings below and equal
     * of the size, and another with the stings longer than the size
     */
    public static List<List<String>> chunkArrayByStringSize(List<String> array, int size) {
        List<List<String>> output = new ArrayList<List<String>>();
        output.add(new ArrayList<String>());
        output.add(new ArrayList<String>());
        for (String word:array) {
            if (word.length() > size) {
                output.get(1).add(word);
            } else {
                output.get(0).add(word);
            }
        }
        return output;
    }

    /**
     * @param numbers A list of integers
     * @return A list containing the integers of the original list, without
     * duplicates, sorted by frequency of occurrence
     */
    public static List<Integer> frequencyOfApparition(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    /**
     * @param numbers A list, containing list of numbers
     * @return The sum of all numbers, but all odd numbers should be multiplied before sum
     * Should return zero if there is no numbers
     */
    public static Integer sumArrays(List<List<Integer>> numbers) {
        var output = 0;
        for (var i:numbers) {
            for (var j:i) {
                if (j%2==1) {
                    output += 2*j;
                }
                else {
                    output += j;
                }
            }
        }
        return output;
    }

    /**
     * @param students A hashmap containing students name as key, and student grade as value
     * @return The student with the best grade in the map
     */
    public static String bestStudent(Map<String, Integer> students) {
        return students
                .entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getKey))
                .get().getKey();
    }
}
