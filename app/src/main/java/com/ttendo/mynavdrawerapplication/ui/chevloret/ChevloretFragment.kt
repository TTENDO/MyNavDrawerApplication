package com.ttendo.mynavdrawerapplication.ui.chevloret

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.ttendo.mynavdrawerapplication.databinding.FragmentChevloretBinding

class ChevloretFragment : Fragment() {

    private var _binding: FragmentChevloretBinding? = null
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
            ViewModelProvider(this).get(ChevroletViewModel::class.java)

        _binding = FragmentChevloretBinding.inflate(inflater, container, false)
        val root: View = binding.root

        webView = binding.subaruWebView
        // WebViewClient allows you to handle onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://www.chevrolet.com/")

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