public class ProgramGaji{
    public static void main(String[]args) {
        double gajipokok = 4600897;
        double tunjanganSI = gajipokok*0.1;
        double tunjanganA = 4*(0.02*gajipokok);
        double bruto = gajipokok+tunjanganSI+tunjanganA;
        double pensiun = 0.04*gajipokok;
        double netto = bruto-pensiun;

        System.out.println("Gaji Pokok      : "+gajipokok);
        System.out.println("Tunjangan Suami : "+tunjanganSI);
        System.out.println("Tunjangan Anak  : "+tunjanganA);
        System.out.println("Tunjangan Anak  : "+bruto);
        System.out.println("Iuran Pensiun   : "+pensiun);
        System.out.println("Gaji Bersih     : "+netto);
    }
}