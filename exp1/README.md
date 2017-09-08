# 实验一 接口 [:airplane:](https://github.com/GQxQD/Software-Architecture-Design-Patterns-in-Java "回到主目录")

1. 设计一个`Search`接口，其中声明用于在列表中查找某个条项的方法。设计并实现两个实现类：`BinarySearch`和`LinearSearch`，以分别实现列表的**二分查找**和**顺序查找**。

```java
public class Test {

    public static void main(String[] args) {
        Search search1 = new BinarySearch();
        Search search2 = new LinearSearch();
        List<Item> list = new ArrayList<>();
        search1.findItem(list,"name");
        search2.findItem(list,"name");
    }
}
```
console log:
```bash
Find item by BinarySearch...
Find item by LinearSearch...
```

2. 设计一个`AddressValidator`接口，其中声明用于验证一个给定地址的不同部分的方法。设计并实现两个实现类：`USAddress`和`CAAddress`，以分别验证一个给定的美国和加拿大地址。

```java
public class Test {

    public static void main(String[] args) {
        AddressValidator validator1 = new CAAddress();
        AddressValidator validator2 = new USAddress();
        String address = "GuangZhou";
        validator1.validate(address);
        validator2.validate(address);
    }
}
```
console log:
```bash
正在验证CAAddress...
正在验证USAddress...
```