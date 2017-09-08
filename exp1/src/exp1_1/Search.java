package exp1_1;

import java.util.List;

public interface Search {

    /**
     * 查找条项
     *
     * @param itemName 条项名称
     * @return 该条项
     */
    Item findItem(List<Item> list, String itemName);

}
