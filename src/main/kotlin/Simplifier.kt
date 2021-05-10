class Simplifier {
    fun simplify(e: Expression): Expression {
        if (e.right is Expression) return (e.left + e.right.left) + e.right.right
        return e
    }
}
