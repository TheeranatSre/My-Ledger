package com.example.myledger.ui.fragment.home.save_money_list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myledger.R

class SaveMoneyFragment : Fragment() {

    companion object {
        fun newInstance() = SaveMoneyFragment()
    }

    private lateinit var viewModel: SaveMoneyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.save_money_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SaveMoneyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}