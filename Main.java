import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instancia(Cria) um objeto no sistema
        // O computador guardo o objeto na memória

        Scanner sc = new Scanner((System.in));
        System.out.println("Digite qual é a sua placa de Video:");
        String v = sc.nextLine();
        
        // Cria o primeiro objeto
        Computador computador1 = new Computador();
        // Efetua a inicializção dos atributos do objeto

        computador1.gabinete = "Corsair Carbide Series 100R";
        computador1.placaMae = "ASUS Prime A320M-K";
        computador1.processador ="AMD Ryzen 3 3200G";
        computador1.placaVideo = "NVIDIA GeForce GTX 1650 4GB";
        computador1.memoria = "8GB DDR4 2666MHz";
        computador1.ssd = "240GB Kingston A400";
        computador1.fonte = "Corsair VS450";
  
        System.out.println("\n" + computador1.gabinete + "\n" + computador1.processador + "\n" + computador1.placaVideo + "\n" + computador1.memoria + "\n" + computador1.ssd + "\n" + computador1.fonte);
  
        computador1.ligar();
        computador1.bateria();
        computador1.desligar();
        
        // Cria o segundo objeto
        Computador computador2 = new Computador("NZXT H510", "ASUS TUF B450M-PLUS GAMING", "AMD Ryzen 5 5600X ");
        System.out.println("\n" + computador2.gabinete + "\n" + computador2.placaMae + "\n" + computador2.processador );
  
        computador2.ligar();
        computador2.bateria();
        computador2.desligar();

        // Cria o terceiro objeto
        Computador computador3 = new Computador("Cooler Master MasterCase H500", "ASUS ROG Strix X570-E Gaming", "AMD Ryzen 9 5900X", v , "32GB DDR4 3600MHz", "1TB NVMe Samsung 980 Pro", "Corsair RM850x");
        System.out.println("\n" + computador3.gabinete + "\n" + computador3.processador + "\n" + v + "\n" + computador3.memoria + "\n" + computador3.ssd + "\n" + computador3.fonte);

        computador3.ligar();
        computador3.bateria();
        computador3.desligar();

        }
  }


