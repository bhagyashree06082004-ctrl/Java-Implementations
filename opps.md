# this keyword :  it refer to the current object inn a method or constructor to avoid the confucion when the class attributes have the same name as method or constructor

this is also used to call another constructor in the same class and reuse the code 


# MODIFIERS in Java : 

    Two group of modifiers:
        Access Modifier : control the access level
        Non-Access modifiers: do not control access level but provide other functionality

    Access Modifier:

        for classes:
            public : class is accessible by any other class
            default: class accessible by classes in the same package.

        for attributes, methods and constructors:
            public : the code is accessible for all classes 
            private : code accessible within the declared classes
            default : only accessible with in the same package.
            protected : in the same package and the subclasses. 


    Non-Access Modifiers:

        Final (can used with class, methods, attributes): if we don't want to overide existinf attribute values we declare it as final

        Static (can be used with the methods and attributes) : static methods belongs to the class not to any specific object, this means you can call it without creating an object of the class

        Abstract (can used with class, methods) : abstract methods belongs to an abstract class, and it does not have a body . the body is provided by the subclass


# ENCAPSULATION :

    to make sure that sensitive data is hidden from users.
        class variable/attributes are declared private.
        provide public get and set methods to access and update the value of private variable 



# PACKAGES : 

    it is used to group related classes. It act as a folder in a file directory. 

    Packages are divided into two categories: 
        Built- in packages
        User-defined packages

    to create an user defined package we use the package keyword.
        then we compile it as regular.
        then compile the package using:     javac -d . fileName.java    (it create the package. the -d word define the destination for where to save the class file.)


# INHERITANCE :


    heritance concept are grouped into two categories: 
        subclass (child)- the cladd that inherits from another class
        superclass (parent)- the classbeginf inherited from

        "extends" is use to inherit 

    If the class is declared Final it can not act as an parent class


# POLYMORPHISM :

    it means many form and it occurs when we have many classes that are related to each other by inheritance. 

    2 types of Polymorphism:
        1. Runtime 
        2. Compiletime

    <> Method Overriding : It is run time polymorphism as the methods to be run is decided at the running of the program after compilation.

    <> Method Overloading : It is the compile time as every thing is done at the compile time only.


# SUPER Keyword :

    super keyword is use to refer the parent class of a subclass.
    It can be used mainly in two ways:
        To access attributes and methods from the parent class
        To call the parent class constructor


# Inner Classes :

    class inside the class is called as the nested/ inner Class. it is done to group classess that belong together. 


    To access the inner class, create an object of the outer class and then create an object of the inner class.

    If we do not want the outer class to access the object inside the inner class declare the inner class as the Private.

    To access the inner class without creating an object of the outer class the inner class is declared as the static.

    Inner Class can accesss the atribute and the methods of the outer class.

    for the inner class file is saved in the format of outerName$InnerName.class .

    Local Inner Class, Anonymous Inner Class and Static Inner Class.








# ABSTRACTION : 

    Hiding the certain details and showing only essential information to the user.

    Abstraction is achieved with either abstract classess or interfaces. 

    abstract keyword is a non-access modifier, used for classes and methods:
        Abstract class: is a restricted class that cannot be used to create objects( to access it, it must be inherited frim another class).
        Abstract methods: can only be used in an abstract class and it does not have a body. The body is provided by the subclass(inherited from)


    Abstract class can have the abstract as well as the regular methods.

    Refrence of the abstract class is allowed but its object can not be created.

    DOes and DOnt of abstract class:
        reference of the abstract can be created but the object cannot be created.
        if we do not have the body for the method then this method should be made abstract.
        it a class contain 1 or more abstract method then the class should be declared abstract.
        if the class is abstract then it cannot be final.and the abstract cannot be final as well.
        abstract class as well as the abstract methods cannot be static.
        if the class does not extend every abstract method then that class also become abstract.
         








