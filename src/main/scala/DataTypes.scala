//object is a singleton instance that is lazily initialized
//when it is first accessed. It is similar to a class but only one instance will be created automatically

object DataTypes {

  //main is entry point to any scala application
  //unit defines the return type of 'main' indicating that it returns nothing
  def main(args: Array[String]): Unit = {

    //integer data type
    val intNum: Int = 20
    val longNum: Long = 12343530L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    //Floating Datatypes
    val floatingNum: Float = 3.14f
    val doubleNum: Double = 3.1415923648

    //String DataTypes
    val stringVar: String = "Hello Scala"

    //Character Datatype
    val charVar: Char = 'A'

    //Unit DataType
    val unitValue: Unit = ()


      //Printing values
//    println(s"Byte: $byteNum")
//    println(s"Unit: $unitValue")
//    println(s"Character: $charVar")
//    println(s"Double: $doubleNum")


    //Mutable DataTypes
    //Boolean - true, false
    var boolVar: Boolean = true
    println("Boolean: "+boolVar)
    var intVar: Int = 124
    println("Integer variable: "+intVar)

    intVar = intVar+1000
    print("Updated value: ",intVar)
  }
}