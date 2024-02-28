package OOPS_Concept;

class Bank {
    int ROI() {

        return 10;
    }
}

class SBI extends Bank {
    int ROI() {                                                               // ROI is the same method in both parent class and chile class

        return 20;
    }
}

class AXIS extends Bank {
    int ROI() {
        return 15;
    }
}

public class Method_Overriding {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        System.out.println(sbi.ROI());

        AXIS axis = new AXIS();
        System.out.println(axis.ROI());


    }
}
