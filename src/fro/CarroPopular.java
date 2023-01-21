package fro;

public class CarroPopular extends Automovel {
    private int diaAlu;
    private float adcSeguro;
    
    public CarroPopular(String modelo, String placa, int km, int diaAlu, 
            float adcSeguro) {
        super(modelo, placa, km);
        this.diaAlu=diaAlu;
        this.adcSeguro=adcSeguro;
    }
    
    /*Método para cadastro de veículo popular*/
    @Override
    public void cadastra(){
        System.out.println("Carros populares disponíveis para locação:"
                + "\nHonda Civic R$ 108,00/dia"
                + "\nChevrolet Prisma R$ 111,61/dia"
                + "\nVolkswagen Jetta R$ 129,00/dia"
                + "\nFiat Cronos R$ 123,29/dia"
                + "\nJeep Renegade R$ 183,00/dia"
                + "\nRenault Duster R$ 241,00/dia"
                + "\n\nInforme o modelo de carro que deseja alugar (Incluindo "
                + "maiúsculas e minúsculas): ");
        setModelo(sc.nextLine());
        System.out.print("Informe por quantos dias será alugado o veículo: ");
        setDiaAlu(sc.nextInt());
        super.cadastra();
    }
    
    /**
     * Implementa o serviço de adicional do seguro de acordo com a idade do 
     * usuário
     * 
     * @return 
     */
    @Override
    public String adicionarSeguro(int idade){
        calcularPreco();
        //idade menor que 25 e maior que 65 é implementado o adicional de seguro
        if (idade > 65 || idade < 25){
            //seguro adicional de 10% do valor do aluguel
            setAdcSeguro(0.1f * calcularPreco());
            return ("Houve um adicional do seguro de: "+
                    df.format(getAdcSeguro()));
        }else{
            return ("Não houve adicional de seguro no contrato do veículo!");
        }
    }
    
    /**
     * Cslcula o preço da locação de acordo com o modelo informado e os dias 
     * alugados
     * 
     * @return 
     */
    @Override
        public float calcularPreco() {
        float preco = 0;//inicializa variável local
        switch (getModelo()) {
            case "Honda Civic":
                preco= 108*getDiaAlu();
                break;
            case "Chevrolet Prisma":
                preco= 111.61f*getDiaAlu();
                break;
            case "Volkswagen Jetta":
                preco= 129*getDiaAlu();
                break;
            case "Fiat Cronos":
                preco= 123.29f*getDiaAlu();
                break;
                case "Jeep Renegade":
                preco= 183*getDiaAlu()+getDiaAlu();
                break;
            case "Renault Duster":
                preco= 241*getDiaAlu()+getDiaAlu();
                break;
        }
        return preco;//retorna o valor armazenado da variavel local pro método
    }
    
    /*Método para exibir as informações do carro popular*/
    @Override
    public String toString(){
        return (super.toString()+"\nQUILOMETRAGEM: "+getKm()+"km"+
                "\nDIAS ALUGADOS: "+getDiaAlu()+
                "\nVALOR DO ALUGUEL: "+df.format(calcularPreco())+
                "\nVALOR DO SEGURO: "+df.format(getAdcSeguro())+
                "\nVALOR FINAL: "+df.format(calcularPreco()+getAdcSeguro()));
    }    

    public int getDiaAlu() {
        return diaAlu;
    }

    public void setDiaAlu(int diaAlu) {
        this.diaAlu = diaAlu;
    }

    public float getAdcSeguro() {
        return adcSeguro;
    }

    public void setAdcSeguro(float adcSeguro) {
        this.adcSeguro = adcSeguro;
    }
}