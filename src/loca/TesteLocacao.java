package loca;

/** Escola Técnica de Brasília - ETB
 *  Linguagem Técnica de Programação
 *  Professor: Regis
 *  GT 04
 *  Classe Associada ao Automóvel: Locação
 *  Desenvolvimento do Projeto Guia Etapa 06
 */
public class TesteLocacao {

    public static void main(String[] args) {
        Locacao loca = new Locacao(0,0);
        loca.mostraModuloED();
        loca.cadastra();  // cadastro de locação
        // Os veículos são armazenados e recuperados para validação 
        boolean check1 = loca.getCarP().validar("Honda Civic");
        boolean check2 = loca.getCarP().validar("Chevrolet Prisma");
        boolean check3 = loca.getCarP().validar("Volkswagen Jetta");
        boolean check4 = loca.getCarP().validar("Fiat Cronos");
        boolean check5 = loca.getCarP().validar("Jeep Renegade");
        boolean check6 = loca.getCarP().validar("Renault Duster");
        if (!check1 && !check2 && !check3 && !check4 && !check5 && !check6){
            System.out.println("O carro informado não está disponível em nosso "
                    + "sistema ou não existe.\nSistema encerrado!!");
            System.exit(0);
        }
        loca.mostraModuloSD();
        
        /* Confere se terá adicional de seguro de acordo com a idade informada 
         * pelo usuário (cliente)
         */
        loca.getCarP().adicionarSeguro(20);
        System.out.println(loca);  // informa os dados registrados no sistema
    }    
}
