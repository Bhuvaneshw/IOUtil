# IOUtils
Python input and print function in Java

This is just for fun!

Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency
```
dependencies {
    implementation 'com.github.bhuvaneshw:ioutils:v2.0'
}
```

Sample code
```
public class Main {
    public static void main(String[] args) {
        String name = input("Enter your name: ");
        int age = toInt(input("Enter your age: "));
        ArrayList<Integer> ints = mapInt(input("Enter numbers separated by space: ").split(" "));
        print("Your name is", name);
        print("Your are", age >= 18 ? "Major" : "Minor");
        for (int i : ints) {
            printEnd(", ", i);
        }
        print();
        print(ints);
    }
}
```
