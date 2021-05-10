class Operator(val o: String) {

    companion object Factory {
        fun plus(): Operator = Operator("+")
        fun minus(): Operator = Operator("-")
        fun times(): Operator = Operator("*")
        fun divide(): Operator = Operator("/")
    }

    override fun toString(): String = o

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Operator) return false
        return  o == other.o
    }

    override fun hashCode(): Int {
        return o.hashCode()
    }
}
