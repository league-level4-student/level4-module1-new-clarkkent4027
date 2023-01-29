package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier {

	private String unfunkifiedText;

	public MixedCapsString(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String upperS = unfunkifiedText.toUpperCase();
		StringBuilder funkeemonkee = new StringBuilder(unfunkifiedText.toLowerCase());
		for (int i = 1; i < unfunkifiedText.length(); i += 2) {
			funkeemonkee.replace(i, i + 1, upperS.substring(i, i + 1));
		}
		System.out.println(unfunkifiedText);

		return funkeemonkee.toString();
	}
}
