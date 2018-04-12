package com.learning.sander.advancedandroid.data;

import com.google.auto.value.AutoValue;
import com.learning.sander.advancedandroid.model.Repo;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

@AutoValue
public abstract class TrendingReposResponse {

    @Json(name = "items")
    public abstract List<Repo> repos();

    public static JsonAdapter<TrendingReposResponse> jsonAdapter(Moshi moshi) {
        return new AutoValue_TrendingReposResponse.MoshiJsonAdapter(moshi);
    }
}