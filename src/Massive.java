public class Massive
    {
    private int[] array;
    private int count;
    private int value;

    public Massive(int size, int count, int value){
        this.count = count;
        this.value = value;

    }

    public int getCount() {
        return count;
    }
    public int getValue() {
        return value;
    }
    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public void setValue(int value) {
        this.value = value;
    }
}