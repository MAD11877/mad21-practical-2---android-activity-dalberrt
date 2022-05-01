package sg.edu.np.mad.madpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User("Dalbert", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);

        Button followBtn = findViewById(R.id.followBtn);
        TextView username = findViewById(R.id.username);
        username.setText(user1.Name);
        TextView desc = findViewById(R.id.desc);
        desc.setText(user1.Description);
        followBtn.setText(user1.Followed ? "Unfollow" : "Follow");
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (followBtn.getText() == "Follow")    //followBtn.setText(user1.Followed ? "Unfollow" : "Follow")
                {
                    followBtn.setText("Unfollow");
                }
                else
                {
                    followBtn.setText("Follow");
                }
                user1.Followed = !user1.Followed;
            }
        });
    }
}