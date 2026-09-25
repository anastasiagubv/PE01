import java.util.Scanner;

public class ProgramaPrincipal {
    Scanner sc = new Scanner(System.in);

    String messatge = "";
    String key = "";

    public static void main(String[] args) {
        ProgramaPrincipal s = new ProgramaPrincipal();
        s.start();
    }

    public void start() {
        menu();
    }

    public String readString(String prompt) {
        String input = "";
        boolean valid = false;

        do {
            System.out.print(prompt);
            try {
                input = sc.nextLine();
                valid = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                valid = false;
            }
        } while (!valid);

        return input;
    }

    public void menu() {
        //Obtenir clau
        key = readString("Introdueix clau: ");

        //Obtenir missatge
        messatge = readString("Introdueix missatge: ");

        //Encriptar missatge cirdant el mètode d'encriptar
        //Mostrar resultat
        //Comprovar que retorna el missatge encriptat amb el mètode de desencriptar
    }
}
