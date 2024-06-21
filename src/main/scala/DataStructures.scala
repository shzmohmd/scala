//Collections in scala programming
object DataStructures{
  def main (args: Array[String]): Unit = {
    //List: Immutable, Homogeneous collection of data
    val fruits: List[String] = List("apple","oranges","watermelon","grapes","guava")
    println("First Element: " + fruits.head)
    println("Last Element: " + fruits.last)

    println("List: "+fruits)

    //empty list
    val emptyList: List[Nothing] = List()
    println("Empty list: "+emptyList)

    //list declaration
    val List2 = 10::20::30::40::Nil
    println(List2)

    //List Buffer
    import scala.collection.mutable.ListBuffer
    var cities = new ListBuffer[String]()
    cities += "Palakkad"
    cities += ("Tsr", "Clct", "Ern")
    cities -= "Tsr"
    println(cities)

    //Array datatype: Array is mutable, fixed size collection of data structure
    //Array is homogeneous collection
    var arrayData = Array("apple","orange","watermelon","mango","grapes")

    //print element by element output in new line
    arrayData.foreach(println)

    //print all values
    println(arrayData.mkString(","))
    arrayData(0) = "banana"
    println(arrayData.mkString(","))

    //Declare an empty array
    val arr_1 = new Array[String](10)
    val arr_2 = Array.ofDim[Int](2,2)
    arr_2(0)(0) = 234
    arr_2(0)(1) = 324
    arr_2(1)(0) = 423
    arr_2(1)(1) = 732

    //print array
    val flattenArr: Array[Int] = arr_2.flatten
    println(flattenArr.mkString(" "))


    //Set Collection: Immutable collection
    //HashSet - Mutable collection of sets
    val set_1 : Set[String] = Set()
    val set_2 = Set("apple","oranges","watermelon")

    import scala.collection.mutable.Set
    val mutableSet = Set("apple","oranges","water melon","grapes")
    mutableSet += "blueberry"
    mutableSet -= "apple"

    //Tuple declaration
    //In scala tuple is fixed size, can hold multiple data types
    val Tuple_1 = (10, 20, 30, 40, 50, 60)

    //Tuple_1._1 = "String" update will provide error
    println(Tuple_1._2)   //Accessing indivijual value


    //Map in scala is a collection of key-value pairs where each key is unique
    //its similar to dictionary in  python.
    import scala.collection.immutable.Map     //also have mutable.Map

    //emplty variable declaration
    var MapVar : Map[String, Int] = Map()
    var MapVar1 = Map("UST1001" -> "Affan", "UST1002" -> "Kevin", "UST1003" -> "Siva")

    println(MapVar1.contains("UST1003"))
    println(MapVar1.get("UST1003"))

    println(MapVar1.keys)
    println(MapVar1.values)



    //ITERATORS IN SCALA
    //Iterators in scala represent a sequence of elements that allow you to traverse throgh a collection sequencially
    val myList = List(20, 30, 40, 50, 60, 90)
    val iter = myList.iterator

    //Method of iterator to check if there is more elements (.hasNext())
    //(.hasNext()), (.Next()) to retrive next value
    //.remove() - to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())

    //lazy initialization using scala
    lazy val donuts : Int = 100
    println(donuts * 5)

    //lazy cant be used with var
    //lazy var donuts_2 : Int = 20   not allowed
  }
}
