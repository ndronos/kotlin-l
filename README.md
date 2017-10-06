# kotlin-l
[Sources](/SOURCES.md)

---
[/src](/src)  

[00-helloWorld.kt](/src/00-helloWorld.kt)
[00-helloPackage.kt](/src/00-helloPackage.kt)
[00-helloObjectOriented.kt](/src/00-helloObjectOriented.kt)

[00-cli-readLine.kt](/src/00-cli-readLine.kt)  
[00-cli-readLine-NullSafety.kt](/src/00-cli-readLine-NullSafety.kt)  

[01-datatypesVarVal.kt](/src/01-datatypesVarVal.kt)  
[01-datatypeConversion.kt](/src/01-datatypeConversion.kt)  


Scripts  
[list_folders.kts](/src/list_folders.kts)

---

[.gitignore](/.gitignore)  
clone [JetBrains.gitignore](https://github.com/github/gitignore/blob/master/Global/JetBrains.gitignore)  
guide [intellij-support](https://intellij-support.jetbrains.com/hc/en-us/articles/206544839-How-to-manage-projects-under-Version-Control-Systems)  
reference JetBrains/kotlin/[.gitignore](https://github.com/JetBrains/kotlin/blob/master/.gitignore)  
reference JetBrains/kotlin-native/[.gitignore](https://github.com/JetBrains/kotlin-native/blob/master/.gitignore)  

---

[kotlin.link](https://kotlin.link/)  
Github [KotlinBy](https://github.com/KotlinBy)/[awesome-kotlin](https://github.com/KotlinBy/awesome-kotlin)  
A [curated list of awesome](https://github.com/sindresorhus/awesome) Kotlin related stuff inspired by [awesome-java](https://github.com/akullpp/awesome-java).  

---

kotlinlang [/index](http://kotlinlang.org/)  

[/reference](https://kotlinlang.org/docs/reference/) [/kotlin-docs.pdf](https://kotlinlang.org/docs/kotlin-docs.pdf)
```
Overview
Getting Started
Basics
Classes and Objects
Functions and Lambdas
Other
Core Libraries
Reference
Java Interop
JavaScript
Tools
FAQ
```

[/tutorials](http://kotlinlang.org/docs/tutorials)  

[/getting-started]((http://kotlinlang.org/docs/tutorials/getting-started.html))

[/command-line](http://kotlinlang.org/docs/tutorials/command-line.html)  


# /[REPL](https://kotlinlang.org/docs/tutorials/command-line.html#running-the-repl)

Run the compiler without parameters to have an interactive shell. Type any valid Kotlin code and see the results.
```
$ kotlinc
Welcome to Kotlin version ... (JRE ...)
Type :help for help, :quit for quit
>>> 
```
```
>>> :help
Available commands:
:help                   show this help
:quit                   exit the interpreter
:dump bytecode          dump classes to terminal
:load <file>            load script from specified file
>>> 
```


# [/Scripting](https://kotlinlang.org/docs/tutorials/command-line.html#using-the-command-line-to-run-scripts)
[#using-the-command-line-to-run-scripts](https://kotlinlang.org/docs/tutorials/command-line.html#using-the-command-line-to-run-scripts)  
Kotlin can also be used as a *scripting language*. A script is a Kotlin source file `.kts` with top level executable code.  
To run a script, we just pass the `-script` option to the compiler with the corresponding script file.  
```$ kotlinc -script file.kts <arguments>```

---

# [/Android](https://developer.android.com/)

[developer.android.com](https://developer.android.com/)  

Kotlin and Android [/kotlin](https://developer.android.com/kotlin/)  
Get Started with Kotlin on Android [/get-started](https://developer.android.com/kotlin/get-started.html)  
Kotlin on Android FAQ [/faq](https://developer.android.com/kotlin/faq.html)  
Resources to Learn Kotlin [/resources](https://developer.android.com/kotlin/resources.html)  

---

# JDK

on Windows  
===

```
C:\>java
Usage: java ...
```
Default Folder Installation
```
C:\Program Files\Java`
jdkX.x.y_yyy
jreX.x.y_yyy
``` 

Default PATH `C:\Program Files\Java\jdk...\bin`

```Computer > Properties > Advanced system settings > Environment Variables > System variables > Path```
```New... > Edit environment variable > New``` OR ```Edit... > Variable value:``` add ; and PATH 


# /Native

```
$ kotlinc-native file.kt -o output -opt
```
`-opt` for optimized compilation

Github JetBrains/[kotlin-native](https://github.com/JetBrains/kotlin-native/)  

[JetBrains/Blog](https://blog.jetbrains.com/kotlin/)  
[Kotlin/Native Tech Preview: Kotlin without a VM](https://blog.jetbrains.com/kotlin/2017/04/kotlinnative-tech-preview-kotlin-without-a-vm/)  
[Kotlin/Native v0.3 is out](https://blog.jetbrains.com/kotlin/2017/06/kotlinnative-v0-3-is-out/)  
 


YouTube/[Tech Cave](https://www.youtube.com/channel/UCo_7ENDNCH4HsVdqaaAIgJQ/videos)  
[Building Kotlin/Native from Sources](https://www.youtube.com/watch?v=KOCXwYpGMoI)  
[Kotlin/Native samples Part 1](https://www.youtube.com/watch?v=SpS5kvMFB20)  
[Kotlin/Native samples Part 2](https://www.youtube.com/watch?v=0Py_6DYFIsw)  
[TechCave.ru](http://techcave.ru)/[Kotlin](http://techcave.ru/groups/41/content/posts)  
[Сборка Kotlin/Native из исходников](http://techcave.ru/posts/102-sborka-kotlinnative-iz-ishodnikov.html)  
[Микросервис на Kotlin, Spring Boot и Docker](http://techcave.ru/posts/101-mikroservis-na-kotlin-spring-boot-i-docker.html)  

[DZone](https://dzone.com/)/[Java Zone](https://dzone.com/java-jdk-development-tutorials-tools-news)  
[JVM-Free Kotlin With Kotlin/Native](https://dzone.com/articles/jvm-free-kotlin-with-kotlinnative)  

[Getting started with Kotlin Native](https://www.sakib.ninja/getting-started-with-kotlin-native/)  

Ariya.io/tags/[kotlin](https://ariya.io/tags/kotlin/)  

[Kotlin/Native on iOS](http://justmaku.org/2017-06-07-kotlin-on-ios)  

[superkotlin](https://superkotlin.com/)  