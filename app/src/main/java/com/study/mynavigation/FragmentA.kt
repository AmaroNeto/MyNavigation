package com.study.mynavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.study.mynavigation.databinding.FragmentABinding
import com.study.mynavigation.databinding.FragmentMainBinding

class FragmentA: Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViews()
    }

    fun setUpViews() {
        binding.button.setOnClickListener {
            view?.findNavController()?.navigate()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}