package Thread;

public class Singleton {
    // 기본 singleton
//    private static Singleton singleton;
//
//    public static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    // Eager Initialize 방법
//    private static Singleton singleton = new Singleton();
//
//    public static Singleton getInstance() {
//        return singleton;
//    }

    // Lazy Initialize
//    private static volatile Singleton singleton;
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    // Lazy Initialize - Lazy Loading
//    private Singleton() {}
//    public static Singleton getInstance() {
//        return LazyHolder.INSTANCE;
//    }
//
//    private static class LazyHolder {
//        private static final Singleton INSTANCE = new Singleton();
//    }
}
