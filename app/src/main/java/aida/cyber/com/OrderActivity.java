package aida.cyber.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.aderayanbima.droidcafe.R;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    private static final  String TAG_ACTIVITY = OrderActivity.class.getSimpleName();

    public void displayToast(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())
        {
            case R.id.sameday:
                if (checked)
                    displayToast(getString(R.string.choosen) +
                            getString(R.string.same_day_messenger_service));
            break;

            case R.id.nextday:
                if (checked)
                    displayToast(getString(R.string.choosen) +
                            getString(R.string.next_day_ground_delivery));
            break;

            case R.id.pickup:
                if (checked)
                    displayToast(getString(R.string.choosen) +
                            getString(R.string.pick_up));
                break;

            default:
                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
                break;

        }
    }

}
