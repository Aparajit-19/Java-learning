public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex; //duplex means printer that prints in both side of paper

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            int a = this.tonerLevel + tonerAmount;
            if (a > 100){
                return -1;
            }
            else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        else {
            return -1;
        }
    }

    //imp
    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex == true){
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2; //rem
            pagesPrinted += pagesToPrint;
            System.out.println("Printing in duplex mode");
            return pagesToPrint;
        }
        else {
            return pages;
            }
        }


    public int getPagesPrinted(){
            return this.pagesPrinted;
        }
}
