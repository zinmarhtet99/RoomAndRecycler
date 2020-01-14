package com.nzh.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nzh.recyclerviewexample.adapter.ContactAdapter
import com.nzh.recyclerviewexample.model.Contact

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contactRecycler:RecyclerView=findViewById(R.id.contact_recycler)
        contactRecycler.layoutManager=LinearLayoutManager(this)

        var contactList = ArrayList<Contact>()
        var contact:Contact
        contact=Contact("Mg Hla","09786790210",R.drawable.boy)
        contactList.add(contact)
        contact=Contact("Ma Hla","0923456432",R.drawable.girl)
        contactList.add(contact)
        contact=Contact("Daw Hla","09456679999",R.drawable.woman)
        contactList.add(contact)
        contact=Contact("U Hla","09966789234",R.drawable.men)
        contactList.add(contact)

        var contactAdapter=ContactAdapter(contactList)
        contactRecycler.adapter=contactAdapter
    }
}
