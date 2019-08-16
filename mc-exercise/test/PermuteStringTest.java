import org.junit.Test;

import java.util.HashSet;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertFalse;

public class PermuteStringTest {

    @Test
    public void testPermuteExampleInput() {
        String input = "GOD";
        HashSet<String> permutations = PermuteString.permute(input);
        String[] answers = {"GDO", "ODG", "GOD", "OGD", "DGO", "DOG"};

        assertEquals(permutations.size(), answers.length);

        for(String s : answers) {
            assertTrue(permutations.contains(s));
        }
    }

    @Test
    public void testIncorrectPermuteExampleInput() {
        String input = "GOD";
        HashSet<String> permutations = PermuteString.permute(input);
        String[] answers = {"GOD", "DOG"};

        assertFalse(permutations.size() == answers.length);
    }

    @Test
    public void testUniquePermutation1() {
        String input = "AAAAAAA";
        final int PERM_NUM = 1;
        HashSet<String> permutations = PermuteString.permute(input);

        assertEquals(permutations.size(), PERM_NUM);
        assertTrue(permutations.contains(input));
    }

    @Test
    public void testUniquePermutation2() {
        String input = "AaAa";
        final int PERM_NUM = 6;
        HashSet<String> permutations = PermuteString.permute(input);

        assertEquals(permutations.size(), PERM_NUM);
    }

    @Test
    public void testBlank() {
        String input = "";
        final int PERM_NUM = 1;
        HashSet<String> permutations = PermuteString.permute(input);

        // blank is considered one permutation
        assertEquals(permutations.size(), PERM_NUM);
    }

    @Test
    public void testLargeInput() {
        String input = "MASTERCARD";
        final int PERM_NUM = 907200;
        HashSet<String> permutations = PermuteString.permute(input);

        assertEquals(permutations.size(), PERM_NUM);
    }


}
