//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Interface HW:"));

    Payable[] payments = new Payable[5];
    payments[0] = new Freelancer("John","Booth",40.00,20.00);
    payments[1] = new VendorInvoice("Lab815","00123",420.00);
    payments[2] = new Freelancer("Steve","Smith",35.00,40.00);
    payments[3] = new VendorInvoice("Jagersoftware", "000001",3.50);
    payments[4] = new Freelancer("Frodo","Baggins",7.25,60.00);

    double totalOwed = 0.0;
    for(int i = 0; i < payments.length; i++){
        payments[i].print();
        totalOwed = totalOwed+ payments[i].calculatePayment();
    }

    IO.println(String.format("Total payout:"+totalOwed));

}
