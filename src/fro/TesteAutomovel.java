package fro;

/** Escola Técnica de Brasília - ETB
 *  Linguagem Técnica de Programação
 *  Professor: Regis
 *  GT 04
 *  Tema: Automóvel
 *  Desenvolvimento do Projeto Guia Etapa 06
 */
public class TesteAutomovel {
    
    public static void main(String[] args) {
        Automovel carP = new CarroPopular("","",0,0,0f);
        carP.mostraModuloED();
        System.out.println();  // Pula linha
        carP.cadastra();
        // Os modelos são armazenados e recuperados para validação
        boolean check1 = carP.validar("Honda Civic");
        boolean check2 = carP.validar("Chevrolet Prisma");
        boolean check3 = carP.validar("Volkswagen Jetta");
        boolean check4 = carP.validar("Fiat Cronos");
        boolean check5 = carP.validar("Jeep Renegade");
        boolean check6 = carP.validar("Renault Duster");
        if (!check1 && !check2 && !check3 && !check4 && !check5 && !check6){
            System.out.println("O carro informado não está disponível em nosso "
                    + "sistema ou não existe.\nSistema encerrado!!");
            System.exit(0);
        }
        carP.mostraModuloSD();
        
        /* A idade do cliente não faz parte desse módulo, deve ser informado
         * pelo sistema de usuário
         */
        carP.adicionarSeguro(20);
        System.out.println(carP);
    }   
}