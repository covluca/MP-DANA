package classes

class Axis {
    var name = "";
    var min = 0;
    var max = 100;
    constructor(name: String, min: Int, max: Int):this(){
        this.name = name
        this.min = min
        this.max = max
    }
    constructor(name: String):this(){
        this.name = name
    }

    constructor(){
    }

    fun opposite_to(a: Axis): Axis{
        return Axis(this.name+""+a.name,a.max,this.max)
    }
}