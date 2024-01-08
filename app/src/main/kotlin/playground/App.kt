package playground

fun main() {
    
    val usuario1 = Usuario(nome = "Caio Vinicius", senha = "MINHASENHA")
    println(usuario1)
    
    val conteudo1 = ConteudoEducacional(nome = "Kotlin para iniciantes", duracao = 40, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional(nome = "Kotlin para intermediários", duracao = 40, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional(nome = "Kotlin para avançados", duracao = 40, Nivel.DIFICIL)
    
    val listaDeConteudos : List<ConteudoEducacional> = listOf(conteudo1, conteudo2, conteudo3)
    
    val formacao = Formacao(nome = "Kotlin do iniciante ao avançado", conteudos = listaDeConteudos)
    
    println(formacao)
    
    formacao.matricular(usuario1)
    println(formacao.inscritos)
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
