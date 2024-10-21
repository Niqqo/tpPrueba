package com.example.tp2024

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class MovieListFragment : Fragment() {

    private lateinit var listView: ListView
    private val movies = listOf("Movie 1", "Movie 2", "Movie 3") // Simulación de datos

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)
        listView = view.findViewById(R.id.listView)

        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, movies)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedMovie = movies[position]
            (activity as MainActivity).showMovieDetails(selectedMovie)
        }

        return view
    }
}
