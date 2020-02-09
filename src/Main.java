
import exporters.ConExporter;

import exporters.NumberExporter;

import providers.NumberProvider;



import providers.UserProvider;

import sorters.NumberSorter;
import sorters.SelectionSorter;


import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        NumberProvider theProvider = new UserProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new SelectionSorter();   ///new sorter goes here HERE
        var sortedNumbers = theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + sortedNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new ConExporter();//To HERE
        theExporter.export(sortedNumbers);
    }
}
