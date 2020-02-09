
package sorters;

import java.util.Collections;
import java.util.List;

public class SelectionSorter implements NumberSorter {

    @Override
    public List<Integer> sort(List<Integer> items) {
        for (int i = 0; i < items.size(); i++){
            int smallest = i;
            for (int j = i+1; j < items.size(); j++){
                if (items.get(j) < items.get(smallest)){
                    smallest = j;
                }
            }
            Collections.swap(items, smallest, i);
        }
        return items;
    }
}