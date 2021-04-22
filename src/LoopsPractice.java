import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoopsPractice {

    public static void main(String[] args) {
        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apperal and the slightly "
                + "more in demand category:makeup along with the category:furniture and ... .";

        //printCategories(str);

        printCategoriesWithFor(str);
    }

//    public static void printCategories(String string) {
//        int i = 0;
//        while (true) {
//            int found = string.indexOf("category:", i);
//            System.out.println(found);
//            if (found != -1)
//            System.out.println(string.toCharArray()[found]);
//            if(found == -1) break;
//            int start = found + 9; //start of the actual category
//            int end = string.indexOf(" ", start);
//            System.out.println(end);
//            System.out.println(string.substring(start,end));
//            i = end + 1;
//        }


//        String name = "sfdghjkluytrehsjdf";
//
//        for (int j = name.length() - 1; j >= 0 ; j--) {
//            System.out.println("char: " + name.charAt(j));
//        }
//
//        for (int k = 0; k <= 100; k+=2) {
//            System.out.println(k);
//        }


    String str = "We have a large inventory of things in our warehouse falling in "
            + "the category:apperal and the slightly "
            + "more in demand category:makeup along with the category:furniture and ... .";

    public static void printCategoriesWithFor(String word) {
        for(int i = 0; i < word.length(); i++) {
            int found = word.indexOf("category:",i);
            if(found == -1) break;
            int start = found + 9;
            int end = word.indexOf(" ",start);
            System.out.println(word.substring(start,end));
            i = end + 1;
        }
    }

    public static void printCategoriesWithLambda(String word) {
        List<char[]> myList = Collections.singletonList(word.toCharArray());



    }
}
