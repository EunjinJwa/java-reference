package jinny.study.pattern.templatemethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Template Method Pattern
 */

public class ftocTemplateMethod extends Application {

    private InputStreamReader isr;
    private BufferedReader br;

    public static void main (String[] args) {
        new ftocTemplateMethod().run();
    }

    @Override
    protected void init () {
        isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
    }

    @Override
    protected void idle () {
        String fahrString = readLineAndReturnNullIfError();
        if (fahrString == null || fahrString.length() == 0) {
            setDone();
        } else {
            double fahr = Double.parseDouble(fahrString);
            double celcius = 5.0 / 9.0 * (fahr - 32);
            System.out.println("F=" + fahr + ", C=" + celcius);
        }
    }

    private String readLineAndReturnNullIfError () {
        String s;
        try {
            s = br.readLine();
        } catch (Exception e) {
            s = null;
        }
        return s;
    }

    @Override
    protected void cleanup () {
        System.out.println("ftoc exit");
    }
}
