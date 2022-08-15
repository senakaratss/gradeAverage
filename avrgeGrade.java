import java.util.Scanner;
public class avrgeGrade {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);	    
		System.out.println("Math Grade:");
		int math=kb.nextInt();
		System.out.println("Physics Grade:");
		int phy=kb.nextInt();
		System.out.println("Chemistry Grade:");
		int chem=kb.nextInt();
		System.out.println("Turkish Grade:");
		int turkish=kb.nextInt();
		System.out.println("History Grade:");
		int history=kb.nextInt();
		System.out.println("Music Grade:");
		int music=kb.nextInt();
		int sum=(math+phy+chem+turkish+history+music);
		double avrge=sum/6;
		System.out.println("Average Grade: "+ avrge);
		boolean kosul = avrge >= 60;
		String gk = kosul ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";
        System.out.println(gk);
	}

}


