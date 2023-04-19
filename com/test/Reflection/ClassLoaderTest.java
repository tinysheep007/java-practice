package Reflection;

public class ClassLoaderTest {
    public static void main(String[] args) {
        //firts from boostrapClassLoader(from JDK) -> ExtClassLoader -> AppClassLoader(our own code)

        //usually the bootstrap class loader would load in from JDK first
        //then pass on to Extclassloader
        //then pass on to app class loader to load in our own self-written code
        
        //for exmaple if we name our file to be String.java if we run it
        //it will give error because bootstrap class loader will 
        //be activating first to import the String class from JDK instead
        //of our own code

        //we can write our own class loader even if the acutual
        //class file is not in our directory

        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent());
        System.out.println(ClassLoaderTest.class.getClassLoader().getParent().getParent());
        System.out.println(String.class.getClassLoader());
    }
}
