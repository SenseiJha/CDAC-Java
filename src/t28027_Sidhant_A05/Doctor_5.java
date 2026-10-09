package t28027_Sidhant_A05;

class Doctor_5 extends Person_5 {
    String specialization;
    double consultationFee;

    public Doctor_5(int personId, String personName, int age,
    		String specialization, double consultationFee) {
        super(personId, personName, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public double calculateConsultationAmount() {
        return this.consultationFee;
    }

    public void displayDoctorDetails() {
        this.displayPersonDetails();

        System.out.println("Specialization : "+this.specialization);
        System.out.println("Consultation Fee :"+this.consultationFee);
        System.out.println("Consultation Amount : "+this.calculateConsultationAmount());
    }
}