package hw9;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListConvertor {
    public static <T> List<T> tilist(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);

        }
        return list;
    }
}
