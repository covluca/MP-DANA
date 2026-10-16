package classes

import kotlin.collections.mutableListOf
import kotlin.math.sqrt

class Point {
    var name = ""
    var coordinates = mutableListOf<Coordinate>()

    constructor(name: String, coordinates:  MutableList<Coordinate>){
        this.name=name
        this.coordinates=coordinates
    }
    fun Point(name: String, axes:MutableList<Axis>){
        this.name=name
        axes.forEach {this.coordinates.add(Coordinate(it))}
    }

    fun addCoord(coordinate: Coordinate) {
        coordinates.add(coordinate)
    }

    fun editCoord(name: String, x: Int) {
        coordinates.forEach { if (it.axis.name == name) it.x = x }
    }

    fun distance(point: Point): Double {
        //TODO ONLY
        var hypot = 0.0;
        this.coordinates.forEach {
            val itC = it
            point.coordinates.forEach {
                if (it.axis.name == itC.axis.name)
                    hypot = sqrt( it.distance(itC)*it.distance(itC)+hypot*hypot)
            }
        }
        return hypot
    }

}