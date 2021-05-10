open class Operand {
    operator fun plus(other: Operand): Expression{
        return Expression(Operator.plus(), this, other)
    }

    operator fun plus(other: Int): Expression{
        return Expression(Operator.plus(), this, Constant(other))
    }

    operator fun times(i: Int): Expression {
        return Expression(Operator.times(), this, Constant(i))
    }

    operator fun div(i: Int): Expression {
        return Expression(Operator.divide(), this, Constant(i))
    }

    operator fun minus(i: Int): Expression {
        return Expression(Operator.minus(), this, Constant(i))
    }
}