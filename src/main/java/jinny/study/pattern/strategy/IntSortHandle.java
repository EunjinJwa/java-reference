package jinny.study.pattern.strategy;

public class IntSortHandle implements SortHandle{
    private int[] array = null;

    @Override
    public void setArray(Object array) {
        this.array = (int[]) array;
    }
    @Override
    public void swap(int index) {
        int temp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = temp;
    }

    @Override
    public boolean outOfOrder(int index) {
        return array[index] > array[index+1];
    }

    @Override
    public int length() {
        return array.length;
    }


}
