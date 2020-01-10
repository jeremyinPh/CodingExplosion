package com.code.explosion.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.code.explosion.R
import kotlinx.android.synthetic.main.fragment_register.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_login, container, false)
        root.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_nav_login_to_register)
        }
        return root
    }
}