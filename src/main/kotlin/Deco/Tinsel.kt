package Deco

class Tinsel(tree: ChrismasTree) : TreeDecorator(tree) {

    override fun decorate(): String {
        return super.decorate() + decorateWithTinsel()
    }

    private fun decorateWithTinsel(): String {
        return " with Tinsel"
    }
}