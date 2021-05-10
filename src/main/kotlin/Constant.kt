class Constant<T>(val c: T) : Operand() {
    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Constant<*>) return false
        return c == other.c
    }

    override fun hashCode(): Int {
        return c?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "$c"
    }
}

operator fun Int.plus(other: Operand): Expression {
    return Expression(Operator.plus(), Constant(this), other)
}

operator fun Int.times(other: Operand): Expression {
    return Expression(Operator.times(), Constant(this), other)
}

operator fun Int.div(other: Operand): Expression {
    return Expression(Operator.divide(), Constant(this), other)
}

operator fun Int.minus(other: Operand): Expression {
    return Expression(Operator.minus(), Constant(this), other)
}