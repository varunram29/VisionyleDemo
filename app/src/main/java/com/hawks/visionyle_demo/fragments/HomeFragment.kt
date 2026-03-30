package com.hawks.visionyle_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.hawks.visionyle_demo.R
import com.hawks.visionyle_demo.adapter.CategoryAdapter
import com.hawks.visionyle_demo.adapter.ProductAdapter
import com.hawks.visionyle_demo.databinding.FragmentHomeBinding
import com.hawks.visionyle_demo.model.DummyList

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var recommendedProductAdapter: ProductAdapter
    private lateinit var topFoodOrderedProductAdapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter = CategoryAdapter(DummyList.categoryList) { }
        val categoryRecyclerView = binding.gridRecyclerview
        categoryRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        categoryRecyclerView.adapter = categoryAdapter


        recommendedProductAdapter = ProductAdapter(DummyList.recommendedProductsList) {}
        val recommendedRecyclerView = binding.recommendedRecyclerview
        recommendedRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        recommendedRecyclerView.adapter = recommendedProductAdapter


        topFoodOrderedProductAdapter = ProductAdapter(DummyList.topFoodOrderedProductsList) {}
        val topFoodRecyclerview = binding.topFoodOrderedRecyclerview
        topFoodRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        topFoodRecyclerview.adapter = topFoodOrderedProductAdapter

        setSpinner(binding.locationSpinner, listOf("Current location"), 0) {}
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setSpinner(
        spinner: Spinner,
        list: List<Any>,
        initialIndex: Int = 0,
        onSelected: (position: Int) -> Unit
    ) {
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_item,
            list
        )

        spinner.adapter = adapter
        spinner.setSelection(initialIndex)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
//                val selected = list[position]
                onSelected(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }

    }

}