public class VendorInvoice implements Payable {
    private String vendorName, invoiceNumber;
    private double amountDue;

    VendorInvoice(String vendorName, String invoiceNumber, double amountDue){
        this.vendorName=vendorName;
        this.invoiceNumber=invoiceNumber;
        this.amountDue=amountDue;
    }


    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String getPayeeName(){
        return vendorName;
    }

    public double calculatePayment(){
        return amountDue;
    }
    public void print(){
        IO.println(String.format(getPayeeName() + " is owed:"+calculatePayment()));
    }
}
