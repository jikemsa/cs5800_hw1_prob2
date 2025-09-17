public class Freelancer implements Payable{
    private String lastName, firstName;
    private double hourlyRate, hoursWorked;

    Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked){
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate >= 0.0) {
            this.hourlyRate = hourlyRate;
        }
    }



    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0.0) {
            this.hoursWorked = hoursWorked;
        }
    }

    public double calculatePayment(){
        if(hoursWorked>40.0){
            return (40.0*hourlyRate + (hoursWorked-40.0)*hourlyRate*1.5);
        }else{
            return hourlyRate*hoursWorked;
        }
    }


    public String getPayeeName(){
        return (firstName+ " "+ lastName);
    }

    public void print(){
        IO.println(String.format(getPayeeName() + " is owed:"+calculatePayment()));
    }
}
