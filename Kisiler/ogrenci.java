
public class ogrenci extends Kisi{
  int OgrenciNo;
	String Bolum;
	String Sinifi;
	
	public void Ogrenci_Tanimla(int OgrenciNo, String Bolum, String Sinifi) {
		this.OgrenciNo = OgrenciNo;
		this.Bolum = Bolum;
		this.Sinifi = Sinifi;		
	}
	public static void derse_girer(String string){
		System.out.println("Ögrenci derse girer..");
	}
	public static void kantine_git(String string){
		System.out.println("Ögrenci kantine gider..");

	}
}
