import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray {
        
        public static int[] get_array() {
            // complete this function
            
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        private static int[] array = {2, 4, 6};
        private static int minValue = 0;
        
        public static int[] get_array() {
            // complete this function
            
            return array;
        }

        public static int get_expected_result() {
            // complete this function
            
            return minValue;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        private static int[] array = {2, 4, 6, 2};
        private static int minIndex = 0;
        
        public static int[] get_array() {
            // complete this function
            
            return array;
        }

        public static int get_expected_result() {
            // complete this function
            
            return minIndex;
        }
    }
