package my.pkg.app.test.functional;

import android.os.SystemClock;
import android.test.ActivityInstrumentationTestCase2;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import my.pkg.app.Main;
import my.pkg.app.R;

public class MainTestWithoutRobotium extends ActivityInstrumentationTestCase2<Main> {

    public MainTestWithoutRobotium() {
        super("my.pkg.app", Main.class);
    }

    public void testTextViewTextIsCorrect() {
        TextView textView = (TextView) getActivity().findViewById(R.id.textView);

        assertEquals("Hello World!", textView.getText());
    }

    public void testButtonTextIsCorrect() {
        Button button = (Button) getActivity().findViewById(R.id.button);

        assertEquals("Say Good Bye!", button.getText());
    }

    public void testButtonAction() {
        Button button = (Button) getActivity().findViewById(R.id.button);
        long downTime = SystemClock.uptimeMillis();
        long upTime = SystemClock.uptimeMillis();
        MotionEvent.obtain(downTime, upTime, MotionEvent.ACTION_DOWN, button.getScrollX(), button.getScrollY(), 0);
        assertEquals("Say Good Bye!", button.getText());
    }
}