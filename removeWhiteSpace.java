package JavaProgramms;

public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Kamal Bhadra     is a Qualityana lit";
		String str2 = str1.replaceAll("\\s", "");
		System.out.println(str2);

	}

}
