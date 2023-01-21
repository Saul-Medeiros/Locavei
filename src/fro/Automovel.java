package fro;

//importação da classe Scanner do pacote java.util
import java.util.Scanner;

//importação da classe DecimalFormat do pacote java.text
import java.text.DecimalFormat;

public abstract class Automovel {//classe mãe abstrata
    
    /*Declaração das variáveis da classe mãe*/
    private String placa;
    private String modelo;
    private boolean disp;
    private int km = 0;//aluguel feito apenas com carros 0km
    
    //instância de entrada de dados no console
    Scanner sc = new Scanner(System.in);
    //instância da formatação de números
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    
    /*Método construtor que define os tipos de parâmetros que serão exigidos 
    quando for instanciado*/ 
    public Automovel(String modelo, String placa, int km){
        /*define que os atributos é igual ao parâmetros do método construtor 
        para não ser criado mais variáveis do mesmo atributo*/
        this.modelo=modelo;//esse atributo é equivalente a esse parâmetro
        this.placa=placa;
        this.km=km;
    }
    
    /*Módulo entrada de dados*/
    public void mostraModuloED(){
        System.out.println("||| Sistema de Locação de Veiculos - LOCAVEI |||"
                + "\nModulo : AUTOMÓVEL          Entrada de Dados");
    }
    
    /*Método para cadastro de veículo*/
    public void cadastra(){
        //aqui sobreposto com metodo da classe filha
        
        System.out.print("Informe a placa do veículo: ");
        setPlaca(sc.next());
    }    
    
    /**
     * Método para retornar se o veículo informado está disponivel no sistema
     * torna válida a declaração da variável disp
     * 
     * @param modelo
     * @return 
     */
    public boolean validar(String modelo){
        if (this.getModelo().equals(modelo)){
            System.out.println("Veículo está disponível para locação!");
            setDisp(true);
            return disp;
        }else{
            setDisp(false);
            return disp;
        }
    }
    
    /**
     * Método para adicional de seguro de acordo com a idade informada pelo 
     * cliente em outro serviço
     * 
     * @param idade
     * @return 
     */
    public abstract String adicionarSeguro(int idade);
    
    /*Método abstrato para cálculo de preço*/
    public abstract float calcularPreco();    
    //public abstract float adicionalAtraso(int diaAlu);
    
    /*Módulo saída de dados*/
    public void mostraModuloSD(){
        System.out.println("\n||| Sistema de Locação de Veículos - LOCAVEI ||"
                + "|\nMódulo : AUTOMÓVEL          Saída de Dados");
    }
    
    /*Método para mostrar informações do veículo*/
    @Override
    public String toString(){
        return ("MODELO: "+getModelo()
                +"\nPLACA: "+getPlaca()
                +"\nDISPONIBILIDADE: Verdadeira");
    }
    
    /*Abaixo tem métodos acessores para recuperar ou mudar as variáveis*/
    
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