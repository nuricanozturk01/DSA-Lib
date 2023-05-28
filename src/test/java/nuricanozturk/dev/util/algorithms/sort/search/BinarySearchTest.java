/**
 * FILE		    : BinarySearchTest.java
 * AUTHOR		: Nuri Can OZTURK
 * LAST UPDATE	: 28.05.2023
 * BinarySearchTest class is test class for BinarySearch class.
 * Copyleft (c) DSA-Lib
 * All Rights Free
 */
package nuricanozturk.dev.util.algorithms.sort.search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static java.util.List.of;
import static nuricanozturk.dev.util.collection.SearchCollections.binarySearch;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BinarySearchTest {
    private final List<String> strList = of("Ali", "Burak", "Ceyhun", "Deniz", "Elif", "Feyza", "Gamze", "Halil", "Iraz", "İrem");

    @ParameterizedTest
    @CsvSource({"Elif", "Iraz", "Ceyhun", "Gamze", "Halil"})
    public void binarySearchTestFound(String key) {
        assertFalse(binarySearch(strList, key) < 0);
    }

    @ParameterizedTest
    @CsvSource({"Dogan", "Can", "Ahmet", "Belis", "Melis"})
    public void binarySearchTestNotFound(String key) {
        assertFalse(binarySearch(strList, key) > 0);
    }
}
