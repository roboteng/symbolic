class Symbol(val s: String): Operand() {
    var value: Number? = null

    companion object Factory {
        fun x(): Symbol = Symbol("x")
        fun y(): Symbol = Symbol("y")
        fun z(): Symbol = Symbol("z")
    }

    val isVariable: Boolean get() = value == null

    override fun toString(): String = s

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Symbol) return false
        return  s == other.s
    }

    override fun hashCode(): Int {
        var result = s.hashCode()
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }
}