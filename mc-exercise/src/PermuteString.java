import java.util.HashSet;

public class PermuteString {

    /**
     * Permute all string inputs.
     *
     * @param input String to permute
     * @return a HashSet of all unique permutations
     */
    public static HashSet<String> permute(String input) {
        HashSet<String> set = new HashSet<>();
        String permuteString = "";
        boolean[] used = new boolean[input.length()];
        permute(set, input, permuteString, used);
        return set;
    }

    /**
     * Applies backtracking algorithm to output all permutation of string input.
     *
     * @param set Empty set to store all permutations
     * @param input String to permute
     * @param permuteString Temporary string to test permutations on
     * @param used Array of used characters when permuting
     */
    private static void permute(HashSet<String> set, String input, String permuteString, boolean[] used) {
        if (permuteString.length() == input.length()) {
            set.add(permuteString);
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (used[i] == true) continue;
                permuteString += input.charAt(i);
                used[i] = true;
                permute(set, input, permuteString, used);
                used[i] = false;
                permuteString = permuteString.substring(0, permuteString.length() - 1);
            }
        }
    }
}
