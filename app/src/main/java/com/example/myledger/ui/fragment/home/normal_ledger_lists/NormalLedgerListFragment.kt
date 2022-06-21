package com.example.myledger.ui.fragment.home.normal_ledger_lists

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myledger.R

class NormalLedgerListFragment : Fragment() {

    companion object {
        fun newInstance() = NormalLedgerListFragment()
    }

    private lateinit var viewModel: NormalLedgerListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.normal_ledger_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NormalLedgerListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}