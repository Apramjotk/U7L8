import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int count=0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                count++;
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Selection sort, number repeated "+ count);
    }

    public static void insertionSort(int[] elements)
    {
        int count=0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                count++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Selection sort, number repeated "+ count);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        for (int i=0; i< words.size()-1; i++){
            int minIndex = i;
            for (int k = i + 1; k <  words.size(); k++) {
                if (words.get(i).compareTo(words.get(minIndex))<0){
                    minIndex = k;
                }
            }
            String  temp = words.get(i);
            words.set(i,words.get(minIndex));
            words.set(minIndex, temp);
            }
        }


    public static void insertionSortWordList(ArrayList<String> words)
    {
        int count=0;
        for (int j = 1; j <  words.size(); j++)
        {
            String  temp = words.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1))<0) {
                words.set(possibleIndex, words.get(possibleIndex - 1));
                possibleIndex--;
            }
            words.set(possibleIndex, temp);
            }

    }
}
