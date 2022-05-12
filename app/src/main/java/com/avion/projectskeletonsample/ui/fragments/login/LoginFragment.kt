package com.avion.projectskeletonsample.ui.fragments.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.avion.projectskeletonsample.R
import com.avion.projectskeletonsample.databinding.FragmentLoginBinding
import com.avion.projectskeletonsample.ui.MainActivity


class LoginFragment : Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLoginBinding.bind(view)
        (activity as MainActivity).supportActionBar?.hide()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}