package com.example.retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit2.adapter.RegionAdapter
import com.example.retrofit2.model.Region
import com.example.retrofit2.network.APIClient
import com.example.retrofit2.network.APIService
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var apiService: APIService = APIClient.client.create((APIService::class.java))
    var regionList:List<Region>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = this.findViewById(R.id.recycler_view)

        recyclerView.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)


        val call=apiService.getRegion()
        call.enqueue(object :retrofit2.Callback<List<Region>>{
            override fun onFailure(call: Call<List<Region>>, t: Throwable) {
            }
            override fun onResponse(call: Call<List<Region>>, response: Response<List<Region>>) {
                regionList=response.body()
                regionList!!.forEach {
                    Log.i("Region Data","Id : ${it.id}")
                    Log.i("Region Data","Id : ${it.region_name}")
                }

                val regionAdapter=RegionAdapter(regionList as ArrayList<Region>)
                recyclerView.adapter=regionAdapter
                Log.i("Region Size ::",regionList!!.size.toString())
            }
        })




    }
}
