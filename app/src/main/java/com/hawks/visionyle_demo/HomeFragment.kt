package com.hawks.visionyle_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.hawks.visionyle_demo.adapter.CategoryAdapter
import com.hawks.visionyle_demo.adapter.ProductAdapter
import com.hawks.visionyle_demo.databinding.FragmentHomeBinding
import com.hawks.visionyle_demo.model.Category
import com.hawks.visionyle_demo.model.Product

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val categoryList: List<Category> = listOf(
        Category(
            1,
            "Pizza",
            "https://img.freepik.com/free-photo/pizza-pizza-filled-with-tomatoes-salami-olives_140725-1200.jpg?semt=ais_incoming&w=740&q=80"
        ),
        Category(
            2,
            "Ice Cream",
            "https://i.pinimg.com/736x/37/78/d7/3778d7d1be1cffaad3b35da51680218f.jpg"
        ),
        Category(
            3,
            "Pasta",
            "https://borges1896.com/app/uploads//2021/06/WW-20190422-1-1-scaled.jpeg"
        ),
        Category(
            4,
            "Snacks",
            "https://t3.ftcdn.net/jpg/11/67/94/48/360_F_1167944833_b1Bq20gYvAPovrGL3niR3EvWaZGSsnLP.jpg"
        ),
        Category(
            5,
            "Milk shakes",
            "https://static.vecteezy.com/system/resources/thumbnails/025/276/210/small/three-milkshakes-chocolate-strawberry-professional-foodgraphy-ai-generated-photo.jpg"
        ),
        Category(
            6,
            "Cool Drinks",
            "https://thumbs.dreamstime.com/b/colorful-cold-drinks-plastic-cups-beach-ice-fresh-fruits-86654557.jpg"
        )
    )
    private val recommendedProductsList: List<Product> = listOf(
        Product(
            1,
            "Boiled Egg Pizza",
            1,
            700,
            "Cheese, Boiled Eggs",
            "https://img.freepik.com/free-photo/pizza-pizza-filled-with-tomatoes-salami-olives_140725-1200.jpg?semt=ais_incoming&w=740&q=80"
        ),
        Product(
            2,
            "Pineapple Pizza",
            1,
            500,
            "Pineapple, Clives",
            "https://img.freepik.com/free-photo/hawaiian-pizza-with-pineapple-ham-cheese-wooden-table_123827-22283.jpg?semt=ais_incoming&w=740&q=80"
        ),
        Product(
            3,
            "Chicken Pasta",
            3,
            500,
            "Pineapple, Clives",
            "https://borges1896.com/app/uploads//2021/06/WW-20190422-1-1-scaled.jpeg"
        )
    )

    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var recommendedProductAdapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter = CategoryAdapter(categoryList) { index ->

        }
        val categoryRecyclerView = binding.gridRecyclerview
        categoryRecyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        categoryRecyclerView.adapter = categoryAdapter





        recommendedProductAdapter = ProductAdapter(recommendedProductsList) {

        }
        val recommendedRecyclerView = binding.recommendedRecyclerview
        recommendedRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        recommendedRecyclerView.adapter = recommendedProductAdapter

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

//        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item) // we can change it too

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