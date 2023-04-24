package Deco

abstract class TreeDecorator
    (private val tree: ChrismasTree) : ChrismasTree {

    override fun decorate(): String {
        return tree.decorate()
    }

}