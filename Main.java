class Main {
  public static void main(String[] args) {
    //dosen1
    System.out.println("");
    System.out.println("---------------------DATA DOSEN-----------------------"); 
    
    Dosen dosen1=new Dosen();
    dosen1.Data_Karyawan("201",2100018142,01,01,2001,2030,"Laki-laki","EKO RACHMAT SATRIYO","TEKNIK INFORMATIKA","Rt.01,Rw.01, Konoha,Konohagakure");
    dosen1.Display();
    dosen1.total_gaji_sks(10);
    System.out.println("");
    
    //dosen2 (6 sks)
    
    Dosen dosen2=new Dosen();
    dosen2.Data_Karyawan("202",2100000000,02,02,1999,2021,"Laki-laki","Pak B","SENI","Rt.02,Rw.02, Suna,Sunagakure");
    dosen2.Display();
    dosen2.total_gaji_sks(6);
    System.out.println(""); 
    
    //tendik
    System.out.println("---------------------DATA TENDIK-----------------------"); 
    
    Tendik tendik1=new Tendik();
    tendik1.Data_Karyawan(203,03,03,2003,2023,"Laki-laki","Kak A","Rt.03,Rw03, Rai,Raigakure");
    tendik1.Display();
    tendik1.total_gaji_jam(0);
    System.out.println(""); 

    Tendik tendik2=new Tendik();
    tendik2.Data_Karyawan(204,04,04,20004,2024,"Laki-laki","Kak B","Rt.04,Rw.04, Kiri,Kirigakure");
    tendik2.Display();
    tendik2.total_gaji_jam(20);
    System.out.println(""); 
  }
}