package loca;

//importação da classe CarroPopular do pacote fro
import fro.CarroPopular;
//importação da classe Scanner do pacote java.util
import java.util.Scanner;
//importação da classe DecimalFormat do pacote java.text
import java.text.DecimalFormat;

public class Locacao {
    /*declaração de atributos*/
    private CarroPopular carP = new CarroPopular("","",0,0,0f);//declaração e instância de classe
    private int codLoca;
    private int diasLoca;
    private float valorLoca;
    private float valorTotal;
    
    /*Método construtor*/
    public Locacao (int codLoca, int diasLoca){
        this.codLoca=codLoca;
        this.diasLoca=diasLoca;
    }
    
    /*Módulo de entrada de dados*/
    public void mostraModuloED() {
        System.out.println("||| Sistema de Locação de Veiculos - LOCAVEI |||"
                + " \nModulo : LOCAÇÃO         Entrada de Dados ");
    }
    
    /*Módulo de saída de dados*/
    public void mostraModuloSD() {
        System.out.println("\n||| Sistema de Locação de Veículos - LOCAVEI |||"
                + " \nModulo : LOCAÇÃO         Saída de Dados ");
    }
    
    /*Método para cadastro de locação*/
    public void cadastra(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEntre com o código da locação: ");
        setCodLoca(sc.nextInt());
        System.out.println("Informe agora, o veículo que será alugado:\n");
        getCarP().cadastra();
    }
    
    /*Método para mostrar as informações recebidas no cadastro*/
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        setDiasLoca(getCarP().getDiaAlu());
        setValorLoca(getCarP().calcularPreco());
        setValorTotal(getCarP().calcularPreco() + getCarP().getAdcSeguro());
        return ("\nCÓDIGO DE LOCAÇÃO: "+getCodLoca()+"\nDIAS ALUGADOS: "
                +getDiasLoca()+"\nVALOR DA LOCAÇÃO: "+df.format(getValorLoca())
                +"\nVALOR TOTAL: "+df.format(getValorTotal())+
                "\n\nDADOS DO VEÍCULO:\n"+getCarP());
    }

    /*Métodos acessores get e set*/

    public int getCodLoca() {
        return codLoca;
    }

    public void setCodLoca(int codLoca) {
        this.codLoca = codLoca;
    }

    public int getDiasLoca() {
        return diasLoca;
    }

    public void setDiasLoca(int diasLoca) {
        this.diasLoca = diasLoca;
    }

    public float getValorLoca() {
        return valorLoca;
    }

    public void setValorLoca(float valorLoca) {
        this.valorLoca = valorLoca;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public CarroPopular getCarP() {
        return carP;
    }

    public void setCarP(CarroPopular carP) {
        this.carP = carP;
    }
}