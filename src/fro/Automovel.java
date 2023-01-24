package fro;

// importação da classe Scanner do pacote java.util
import java.util.Scanner;

// importação da classe DecimalFormat do pacote java.text
import java.text.DecimalFormat;

// classe mãe abstrata
public abstract class Automovel {
    
    // Declaração das variáveis da classe mãe
    private String placa;
    private String modelo;
    private boolean disp;
    private int km = 0;  // aluguel feito apenas com carros 0km
    
    // instância de entrada de dados no console
    Scanner sc = new Scanner(System.in);
    // instância da formatação de números
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    
    /* Método construtor que define os tipos de parâmetros que serão exigidos 
     * quando for instanciado
     */ 
    public Automovel(String modelo, String placa, int km){
        this.modelo = modelo;
        this.placa = placa;
        this.km = km;
    }
    
    // Módulo entrada de dados
    public void mostraModuloED(){
        System.out.println("||| Sistema de Locação de Veiculos - LOCAVEI |||"
                + "\nModulo : AUTOMÓVEL          Entrada de Dados");
    }
    
    // Método para cadastro de veículo
    public void cadastra(){
        // aqui sobreposto com metodo da classe filha
        
        System.out.print("Informe a placa do veículo: ");
        setPlaca(sc.next());
    }    
    
    /**
     * Método para validar se o veículo informado está disponivel no sistema
     * 
     * @param modelo: Armazena o carro informado para validação
     */
    public void validar(String modelo){
        String check1 = "Honda Civic";
        String check2 = "Chevrolet Prisma";
        String check3 = "Volkswagen Jetta";
        String check4 = "Fiat Cronos";
        String check5 = "Jeep Renegade";
        String check6 = "Renault Duster";

        if (check1.equals(modelo) || check2.equals(modelo) ||
                check3.equals(modelo) || check4.equals(modelo) ||
                check5.equals(modelo) || check6.equals(modelo)){
            System.out.println("Veículo está disponível para locação!");
            setDisp(true);
        } else {
            System.out.println("O carro informado não está disponível em" +
                    " nosso sistema ou não existe.\n" +
                    "Sistema Encerrado!!");
            System.exit(0);
            setDisp(false);
        }
    }
    
    /**
     * Implementa o serviço de adicional do seguro de acordo com a idade do 
     * usuário
     * 
     * @param idade
     */
    public abstract void adicionarSeguro(int idade);
    
    // Método abstrato para cálculo de preço
    public abstract float calcularPreco();    
    
    // Módulo saída de dados
    public void mostraModuloSD(){
        System.out.println("\n||| Sistema de Locação de Veículos - LOCAVEI ||"
                + "|\nMódulo : AUTOMÓVEL          Saída de Dados");
    }
    
    // Método para mostrar informações do veículo
    @Override
    public String toString(){
        return ("MODELO: "+getModelo()
                +"\nPLACA: "+getPlaca()
                +"\nDISPONIBILIDADE: Verdadeira");
    }
    
    // Declaração de métodos acessores e modificadores
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public boolean isDisp() {
        return disp;
    }

    public void setDisp(boolean disp) {
        this.disp = disp;
    }
}
