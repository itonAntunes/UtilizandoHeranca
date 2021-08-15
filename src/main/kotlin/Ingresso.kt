import java.util.*

open class Ingresso(
    var valor: Int = 10
) {
    open fun imprimeValor(): Int {
        return valor
    }
}

class IngressoVip(
    var valorAdicional: Int = 5
) : Ingresso() {
    override fun imprimeValor():Int {
       return valor + valorAdicional
    }
}

class IngressoPadrao : Ingresso()


fun retornoUsuario() {
    val scanner = Scanner(System.`in`)
    println("Olá, Voce gostaria de comprar um Ingresso?")
    println(
        """
        1 - Sim
        2 - não
        
    """.trimIndent()
    )
    val ingressoPadrao = IngressoPadrao()
    val ingressoVip = IngressoVip()
    val retornoInicial = scanner.nextInt()
    if (retornoInicial == 1) {
        println(
            """
            Temos duas opções
            1 - Ingresso padrão ${ingressoPadrao.imprimeValor()}
            2 - ingresso vip ${ingressoVip.imprimeValor()}
        """.trimIndent()
        )
    } else {
        println("volte Sempre!!")
    }
}
fun escolherIngresso() {

    val scanner = Scanner(System.`in`)
    val ingressoPadrao = IngressoPadrao()
    val ingressoVip = IngressoVip()
    val retornoInicial = scanner.nextInt()

    if (retornoInicial == 1) {
        println("Parabens voce comprou o Ingresso Padrão de R$ ${ingressoPadrao.imprimeValor()}")

    } else {
        println("Parabens Voce comprou um Ingresso Vip de R$ ${ingressoVip.imprimeValor()}")
    }
}
fun main() {
    retornoUsuario()
    escolherIngresso()

}