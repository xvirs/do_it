package com.example.do_it

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {

    val makeNetwork : MakeNetwork = MakeNetwork()
    val myResponse: MutableLiveData<MakeResponse> = MutableLiveData()

    fun getMake(){
        viewModelScope.launch {
            myResponse.value = makeNetwork.retrofit.getMake()
        }
    }
}