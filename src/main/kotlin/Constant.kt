class Constant<T>(val c: T) : Operand() {
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