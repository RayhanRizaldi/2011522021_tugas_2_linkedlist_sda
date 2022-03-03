import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

                LinkedList<String> saya = new LinkedList<>();
                saya.add("M");
                saya.add("U");
                saya.add("H");
                saya.add("A");
                saya.add("M");
                saya.add("M");
                saya.add("A");
                saya.add("D");
                saya.add(" ");
                saya.add("R");
                saya.add("A");
                saya.add("Y");
                saya.add("H");
                saya.add("A");
                saya.add("N");
                saya.add(" ");
                saya.add("R");
                saya.add("I");
                saya.add("Z");
                saya.add("A");
                saya.add("L");
                saya.add("D");
                saya.add("I");
        
                System.out.println(" ");
                System.out.println("NAMA : " +saya);
                System.out.println(" ");
        
                System.out.println("ADD");
                saya.addFirst("Dr. ");
                saya.addLast(" Ph.D.");
                System.out.println("NAMA TERKINI : "+saya);
                System.out.println("------------------------------------");
        
                System.out.println("SISIP");
                saya.set(1, "B");
                saya.set(5, "N");
                saya.set(7, "A");
                saya.set(10, "N");
                saya.set(19, "E");
                System.out.println("UPDATE TERKINI : "+saya);
                System.out.println("------------------------------------");
        
                System.out.println("HAPUS");
                saya.removeFirst();
                saya.removeLast();
                saya.removeLast();
                saya.remove(1);
                saya.remove(1);
                saya.remove(3);
                saya.remove(4);
                saya.remove(4);
                saya.remove(6);
                saya.remove(7);
                saya.remove(6);
                saya.remove(6);
                saya.remove(8);
                saya.remove(10);
                saya.remove(9);
                System.out.println("HASIL TERKINI : "+saya);
                System.out.println("------------------------------------");
        
                System.out.println("PUSH");
                saya.push(" ");
                saya.push("E");
                saya.push("V");
                saya.push("O");
                saya.push("L");
                saya.push("I");
                System.out.println("CODE TERKINI : "+saya);
        
                System.out.println("POP");
                saya.pop();
                System.out.println("HASIL AKHIR : "+saya);
    }
}
