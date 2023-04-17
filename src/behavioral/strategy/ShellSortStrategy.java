package behavioral.strategy;

public class ShellSortStrategy implements SortStrategy {
    @Override
    public void sort() {
        System.out.println("Sort with ShellSortStrategy...");
    }
}
