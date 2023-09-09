package com.ttendo.mynavdrawerapplication.ui.mercedes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.ttendo.mynavdrawerapplication.R
import com.ttendo.mynavdrawerapplication.databinding.FragmentFerrariBinding
import com.ttendo.mynavdrawerapplication.databinding.FragmentMercedesBinding
import com.ttendo.mynavdrawerapplication.ui.ferrari.FerrariViewModel

class MercedesFragment : Fragment() {

    private var _binding: FragmentMercedesBinding? = null
    private lateinit var webView: WebView
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mercedesViewModel =
            ViewModelProvider(this).get(MercedesViewModel::class.java)

        _binding = FragmentMercedesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        webView = binding.mercedesWebView
        // WebViewClient allows you to handle onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://www.mercedes-amg.com/en/home.html")

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        //enable zoom feature
        webView.settings.setSupportZoom(true)

        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}