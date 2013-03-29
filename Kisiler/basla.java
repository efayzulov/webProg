
public class basla extends memur {

  public static void main(String[] args) {
		basla Kisi = new basla();
		Kisi.Kisi_Tanimla("12547896325", "Eldar", "Fayzulov", "01.01.1988");
		Kisi.Ogrenci_Tanimla(12345678, "Bilgisayar Mühendisligi", "4");
		Kisi.Hoca_Tanimla(12345, "Bilgisayar Mühendisligi");
		Kisi.Memur_Tanimla(12345, "deneme");
		System.out.println(Kisi.Ad);
		ogrenci.derse_girer("");
		ogrenci.kantine_git("");
		hoca.ders_yap("");
		hoca.Sinav_yap("");
		memur.Evrak_getirir("");
		memur.Evrak_goturur("");

	}

}
