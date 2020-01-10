package com.code.explosion.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.code.explosion.MainActivity
import com.code.explosion.R
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_register.view.btnRegister

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_login, container, false)
        root.btnRegister.setOnClickListener {
            val account = root.etAccount.text.toString()
            var bundle = bundleOf("account" to account)
            findNavController().navigate(R.id.action_nav_login_to_register, bundle)
        }
        root.btnLogin.setOnClickListener {
            startActivity(Intent(activity, MainActivity::class.java))
        }
        return root
    }
}