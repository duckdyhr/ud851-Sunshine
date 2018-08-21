package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>{
    private String[] mWeatherData;

    public void setWeatherData(String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layoutIdForItem, parent, false);

        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }

    @Override
    public int getItemCount() {
        if(mWeatherData==null) return 0;
        else{
            return mWeatherData.length;
        }

    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
        public TextView mWeatherTextView;
        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
            mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
        }
    }

}
// Within com.example.android.sunshine.ForecastAdapter.java /////////////////////////////////////////////////////////////////
// TODO (15) Add a class file called com.example.android.sunshine.ForecastAdapter
// TODO (22) Extend RecyclerView.Adapter<com.example.android.sunshine.ForecastAdapter.ForecastAdapterViewHolder>
// TODO (23) Create a private string array called mWeatherData
// TODO (24) Override onCreateViewHolder
// TODO (25) Within onCreateViewHolder, inflate the list item xml into a view
// TODO (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

// TODO (27) Override onBindViewHolder
// TODO (28) Set the text of the TextView to the weather for this list item's position

// TODO (29) Override getItemCount
// TODO (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

// TODO (31) Create a setWeatherData method that saves the weatherData to mWeatherData
// TODO (32) After you save mWeatherData, call notifyDataSetChanged
// TODO (47) Create the default constructor (we will pass in parameters in a later lesson)

// TODO (16) Create a class within com.example.android.sunshine.ForecastAdapter called ForecastAdapterViewHolder
// TODO (17) Extend RecyclerView.ViewHolder

// Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
// TODO (18) Create a public final TextView variable called mWeatherTextView

// TODO (19) Create a constructor for this class that accepts a View as a parameter
// TODO (20) Call super(view) within the constructor for ForecastAdapterViewHolder
// TODO (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
// Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////