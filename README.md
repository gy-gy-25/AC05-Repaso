# AC05 - Repaso de Kotlin

Pequeño proyecto de repaso en Kotlin que muestra cómo definir y utilizar una
función de extensión sobre `Double`.

## ¿Qué hace?

El programa implementa la función `Double.esCritica()`, que determina si una
temperatura es crítica:

```kotlin
fun Double.esCritica(): Boolean {
    return this > 35.0 || this < 5.0
}
```

Una temperatura se considera crítica cuando es **mayor que 35 °C** o
**menor que 5 °C**. Los valores exactamente iguales a `35.0` y `5.0` no se
consideran críticos.

En `main()` se comprueba la función con una temperatura individual y con una
lista de valores:

```kotlin
val listaTemperaturas = listOf(15.5, 38.2, 4.0, 22.0, 36.0, 2.8)
```

## Salida esperada

```text
true
true

false
true
true
false
true
true
```