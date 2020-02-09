
package exporters;

import java.util.Arrays;
import java.util.List;

public class ConExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        int length = 0;
        length += String.valueOf(Arrays.asList(numbers)).length();
        for (int i = 0; i<length; i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("*" + numbers + "*");
        for (int i = 0; i<length; i++){
            System.out.print("*");
        }
    }
}
