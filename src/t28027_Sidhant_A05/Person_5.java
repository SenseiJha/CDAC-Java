package t28027_Sidhant_A05;

class Person_5 {
    int personId;
    String personName;
    int age;

    public Person_5(int personId, String personName, int age) {
        this.personId = personId;
        this.personName = personName;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Person ID : " + this.personId);
        System.out.println("Person Name : " + this.personName);
        System.out.println("Age : " + this.age);
    }

    public void checkAge() {
        if (this.age >= 18) {
            System.out.println("Age Status : Adult");
        } else {
            System.out.println("Age Status : Minor");
        }
    }

    public static void main(String[] args) {
        Doctor_5 doctor = new Doctor_5(101,"Dr. Sharma",45,"Cardiology",1500);
        Patient_5 patient = new Patient_5(201,"Rohan",30,"Fever",205);
        doctor.displayDoctorDetails();
        System.out.println();
        patient.displayPatientDetails();
    }
}