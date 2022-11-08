class Karyawan{
  int nip;
  int tahun_masuk;
  int tanggal_lahir;
  int bulan_lahir;
  int tahun_lahir;
  int gaji=2000000;

  String jenis_kelamin;
  String nama;
  String alamat;

public void Data_Karyawan(int nip,int tanggal_lahir, int bulan_lahir,int tahun_lahir, int   tahun_masuk,String jenis_kelamin,String nama,String alamat){
      this.nip = nip;
      this.tanggal_lahir=tanggal_lahir;
      this.bulan_lahir=bulan_lahir;
      this.tahun_lahir=tahun_lahir;
      this.tahun_masuk=tahun_masuk;
      this.jenis_kelamin=jenis_kelamin;
      this.nama=nama;
      this.alamat=alamat;
      }
  
public void Display(){
        System.out.println("Nama           = "+nama);
        System.out.println("NIP            = "+nip);
        System.out.println("Alamat         = "+alamat);
        System.out.println("Tanggal lahir  = "+tanggal_lahir+"-"+bulan_lahir+"-"+tahun_lahir);
        System.out.println("Jenis Kelamin  = "+jenis_kelamin);
        System.out.println("Tahun Masuk    = "+tahun_masuk);
      } 
}