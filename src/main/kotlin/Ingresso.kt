
/* instanciando a lib do java para utilizar a funcão scanner */
import java.util.*
import kotlin.concurrent.thread

/* criando a classe pai*/
open class Ingresso(
    var valor: Double = 10.0
) {
    open fun imprimeValor(): Double {
        return valor
    }
}
/*herderiros */
class IngressoVip(
    var valorAdicional: Double = 5.0
) : Ingresso() {
    override fun imprimeValor(): Double {
       return valor + valorAdicional
    }
}

class IngressoPadrao : Ingresso()

/* utilizando a funçao scanner para receber a informação que o usuário informou*/
fun retornoUsuario() {
    val scanner = Scanner(System.`in`)
    println ("")
    println("--------------- BILHETERIA ---------------")
    println ("")
    println("Olá, Voce gostaria de comprar um Ingresso?")
    println(
        """
        1 - Sim
        2 - não
        
    """.trimIndent()
    )
    /* criando as variaveis que vao utilizar os parametros herdados da classe*/
    val ingressoPadrao = IngressoPadrao()
    val ingressoVip = IngressoVip()
    val retornoInicial = scanner.nextInt() /* comando de ler oque foi escrito no prompt*/
    if (retornoInicial == 1) {
        println(
            """
            Temos duas opções
            1 - Ingresso padrão R$ ${ingressoPadrao.imprimeValor()}
            2 - ingresso vip R$ ${ingressoVip.imprimeValor()}
        """.trimIndent()
        )
    } else {
        println("volte Sempre!!")
    }
}
/*segunda tela*/
fun escolherIngresso() {

    val scanner = Scanner(System.`in`)
    val ingressoPadrao = IngressoPadrao()
    val ingressoVip = IngressoVip()
    val retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        println("Parabéns !! você comprou o Ingresso Padrão de R$ ${ingressoPadrao.imprimeValor()}")

    } else {
        println("Parabéns !!! Você comprou um Ingresso Vip de R$ ${ingressoVip.imprimeValor()}")
    }

    println("""
        - Faça bom proveito !! 
    -----------------------------------------------
   
    """.trimIndent())
    return main()
}
/*chamando as funções*/
fun main() {
    retornoUsuario()
    escolherIngresso()

}