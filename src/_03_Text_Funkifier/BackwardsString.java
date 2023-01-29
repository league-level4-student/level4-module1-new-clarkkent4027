package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	
StringBuilder funkee = new StringBuilder(unfunkifiedText);
System.out.println(unfunkifiedText);

    	return funkee.reverse().toString();

    }
}
