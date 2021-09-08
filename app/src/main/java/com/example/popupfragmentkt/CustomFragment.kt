package com.example.popupfragmentkt

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.popupfragmentkt.databinding.FragmentBinding
import android.view.Gravity

import android.widget.TextView




class CustomFragment : DialogFragment() {
    lateinit var binding: FragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //var root : View  = inflater.inflate(R.layout.fragment,container,false)
        binding = FragmentBinding.inflate(inflater,container,false)
        binding.cancel.setOnClickListener { dismiss() }
        binding.submit.setOnClickListener {
            val selectedRadio = binding.radiogroup.checkedRadioButtonId
            val value = binding.root.findViewById<RadioButton>(selectedRadio)
            Toast.makeText(context,"You rated ${value.text} \n Have a good day/night",Toast.LENGTH_LONG).show()

           /* val toast: Toast = Toast.makeText(context, "You rated ${value.text} \n Have a good day/night", Toast.LENGTH_SHORT)
            val v = toast.view!!.findViewById<View>(R.id.message) as TextView
            if (v != null) v.gravity = Gravity.CENTER
            toast.show()*/
            dismiss()
        }
        return binding.root
    }
}