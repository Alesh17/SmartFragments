package com.example.smartfragments

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.smartfragments.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null

    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
        Log.v("Lifecycle. Second", "onInflate")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("Lifecycle. Second", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("Lifecycle. Second", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.v("Lifecycle. Second", "onCreateView")
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("Lifecycle. Second", "onViewCreated")
        binding!!.buttonSecond.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.v("Lifecycle. Second", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("Lifecycle. Second", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Lifecycle. Second", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Lifecycle. Second", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v("Lifecycle. Second", "onDestroyView")
        binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Lifecycle. Second", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v("Lifecycle. Second", "onDetach")
    }
}