// Características do objeto

public class Computador {
    public String gabinete;
    public String placaMae;
    public String processador;
    public String placaVideo;
    public String memoria;
    public String ssd;
    public String fonte;
    public boolean ligado;
  
    // Construtor da Classe(objeto)

    public Computador() {
        gabinete = gabinete;
        placaMae = placaMae;
        processador = processador;
        placaVideo = null;
        memoria = null;
        ssd = ssd;
        fonte = fonte;
         
    }

    public Computador(String gabinete, String placaMae, String processador){
        // Atributo = parametro de entrada
        // this faz referencia para a propria classe (Computador)
        this.gabinete = gabinete;
        this.placaMae = placaMae;
        this.processador = processador;
        this.placaVideo = placaVideo;
        this.memoria = null;
        this.ssd = ssd;
        this.fonte = fonte;
  
    }

    public Computador(String gabinete, String placaMae, String processador, String placaVideo, String memoria, String ssd, String fonte){
        this.gabinete = gabinete;
        this.placaMae = placaMae;
        this.processador = processador;
        this.placaVideo = placaVideo;
        this.memoria = memoria;
        this.ssd = ssd;
        this.fonte = fonte;

    }

  
    public void ligar(){
      ligado = true;
      System.out.println("Bem-vindo!!!");
    }
  
    public void bateria(){
      System.out.println("Bateria: 20%" + " " + "Conecte um carregador");
    }
  
    public void desligar(){
      ligado = false;
      System.out.println("Até Logo");
    }
  
  }