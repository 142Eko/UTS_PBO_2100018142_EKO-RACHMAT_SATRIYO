class Dosen extends Karyawan{
  int sks;
  int nidn;
  String jurusan;
  String nip;
  // overloading pada nip menjadi string
  public void Data_Karyawan(String nip,int nidn,int tanggal_lahir, int bulan_lahir,int tahun_lahir, int   tahun_masuk,String jenis_kelamin,String nama,String jurusan,String alamat){
      this.nip = nip;
      this.nidn= nidn;
      this.tanggal_lahir= tanggal_lahir;
      this.bulan_lahir= bulan_lahir;
      this.tahun_lahir= tahun_lahir;
      this.tahun_masuk= tahun_masuk;
      this.jenis_kelamin= jenis_kelamin;
      this.nama = nama;
      this.alamat=alamat;
      this.jurusan=jurusan;
      }
  
  //overriding
  
  public void Display(){
        System.out.println("Nama           = "+nama);
        System.out.println("NIP            = "+nip);
        System.out.println("NIDN           = "+nidn);
        System.out.println("Jurusan        = "+jurusan);
        System.out.println("Alamat         = "+alamat);
        System.out.println("Tanggal lahir  = "+tanggal_lahir+"-"+bulan_lahir+"-"+tahun_lahir);
        System.out.println("Jenis Kelamin  = "+jenis_kelamin);
        System.out.println("Tahun Masuk    = "+tahun_masuk);
      } 
  public void total_gaji_sks(int sks){
   this.gaji=(sks*4*100000)+gaji;
   System.out.println("Gaji /bulan    = Rp."+gaji);
   }
}