import org.example.IntegerListImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegerListImplTest {
    private final IntegerListImpl integerList = new IntegerListImpl();

    @AfterEach
    public void afterEach() {
        integerList.clear();}

    @Test
    void addTest() {
        Integer[] elements = {1, 2, 3, 4, 5};
        add(elements);

        for (int i = 0; i < elements.length; i++) {
            assertThat(integerList.get(i)).isEqualTo(elements[i]);
            assertThat(integerList.contains(elements[i])).isTrue();
            assertThat(integerList.indexOf(elements[i])).isEqualTo(i);
            assertThat(integerList.lastIndexOf(elements[i])).isEqualTo(i);
        }

        assertThat(integerList.toArray()).hasSize(elements.length);
        assertThat(integerList.toArray()).containsExactly(elements);
    }

    @Test
    void addByIndexAndItemTest() {
        Integer[] elements = {1, 2, 3, 4, 5};
        add(elements);

        integerList.add(0, 6);
        assertThat(integerList.size()).isEqualTo(elements.length + 1);
        assertThat(integerList.get(0)).isEqualTo(6);

        integerList.add(3, 0);
        assertThat(integerList.size()).isEqualTo(elements.length + 2);
        assertThat(integerList.get(3)).isEqualTo(0);
        assertThat(integerList.indexOf(0)).isEqualTo(3);
        assertThat(integerList.lastIndexOf(0)).isEqualTo(3);

        integerList.add(7, 9);
        assertThat(integerList.size()).isEqualTo(elements.length + 3);
        assertThat(integerList.get(7)).isEqualTo(9);
        assertThat(integerList.indexOf(9)).isEqualTo(7);
        assertThat(integerList.lastIndexOf(9)).isEqualTo(7);
    }

    @Test
    void setTest() {
    }

    @Test
    void removeByItemTest() {
    }

    @Test
    void removeByIndexTest() {
    }

    @Test
    void containsTest() {
    }

    @Test
    void indexOfTest() {
    }

    @Test
    void lastIndexOfTest() {
    }

    @Test
    void getTest() {
    }

    @Test
    void equalsTest() {
    }

    @Test
    void sizeTest() {
    }

    @Test
    void isEmptyTest() {
    }

    @Test
    void clearTest() {
    }

    @Test
    void toArrayTest() {
    }

    @Test
    void checkItemTest() {
    }

    @Test
    void checkIndexTest() {
    }

    private void add(Integer [] elements) {
        assertThat(integerList.isEmpty()).isTrue();
        Stream.of(elements).forEach(integerList::add);
        assertThat(integerList.size()).isEqualTo(elements.length);
    }

}
