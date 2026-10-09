package t28027_Sidhant_A05;

class Patient_5 extends Person_5 {
    String disease;
    int roomNumber;
    
    public Patient_5(int personId, String personName, int age,String disease, int roomNumber) {
        super(personId, personName, age);
        this.disease = disease;
        this.roomNumber = roomNumber;
    }
    
    public double calculateRoomCharge() {
        return 2000;
    }
    
    public void displayPatientDetails() {
        this.displayPersonDetails();

        System.out.println("Disease : " + this.disease);
        System.out.println("Room Number : " + this.roomNumber);
        System.out.println("Room Charge : " + this.calculateRoomCharge());
    }
}