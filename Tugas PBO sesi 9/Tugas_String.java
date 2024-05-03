public class Tugas_String {
    public static void main(String[] args) {
        String nama = "Saila Julia";
        String nama2 = "Saila Julia";
        String nama3 = "saila julia";

        System.out.println("======Method Lenght======");
        System.out.println("Hasil dari Method Lenght        : " + nama.length());

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method Substring     : " + nama.substring(0, 11));

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method ChartAt       : " + nama.charAt(9));

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method toLowerCase   : " + nama.toLowerCase());

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method toUpper       : " + nama.toUpperCase());

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method Replace       : " + nama.replace("Julia", "Fitri"));
        System.out.println("Hasil dari Method Replace       : " + nama.replace("a", "o"));

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method Contains      : " + nama.contains("Saila"));
        System.out.println("Hasil dari Method Contains      : " + nama.contains("Julia"));
        System.out.println("Hasil dari Method Contains      : " + nama.contains("Ahmad"));

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method Equals        : " + nama.equals(nama2));
        System.out.println("Hasil dari Method Equals        : " + nama.equals(nama3));

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method Equals        : " + nama.equals(nama2));
        System.out.println("Hasil dari Method Equals        : " + nama.equals(nama3));

        System.out.println("======Method Substring======");
        System.out.println("Hasil dari Method EndsWith      : " + nama.endsWith("a"));
        System.out.println("Hasil dari Method EndsWith      : " + nama.endsWith("e"));
    }
}