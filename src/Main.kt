//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val temperatura1 = 36.0
    println(temperatura1.esCritica())
    // O también puedes llamar a la función directamente en el valor literal:
    println(36.0.esCritica())

    println()

    val listaTemperaturas = listOf(15.5, 38.2, 4.0, 22.0, 36.0, 2.8)
    for (temp in listaTemperaturas) {
        if (temp.esCritica()) {
            println("True")
        } else {
            println("False")
        }
    }
}

fun Double.esCritica(): Boolean {
    // 'this' se refiere al valor Double en el que se llama la función
    return this > 35.0 || this < 5.0
}