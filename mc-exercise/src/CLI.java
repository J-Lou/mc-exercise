import java.util.HashSet;

public class CLI {

    /**
     * Main class to execute arguments when executing jar.
     * Will execute permutation on provided string using backtracking algorithm.
     * @param args String argument to permute when executing jar
     */
    public static void main(String[] args) {
        System.out.println("Output of all Permutations");
        HashSet<String> set = PermuteString.permute(args[0]);
        System.out.println("Number of permutations: " + set.size());
        System.out.println(set);
    }
}
