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
        carP.validar(carP.getModelo());
        carP.mostraModuloSD();
        
        /* A idade do cliente não faz parte desse módulo, deve ser informado
         * pelo sistema de usuário
         */
        carP.adicionarSeguro(20);
        System.out.println(carP);
    }   
}
