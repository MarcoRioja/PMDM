package M.Ayuda.Otros

fun main() {
    println("Ingresar numero 1: ");
    val num1 = readln().toFloat();
    println("Ingresar numero 2: ");
    val num2 = readln().toFloat();

    println("El numero mayor es: " + (if (num1>num2) num1 else num2));
}