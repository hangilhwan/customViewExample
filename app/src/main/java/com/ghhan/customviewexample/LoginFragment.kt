package com.ghhan.customviewexample

import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//without Server
class LoginFragment : Fragment() {

    companion object {
        private const val TAG = "LoginFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }


    private fun initView() {
        btn_login.setOnClickListener {
            login()
        }
    }

    private fun login() {
        Log.d(TAG, "Login")

        //loExample login..

        if (!isValidate()) {
            onLoginFailed()
            return
        }
        btn_login.isEnabled = false
        progress_auth.visibility = View.VISIBLE
        val email: String = input_email.text.toString()
        val password: String = input_password.text.toString()


        // coroutines https://developer.android.com/kotlin/coroutines
        GlobalScope.launch(Dispatchers.Main) {

            delay(3000)
            //only allowed UiThread
            onLoginSuccess(email)
        }
    }

    private fun onLoginSuccess(email: String) {
        btn_login.isEnabled = true
        Toast.makeText(context, "Login Success UserId : $email", Toast.LENGTH_LONG).show()
        progress_auth.visibility = View.GONE
    }

    private fun onLoginFailed() {
        Toast.makeText(context, "Login Failed", Toast.LENGTH_LONG).show()
        btn_login.isEnabled = true
        progress_auth.visibility = View.GONE
    }

    private fun isValidate(): Boolean {
        var valid = true
        val email: String = input_email.text.toString()
        val password: String = input_password.text.toString()
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            input_email.error = "enter a valid email address"
            valid = false
        } else {
            input_email.error = null
            //Invisible Error
        }
        if (password.isEmpty() || password.length < 4 || password.length > 10) {
            input_password.error = "between 4 and 10 alphanumeric characters"
            valid = false
        } else {
            input_password.error = null
            //Invisible Error
        }
        return valid
    }
}