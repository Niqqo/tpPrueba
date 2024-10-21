package com.example.tp2024

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MovieDetailFragment : Fragment() {

    private lateinit var movieDetailTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_detail, container, false)
        movieDetailTextView = view.findViewById(R.id.movieDetailTextView)

        val movieTitle = arguments?.getString("movieTitle")
        movieDetailTextView.text = movieTitle

        return view
    }
}
