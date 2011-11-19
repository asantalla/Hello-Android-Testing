package es.greenandroid.example.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import es.greenandroid.example.Main;
import es.greenandroid.example.R;

public class MainTest extends ActivityInstrumentationTestCase2<Main> {

    public MainTest() {
        super("es.greenandroid.example", Main.class);
    }

    public void test() {
        TextView textView = (TextView) getActivity().findViewById(R.id.textView);

        assertEquals("Hello World!", textView.getText());
    }
}