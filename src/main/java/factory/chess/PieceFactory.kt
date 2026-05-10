package abstractfactory.chess

class PieceFactory {

    fun createPiece(notation: String): ChessPiece {
        val (type, file, rank) = notation.toCharArray()
        return when (type) {
            'q' -> Queen(file, rank)
            'p' -> Pawn(file, rank)
            'k' -> King(file, rank)
            'b' -> Bishop(file, rank)
            'r' -> Rook(file, rank)
            'n' -> Knight(file, rank)
            else -> throw IllegalArgumentException("Unknown chess piece: $type")
        }

    }
}