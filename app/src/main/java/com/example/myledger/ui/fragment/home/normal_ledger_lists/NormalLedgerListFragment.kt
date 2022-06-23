package com.example.myledger.ui.fragment.home.normal_ledger_lists

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myledger.databinding.NormalLedgerListFragmentBinding
import com.example.myledger.ui.activity.MainActivity2

class NormalLedgerListFragment : Fragment() {

    private lateinit var viewModel: NormalLedgerListViewModel
    private var _binding: NormalLedgerListFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProvider(this)[NormalLedgerListViewModel::class.java]
        _binding = NormalLedgerListFragmentBinding.inflate(inflater, container, false)

        binding.openAddAccountLedger.setOnClickListener {
            openNewActivity()
        }


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun openNewActivity() {
        val intent = Intent(context, MainActivity2::class.java)
        startActivity(intent)
    }

}