class Simplifier {
    fun simplify(e: Expression): Expression {
        if (e.left is Symbol && e.left == e.right) return 2 * e.left
        if (e.right is Expression) return (e.left + e.right.left) + e.right.right
        return e
    }

    fun areEquivalent(e1: Expression, e2: Expression): Boolean {
        if (e1 == e2) return true
        if (e1.left == e2.right && e1.right == e2.left) return true
        return false
    }
}
