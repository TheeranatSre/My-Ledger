package com.example.myledger.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myledger.R
import com.example.myledger.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    private var isCollapseListsNormalLedgerLayout: Boolean = false
    private var isCollapseLintsSaveMoneyLayout: Boolean = false


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.listsNormalLedgerLayout.setOnClickListener {
            if (isCollapseListsNormalLedgerLayout) {
                binding.arrowIconTapNormalLedger.setImageResource(R.drawable.ic_arrow_down)
                binding.listsNormalLedgerFragment.visibility = View.GONE
                isCollapseListsNormalLedgerLayout = false
            } else {
                binding.arrowIconTapNormalLedger.setImageResource(R.drawable.ic_arrow_up)
                binding.listsNormalLedgerFragment.visibility = View.VISIBLE
                isCollapseListsNormalLedgerLayout = true
            }
        }

        binding.lintsSaveMoneyLayout.setOnClickListener {
            if (isCollapseLintsSaveMoneyLayout) {
                binding.arrowIconTapSaveMoney.setImageResource(R.drawable.ic_arrow_down)
                binding.listsSaveMoneyFragment.visibility = View.GONE
                isCollapseLintsSaveMoneyLayout = false
            } else {
                binding.arrowIconTapSaveMoney.setImageResource(R.drawable.ic_arrow_up)
                binding.listsSaveMoneyFragment.visibility = View.VISIBLE
                isCollapseLintsSaveMoneyLayout = true
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}