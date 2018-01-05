public class SmartPhone extends Phone {
    public void sendEmail(String message, String address){
        System.out.println("Sending email");
    }
    public String retrieveEmail(){
        System.out.println("Retrieving Email");
        String messages = new String();
        return messages;
    }
    public boolean isRinging(){
        System.out.println("Is phone ringing");
        boolean ringing = false;
        return ringing;
    }
}
