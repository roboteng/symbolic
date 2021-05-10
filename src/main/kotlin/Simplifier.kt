class Simplifier {
    fun simplify(e: Expression): Expression {
        if (e.left is Symbol && e.left == e.right) return 2 * e.left
        if (e.right is Expression) return (e.left + e.right.left) + e.right.right
        return e
    }
}
