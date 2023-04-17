package behavioral.strategy;

public class QuickSortStrategy implements SortStrategy{
    @Override
    public void sort() {
        System.out.println("Sort with QuickSortStrategy...");
    }
}
