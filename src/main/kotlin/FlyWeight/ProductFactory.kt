package FlyWeight


class ProductFactory {
    companion object{
        private val products = hashMapOf<String, Product>()
        private var idSeguence = 0L

        fun createProduct(descriptionProduct: String, price: Double, brand: String): Product? {
            return if (products.containsKey(descriptionProduct)){
                products[descriptionProduct]
            }else{
                val product = Product(++idSeguence, descriptionProduct, price, brand)
                products[descriptionProduct] = product
                product
            }
        }
    }
}