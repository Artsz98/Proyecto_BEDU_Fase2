

fun main() {
    val loginUser = LoginUser()
    println("!Hola Bienvenido a la Tienda de Amigos Cool")

    try{
        println("Escribe una opción del menu : ")
        println("1) Iniciar sesion")
        println("2) Registrarse")
        println("3) Consultar Productos")

        var number = Integer.valueOf(readLine())

        when(number){
            1 -> println("Iniciar Sesión")
            2 -> loginUser.registerUser()
            3 -> println("Consultar Productos ")
            else -> println("Opción no valida")
        }
    } catch (e: NumberFormatException){
        println("Por favor, escribe una opción válida")
    }


}