public class TugasJobsheet1 {
    public static void main (String [] args) {
        if(args.length > 0){

            switch(args[0]){
                case "halo"
                System.out.println("hai juga");
                break;
                case "help"
                System.out.println("***** IDENTITAS DIRI *****");
                System.out.println("Nama    : Firdaus Yuli Darmawan");
                System.out.println("Absen   : 12");
                System.out.println("Kelas   : 1A");
                System.out.println("Prodi   : D4 TI");
                System.out.println("Jurusan : Teknologi Informasi");
                break;
                case "hello":
                // tampilkan pesan hello
                if (args.length > 1){
                    System.out.println("Hello " + args[1]);
                } else {
                    System.out.println("Hello World!");
                }
                break;
            default:
                // tampilkan ucapan argumen tidak dikenali
                System.out.println("argumen tidak dikenali, silahkan ketik `Petani help` untuk bantuan");
        }

    }

            
            }
        }
      
    
