package com.ttendo.mynavdrawerapplication.ui.nissan

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.ttendo.mynavdrawerapplication.R
import com.ttendo.mynavdrawerapplication.databinding.FragmentMercedesBinding
import com.ttendo.mynavdrawerapplication.databinding.FragmentNissanBinding
import com.ttendo.mynavdrawerapplication.ui.mercedes.MercedesViewModel

class NissanFragment : Fragment() {
    private var _binding: FragmentNissanBinding? = null
    private lateinit var webView: WebView
    private val binding get() = _binding!!

    private lateinit var viewModel: NissanViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mercedesViewModel =
            ViewModelProvider(this).get(MercedesViewModel::class.java)

        _binding = FragmentNissanBinding.inflate(inflater, container, false)
        val root: View = binding.root

        webView = binding.nissanWebView
        // WebViewClient allows you to handle onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl("https://www.nissan.co.ug/")

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