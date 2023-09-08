package com.ttendo.mynavdrawerapplication.ui.ferrari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.ttendo.mynavdrawerapplication.R
import com.ttendo.mynavdrawerapplication.databinding.FragmentFerrariBinding
import com.ttendo.mynavdrawerapplication.databinding.FragmentGalleryBinding
import com.ttendo.mynavdrawerapplication.ui.gallery.GalleryViewModel

class FerrariFragment : Fragment() {
    private var _binding: FragmentFerrariBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ferrariViewModel =
            ViewModelProvider(this).get(FerrariViewModel::class.java)

        _binding = FragmentFerrariBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textFragment
        ferrariViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}