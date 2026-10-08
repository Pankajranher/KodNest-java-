package Run_T_polymorphism_ex_1;

public class R_poly {

    public static void main(String[] args) {

        Java_developer jd = new Java_developer();
        accessMethod(jd);

        Python_developer pd = new Python_developer();
        accessMethod(pd);

    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}

// Developer d = new Developer();
// d.work();
// d.project();

// Python_developer pd = new Python_developer();
// pd.work();
// pd.project();

// Java_developer jd = new Java_developer();
// jd.work();
// jd.project();

// }
// }
