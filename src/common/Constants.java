package common;

public class Constants {
    private Constants() {}

    public static final int WordSize;
    public static final int x86 = 4; // 4B
    public static final int x64 = 8; // 8B

    // 'Standardna knjižnica'
    public static final String printStringLabel = "print_str";
    public static final String printIntLabel    = "print_int";
    public static final String printLogLabel    = "print_log";
    public static final String randIntLabel     = "rand_int";
    public static final String seedLabel        = "seed";

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> repo7/main
    // 'Registri'
    public static final String framePointer     = "{FP}";
    public static final String stackPointer     = "{SP}";

<<<<<<< HEAD
=======
>>>>>>> repo1/main
=======
>>>>>>> repo2/main
=======
>>>>>>> repo3/main
=======
>>>>>>> repo4/main
=======
>>>>>>> repo5/main
=======
>>>>>>> repo6/main
=======
>>>>>>> repo7/main
    static {
        /**
         * Ciljna arhitektura je x86.
         */
        WordSize = x86;
    }
}
