class Petani {
    public static void main(String[] args){

        
        if(args.length > 0){

            switch(args[0]){
                case "version":
                    // tampilkan versi program
                    System.out.println("Petani Version 1.0.0");
                    break;
                case "help":
                    // tampilkan bantuan program
                    System.out.println("Gunakan Perintah berikut:");
                    System.out.println("Petani version \t\t untuk mengecek versi");
                    System.out.println("Petani help \t\t untuk menampilkan bantuan ini");
                    System.out.println("Petani hello \t\t untuk menampilkan pesan hello world");
                    System.out.println("Petani hello [nama] \t untuk menampilkan pesan hello [nama]");
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