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
        loca.getCarP().validar(loca.getCarP().getModelo());
        loca.mostraModuloSD();
        
        /* Confere se terá adicional de seguro de acordo com a idade informada 
         * pelo usuário (cliente)
         */
        loca.getCarP().adicionarSeguro(20);
        System.out.println(loca);  // informa os dados registrados no sistema
    }    
}
