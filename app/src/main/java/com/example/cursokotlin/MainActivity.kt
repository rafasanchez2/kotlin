package com.example.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  codigo()
      //  tipos()
      //  operaciones()
      //  rangos()
    //  control()
      //  fArray()
     //   listas()
     // mapas()
        funciones()

    }


    /***  var : Variables Mutables ***/
    /***  val: Variables Inmutables - Constantes ***/

    /***  Byte ***/
    /*** Short ***/
    /*** Int  ***/
    /*** Long ***/
    /***  ***/
    /***  ***/
    /*** Float ***/
    /*** Double ***/
    /***  ***/
    /***  ***/
    /*** Char ***/
    /*** Boolean ***/
    /*** String ***/

    fun codigo(){
        var nombre:String= "Rafa"
        var a=3
        var b =1
        var c =8

        var suma=a+b+c
        println("$nombre, El resultado es $suma")
    }


    fun tipos(){

        /***  var : Variables Mutables ***/
        /***  val: Variables Inmutables - Constantes ***/

        var numeroA:Byte=127
        var numeroC:Short=8
        var numeroB:Int=24
        var numeroD:Long=12584
        var numeroE:Float=2.5f
        var numeroF:Double=2.5

        var caracter:Char='a'
        var nombre:String="Rafa"
        var logico:Boolean=true


        /** PARSEAR **/
        var edad:Int=numeroA.toInt()

        println("Suma de $numeroA + $numeroC es igual a ${numeroA+numeroC}" )
    }


    fun operaciones(){
        var num1=2
        var num2=4

        var res=(num1==num2) && (num1<5)
        println("$num1==$num2=$res")
    }


    fun rangos(){

        var res = 3 in 1..5
        println("3 está en el intervalo del 1 al 5? = $res")

        var res2 = 'b' in  'c'.. 'z'
        println("b está en el intervalo de la c  a la z? = $res2")

    }


    fun control(){

       /** estructuras de control**/
        /** Secuenciales**/ /** Seleccion o condicionales**/
        /** simples, dobles, multiples**/

        /**if **/
        /** if else**/
        /** else if**/
        /** when**/



        /** iterativas **/

        /** do while**/
        /** while**/
        /** for **/

        var num1 = 2.0
        var num2 = 4.0
        var num3 = 4.0

        var prom=(num1+num2+num3)/3
        println("El promedio es $prom")
      //  println("%.2f".format(prom))
        if(prom>=3.5)
            println("El promedio es mayor a 3.5")

        else if(prom in 3.0 .. 3.5 )
            println("El promedio está entre 3.5 y 3")

        else
            println("El promedio es menor a 3")



        var estacion=1

        when(estacion){
            1,8->println("Verano")
            2->println("Invierno")
            3->println("Otoño")
          in  4..6->println("Primavera")
            else->println("No corresponde a una estacion")
        }



        for (i in 1..10 step 2){
            println("$i del 0 al 10 de 2 en 2")

        }

        for (i in 0 until 15 ){
            println("$i del 0 hasta llegar al 15")

        }


        for (i in 20 downTo  10 step 2 ){
            println("$i del 20  al 10 de 2 en 2")

        }

    }//end_control


    fun fArray(){

    /*    var array:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)

        for(i in array){
            println("$i")
        }
*/


        var array= arrayOf("pepe","juan","miguel")
        println("Tamaño del array "+array.size)
        println("Posicion 1 del array: "+array[0])
        println("Posicion 2 del array: "+array.get(1))

    }//END_fArray


    fun listas(){
        val list= listOf<Int>(1,2,3,4,5)
        println("Lista no modificable: $list")


        val list2= mutableListOf<Int>(1,2,3,4,5)
        list2.add(6)
        list2.add(99)

        println("Lista  modificable: $list2")
        println("Tamaño Lista  modificable: "+list2.count())

        list2.add(1,98)
        println("Lista  modificable añadiendo en posicion indicada: $list2")

        //list.first()
        //list.last()
        //list.clear()
        //list.sort() Ordena ascendente
        //list.sortDescending() Ordena descendentemente
    }


    fun   mapas(){

        //MAPA NO MODIFICABLE
        val mapaDeNumeros=mapOf("cod1" to 1, "cod2" to 2, "cod3" to 3,)
        println("Mapa de nº : $mapaDeNumeros")

        val mapaDeString=mapOf(1 to "Rafa", 2 to "Sanchez", 3 to "Escobar",)
        println("Mapa de string : $mapaDeString")

        println("Claves de mapa ${mapaDeString.keys}")
        println("Valores de mapa ${mapaDeString.values}")


        //MAPA MODIFICABLE
        val mapaMutable= mutableMapOf("primero" to 1, "segundo" to 2, "tercero" to 3,)
        mapaMutable["cuarto"]=4
        mapaMutable.put("quinto",5)
        println("Mapa mutable : $mapaMutable")

        println("El valor del elemento segundo es : " +mapaMutable["segundo"])  // OTRA FORMA: +mapaMutable.get("segundo")

        mapaMutable.remove("primero")
        println("Mapa mutable : $mapaMutable")


    }//end_mapas


    fun funciones(){



}//End_funciones

    /** equivalente a funcion MAIN
     *
     *  fun main(arg:Array<String>){}
     *
     * **/


}