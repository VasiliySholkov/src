package OverOne;

public class Computer {
    int vec;
    int size;
    boolean keyboard;
    boolean mouse;
    int cpu;

    public Computer(int vec, int size, boolean keyboard, boolean mouse, int cpu) {
        this.vec = vec;
        this.size = size;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.cpu = cpu;
    }

    public int getVec() {
        return vec;
    }

    public void setVec(int vec) {
        this.vec = vec;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isKeyboard() {
        return keyboard;
    }

    public void setKeyboard(boolean keyboard) {
        this.keyboard = keyboard;
    }

    public boolean isMouse() {
        return mouse;
    }

    public void setMouse(boolean mouse) {
        this.mouse = mouse;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vec=" + vec +
                ", size=" + size +
                ", keyboard=" + keyboard +
                ", mouse=" + mouse +
                ", cpu=" + cpu +
                '}';
    }
}
