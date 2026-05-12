package factory.chess

fun main() {
    val pieceFactory = PieceFactory()
    val notations = listOf("pa4", "qc3", "nd1")
    val pieces = mutableListOf<ChessPiece>()
    for (n in notations) {
        pieces.add(pieceFactory.createPiece(n))
    }
    println(pieces)

}