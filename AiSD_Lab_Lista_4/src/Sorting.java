import java.util.Arrays;

public class Sorting
{

    public Sorting(){}


    public void bubble(int [] set)
    {

        int [] set_clone = set.clone();
        long start = System.nanoTime();
        int tmp;

        for (int i = 0; i < set_clone.length; i++)
        {
            for (int j = 1; j < set_clone.length; j++)
            {
                if(set_clone[j-1] > set_clone[j])
                {
                    tmp = set_clone[j-1];
                    set_clone[j-1] = set_clone[j];
                    set_clone[j] = tmp;
                }
            }
        }

        long stop = System.nanoTime();
        System.out.println("bubble: " + (stop-start) + " ns");
    }
    public void shell(int [] set)
    {
        int [] set_clone = set.clone();
        long start = System.nanoTime();

        for (int gap = set_clone.length/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < set_clone.length; i ++)
            {

                int temp = set_clone[i];

                int j;
                for (j = i; j >= gap && set_clone[j - gap] > temp; j -= gap)
                {
                    set_clone[j] = set_clone[j - gap];
                }

                set_clone[j] = temp;
            }
        }
        long stop = System.nanoTime();
        System.out.println("shell: " + (stop-start) + " ns");
    }

    public void insert(int [] set)
    {
        int [] set_clone = set.clone();
        long start = System.nanoTime();
        int tmp, j;

        for (int i = 1; i < set_clone.length; i++)
        {
            j = i - 1;
            tmp = set_clone[i];

            while(j >= 0 && set_clone[j] > tmp)
            {
                set_clone[j+1] = set_clone[j];
                j--;
            }
            set_clone[j+1] = tmp;
        }

        long stop = System.nanoTime();
        System.out.println("insert: " + (stop-start) + " ns");
    }

    public void select(int [] set)
    {
        int [] set_clone = set.clone();
        long start = System.nanoTime();
        int tmp;

        for (int i = 0; i < set_clone.length; i++)
        {
            int index_lowestNumber = i;
            for (int j = i + 1; j < set_clone.length; j++)
            {
                if(set_clone[j]<set_clone[index_lowestNumber])
                {
                    index_lowestNumber = j;
                }
            }
            if (index_lowestNumber != i)
            {
                tmp = set_clone[i];
                set_clone[i] = set_clone[index_lowestNumber];
                set_clone[index_lowestNumber] = tmp;
            }

        }

        long stop = System.nanoTime();
        System.out.println("select: " + (stop-start) + " ns");
    }

    public void mergeSort(int [] set)
    {
        
    }

    public void quickSort(int [] set, int mostLeft, int mostRight)
    {

        int i,j,pivot,tmp;

        i = (mostLeft+mostRight)/2;
        pivot = set[i];
        set [i] = set[mostRight];
        for(j = i = mostLeft; i < mostRight; i++)
        {
            if(set[i]<pivot)
            {
                tmp = set[i];
                set[i] = set[j];
                set[j] = tmp;
                j++;
            }
        }
        set[mostRight] = set[j];
        set[j] = pivot;
        if (mostLeft < j-1)
        {
            quickSort(set, mostLeft, j-1);
        }
        if (j + 1 < mostRight)
        {
            quickSort(set,j + 1, mostRight );
        }
    }

    public void quick(int [] set)
    {
        int [] set_clone = set.clone();

        long start = System.nanoTime();
        quickSort(set_clone, 0, set_clone.length - 1);
        long stop = System.nanoTime();

        System.out.println("quick: " + (stop-start) + " ns");
    }

//  ------------------------------------------------------------------------------------------------------------

    public void arraySort(int [] set)
    {
        int [] set_clone = set.clone();
        long start = System.nanoTime();
        Arrays.sort(set_clone);
        long stop = System.nanoTime();
        System.out.println("arrays.sort: " + (stop-start) + " ns");
    }
}