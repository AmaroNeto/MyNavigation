package com.study.mynavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.study.mynavigation.databinding.FragmentMainBinding

class MainFragment: Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    fun setUpViews() {
        binding.buttonA.setOnClickListener {
            view?.findNavController()?.navigate(MainFragmentDirections.actionMainToFragmentA())
        }
        binding.buttonB.setOnClickListener {
            view?.findNavController()?.navigate(MainFragmentDirections.actionMainToFragmentB())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}