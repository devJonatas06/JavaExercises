package STUDYJAVA.Polymorphism.Emcapsulamento;

public class Printer {
    private int tonerLevel;


    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel > 0 && tonerLevel <= 100 ? -1 : tonerLevel);
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100){
            return -1;
        }
        if (tonerAmount + tonerLevel > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int Pages){
        int pagesToPrint = Pages;
        if (duplex){
            pagesToPrint = (Pages / 2) + (Pages % 2);
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }


}

