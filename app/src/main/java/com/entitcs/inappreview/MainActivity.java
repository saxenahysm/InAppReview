package com.entitcs.inappreview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.review.testing.FakeReviewManager;
import com.google.android.play.core.tasks.Task;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ReviewManager reviewManager;
    private ReviewInfo reviewInformation;
    List<DSPMMOdel> array_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reviewManager = ReviewManagerFactory.create(MainActivity.this);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            showDialog();
        });
    }

    private void showDialog() {
        Task<ReviewInfo> request = reviewManager.requestReviewFlow();
        request.addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                reviewInformation = task.getResult();
                Task<Void> launchReviewFlow = reviewManager.launchReviewFlow(MainActivity.this, reviewInformation);
                launchReviewFlow.addOnCompleteListener(taskDone -> {
                });
            } else {
            }
        });
    }


}