# INTERFACES :

    Another way to achieve the abstraction is Interface.
    It is a completely abstract class that is used to group related methods with the empty bodies.

    to access the interface methods the interface must be implemented by another class with the implements keyword. The body of the interface method is provided by the implement class

    Interface cannot be used to create objects.
    Has it cannot used to create the objects, it does not have the constructor.
    All the methods in the interface should be override. 

    Interface methods are by default abstract and public 
    Interface attributes are by default public, static and final

    Multiple inheritance is not supported, but it can be achieved with the interface has the class can implement multiple interface.

    DO and DOnt of Interface:
        by default the methods are public and abstract.
        we can write identifier in the interface they are by default static and final.
        interface can have the static method with the body.
        Interface can extend another interface.
        default methods are also allowed inside the interface.



     







# ANONYMOUS Class : 

    a class without a name. It is created and used at the same time.
    they are used to override methods of an existing class or interface without writing a seprate class file.

    When to use Anonymous Classes:
        Overriding a method without creating a new subclass
        implementing an interface quickly.
        Passing small pieces of bbehavior as objects.

# Dynamic Method dispatch:
    Refernce of the parent class is used but the object is of the child class. 

    Parent obj = new Child();

    all the methods of the parent class are accessible but the one present in the child cannot be called using this object. And the methods that are override in the child are called if we call the method using that object.





# Multiple Inheritance vs Interfaces :



# Static keyword:
    it is use ful for representing a data or information related to class.
    types:
        Static variable
        Static methods
        Static Class
        static block
    
    it is stored in the method area.


# Final Keyword: 
    variable
    methods
    class


    variable :
    fix value cannot be changed once the variable is declared final
    we can assign value to the final variable at:
        directly assign 
        assign inside the constructor
        assign inside the static block but the variable should also static.

    Methods:
    final method can not be override.

    Class:
    final class cannot be inherited.



Class can have variable, methods, class.

    class can only be default and public.
    we can use the class by creating its object or using the extend the class. If we are creating its object in another class and using it it is HasA relation where as the in inheritance it is IsA relationship.

# Type of Errors:

    Syntax Errors: After the compilation of the project they are caught.

    Logical Errors: If the code does not give the expected result as the logic is wrong then it is logical error.

    Runtime Errors (Exception): take place because of the mishandling of the user. ex: giving wrong input, use of file that are not present.


# Exception Handling Construct:

    try{
        code that can give us the exception
    }
    catch(Exception e){
        give the output that to be dispplay when the exception is caught.
    }

    for one try block there can be more than 1 catch block that catches different type of exception.
    Inside the try block we can make a nested try and catch block.

    we can have finally block that executes everytime does not depend if there is a exception or not.

# Exception Classes:

    Checked Exception : Need to be checked to run the program
    Unchecked Exception : Does not need to be checked and are the runtime exception.


    Subclass should be written above the parent class of the exception in the catch block.

    Exception Class has some methods:
        String getMessage();//
        String toString(); // if we print the object toString method will be executed by default.
        void printStackTrace(): //trace the methods were the exception has taken the place and help to find the exception.

# Throw vs Throws:

    throw is used as statement in the method where you want to throw a exception and this must caught and handled properly.

    throws is used at the method signature showing that this method is throwing an exception that should be handled at the parent method.

# Finally Block:
    finally block executes every time regardless the exception is present or not.
    try{

    }
    finally{

    }
    this type of try can also be declared with only the finally block and wothout the catch block

    finally block is mostly uused to close the resources that are used or open earlier.

# try-with-resources:

    try(resource, resource){
        return result;
    }

    if the resource is opened with the try blovk then we do not have to manually close the resource in the finally block, try itself close the resource.

# Multithreading:




# Thread Class:
    Constructors:
        Thread();
        Thread(Runnable r);
        Thread(Runnable r, String name);
        Thread(ThreadGroup r, String name);
        Thread(String name);
    GetMethods:
        long getId()
        String getName()
        int getPriority();
        Thread.state getState()
        ThreadGroup getThreadGroup();

    SetMethods:
        void setName(String name);
        void setPriority(int p)
        void setDaemon(boolean d)

    Enquiry Methods:
        boolean isAlive();
        boolean isDaemon();
        boolean isInterrupted();
    
    Instace Methods:
        void interrupt();
        void join();
        void join(long millis);
        void run();
        void start();

    Static Methods:
        int activeCount()

        Thread currentThread();
        void yeild();
        void dumpStack();

