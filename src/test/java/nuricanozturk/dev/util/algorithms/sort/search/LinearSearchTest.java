/**
 * FILE		    : LinearSearchTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * LinearSearchTest class is test class for LinearSearch class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.algorithms.sort.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static java.util.List.of;
import static nuricanozturk.dev.util.collection.NCollection.linearSearch;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LinearSearchTest {

    private final List<String> strList = of("Ali", "Burak", "Ceyhun", "Deniz", "Elif", "Feyza", "Gamze", "Halil", "Iraz", "İrem");

    @ParameterizedTest
    @CsvSource({"Elif", "Iraz", "Ceyhun", "Gamze", "Halil"})
    public void linearSearchTestFound(String key) {
        assertNotEquals(linearSearch(strList, key, "Not Found!"), "Not Found!");
    }


    @ParameterizedTest
    @CsvSource({"Nuri", "Can", "Dogan", "Ahmet"})
    public void linearSearchTestNotFound(String key) {
        assertEquals(linearSearch(strList, key, "Not Found!"), "Not Found!");
    }
}
