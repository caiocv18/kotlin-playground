package playground

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        val matricula : Int = (Math.random() * 1000).toInt()
        println("Usuário matriculado com sucesso. Matrícula:  $matricula")
        usuario.matricula = matricula
    }
}