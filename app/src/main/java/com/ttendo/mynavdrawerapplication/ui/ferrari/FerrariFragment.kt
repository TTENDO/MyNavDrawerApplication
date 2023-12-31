package com.ttendo.mynavdrawerapplication.ui.ferrari

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.lifecycle.ViewModelProvider
import com.ttendo.mynavdrawerapplication.databinding.FragmentFerrariBinding

class FerrariFragment : Fragment() {
    private var _binding: FragmentFerrariBinding? = null
    private lateinit var webView: WebView
    // This property is only valid between onCreateView and onDestroyView.
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

//        val textView: TextView = binding.textFragment
//        ferrariViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        webView = binding.ferrariWebView
        // WebViewClient allows you to handle onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://www.ferrari.com/en-UG")
//        webView.loadUrl("https://www.nissan.co.ug/")
//        webView.loadUrl("https://www.landrover.com/range-rover/index.html")
//        webView.loadUrl("https://www.mercedes-amg.com/en/home.html")
//        webView.loadUrl("https://www.subaru.com/index.html")

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}