class GymMembership{
    String member_name;
    String membership_type;
    int memembership_duration;
    GymMembership(String n, String t, int d){
        member_name=n;
        membership_type=t;
        memembership_duration=d;
    }

    public double fees(){
        double bpm = 100.0;
        return bpm*memembership_duration;
    }

    public void offers(){
        if (membership_type=="annual"){
            System.out.println("15% DISCOUNT AVAILABLE"); 
        }else{
            System.out.println("NO DISCOUNT AVAILABLE");
        }
    }

    public void display(){
        System.out.println("Member Name: " + member_name);
        System.out.println("Membership Type: " + membership_type);
        System.out.println("Duration: " + membership_type + " months");
        System.out.println("Membership Fees: $" + fees());
        offers();
    }
}

class PremiumMembership extends GymMembership{
    String personalTrainer;
    String spaAccess;

    PremiumMembership(String n, String t, int d, String p, String s){
        super(n, t, d);
        personalTrainer = p;
        spaAccess = s;
    }

    public double fees(){
        double bpm = super.fees();
        double additional_fee=0.0;

        if(personalTrainer=="yes"){
            additional_fee+= 20.0*memembership_duration;

        }
        if(spaAccess=="yes"){
            additional_fee+= 25.0*memembership_duration;
        }
        return bpm+additional_fee;
    }

    public void display(){
        super.display();;
        System.out.println("Personal Trainer Availability(yes or no)" + personalTrainer);
        System.out.println("Spa Access (yes or no)" + spaAccess);
    }
}


public class program1 {
    public static void main(String[] args) {
        GymMembership ob1 = new GymMembership("a", "annual", 12);

        PremiumMembership ob2 = new PremiumMembership("b", "monthly", 6, "yes", "no");

        System.out.println("Membership Details");
        ob1.display();

        System.out.println("Premium Membership Details");
        ob2.display();
    }
}
