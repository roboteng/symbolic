class Expression(val operator: Operator, val left: Operand, val right: Operand): Operand() {

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Expression) return false
        return  left == other.left && right == other.right && operator == other.operator
    }

    override fun toString(): String {
        return "$left $operator $right"
    }

    override fun hashCode(): Int {
        var result = operator.hashCode()
        result = 31 * result + left.hashCode()
        result = 31 * result + right.hashCode()
        return result
    }
}



operator fun Symbol.minus(other: Symbol): Expression {
    return Expression(Operator.minus(),this, other)
}