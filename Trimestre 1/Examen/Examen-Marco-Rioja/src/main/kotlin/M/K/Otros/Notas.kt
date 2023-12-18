package M.Ayuda.Otros

fun main() {
    println("Ingrese tu nota de examen: ")
    var nota = -1f;

    while (nota < 0 || nota > 10) {
        nota = readln().toFloat();
        if (nota==0f) {
            println("Increible Cerapio");
        } else if (nota>0f && nota<5f) {
            println("Que Manco");
        } else if (nota>=5f && nota<7f) {
            println("Aprobado Raspado");
        } else if (nota>=7f && nota<9f) {
            println("Notable");
        } else if (nota==9f) {
            println("Sobresaliente");
        } else if (nota==10f) {
            println("BOFF QUE CRACK");
        } else {
            println("No me vaciles");
        }
    }
}