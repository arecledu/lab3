import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListTests {
    class PrefixChecker implements StringChecker {
        String prefix;
        public PrefixChecker(String prefix) {
            this.prefix = prefix;
        }
        @Override
        public boolean checkString(String s) {
            return s.startsWith(prefix);
        }

    }

    @Test
    public void testFilterRemoveAllEvenSameOrder() {;
        List<String> input = Arrays.asList(new String[] {"america", "anatolia", "AT&T", "amatan"});
        assertArrayEquals(new String[] {"america", "amatan"}, 
            ListExamples.filter(input, new PrefixChecker("am")).toArray());
    }

    @Test
    public void testMerge() {

    }
}
