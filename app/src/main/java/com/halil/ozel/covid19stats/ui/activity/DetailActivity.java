package com.halil.ozel.covid19stats.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.halil.ozel.covid19stats.R;
import com.halil.ozel.covid19stats.common.Constants;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView ivCountryPoster;
    TextView tvCountryName, tvTodayCases, tvTodayDeath, tvTotalTests, tvTotalCases, tvTotalDeaths, tvTotalRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvCountryName = findViewById(R.id.tvCountryName);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTodayDeath = findViewById(R.id.tvTodayDeath);
        tvTotalTests = findViewById(R.id.tvTotalTests);
        tvTotalCases = findViewById(R.id.tvTotalCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvTotalRecovered = findViewById(R.id.tvTotalRecovered);

        ivCountryPoster = findViewById(R.id.ivCountryPoster);


        String countryName = getIntent().getStringExtra(Constants.COUNTRY);
        String todayCase = getIntent().getStringExtra(Constants.TODAYS_CASES);
        String todayDeath = String.valueOf(getIntent().getIntExtra(Constants.TODAYS_DEATHS, 0));
        String totalCases = getIntent().getStringExtra(Constants.TOTAL_CASES);
        String totalDeaths = String.valueOf(getIntent().getIntExtra(Constants.TOTAL_DEATHS, 0));
        String totalTests = getIntent().getStringExtra(Constants.TOTAL_TESTS);
        String totalRecovered = getIntent().getStringExtra(Constants.TOTAL_RECOVERED);

        tvCountryName.setText(countryName);
        tvTodayCases.setText(todayCase);
        tvTodayDeath.setText(todayDeath);

        tvTotalTests.setText(totalTests);
        tvTotalCases.setText(totalCases);
        tvTotalDeaths.setText(totalDeaths);
        tvTotalRecovered.setText(totalRecovered);


        Picasso.with(getApplicationContext()).
                load(getIntent().getStringExtra(Constants.FLAG))
                .into(ivCountryPoster);
    }
}
