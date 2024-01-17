package playground

import java.util.*

/*

Descrição
As Extension Functions, ou Funções de Extensão, são recursos poderosos disponíveis em linguagens de programação que permitem adicionar métodos a classes existentes sem a necessidade de modificar o código-fonte original dessas classes. Isso facilita a criação de novas funcionalidades ou comportamentos para tipos de dados já existentes, mesmo quando você não tem acesso ao código fonte original desses tipos.

Neste desafio, com foco em um sistema de gerenciamento de livros para uma biblioteca digital, você deve implementar uma solução que permita gerar um "slug" único para representar os dados de um livro. Um "slug" é uma versão simplificada e amigável para URLs de um texto, com espaços substituídos por traços (-) e caracteres especiais removidos. A solução requer que você crie uma função de extensão generateSlug() para a classe String que fará essa transformação.

Funcionalidade a ser implementada:

generateSlug(): Crie uma função de extensão chamada generateSlug() para a classe String. A função deve gerar um "slug" para a string fornecida, removendo espaços e caracteres especiais, substituindo-os por traços.

Entrada
A entrada consistirá em duas strings: o título e o autor de um livro.

Saída
Imprima o "slug" gerado para o livro, no seguinte padrão:
Slug gerado para o livro:
nome-livro-separado-por-ifens_nome-autor-separado-por-ifens

Nota:
O uso de extension functions tem seus pontos positivos, como a extensibilidade e organização do código, mas também apresenta desafios, como a possível confusão e a separação da lógica. A solução eficiente depende da linguagem de programação escolhida e das práticas de programação adotadas.

Saiba mais sobre Extension Functions em Kotlin:
https://kotlinlang.org/docs/extensions.html#extension-functions

*/

fun main() {
    val title = readlnOrNull() ?: ""
    val author = readlnOrNull() ?: ""

    val slugTitle = title.generateSlug()
    val slugAuthor = author.generateSlug()

    println("Slug gerado para o livro:")
    println("${slugTitle}_$slugAuthor")
}

fun String.generateSlug(): String {
    return this.lowercase(Locale.getDefault())
                .replace(" ", "-")
                .replace("[áàâã]".toRegex(), "a")
                .replace("[éèê]".toRegex(), "e")
                .replace("[íìî]".toRegex(), "i")
                .replace("[óòôõ]".toRegex(), "o")
                .replace("[úùû]".toRegex(), "u")
                .replace("ñ", "n")
                .replace("[^a-z0-9\\-]".toRegex(), "")
}