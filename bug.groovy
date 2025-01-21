```groovy
class MyClass {
    def myMethod() {
        def list = [1, 2, 3, 4, 5]
        list.eachWithIndex { item, index ->
            println "Item: $item, Index: $index"
            if (index == 2) {
                list.remove(item) // This will cause an error
            }
        }
    }
}

new MyClass().myMethod()
```