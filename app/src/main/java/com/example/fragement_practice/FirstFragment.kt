package com.example.fragement_practice

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)

//        Button1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment,null))

    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Button1.setOnClickListener{
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

//        view.Button1.setOnClickListener {
//            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
//            R.id.action_firstFragment_to_secondFragment
//        }




    }

//    override fun onClick(view: View){
//        val action =
//            FirstFragmentDirections
//                .actionFirstFragmentToSecondFragment()
//        view.findNavController().navigate(action)
//    }



}







