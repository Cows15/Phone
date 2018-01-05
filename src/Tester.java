public class Tester {

    public static void main(String[] args) {
        new Tester();
    }
    public Tester(){
        Phone phone = new Phone();
        SmartPhone SmartPhone = new SmartPhone();
        testPhone(phone);
        testSmartPhone(SmartPhone);
        System.out.println();
        System.out.println();



    }
    private void testPhone(Phone phone){
        phone.callNumber(5489230);
        phone.isRinging();
    }
    private void testSmartPhone(SmartPhone phone){
        phone.sendEmail("Answer my emails", "magintc@mac.com");
        phone.retrieveEmail();
    }

    /*
    Example of polymorphism via class inheritance
     */
}
