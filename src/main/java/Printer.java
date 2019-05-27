public class Printer {

    private int paper;
    private int toner;

    public Printer() {
        this.paper = 20;
        this.toner = 100;
    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner() {
        return this.toner;
    }

    public void print(int pages, int copies) {
        if (this.paper >= pages * copies) {
            this.paper -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }
}
