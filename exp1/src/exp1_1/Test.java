package exp1_1;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Search search1 = new BinarySearch();
        Search search2 = new LinearSearch();
        List<Item> list = new ArrayList<>();
        search1.findItem(list,"name");
        search2.findItem(list,"name");
    }
}
