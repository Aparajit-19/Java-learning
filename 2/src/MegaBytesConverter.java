public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int MegaByte = kiloBytes / 1024 ;
            int MegaByteRemainder = kiloBytes % 1024; //rem concept of remainder operator %
            System.out.println(kiloBytes + "KB = " + MegaByte + "MB and " +
                                        MegaByteRemainder + "KB");
        }

    }
}