# Thread Priorities:

    priority range for 1-10 higher the humber hogher the priority.

 
# Synchronization : 





# Object Class :

    It is the parent class of all the class in Java.

 

# Wrraper Class:

    Integer class is the child class of the Number. 

    AutoBoxing : if the primitive data is assigned to the wrapper class is AutoBoxing
    UnBoxing : if the wrapper class data is assigned to the primitive data is Auto unboxing.

    

# String vs String Buffer vs String Builder:

    String is immutable means that cannot be changed. it will create a new object every time we use it.

    String Buffer is mutable means that can change. It has all the methods of the string and more methods to append and concatnate the string. It is thread safe. That means more than 1 thread canot use the string buffer simulatenousy. Heance, it is slower.

    String Builder is same as that of the String Buffer but it is not thread safe and hence it is Faster compare to the string buffer


# Math Class :

    Java has the seprate class for the Mathematics which has different methods to do the require.


# ENUM :
 


# Introduction to Reflection:
    Reflection help us to find different information and other things about the class and help us find every detail about the class.

# Built-in Annotations:
    It is use to give the Meta Data(Data about anything.)

    Annotations are used to applied to the Code or to Other Annotations.

    In-Built Annotations:

        @Override
        @Deprecated
        @FunctionalInterface
        @SuppressWarnings
        @SafeVarargs

    
    User-Defined Annotation:
        Starting with the @.

# Lambda Expressions : 
    methods are written as an expression. Hence, named as the lambda expression.


# Method Reference :
    Method is given as the reference then it act similar to that method and give the similar property and return.


# IO Streams:
    Stream is the flow of data. IO stands for input/output.

    class InputStream:
        int read() : reading just on byte
        int read(byte[] b) : read the collection of byte and depend on the size of the byte.
        int read(byte[] b, int off, int len) : read in the collect of byte , can give the position to start and length of the byte.
        int available() : how bytes of data available.
        long skip(long n) : can be used to skip some byte.
        void mark(int limit) : mark the visited byte
        void reset() : reset the mark to the starting point.
        boolean marksupported() : tell us if it is mark supported.
        void close() : close if the task is done.


        read, available and close are important


    Class Output Stream:
        void write(int b) : use to write the data.
        void write(byte[] b) : can be used write all the byte together.
        void write(byte[] b, int off, int len) : from which to start and of how much length.
        void flush() : useful for forcing the data.
        void close(): use to close the classes.


# Collection Framework:
    
    Limitation of the standard data structure:
        fixed size -> ArrayList, LinkedList
        Distinct Collection -> Set
        Sorted Collection -> SortedSet
        Insertion (manually need to shift the element. )
        Delete (after deleting need to shift the element manually. )
        Search (time complexity(O(n))) -> O(1) for collection.
        Hashing (storing data in key value pair. )


    Collection Framework
        Iterable Interface:
            Collection Interface:

                List Interface (ordered collection):
                    ArrayList
                    LinkedList
                    Vector <- Stack (Legacy Classes)
                    
                Set Interface (no duplicate allowed plus unordered):
                    HashSet
                    LinkedHashSet
                    SortedSet Interface <- TreeSet
                
                Queue (FIFO -> first in first out):
                    PriorityQueue
                    Deque Interface <- ArrayDeque

    Map Interface (key-value):
        HashMap
        LinkedHashMap
        HashTable
        SortedMap Interface <- TreeMap

    java.util


# Hashing Tech :

    Data is stored in the Hash Table. Each cell is called as the bucket.

    hash function help us to find where to save the value in the table.

    It is implemented as the open addressing, chanining or the combination of the both.

    















       



    
























    
        