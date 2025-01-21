```groovy
class MyClass {
    def myMethod() {
        def list = [1, 2, 3, 4, 5]
        // Solution 1: Iterate over a copy of the list
        def listCopy = new ArrayList(list)
        listCopy.eachWithIndex { item, index ->
            println "Item: $item, Index: $index"
            if (index == 2) {
                listCopy.remove(item)
            }
        }
        println listCopy

        // Solution 2: Use an iterator that supports removal
        def iterator = list.iterator()
        while (iterator.hasNext()) {
            def item = iterator.next()
            def index = list.indexOf(item)
            println "Item: $item, Index: $index"
            if (index == 2) {
                iterator.remove()
            }
        }
        println list
    }
}

new MyClass().myMethod()
```