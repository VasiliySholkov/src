package Generic;

class Box <E>{
    private E value;
    public Box(E value) {
        this.value = value;
    }
    public E get() {
        return value;
    }
}
