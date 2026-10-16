package classes

import kotlin.math.abs

class Coordinate() {
    var axis = Axis()
    var x:Int = 0

    constructor(axis: Axis,x: Int) : this() {
        this.axis=axis
        this.x=x
    }

    constructor(axis: Axis) : this() {
        this.axis=axis
    }

    fun distance(c: Coordinate): Int{
        return abs(this.x-c.x)
    }

}