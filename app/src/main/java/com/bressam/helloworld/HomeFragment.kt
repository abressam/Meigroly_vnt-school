package com.bressam.helloworld
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment

class HomeFragment: Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val continueButton = view.findViewById<ImageButton>(R.id.continue_button)
        continueButton.setOnClickListener { loginFragment() }
    }

    private fun loginFragment() {
        parentFragmentManager.beginTransaction()
            .add(R.id.fragment_container_view, LoginFragment())
            .addToBackStack(null)
            .commit()
    }
}