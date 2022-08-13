package com.lokilinks.moviecatalogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lokilinks.moviecatalogue.databinding.ActivityMoviesDetailsBinding
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityMoviesDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoviesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val id = intent.getIntExtra("id",0)


        val apiInterface = id.let { ApiInterface.create().getMovieDetails(it, "69ac03caf1211635f7b81be55ba171bd") }

        apiInterface.enqueue(object: Callback<MovieDetails>{
            override fun onResponse(call: Call<MovieDetails>, response: Response<MovieDetails>) {
                binding.moviesDetailsTitle.text = response.body()?.title
                binding.moviesDetailsDate.text = response.body()?.release_date.toString()
                binding.moviesDetailsScore.text = response.body()?.vote_average.toString()
                binding.moviesBodyOverview.text = response.body()?.overview

                Picasso.get().load("https://image.tmdb.org/t/p/w500" + response.body()?.backdrop_path).into(binding.moviesDetailsImageBanner)
            }

            override fun onFailure(call: Call<MovieDetails>, t: Throwable) {
                Toast.makeText(this@MoviesDetailsActivity, "Произошла Ошибка - $t", Toast.LENGTH_SHORT).show()
            }
        } )
    }
}