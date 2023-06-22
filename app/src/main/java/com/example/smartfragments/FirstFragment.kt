package com.example.smartfragments

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.smartfragments.databinding.FragmentFirstBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onInflate(context: Context, attrs: AttributeSet, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
        Log.v("Lifecycle. First", "onInflate")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.v("Lifecycle. First", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("Lifecycle. First", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.v("Lifecycle. First", "onCreateView")
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root!!
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("Lifecycle. First", "onViewCreated")
        binding!!.buttonReplace.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fullscreenContainer, SecondFragment())
                addToBackStack("second")
            }
        }
        binding!!.buttonAdd.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.fullscreenContainer, SecondFragment())
                addToBackStack("second")
            }
        }
        binding!!.buttonHide.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                hide(this@FirstFragment)
                addToBackStack("second")
            }
        }
        binding!!.buttonShow.setOnClickListener {
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                show(this@FirstFragment)
                addToBackStack("second")
            }
        }
        binding!!.buttonDialog.setOnClickListener { showAlertDialog() }
        binding!!.buttonDialogFragment.setOnClickListener { showFragmentDialog() }
    }

    override fun onStart() {
        super.onStart()
        Log.v("Lifecycle. First", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.v("Lifecycle. First", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Lifecycle. First", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Lifecycle. First", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.v("Lifecycle. First", "onDestroyView")
        binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Lifecycle. First", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.v("Lifecycle. First", "onDetach")
    }

    private fun showAlertDialog() {
        MaterialAlertDialogBuilder(requireContext()).run {
            setTitle("Title")
            setMessage("Message")
            setCancelable(true)
            create()
            show()
        }
    }

    private fun showFragmentDialog() {
        BottomSheetDialogFragment(R.layout.fragment_dialog).show(childFragmentManager, null)
    }
}