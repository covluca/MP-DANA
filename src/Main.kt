import classes.Axis
import classes.Coordinate
import classes.Point

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val gb = Axis("good").opposite_to(Axis("bad"))
    val le = Axis("love").opposite_to(Axis("hate"))
    val cf = Axis("courage").opposite_to(Axis("fear"))
    val iS = Axis("intelligence").opposite_to(Axis("stupidity"))
    val hs = Axis("happy").opposite_to(Axis("sad"))
    val el = Axis("energic").opposite_to(Axis("lethargic"))
    val pa = Axis("precise").opposite_to(Axis("approximate"))
    val ku = Axis("known").opposite_to(Axis("unknown"))

    val axes = mutableListOf(gb,le,cf,iS,hs,el,pa,ku)
    val thinkC = mutableListOf(Coordinate(gb,10),Coordinate(le,0),Coordinate(cf,10),Coordinate(iS,20),Coordinate(hs,0),Coordinate(el,-3),Coordinate(pa,10),Coordinate(ku,10))
    val readC = mutableListOf(Coordinate(gb,8),Coordinate(le,0),Coordinate(cf,8),Coordinate(iS,13),Coordinate(hs,3),Coordinate(el,-8),Coordinate(pa,3),Coordinate(ku,10))
    var think = Point("think",thinkC)
    var read = Point("read",readC)

    val stateExampleC = mutableListOf(Coordinate(gb,0),Coordinate(le,10),Coordinate(cf,8),Coordinate(iS,20),Coordinate(hs,8),Coordinate(el,13),Coordinate(pa,8),Coordinate(ku,10))
    var state = Point("state",stateExampleC)


    var find = think.distance(read)
    var ifRead = state.distance(read)
    var ifThink = state.distance(think)


    println("Hello, " + find + "!")
    println("Hello, " + ifRead + "!")
    println("Hello, " + ifThink + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}