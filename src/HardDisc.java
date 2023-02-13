public class HardDisc {
    int memory;
    int divided;

    public HardDisc(int memory, int divided) {
        this.memory = memory;
        this.divided = divided;
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "memory=" + memory +
                ", divided=" + divided +
                '}';
    }
}
