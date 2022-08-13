package com.lokilinks.tablayouttest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.lokilinks.tablayouttest.databinding.UsecaseFragmentBinding

class UseCaseFragment : Fragment() {
    private lateinit var binding: UsecaseFragmentBinding
    private val model: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = UsecaseFragmentBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.plant.observe(viewLifecycleOwner){
            binding.tvUseCase.text = it.useCase
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = UseCaseFragment()
                }


            }

