package FlyWeight

fun main(){

    val productosElectrodomesticos = ProductList("Electrodomesticos")
    productosElectrodomesticos.addItem("Celular Samsung", 23500.0,"samsung")
    productosElectrodomesticos.addItem("Televisor de 50 Pulgadas", 30000.0,"LG")
    productosElectrodomesticos.addItem("Celular Huawei", 18000.0,"Huawei")
    productosElectrodomesticos.addItem("Celular Samsung", 23500.0,"samsung")
    productosElectrodomesticos.printList()

}