public class HardDisc {
    private int memory;
    private int divided;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDivided() {
        return divided;
    }

    public void setDivided(int divided) {
        this.divided = divided;
    }

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
