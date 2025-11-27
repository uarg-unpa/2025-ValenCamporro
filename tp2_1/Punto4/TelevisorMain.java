package tp2_1.Punto4;

public class TelevisorMain {
    public static void main(String[] args) {

        Televisor miTelevisor = new Televisor(false, 1, 10, 1);

        miTelevisor.encender();
        System.out.println();
        miTelevisor.subirCanal();
        miTelevisor.subirVolumen();
        miTelevisor.bajarCanal();
        miTelevisor.bajarVolumen();
        miTelevisor.volverCanalAnterior();
        System.out.println();
        miTelevisor.apagar();

        System.out.println(miTelevisor);
    }
}
